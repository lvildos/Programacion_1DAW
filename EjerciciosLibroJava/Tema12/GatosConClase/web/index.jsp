<%-- 
    Document   : index
    Created on : 26 may. 2023, 2:06:00
    Author     : USUARIO
--%>

<%-- index.jsp (proyecto GatosConClaseYBocadillos) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw1.Gato"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Nutrias con clase y bocadillos</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
    <% 
    String gato1nombre = request.getParameter("nutria1");
    String gato2nombre = request.getParameter("nutria2");
    String gato3nombre = request.getParameter("nutria3");
    
    
    %>
    <h1>Nutrias con clase</h1>
    <hr>
    <%
    Gato g1 = new Gato(gato1nombre, "nutria1.png");
    Gato g2 = new Gato(gato2nombre, "nutria2.png");
    Gato g3 = new Gato(gato3nombre, "nutria3.png");%>
    
    <div class="container">
        <div class="marisol-container">
            <%= g1.toString() %>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <div class="ruperta-container">
            <%= g2.toString() %>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br>
        <div class="esmeralda-container" >
            <%= g3.toString() %>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <div>
            <%= g1.grita() %>
        </div>
        
        <div class="come-container">
            <%= g2.come("ensalada de canónigos") %>
        </div>
    </div>
</body>
</html>
