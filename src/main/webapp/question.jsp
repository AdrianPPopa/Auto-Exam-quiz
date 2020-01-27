<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Auto Exam</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body class="quiz-component">
<h2>Auto Exam</h2>

<form:form method="POST" action="${pageContext.request.contextPath}/questions/submit">
<div class="quizmain">
    <ol type="a">
        <li>
        <ol type="a">
           <li>
           </li>
           <li>
           </li>
           <li>
           </li>
        </ol>
        </li>
    </ol>
</div>
    <input class="btn btn-primary btn-lg" type="submit" value="Submit">
</form:form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="resources/js/answers.js"></script>


</body>
</html>




