<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title> Student Registration Form</title>
</head>
<body>
  <h1>Student Registration Form</h1>
   <form:form action="processForm" modelAttribute="student">
       First name: <form:input path="firstName" /><!--on submit, spring will call student.setFirstName()-->
       <br><br>
       Last name: <form:input path="lastName" /><!--on submit, spring will call student.setLastName()-->
       <br><br>

       <form:select path="country"><!--on submit, spring will call student.setCountry()-->
           <!--<form:option value="brazil" label="brazil" /> this is how we normally add them-->
           <form:options items="${student.countryOptions}" />
       </form:select>

       <br><br>
       Java <form:radiobutton path="favoriteLanguage" value="Java" /><!--value is seen on output screen-->
       C# <form:radiobutton path="favoriteLanguage" value="C#" />
       Python <form:radiobutton path="favoriteLanguage" value="Python" />
       Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
       <br><br>

       Operating Systems:
       Linux <form:checkbox path="OperatingSystems" value="Linux" /><!--value is seen on output screen-->
       Mac OS <form:checkbox path="OperatingSystems" value="Mac OS" />
       Windows <form:checkbox path="OperatingSystems" value="MS Windows" />

       <br><br>
       <input type="submit" value="Submit"/>
   </form:form>

</body>
</html>
