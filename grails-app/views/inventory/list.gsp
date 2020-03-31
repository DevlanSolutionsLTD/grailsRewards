<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 3/30/20
  Time: 12:41 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<h1>All Products Are</h1>
<table border="1">
    <g:each in="${allProducts}" var="myProduct">
        <tr>
            <td>${myProduct.name}</td>
            <td>${myProduct.sku}</td>
            <td>${myProduct.price}</td>

        </tr>
    </g:each>
</table>
</body>
</html>