<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Auto Exam</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet" >
</head>
<body class="index-component">
<div id="cssmenu">
    <ul>
        <li><a href="">Home</a></li>
        <li><a href="about.jsp">About</a></li>
        <li> <c:if test="${pageContext.request.userPrincipal.name != null}">
            <form id="logoutForm" method="POST" action="${contextPath}/logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>

            <a href="" onclick="document.forms['logoutForm'].submit()">Logout</a>
        </c:if>
        </li>
    </ul>
</div>

<a href="question.jsp" class="btn-lg btn-primary btn-block">Start Quiz</a>

<div class="footer-area">
    <p>If you don’t know where you are going, any road will get you there.</p>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>