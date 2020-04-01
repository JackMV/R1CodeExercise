package com.relationshipone;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.relationshipone.bean.AppRecordBean;
import com.relationshipone.service.RestCaller;

/**
 * Feel free to use this class or not.
 */

public class ExampleService {

	private RestCaller restCaller = new RestCaller();

	private String endpoint;
	private MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();

	public void run() {

		endpoint = "https://api.appcloud.relationshipone.com/appcloud/apps";
		queryParams.add("eloquapackageId", "153");

		AppRecordBean[] appRecords = restCaller.hitEndpoint(endpoint, queryParams);
		
		for (AppRecordBean record : appRecords) {
			System.out.println(record.getName() + " --------- " + record.getDocumentationUrl());
		}
	}
}
