<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Hire Category</title>
</head>
<body>
	<div align="center">
		
		<form:form action="savehiretable" method="post" modelAttribute="hireTable">
		<table border="1" cellpadding="5" style="border-collapse: collapse;">
				<tr style="background: gold">
					<th colspan="20">Edit Category</th>
				</tr>
				<tr style="display:none">
					<td>ID </td>
					<td>${hireTable.id}
						<form:hidden path="id"/>
					</td>
				</tr>
				<tr>
					<!-- <th hidden="true">ID: </th> -->
					<th style="background: lightgreen">Category</th>
					<th style="background: #14940d">P1</th>
					<th style="background: #14940d">P2</th>
					<th style="background: #14940d">P3</th>
					<th style="background: #14940d">P4</th>
					<th style="background: #5795cf">P5</th>
					<th style="background: #5795cf">P6</th>
					<th style="background: #5795cf">P7</th>
					<th style="background: #5795cf">P8</th>
					<th style="background: #5795cf">P9</th>
					<th style="background: #5795cf">P10</th>
					<th style="background: #5795cf">p11</th>
					<th style="background: #5795cf">P12</th>
					<th style="background: #5795cf">p13</th>
					<th style="background: #5795cf">Comments</th>

				</tr>
				
					<tr>
						
						<td style="background: lightgreen">${hireTable.category}<form:hidden path="category" style="width:40px"/></td>
						<td><form:input path="p1" style="width:20px"/></td>
						<td><form:input path="p2" style="width:20px"/></td>
						<td><form:input path="p3" style="width:20px"/></td>
						<td><form:input path="p4" style="width:20px"/></td>
						<td><form:input path="p5" style="width:20px"/></td>
						<td><form:input path="p6" style="width:20px"/></td>
						<td><form:input path="p7" style="width:20px"/></td>
						<td><form:input path="p8" style="width:20px"/></td>
						<td><form:input path="p9" style="width:20px"/></td>
						<td><form:input path="p10" style="width:20px"/></td>
						<td><form:input path="p11" style="width:20px"/></td>
						<td><form:input path="p12" style="width:20px"/></td>
						<td><form:input path="p13" style="width:20px"/></td>
						<td><form:input path="comments" style="width:60px"/></td>
						
						

					</tr>

			</table>
			</br>
			<input type="submit" value="Save">
			<%-- <table border="0" cellpadding="5">
				<tr>
					<td>ID: </td>
					<td>${hireTable.id}
						<form:hidden path="id"/>
					</td>
				</tr>			
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Email: </td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Address: </td>
					<td><form:input path="address" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
 --%>		</form:form>
	</div>
</body>
</html>