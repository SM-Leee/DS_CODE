package com.douzone.dscode.controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.dscode.service.link;

@Controller
@RequestMapping("/css")
public class CSSController {
	
	link link = new link();
	String path = "/assets/css/";
	
	@RequestMapping(value = "/default.css", method = RequestMethod.GET)
    public void default_download(HttpServletResponse res) {
		link.download(res, path ,"default.css", "text/css");
    }
	
	@RequestMapping(value = "/dscomponent.css", method = RequestMethod.GET)
    public void dscomponent_download(HttpServletResponse res) {
		link.download(res, path ,"dscomponent.css", "text/css");
    }

}
