package com.bsutility.node.ws.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bsutility.node.ws.GetMonitorRequest;
import com.bsutility.node.ws.GetMonitorResponse;

/**
 * @author adminytf
 *
 */
@Endpoint
public class MonitorEndpoint {

	private static final String NAMESPACE_URI = "http://ws.node.bsutility.com";
	@Autowired
	private MonitorRepository monitorRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMonitorRequest")
	@ResponsePayload
	public GetMonitorResponse getMonitor(@RequestPayload GetMonitorRequest request) {
		System.out.println("进入action");
		GetMonitorResponse response = new GetMonitorResponse();
		response.setContainers(monitorRepository.getNodeContainerList(request.getNodeIp()));
		return response;
	}

	@PayloadRoot(namespace = "http://ws.bsutility.com/ws/schema", localPart = "getContainer")
	@ResponsePayload
	public String getContainer(@RequestPayload String nodeIp) {
		System.out.println("进入action2");

		return monitorRepository.getNodeContainerLists(nodeIp);
	}
}
