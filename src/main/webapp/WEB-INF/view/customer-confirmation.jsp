<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!Doctype html>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
    <h2>The customer is confirmed: ${customer.firstName} ${customer.lastName}</h2><br>
<h2> Free passes: ${customer.freePasses}</h2><br>
<h2>Postal Code: ${customer.postalCode}</h2><br>
    <h2>Postal Code: ${customer.email}</h2>
    <h2> Course code: ${customer.courseCode}</h2>
</body>
</html>