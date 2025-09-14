FROM maven:3.9.9-eclipse-temurin-21-jammy AS build
WORKDIR /app

COPY app/src ./src
COPY app/pom.xml ./pom.xml

RUN echo ">>> Verify files at build:" && \
    ls -lh ./src/main/webapp/resources/Images && \
    if grep -r "version https://git-lfs.github.com/spec/v1" ./src/main/webapp/resources; then \
      echo ">>> ERROR: LFS Pointers found after COPY!"; \
      exit 1; \
    else \
      echo ">>> No LFS Files found."; \
    fi

RUN mvn dependency:go-offline -B
RUN mvn clean package -DskipTests


FROM tomcat:10-jdk21
LABEL "Project"="ByteCraft"

RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD [ "catalina.sh", "run" ]