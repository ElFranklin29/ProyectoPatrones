<%@page import="Logica.EncuestaDiariaVO"%>
<%@page import="Logica.ControladoraLogica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <style>
            .navbar-custom {
                background-color: #7A7A7A; /* Un tono de gris */
            }

            .center-page {
                display: flex;
                justify-content: center;
                align-items: center;
                margin-top: 25vh;
            }

            /* Estilos para la columna Balance General */
            td.texto-largo {
                max-width: 150px; /* Define un ancho máximo */
                white-space: nowrap; /* Evita saltos de línea */
                overflow: hidden; /* Oculta el texto desbordante */
                text-overflow: ellipsis; /* Muestra los puntos suspensivos */
            }
        </style>
    </head>

    <body>

        <nav class="navbar navbar-custom">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">MPS</a>
            </div>
        </nav>

        <!-- Div para centrar la tabla -->
        <div class="container center-page">
            <table class="table table-hover text-center">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Estado Animo</th>
                        <th scope="col">Nivel Energia</th>
                        <th scope="col">Estres/Ansiedad</th>
                        <th scope="col">Balance General</th>
                        <th scope="col">Recomendacion</th>
                    </tr>
                </thead>
                <tbody>

                    <%
                        ControladoraLogica controlLog = (ControladoraLogica) request.getSession().getAttribute("controlLog");
                        int cont = 1;
                        for (EncuestaDiariaVO encuestaVO : controlLog.getEncuestasDiarias()) {
                            System.out.println(encuestaVO.getEstadoAnimo() + " , " + encuestaVO.getEstresAnsiedad());
                    %>
                    <tr>
                        <th scope="row"><%=cont%></th>
                        <td><%=encuestaVO.getEstadoAnimo()%></td>
                        <td><%=encuestaVO.getNivelEnergia()%></td>
                        <td><%=encuestaVO.getEstresAnsiedad()%></td>
                        <td class="texto-largo"><%=encuestaVO.getBalanceGeneral()%></td>
                        <td class="texto-largo"><%=encuestaVO.getRecomendacion()%></td>
                    </tr>
                    <%
                        cont++;
                        }
                    %>

                </tbody>
            </table>
        </div>

    </body>
</html>

