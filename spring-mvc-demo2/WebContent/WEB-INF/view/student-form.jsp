<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<h3>Student Form:</h3>
	<form:form  action="save" method="post" modelAttribute="student">

		<table>
			<tr>
				<td>First name <form:input  path="first_name" /> <form:errors
						path="first_name" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Last name <form:input path="last_name" /></td>
			</tr>
			<br />
			<tr>
				<td>Countries <form:select path="country">
						<%-- 	<form:option value="brazil">brazil</form:option>
			<form:option value="india">india</form:option>
			<form:option value="france">france</form:option> --%>

						<form:options items="${student.countries }" />
					</form:select>
				</td>
			</tr>
			<br />

			<%-- Languages known: 
<form:checkboxes path="language"  items="${student.language }"/>
		


 --%>
			<tr>
				<td>Favorite Language: <form:radiobutton
						path="favoriteLanguage" value="Java" /> Java <form:radiobutton
						path="favoriteLanguage" value="Python" /> Python <form:radiobutton
						path="favoriteLanguage" value="C#" /> C# <form:radiobutton
						path="favoriteLanguage" value="C++" /> C++
				</td>
			</tr>
			<tr>
				<td>Operating System: <form:checkboxes path="operatingSystem"
						items="${student.operatingSystem}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>

			</tr>


		</table>
	</form:form>
	<a href="/spring-mvc-demo2/database/displayAll">Display all student</a>
</body>
</html>