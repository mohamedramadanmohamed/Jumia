<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, tr, td{
border:1px solid #000;
}
</style>
</head>
<body>
<table style="border:1px solid #000;">
	<c:forEach items="${todos}" var="todo">
        <tr>
            <td>Employee ID: <c:out value="${todo.id}"/></td>
            <td>Employee Pass: <c:out value="${todo.user}"/></td>  
        </tr>
    </c:forEach>
    </table>
</body>
</html>