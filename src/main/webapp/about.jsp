<%--
  Created by IntelliJ IDEA.
  User: Adi
  Date: 12/1/2019
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>About</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet" >
</head>
<body>
<div id="cssmenu">
    <ul>
        <li><a href="index.jsp"> Home </a></li>
        <li>Login</li>
        <li>Register</li>
        <li><a href="about.jsp">About</a></li>
        <li> <c:if test="${pageContext.request.userPrincipal.name != null}">
            <form id="logoutForm" method="POST" action="${contextPath}/logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>

            <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </c:if>
        </li>
    </ul>

</div>

<div class="cssbodyabout"></div>


<div class="footer-area">
    <p>This is the project for my final exam.</p>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
