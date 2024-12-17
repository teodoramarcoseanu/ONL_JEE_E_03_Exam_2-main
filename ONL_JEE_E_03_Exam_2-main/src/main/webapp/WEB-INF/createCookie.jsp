<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Cookie</title>
</head>
<body>
    <h2>Create a New Cookie</h2>
    <form action="<%= request.getRequestURI() %>" method="post">
        <label for="name">Cookie Name:</label>
        <input type="text" name="name" required/><br><br>
        <label for="value">Cookie Value:</label>
        <input type="text" name="value" required/><br><br>
        <input type="submit" value="Create Cookie"/>
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
