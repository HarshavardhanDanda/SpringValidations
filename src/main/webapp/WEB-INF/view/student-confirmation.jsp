<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
    <title> Student Confirmation</title>
</head>
<body>
<h1> the student is confirmed: ${student.firstName} ${student.lastName} </h1> <!--calls student.getFirstName and getLastName-->
<h2>Country: ${student.country}</h2>
<h2>Favorite Language: ${student.favoriteLanguage}</h2><br>
Operating systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
    <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>
