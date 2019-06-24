package com.douzone.dscode.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.dscode.service.link;

@Controller
@RequestMapping("/image")
public class IMAGEController {
	link link = new link();
	String path = "/assets/images/";

	@RequestMapping(value = "/angle-down-solid.svg", method = RequestMethod.GET)
	public void img0_download(HttpServletResponse res) {
		link.download(res, path, "angle-down-solid.svg", "image/svg");
	}

	@RequestMapping(value = "/angle-up-solid.svg", method = RequestMethod.GET)
	public void img1_download(HttpServletResponse res) {
		link.download(res, path, "angle-up-solid.svg", "image/svg");
	}

	@RequestMapping(value = "/arrow-down.png", method = RequestMethod.GET)
	public void img2_download(HttpServletResponse res) {
		link.download(res, path, "arrow-down.png", "image/png");
	}

	@RequestMapping(value = "/arrow-up.png", method = RequestMethod.GET)
	public void img3_download(HttpServletResponse res) {
		link.download(res, path, "arrow-up.png", "image/png");
	}

	@RequestMapping(value = "/calendar_font_awesome.png", method = RequestMethod.GET)
	public void img4_download(HttpServletResponse res) {
		link.download(res, path, "calendar_font_awesome.png", "image/png");
	}
	@RequestMapping(value = "/calendar_readonly_fas.png", method = RequestMethod.GET)
	public void img4_1_download(HttpServletResponse res) {
		link.download(res, path, "calendar_readonly_fas.png", "image/png");
	}
	@RequestMapping(value = "/calendar_required_fas.png", method = RequestMethod.GET)
	public void img4_2_download(HttpServletResponse res) {
		link.download(res, path, "calendar_required_fas.png", "image/png");
	}

	@RequestMapping(value = "/camera-solid.svg", method = RequestMethod.GET)
	public void img5_download(HttpServletResponse res) {
		link.download(res, path, "camera-solid.svg", "image/svg");
	}

	@RequestMapping(value = "/css.svg", method = RequestMethod.GET)
	public void img6_download(HttpServletResponse res) {
		link.download(res, path, "css.svg", "image/svg");
	}

	@RequestMapping(value = "/cursor-ball.png", method = RequestMethod.GET)
	public void img7_download(HttpServletResponse res) {
		link.download(res, path, "cursor-ball.png", "image/png");
	}

	@RequestMapping(value = "/data-table-function.png", method = RequestMethod.GET)
	public void img8_download(HttpServletResponse res) {
		link.download(res, path, "data-table-function.png", "image/png");
	}

	@RequestMapping(value = "/gray-css.svg", method = RequestMethod.GET)
	public void img10_download(HttpServletResponse res) {
		link.download(res, path, "gray-css.svg", "image/svg");
	}

	@RequestMapping(value = "/gray-html.svg", method = RequestMethod.GET)
	public void img11_download(HttpServletResponse res) {
		link.download(res, path, "gray-html.svg", "image/svg");
	}

	@RequestMapping(value = "/gray-js.svg", method = RequestMethod.GET)
	public void img12_download(HttpServletResponse res) {
		link.download(res, path, "gray-js.svg", "image/svg");
	}

	@RequestMapping(value = "/html.svg", method = RequestMethod.GET)
	public void img13_download(HttpServletResponse res) {
		link.download(res, path, "html.svg", "image/svg");
	}

	@RequestMapping(value = "/icon-check.png", method = RequestMethod.GET)
	public void img14_download(HttpServletResponse res) {
		link.download(res, path, "icon-check.png", "image/png");
	}

	@RequestMapping(value = "/icon-error.png", method = RequestMethod.GET)
	public void img15_download(HttpServletResponse res) {
		link.download(res, path, "icon-error.png", "image/png");
	}

	@RequestMapping(value = "/icon-warning.png", method = RequestMethod.GET)
	public void img16_download(HttpServletResponse res) {
		link.download(res, path, "icon-warning.png", "image/png");
	}

	@RequestMapping(value = "/iphone1.png", method = RequestMethod.GET)
	public void img17_download(HttpServletResponse res) {
		link.download(res, path, "iphone1.png", "image/png");
	}

	@RequestMapping(value = "/js.svg", method = RequestMethod.GET)
	public void img18_download(HttpServletResponse res) {
		link.download(res, path, "js.svg", "image/svg");
	}

	@RequestMapping(value = "/pause.svg", method = RequestMethod.GET)
	public void img19_download(HttpServletResponse res) {
		link.download(res, path, "pause.svg", "image/svg");
	}

	@RequestMapping(value = "/play.svg", method = RequestMethod.GET)
	public void img20_download(HttpServletResponse res) {
		link.download(res, path, "play.svg", "image/svg");
	}

	@RequestMapping(value = "/won-sign-solid.svg", method = RequestMethod.GET)
	public void img21_download(HttpServletResponse res) {
		link.download(res, path, "won-sign-solid.svg", "image/svg");
	}

}
