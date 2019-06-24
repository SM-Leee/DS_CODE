package com.douzone.dscode.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.dscode.service.link;

@Controller
@RequestMapping("/js")
public class JSController {

	link link = new link();
	String mainPath = "/assets/js/";
	String componentPath = "/assets/js/component/";

	/* main js file */
	@RequestMapping(value = "/app.js", method = RequestMethod.GET)
	public void app_ownload(HttpServletResponse res) {
		link.download(res, mainPath, "app.js", "text/javascript");
	}

	@RequestMapping(value = "/ds.js", method = RequestMethod.GET)
	public void ds_download(HttpServletResponse res) {
		link.download(res, mainPath, "ds.js", "text/javascript");
	}

	@RequestMapping(value = "/core.js", method = RequestMethod.GET)
	public void core_download(HttpServletResponse res) {
		link.download(res, mainPath, "core.js", "text/javascript");
	}

	@RequestMapping(value = "/ds-css.js", method = RequestMethod.GET)
	public void ds_css(HttpServletResponse res) {
		link.download(res, mainPath, "ds-css.js", "text/javascript");
	}
	@RequestMapping(value = "/ds-js.js", method = RequestMethod.GET)
	public void ds_js(HttpServletResponse res) {
		link.download(res, mainPath, "ds-js.js", "text/javascript");
	}

	/* component js file */
	@RequestMapping(value = "/accordion.js", method = RequestMethod.GET)
	public void accordio_download(HttpServletResponse res) {
		link.download(res, componentPath, "accordion.js", "text/javascript");
	}

	@RequestMapping(value = "/barchart.js", method = RequestMethod.GET)
	public void barchar_download(HttpServletResponse res) {
		link.download(res, componentPath, "barchart.js", "text/javascript");
	}

	@RequestMapping(value = "/bubblechart.js", method = RequestMethod.GET)
	public void bubblechar_download(HttpServletResponse res) {
		link.download(res, componentPath, "bubblechart.js", "text/javascript");
	}

	@RequestMapping(value = "/button.js", method = RequestMethod.GET)
	public void butto_download(HttpServletResponse res) {
		link.download(res, componentPath, "button.js", "text/javascript");
	}

	@RequestMapping(value = "/cardlist.js", method = RequestMethod.GET)
	public void cardlis_download(HttpServletResponse res) {
		link.download(res, componentPath, "cardlist.js", "text/javascript");
	}

	@RequestMapping(value = "/chartutil.js", method = RequestMethod.GET)
	public void chartuti_download(HttpServletResponse res) {
		link.download(res, componentPath, "chartutil.js", "text/javascript");
	}

	@RequestMapping(value = "/checkbox.js", method = RequestMethod.GET)
	public void checkbo_download(HttpServletResponse res) {
		link.download(res, componentPath, "checkbox.js", "text/javascript");
	}

	@RequestMapping(value = "/dataTable.js", method = RequestMethod.GET)
	public void dataTabl_download(HttpServletResponse res) {
		link.download(res, componentPath, "dataTable.js", "text/javascript");
	}

	@RequestMapping(value = "/datepicker.js", method = RequestMethod.GET)
	public void datepicke_download(HttpServletResponse res) {
		link.download(res, componentPath, "datepicker.js", "text/javascript");
	}

	@RequestMapping(value = "/dropdownpicker.js", method = RequestMethod.GET)
	public void dropdownpicke_download(HttpServletResponse res) {
		link.download(res, componentPath, "dropdownpicker.js", "text/javascript");
	}

	@RequestMapping(value = "/falsepiechart.js", method = RequestMethod.GET)
	public void falsepiechar_download(HttpServletResponse res) {
		link.download(res, componentPath, "falsepiechart.js", "text/javascript");
	}

	@RequestMapping(value = "/footer.js", method = RequestMethod.GET)
	public void foote_download(HttpServletResponse res) {
		link.download(res, componentPath, "footer.js", "text/javascript");
	}

	@RequestMapping(value = "/header-title.js", method = RequestMethod.GET)
	public void header_titl_download(HttpServletResponse res){
	link.download(res,  componentPath, "header-title.js", "text/javascript");
	}

	@RequestMapping(value = "/header-togglemenu.js", method = RequestMethod.GET)
	public void header_togglemen_download(HttpServletResponse res){
	link.download(res,  componentPath, "header-togglemenu.js", "text/javascript");
	}

	@RequestMapping(value = "/imgview.js", method = RequestMethod.GET)
	public void imgvie_download(HttpServletResponse res) {
		link.download(res, componentPath, "imgview.js", "text/javascript");
	}

	@RequestMapping(value = "/input.js", method = RequestMethod.GET)
	public void inpu_download(HttpServletResponse res) {
		link.download(res, componentPath, "input.js", "text/javascript");
	}

	@RequestMapping(value = "/linechart.js", method = RequestMethod.GET)
	public void linechar_download(HttpServletResponse res) {
		link.download(res, componentPath, "linechart.js", "text/javascript");
	}

	@RequestMapping(value = "/msgbox.js", method = RequestMethod.GET)
	public void msgbo_download(HttpServletResponse res) {
		link.download(res, componentPath, "msgbox.js", "text/javascript");
	}

	@RequestMapping(value = "/name.txt", method = RequestMethod.GET)
	public void name_download(HttpServletResponse res) {
		link.download(res, componentPath, "name.txt", "text/javascript");
	}

	@RequestMapping(value = "/navigator-submenu.js", method = RequestMethod.GET)
	public void navigator_submen_download(HttpServletResponse res){
	link.download(res,  componentPath, "navigator-submenu.js", "text/javascript");
	}

	@RequestMapping(value = "/periodpicker.js", method = RequestMethod.GET)
	public void periodpicke_download(HttpServletResponse res) {
		link.download(res, componentPath, "periodpicker.js", "text/javascript");
	}

	@RequestMapping(value = "/piechart.js", method = RequestMethod.GET)
	public void piechar_download(HttpServletResponse res) {
		link.download(res, componentPath, "piechart.js", "text/javascript");
	}

	@RequestMapping(value = "/piechart2.js", method = RequestMethod.GET)
	public void piechart_download(HttpServletResponse res) {
		link.download(res, componentPath, "piechart2.js", "text/javascript");
	}

	@RequestMapping(value = "/radarchart.js", method = RequestMethod.GET)
	public void radarchar_download(HttpServletResponse res) {
		link.download(res, componentPath, "radarchart.js", "text/javascript");
	}

	@RequestMapping(value = "/radiobutton.js", method = RequestMethod.GET)
	public void radiobutto_download(HttpServletResponse res) {
		link.download(res, componentPath, "radiobutton.js", "text/javascript");
	}

	@RequestMapping(value = "/rangeslider.js", method = RequestMethod.GET)
	public void rangeslide_download(HttpServletResponse res) {
		link.download(res, componentPath, "rangeslider.js", "text/javascript");
	}

	@RequestMapping(value = "/staticbutton.js", method = RequestMethod.GET)
	public void staticbutto_download(HttpServletResponse res) {
		link.download(res, componentPath, "staticbutton.js", "text/javascript");
	}

	@RequestMapping(value = "/statusview.js", method = RequestMethod.GET)
	public void statusvie_download(HttpServletResponse res) {
		link.download(res, componentPath, "statusview.js", "text/javascript");
	}

	@RequestMapping(value = "/toggle-button.js", method = RequestMethod.GET)
	public void toggle_butto_download(HttpServletResponse res){
	link.download(res,  componentPath, "toggle-button.js", "text/javascript");
	}

}