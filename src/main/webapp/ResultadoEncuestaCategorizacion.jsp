<%@page import="Logica.EncuestaCategorizacionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <style>
              html, body {
                height: 100%;
                margin: 0;
                padding: 0;
                overflow: hidden; /* Evita el scroll */
            }

            .navbar-custom {
                background-color: #7A7A7A; /* Un tono de gris */
            }

            .full-height {
                height: calc(100vh - 56px); /* Ajusta la altura total menos la altura del navbar */
                display: flex;
                justify-content: center; /* Centra horizontalmente */
                align-items: center;    /* Centra verticalmente */
                text-align: center;     /* Alinea el texto al centro */
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-custom">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">MPS</a>
            </div>
        </nav>
        
        <%
            EncuestaCategorizacionVO encuestaCate = (EncuestaCategorizacionVO) request.getSession().getAttribute("encuestaCatego");
        %>
        <div class="full-height">
            <div>
                <h1>Categoria:</h1>
                <h2><%=encuestaCate.getCategoriaPaciente()%></h2>
            </div>
        </div>
    </body>
</html>
