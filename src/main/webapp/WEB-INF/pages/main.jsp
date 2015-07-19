<%--
  Created by IntelliJ IDEA.
  User: Chann
  Date: 7/18/2015
  Time: 8:07 AM
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
    <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

</head>
<body>


<h2>Student Management System</h2>

<div id="msgFormName"></div>

<form action="person/save" method="post" class="left" onSubmit="return validateForm()">
    <table border="1">

        <input type="hidden" name="id">

        <tr>
            <td>
                <label for="name">Person Name</label>
                <input type="text" id="name" name="name" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" class="right"/>
            </td>
        </tr>
        </td>
        </tr>
        <tr>
            <td>
                <label for="age">Age</label>
                <input type="text" id="age" name="age" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="department">Department</label>
                <input type="text" id="department" name="department" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="degree">Degree</label>
                <input type="text" id="degree" name="degree" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="indexNumber">Index Number</label>
                <input type="text" id="indexNumber" name="indexNumber" class="right"/>
            </td>
        </tr>
    </table>

    <input type="submit" value="Submit"/>

</form>

<table border="1" class="right">
    <div id="msgStudentList" class="right"></div>
    <c:forEach var="person" items="${studentList}">
        <tr>
            <td>${person.name}</td>
            <td><input type="button" value="view" onclick="viewStudent('${person.id}');" id="view"/></td>
            <td><input type="button" value="delete" onclick="window.location='student/delete?id=${person.id}'"/></td>
            <td><input type="button" value="edit" onclick="viewStudent('${person.id}');" id="edit"/></td>
        </tr>
    </c:forEach>
</table>
<div id="viewStudent" class="right"></div>

</body>
</html>