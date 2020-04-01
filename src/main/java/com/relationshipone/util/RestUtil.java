package com.relationshipone.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.relationshipone.bean.AppRecordBean;

public class RestUtil {

	public static AppRecordBean[] parseObject(String json) {
		
		AppRecordBean[] appRecordBean = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			appRecordBean = mapper.readValue(json, AppRecordBean[].class);
		} catch (Exception e) {
			System.out.println("JSON parsing failed with message:");
			System.out.println(e.getMessage());
		}

		return appRecordBean;
	}

}
