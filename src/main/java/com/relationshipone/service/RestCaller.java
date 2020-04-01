package com.relationshipone.service;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.relationshipone.bean.AppRecordBean;
import com.relationshipone.util.RestUtil;

@Service
public class RestCaller {

	RestTemplate restTemplate = new RestTemplate();

	public AppRecordBean[] hitEndpoint(String endpoint, MultiValueMap<String, String> queryParams) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint).queryParams(queryParams);
		String responseJSON = restTemplate.getForObject(builder.build().toUri(), String.class);
		AppRecordBean[] responseBean = RestUtil.parseObject(responseJSON);

		return responseBean;
	}

}
