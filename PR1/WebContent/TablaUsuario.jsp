<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr style="background:#BDBDBD">
<th> Apellidos </th>
<th> Nombre </th>
<th> email </th>
<th> admin </th>
</tr>
<c:forEach items="${Usuario}" var="user" varStatus="estado">
<c:if test="${estado.count%2 == 0}">
<tr style="background:#81BEF7">
</c:if>
<c:if test="${estado.count%2 != 0}">
<tr style="background:#01A9DB">
</c:if>
<td><c:out value="${user.apellidos}" /></td>
<td><c:out value="${user.nombre}" /></td>
<td><c:out value="${user.email}" /></td>
<td><c:out value="${user.admin}" /></td>
</c:forEach> </table>
<br><br>Lista de correos:
<c:forEach items="${Usuario}" var="user" varStatus="estado">
<c:out value="${user.email}"/><c:if test="${!estado.last}">,</c:if></c:forEach>
<br>
<a href="mailto:<c:forEach items="${profesores}" var="prof" varStatus="estado">
<c:out value="${user.email}"/><c:if test="${!estado.last}">,</c:if></c:forEach>"></a>
</body>
</html>