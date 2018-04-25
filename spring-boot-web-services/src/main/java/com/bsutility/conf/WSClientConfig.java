package com.bsutility.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.bsutility.node.ws.client.MonitorClient;

@Configuration
public class WSClientConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		marshaller.setContextPath("ws.wsdl");
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