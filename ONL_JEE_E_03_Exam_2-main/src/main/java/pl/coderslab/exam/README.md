### Task 1 (2 pts)

1. Create a servlet available at **/register**.
2. Display a form with fields on the page:
    * well-known technologies - multiple choice checkboxes 
    (The values to choose from are: Servlets, JSP, Java, MySQL)
    * github login - text field
3. Create the form in jsp, send by **POST**
4. When sent, retrieve the data and display them on the screen. You can use the following code for this purpose:

```java
response.getWriter().append("login: ");
```


## Task 2 (4 pts)

1. Create a servlet available at **/furniture**.
2. Display all furniture information in a html table. 
Individual information should be displayed in separate table cells. Use the JSP file.
3. Use the available `FurnitureDao` class, and the `Furniture` class.
4. In the Furniture table, a link should be available next to each row to remove the furniture from the list.
5. After removing a line, display the shortened list again.
6. Keep the furniture data in session.


## Task 3 (4 pts)

1. Create a servlet available at **/createCookie**.
2. Display a form that allows you to create cookies, the form should have the fields `name` and `value`.  Use the JSP file.
3. When a cookie is created, display a list of all cookies.
4. Create a servlet available at **/deleteCookie**. Use the JSP file.
5. Display a form that allows you to delete cookies with the name given in it.
6. After deleting a cookie, display a list of all cookies. 
