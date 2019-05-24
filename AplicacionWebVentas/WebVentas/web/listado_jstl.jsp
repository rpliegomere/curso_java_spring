<%-- 
    Document   : listado_jstl
    Created on : 24-may-2019, 13:50:20
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sinensia.modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--- <% List<Cliente> listaCliPorNombre = (ArrayList <Cliente>) request.getAttribute("listaPorNombre");%> ---%>
<jsp:useBean id="listaCliPorNombre" type="java.util.ArrayList<Cliente>" scope="request">
    <jsp:getProperty property="*" name="listaPorNombre"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                </tr>
            </thead>
           <%-- for (int i = 0; i < listaCliPorNombre.size(); i++){%>
           <tr><td><%= listaCliPorNombre.get(i).getNombre()%></td>
               <td><%= listaCliPorNombre.get(i).getEmail()%></td></tr>
           <% }--%>
           <c:forEach items="${listaPorNombre}" var="cli">
               <tr><td>${cli.nombre}</td>
               <td>${cli.email}</td></tr>
         
        </table><br>
    </body>
</html>
