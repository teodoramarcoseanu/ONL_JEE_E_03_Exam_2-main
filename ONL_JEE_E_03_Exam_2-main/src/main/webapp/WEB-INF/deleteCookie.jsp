<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Cookie</title>
</head>
<body>
    <h2>Delete a Cookie</h2>
    <form action="<%= request.getRequestURI() %>" method="post">
        <label for="nameToDelete">Cookie Name to Delete:</label>
        <input type="text" name="nameToDelete" required/><br><br>
        <input type="submit" value="Delete Cookie"/>
    </form>

    <h2>All Cookies</h2>
    <ul>
        <%
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
        %>
            <li><%= cookie.getName() %>: <%= cookie.getValue() %></li>
        <%
                }
            } else {
        %>
            <li>No cookies found.</li>
        <%
            }
        %>
    </ul>
</body>
</html>
