<header><h1>Web ventas</h1></header>
<nav>
    <a href="registro.jsp">Nuevo cliente</a>
    <a href="listado.jsp">Listado clientes</a>
    <a href="listado_sql.jsp">Listado JSTL - SQL</a>
    <a href="clientes.do">Listado JSTL y JavaBeans</a>
    
    <form method="GET" action="clientes.do">
        <input type="text" id="nombre" name="nombre"/>
        <input type="submit" value="BUSCAR"/>
    </form>
    <%-- Cookies con el (Expression Language) --%>
    <span>${cookie.nombre_busqueda.value}</span>
    <span id="cookie_nom"></span>
</nav>
<script src="js/cookies.js"></script>
