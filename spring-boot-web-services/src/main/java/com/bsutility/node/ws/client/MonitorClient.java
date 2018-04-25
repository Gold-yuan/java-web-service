package com.bsutility.node.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.bsutility.node.ws.*;

public class MonitorClient extends WebServiceGatewaySupport {
	public static final String URI = "http://localhost:8080/ws";
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