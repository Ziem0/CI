package com.bitbucket.devops.contintegration.models;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Calendar;

@Data
public class PageInfo {

	private String status;
	private Timestamp timeStamp;

	public PageInfo(String status) {

		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();

		this.timeStamp = new java.sql.Timestamp(now.getTime());

		this.status = calculateStatus(status);

	}

	public String calculateStatus(String status) {
		if (status.startsWith("2")) {
			return "ok";
		}
		return "error";
	}

}
