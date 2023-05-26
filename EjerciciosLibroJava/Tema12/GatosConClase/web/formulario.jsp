<%-- 
    Document   : formulario
    Created on : 26 may. 2023, 17:26:48
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elegir nombres</title>
        <link rel="stylesheet" type="text/css" href="estilos.css" />
    </head>
    <body>
        <style>
            h3 {
              text-align: left;
              font-size: 30px;
              color: cornsilk;
              font-family: "Verdana";
              margin-left: 50px;
            }
            
            p {
              text-align: left;
              font-size: 20px;
              color: cornsilk;
              font-family: "Verdana";
              margin-left: 50px;
            }
            
            .p1{
              
              font-size:40px;
                
            }
        </style>
        <h1>NUTRIAS</h1>
        <div style="display:flex;">
            <div>
                <h3>10 curiosidades sobre las nutrias:</h3>
                <p>1. Existen en distintos tamaños</p>
                <p>2. Son parte de una familia mucho más grande</p>
                <p>3. Se pueden encontrar en todo el mundo, excepto en dos lugares</p>
                <p>4. Son carnívoras muy activas</p>
                <p>5. Tienen un gran apetito</p>
                <p>6. Las nutrias hacen un gran uso de las herramientas</p>
                <p>7. Tienen el pelaje más grueso del mundo</p>
                <p>8. Son increíblemente sociales</p>
                <p>9. Tienen una larga historia con los humanos</p>
                <p>10. Están en peligro de extinción</p>
                <br><br>
                <p class="p1" align="center">ELIJA EL NOMBRE DE LAS NUTRIAS</p>
            </div>
            <div style="float: right; margin-left: 10px;">
                <img src="nutrias.png" width="900px">
            </div>
        </div>
        
        <style>
            input[type="submit"] {
              background-color: cornsilk;
              color: black;
              padding: 10px 20px;
              display: inline-block;
              font-size: 16px;
              margin: 4px 2px;
              cursor: pointer;
              border-radius: 4px;
            }
         </style>
        
         <style>
            select {
              padding: 10px;
              font-size: 16px;
              border-radius: 4px;
              border: 1px solid #ccc;
              width: 200px;
            }
         </style>
        
        
        <form method="post" action="index.jsp" >
            <select name="nutria1">
                <option value="Marisol">Marisol</option>
                <option value="Ruperta">Ruperta</option>
                <option value="Esmeralda">Esmeralda</option>
            </select>
            <select name="nutria2">
                <option value="Marisol">Marisol</option>
                <option value="Ruperta">Ruperta</option>
                <option value="Esmeralda">Esmeralda</option>
            </select>
            <select name="nutria3">
                <option value="Marisol">Marisol</option>
                <option value="Ruperta">Ruperta</option>
                <option value="Esmeralda">Esmeralda</option>
            </select>
            
            <input type="submit" value="Enviar nombre">
        </form>
        
    </body>
</html>
