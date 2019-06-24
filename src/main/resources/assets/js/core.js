/*document.open();*/

document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/falsepiechart.js' ><" + "/script>");

document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/input.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/header-title.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/header-togglemenu.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/navigator-submenu.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/dropdownpicker.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/datepicker.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/periodpicker.js' ><" + "/script>");

document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/chartutil.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/piechart.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/radarchart.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/linechart.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/bubblechart.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/barchart.js' ><" + "/script>");

document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/footer.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/button.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/cardlist.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/staticbutton.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/statusview.js' ><" + "/script>");

document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/dataTable.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/accordion.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/checkbox.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/radiobutton.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/rangeslider.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/msgbox.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/toggle-button.js' ><" + "/script>");
document.write("<script type='text/javascript' src='http://106.10.41.222:8080/ds_code/js/imgview.js' ><" + "/script>");

/*docuemnt.close();*/
function component(){
	resizible();
	headerTitle()
	headerToggleMenu();
	navigatorSubmenu();
//	dataTable();
	inputFormat();
	dropdownPicker();
	datePicker();
	periodPicker();
	falsepiechart();
	cardlistSetting();
	footerSetting();
	staticBtnSetting();
	
	toggleButton(); 
	/*messageBox();*/
	/* 원형 차트 */
	/* 기본적인 형태는 갖춰졌지만 UI적인 수정이 필요함 */
	$('.circle').each(function(){
		select = '.circle[id='+$(this).attr('id')+'] ';
		pieChart(chartDataBinding('circle', ''), select);
	})
	/* 방사형 차트 (radar chart) */
	$('.radar').each(function(){
		select = '.radar[id='+$(this).attr('id')+'] ';
		formItems(chartDataBinding('radar', ''), select);
	})
	/* 꺽은선 차트 (line chart) */
	/* 아직 이건 차트의 사이즈 설정이 완전하지 않음 */
	/* 또한 UI 적인 수정이 필요함 */
	/*$('.bubble').each(function(){
		select = '.bubble[id='+$(this).attr('id')+'] ';
		bubbleChart(dataSet1, select);
	})*/
	$('.bar').each(function(){
		select = '.bar[id='+$(this).attr('id')+'] ';
		barChart(chartDataBinding('bar', ''), select);
	})
	$('.line').each(function(){
		select = '.line[id='+$(this).attr('id')+'] ';
		//년도별
		//let btnClickDataset = ['A', 'plus', '년도별', '2016', '2019'];
		//분기별
		//let btnClickDataset = ['A', 'plus', '분기별', '2018'];
		//월별
		//let btnClickDataset = ['A', 'plus', '월별', '2018'];
		lineChart(chartDataBinding('line',''), select, '');
	})
	basicButton();
	checkbox();
	radiobutton();
	rangeSlider();
	accordion();
}
const resizible = function () {
	const restartHeight = function() { $('body').css('height', $(window).height() + 'px'); }
	const minHeight = function(){ $('body').css('minHeight', $(window).height() + 'px'); }
	minHeight();
	restartHeight();
	$(window).resize(function () {
		restartHeight();

	});

}

