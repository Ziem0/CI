package com.bitbucket.devops.contintegration.controllers;

import com.bitbucket.devops.contintegration.models.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping(value = "")
public class MainController {

	@GetMapping(value = "/ping")
	public PageInfo getPing(HttpServletRequest request, HttpServletResponse response) {
		return new PageInfo(String.valueOf(response.getStatus()));
	}

}
