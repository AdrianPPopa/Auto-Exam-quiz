<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Auto Exam</title>
</head>
<body>
<h2>Auto Exam</h2>

<div class="quizmain">
    <h3></h3>

    <ol type ="1">
        <li>
            <ol type="a">
                <li>

                </li>
            </ol>
        </li>
        </c:forEach>
    </ol>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<%--<script src="resources/js/questions.js"></script>--%>
<script src="resources/js/answers.js"></script>

</body>
</html>




