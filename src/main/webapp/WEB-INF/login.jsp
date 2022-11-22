<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- Font Awesome -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
    />
    <!-- MDB -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.css"
            rel="stylesheet"
    />

    <!-- MDB -->
    <script
            type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.js"
    ></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <style type="text/css">
        .divider:after,
        .divider:before {
            content: "";
            flex: 1;
            height: 1px;
            background: #eee;
        }
    </style>
</head>
<body>
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://images.unsplash.com/photo-1454165804606-c3d57bc86b40?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <form method="POST" action="/login">
                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <label for="username">Username</label>
                        <input type="text" id="username" name="username" class="form-control form-control-lg"/>
                    </div>

                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <label for="password">Password</label>
                        <input type="password" id="password" name="password" class="form-control form-control-lg"/>
                    </div>
                        <a href="/registration">Not Registered?</a>
                    <!-- Submit button -->
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input type="submit" value="Login" class="btn btn-primary btn-lg btn-block"/>


                    <c:if test="${logoutMessage != null}">
                        <c:out value="${logoutMessage}"></c:out>
                    </c:if>
                    <c:if test="${errorMessage != null}">
                        <c:out value="${errorMessage}"></c:out>
                    </c:if>
                </form>
            </div>
        </div>
    </div>
</section>
<%--<c:if test="${logoutMessage != null}">--%>
<%--    <c:out value="${logoutMessage}"></c:out>--%>
<%--</c:if>--%>
<%--<c:if test="${errorMessage != null}">--%>
<%--    <c:out value="${errorMessage}"></c:out>--%>
<%--</c:if>--%>
<%--<form method="POST" action="/login">--%>
<%--    <p>--%>
<%--        <label for="username">Username</label>--%>
<%--        <input type="text" id="username" name="username"/>--%>
<%--    </p>--%>
<%--    <p>--%>
<%--        <label for="password">Password</label>--%>
<%--        <input type="password" id="password" name="password"/>--%>
<%--    </p>--%>
<%--    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
<%--    <input type="submit" value="Login!"/>--%>
<%--</form>--%>
</body>
</html>
