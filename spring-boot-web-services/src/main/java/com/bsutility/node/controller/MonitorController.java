package com.bsutility.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsutility.node.ws.GetMonitorResponse;
import com.bsutility.node.ws.client.MonitorClient;

/**
 * @author adminytf
 *
 */
@Controller
@RequestMapping("/wsc")
public class MonitorController {

	@Autowired
	private MonitorClient monitorClient;

	@ResponseBody
	@RequestMapping("/")
	public String get() {
		return "success";
	}

	@ResponseBody
	@RequestMapping("/get")
	public String getws() {

		String MonitorName = "Spain";
		GetMonitorResponse response = monitorClient.getMonitor(MonitorName);
		System.out.println("response: " + response.getContainers());

		return "success";
	}
}
