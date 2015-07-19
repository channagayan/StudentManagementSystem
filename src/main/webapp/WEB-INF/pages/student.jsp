<%--
  Created by IntelliJ IDEA.
  User: Chann
  Date: 7/18/2015
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>

</head>
<body>
<h2>Details of ${student.name} ${student.lastName}</h2>

<form action="student/edit" method="post">
    <table border="1">

        <input type="hidden" name="id" value="${student.id}">

        <tr>
            <td>
                <label for="name">Person Name</label>
                <input type="text" id="name" name="name" value="${student.name}" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" value="${student.lastName}" class="right"/>
            </td>
        </tr>
        </td>
        </tr>
        <tr>
            <td>
                <label for="age">Age</label>
                <input type="text" id="age" name="age" value="${student.age}" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="department">Department</label>
                <input type="text" id="department" name="department" value="${student.department}" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="degree">Degree</label>
                <input type="text" id="degree" name="degree" value="${student.degree}" class="right"/>
            </td>
        </tr>
        <tr>
            <td>
                <label for="indexNumber">Index Number</label>
                <input type="text" id="indexNumber" name="indexNumber" value="${student.indexNumber}" class="right"/>
            </td>
        </tr>
    </table>

    <input type="submit" value="Edit"/>
</form>

</body>
</html>