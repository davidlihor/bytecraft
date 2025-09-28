package com.bytecraft.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Components {
	

  private String activeHost;
  private String activePort;

	@Value("${memcached.standBy.host}")
    private String standByHost;
	@Value("${memcached.standBy.port}")
    private String standByPort;
	

  private String rabbitMqHost;
  private String rabbitMqPort;
  private String rabbitMqUser;
  private String rabbitMqPassword;
	
	@Value("${elasticsearch.host}")
    private String elasticsearchHost;
	@Value("${elasticsearch.port}")
    private String elasticsearchPort;
	@Value("${elasticsearch.cluster}")
    private String elasticsearchCluster;
	@Value("${elasticsearch.node}")
    private String elasticsearchNode;
	
	
    public String getActiveHost() {
        return System.getenv("MEMCACHED_ACTIVE_HOST");
    }

    public String getActivePort() {
        return System.getenv("MEMCACHED_ACTIVE_PORT");
    }

	public String getStandByHost() {
		return standByHost;
	}
	public String getStandByPort() {
		return standByPort;
	}
	public void setActiveHost(String activeHost) {
		this.activeHost = activeHost;
	}
	public void setActivePort(String activePort) {
		this.activePort = activePort;
	}
	public void setStandByHost(String standByHost) {
		this.standByHost = standByHost;
	}
	public void setStandByPort(String standByPort) {
		this.standByPort = standByPort;
	}

    public String getRabbitMqHost() {
        return System.getenv("RABBITMQ_ADDRESS");
    }

	public void setRabbitMqHost(String rabbitMqHost) {
		this.rabbitMqHost = rabbitMqHost;
	}

    public String getRabbitMqPort() {
        return System.getenv("RABBITMQ_PORT");
    }


	public void setRabbitMqPort(String rabbitMqPort) {
		this.rabbitMqPort = rabbitMqPort;
	}
    public String getRabbitMqUser() {
        return System.getenv("RABBITMQ_USERNAME");
    }

	public void setRabbitMqUser(String rabbitMqUser) {
		this.rabbitMqUser = rabbitMqUser;
	}

    public String getRabbitMqPassword() {
        return System.getenv("RABBITMQ_PASSWORD");
    }

	public void setRabbitMqPassword(String rabbitMqPassword) {
		this.rabbitMqPassword = rabbitMqPassword;
	}
	public String getElasticsearchHost() {
		return elasticsearchHost;
	}
	public void setElasticsearchHost(String elasticsearchHost) {
		this.elasticsearchHost = elasticsearchHost;
	}
	public String getElasticsearchPort() {
		return elasticsearchPort;
	}
	public void setElasticsearchPort(String elasticsearchPort) {
		this.elasticsearchPort = elasticsearchPort;
	}
	public String getElasticsearchCluster() {
		return elasticsearchCluster;
	}
	public void setElasticsearchCluster(String elasticsearchCluster) {
		this.elasticsearchCluster = elasticsearchCluster;
	}
	public String getElasticsearchNode() {
		return elasticsearchNode;
	}
	public void setElasticsearchNode(String elasticsearchNode) {
		this.elasticsearchNode = elasticsearchNode;
	}
	
	
}
