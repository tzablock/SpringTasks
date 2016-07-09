<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>TODO Home</title>
</head>
<body>
    <c:forEach items="${tasks}" var="task">
        <div style="background-color:white; color:black; padding:20px; border: 1px solid black;">
            <h2 style="margin: 30px">
                <li>${task.name}</li>
            </h2>
            <p>${task.text}</p>
        </div>
    </c:forEach>
</body>
</html>
