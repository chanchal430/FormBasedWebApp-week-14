<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee confirmation</title>
</head>
<body>

				The registration of employee is confirmed  : ${employeeModel.firstName } ${employeeModel.lastName }
				<br>
				<br>
				
				The department assinged is :  ${ employeeModel.department}
				<br>
				<br>
				
				The technologies that employee knows  : 
				<!--${employeeModel.technologies}  -->
            <!--  We are going to iterate over the object technologies -->
            <ul>
                  <c:forEach  var="temp"  items=" ${ employeeModel.technologies }">
                  
                <li>$(temp)</li>
                
            </c:forEach>
            </ul>
</body>
</html>