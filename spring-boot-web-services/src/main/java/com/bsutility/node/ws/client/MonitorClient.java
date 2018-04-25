package com.bsutility.node.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.bsutility.node.ws.*;

public class MonitorClient extends WebServiceGatewaySupport {
	
	
	/**
	 * 此配置由WSServerConfig.java配置
	 * 
	 * setContextPath
	 */
	public static final String URI = "http://localhost:8080/ws";
	
	/**
	 * 此地址在 MonitorEndpoint.java 配置 
	 * @PayloadRoot 中的 namespace + localPart
	 */
	public static final String SOAPACTION = "http://ws.node.bsutility.com/getMonitorRequest";

	public GetMonitorResponse getMonitor(String nodeIp) {
		GetMonitorRequest request = new GetMonitorRequest();
		request.setNodeIp(nodeIp);
		GetMonitorResponse response = (GetMonitorResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request,
				new SoapActionCallback(SOAPACTION));

		return response;
	}
	public GetMonitorResponse getContainer(String nodeIp) {
		GetMonitorRequest request = new GetMonitorRequest();
		request.setNodeIp(nodeIp);
		GetMonitorResponse response = (GetMonitorResponse) getWebServiceTemplate().marshalSendAndReceive(URI, request,
				new SoapActionCallback(SOAPACTION));
		
		return response;
	}

}