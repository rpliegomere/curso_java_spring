<%-- 
    Document   : Listado
    Created on : 24-may-2019, 9:32:24
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sinensia.modelo.logica.*" %>
<%@page import="com.sinensia.modelo.Cliente" %>
<%! ServicioClientes srvCli; %>
<% srvCli = new ServicioClientes(); 
List<Cliente> clientes = srvCli.obtenerTodos();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado Lientes</h1>
        <table border>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                </tr>
            </thead>
           <% for (Cliente cli : clientes){
             out.println("<tr><td>"+ cli.getNombre()+ "</td>");
                     out.println("<td>"+ cli.getEmail()+ "</td></tr>");
           } %>
         
        </table><br>
        
    </body>
</html>
