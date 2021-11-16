<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head >
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<s:head/></head>
<body>
	<h1 class="titulo">register</h1>
		<s:form method="post" action="teste">
		<s:textfield label="Nome para a turma -1" name="pessoa"/>
		<s:textfield label="Nome para a turma -1" name="pessoa"/>
		<s:set var="turmaList">AA</s:set>
		<button type="submit">Salvar</button>
	</s:form>
</body>
</html>