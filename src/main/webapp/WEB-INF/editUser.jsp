<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <!-- Favicons -->
    <link href="/img/favicon.png" rel="icon">
    <link href="/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="/vendor/aos/aos.css" rel="stylesheet">
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="/css/style.css" rel="stylesheet">
    <title>Edit an Item</title>
</head>
<body>
<header id="header" class="header fixed-top">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">

        <a href="/" class="logo d-flex align-items-center">
            <img src="/img/InvoiceTracker-logos.jpeg" alt="Logo">
            <span>Invoice Tracker</span>
        </a>

        <nav id="navbar" class="navbar">
            <ul>
                <li><a class="nav-link disabled"> <c:out value="${currentUser.username}"></c:out></a></li>
                <li><a class="nav-link " href="/invoices">Invoices</a></li>
                <li><a class="nav-link " href="/items">Items</a></li>
                <li><a class="nav-link " href="/users">Users</a></li>
                <form id="logoutForm" method="POST" action="/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input style="background: white;border: white solid 1px; color: #0a53be; margin-left: 10px;margin-bottom: -13px"  type="submit" value="Logout" />
                </form>
            </ul>
            <i class="bi bi-list mobile-nav-toggle"></i>
        </nav><!-- .navbar -->

    </div>
</header><!-- End Header -->

<div style="margin: 20px;text-align: center;">
<h1 style="margin-left: 10px" >Edit User</h1>
<form:form action="/users/${id}/edit" method="post" modelAttribute="editUser">
    <input type="hidden" name="_method" value="put">
        <div class="form-group">
            <form:label path="username">Name: </form:label>
            <form:errors path="username" class="alert alert-danger p-1" role="alert"/>
            <form:input path="username" placeholder="${user.username}"/>
        </div>
        <div class="form-group">
            <form:label path="password">Password: </form:label>
            <form:errors path="password" class="alert alert-danger p-1" role="alert"/>
            <form:input type="password" path="password" />
        </div>
    <div class="form-group">
        <form:label path="roles">Role: </form:label>
        <form:select path="roles">
            <c:forEach var="roles" items="${roles}">
                <option value="${roles.id}">${roles.name}</option>
            </c:forEach>
        </form:select>
    </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="submit" class="btn btn-secondary"><a href="/items">Cancel</a></button>
    </form:form>
</div>
<script src="/vendor/purecounter/purecounter_vanilla.js"></script>
<script src="/vendor/aos/aos.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="/vendor/glightbox/js/glightbox.min.js"></script>
<script src="/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="/vendor/swiper/swiper-bundle.min.js"></script>
<script src="/vendor/php-email-form/validate.js"></script>
</body>
</html>