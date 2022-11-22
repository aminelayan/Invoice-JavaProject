<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Main Page</title>
</head>
<body>

<h1>Welcome, <c:out value="${currentUser.username}"></c:out></h1>
<table class="table" style="margin-top: 10px">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="items" items="${allItems}">
        <tr>
            <td><a href="/items/${items.id}">${items.name}</a></td>
            <td>${items.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button type="submit" class="btn btn-danger"><a href ='/items/new'>Create Item</a></button>
</body>
</html>