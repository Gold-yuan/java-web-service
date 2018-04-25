package com.bsutility.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.bsutility.node.ws.client.MonitorClient;

/**
 * webservice 客户端配置
 * 
 * @author adminytf
 *
 */
@Configuration
public class WSClientConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// 设置webservice客户端生成文件的包
		marshaller.setContextPath("com.bsutility.node.ws");
		return marshaller;
	}

	@Bean("monitorClient")
	public MonitorClient counrtyClient(Jaxb2Marshaller marshaller) {
		MonitorClient client = new MonitorClient();
		client.setDefaultUri(MonitorClient.URI);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}