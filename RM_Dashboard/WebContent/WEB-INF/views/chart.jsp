<!-- chart.jsp-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
window.onload = function() {
 
var dps = [[], [],[],[],[],[],[],[]];


var chart = new CanvasJS.Chart("chartContainer", {
	exportEnabled: true,
	animationEnabled: true,
	theme: "light1",
	title: {
		text: "Predicted Vs Actual Roll Offs"
	},
	axisY: {
		labelFontColor: "#4F81BC"
	},
	
	toolTip: {
		shared: true
	},
	legend: {
		cursor: "pointer",
		itemclick: toggleDataSeries
	},
	data: [{
		type: "column",
		name: "Roll off Forecast",
		showInLegend: true,
		
		dataPoints: dps[0],
		color:"Orange",
		width:38
	
	},
	{
		type: "column",
		name:"Roll-Offs Actual",
		showInLegend: true,
		dataPoints: dps[1],
		color:"Blue",
		width:38
	}
	
	]
});
 
var yValue;
var label;
 
<c:forEach items="${dataPointsList2}" var="dataPoints" varStatus="loop">	
<c:forEach items="${dataPoints}" var="dataPoint">
	yValue = parseFloat("${dataPoint.y}");
	label = "${dataPoint.label}";
	dps[parseInt("${loop.index}")].push({
		label : label,
		y : yValue,
	});		
</c:forEach>	
</c:forEach> 

chart.render();



var chart2 = new CanvasJS.Chart("chartContainer2", {
	exportEnabled: true,
	animationEnabled: true,
	theme: "light1",
	title: {
		text: "Availibility against threshold"
	},

	axisY: {
	
	
	
		labelFontColor: "#4F81BC",
		
		
	},
	
	toolTip: {
		shared: true
	},
	legend: {
		cursor: "pointer",
		itemclick: toggleDataSeries
	},
	data: [{
		type: "column",
		name: "Availibility",
		showInLegend: true,
		
		dataPoints: dps[2],
		color:"Orange",
		width:38
	
	},
	{
		type: "column",
		name: "Maximum Bench Strength",
		showInLegend: true,
		
		dataPoints: dps[3],
		color:"Grey",
		width:38
	
	},
	{
		type: "line",
		name:"Minimum Bench Strength",
		showInLegend: true,
		dataPoints: dps[4],
		color:"Blue",
		width:38
	}
	
	]
});
<c:forEach items="${dataPointsList2}" var="dataPoints" varStatus="loop">	
<c:forEach items="${dataPoints}" var="dataPoint">
	yValue = parseFloat("${dataPoint.y}");
	label = "${dataPoint.label}";
	dps[parseInt("${loop.index}")].push({
		label : label,
		y : yValue,
	});		
</c:forEach>	
</c:forEach>

chart2.render();

var chart3 = new CanvasJS.Chart("chartContainer3", {
	exportEnabled: true,
	animationEnabled: true,
	theme: "light1",
	title: {
		text: "Resignations against threshold"
	},

	
	
	axisY: {
	
	
	
		labelFontColor: "#4F81BC",
		
		
	},
	
	toolTip: {
		shared: true
	},
	legend: {
		cursor: "pointer",
		itemclick: toggleDataSeries
	},
	data: [{
		type: "column",
		name: "Resigned",
		showInLegend: true,
		
		dataPoints: dps[5],
		color:"Orange",
		width:38
	
	},
	{
		type: "line",
		name:"Allowable Attrition",
		showInLegend: true,
		dataPoints: dps[6],
		color:"Blue",
		width:38
	}
	
	]
});
 
var yValue;
var label;
 

<c:forEach items="${dataPointsList2}" var="dataPoints" varStatus="loop">	
<c:forEach items="${dataPoints}" var="dataPoint">
	yValue = parseFloat("${dataPoint.y}");
	label = "${dataPoint.label}";
	dps[parseInt("${loop.index}")].push({
		label : label,
		y : yValue,
	});		
</c:forEach>	
</c:forEach> 
chart3.render();

function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else {
		e.dataSeries.visible = true;
	}
	e.chart2.render();
}


 
}
</script>
</head>
<body>
     <div   id="chartContainer" style="height: 151px; width:40%;float:left "></div>
	
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
	
	<div  id="chartContainer2" style="height: 151px; width:30%;float:Right "></div>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
	
	<div id="chartContainer3" style="height: 151px; width:30%;float:Center"></div>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>