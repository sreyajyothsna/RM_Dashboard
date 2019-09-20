<!-- Availability.jsp-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
window.onload = function() {
 
var dps = [[], [],[]];
var chart = new CanvasJS.Chart("chartContainer", {
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
		
		dataPoints: dps[0],
		color:"Orange",
		width:38
	
	},
	{
		type: "column",
		name: "Maximum Bench Strength",
		showInLegend: true,
		
		dataPoints: dps[1],
		color:"Grey",
		width:38
	
	},
	{
		type: "line",
		name:"Minimum Bench Strength",
		showInLegend: true,
		dataPoints: dps[2],
		color:"Blue",
		width:38
	}
	
	]
});
 
var yValue;
var label;
 

<c:forEach items="${dataPointsList}" var="dataPoints" varStatus="loop">	
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
 
function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else {
		e.dataSeries.visible = true;
	}
	e.chart.render();
}
 
}
</script>
</head>
<body>
	<div id="chartContainer" style="height: 151px; width:30%;"></div>
	<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>