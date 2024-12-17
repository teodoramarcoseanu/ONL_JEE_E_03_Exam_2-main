<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furniture List</title>
</head>
<body>
    <h2>Furniture List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="furniture" items="${furnitureList}">
                <tr>
                    <td>${furniture.name}</td>
                    <td>${furniture.description}</td>
                    <td>${furniture.quantity}</td>
                    <td>
                        <!-- Link to remove furniture item -->
                        <form action="${pageContext.request.contextPath}/furniture" method="POST">
                            <input type="hidden" name="removeId" value="${furniture.id}"/>
                            <input type="submit" value="Remove"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
