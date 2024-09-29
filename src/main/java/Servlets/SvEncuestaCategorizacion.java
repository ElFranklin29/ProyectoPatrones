/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.EncuestaCategorizacionVO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class SvEncuestaCategorizacion extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        EncuestaCategorizacionVO encuestaCatego = new EncuestaCategorizacionVO();
        
        int estadoAnimo = Integer.parseInt(request.getParameter("EstadoAnimo"));
        int situacionEstresante = Integer.parseInt(request.getParameter("SituacionEstresante"));
        int relacionComida = Integer.parseInt(request.getParameter("RelacionComida"));
        int patronSueno = Integer.parseInt(request.getParameter("PatronSueno"));
   
        int respuestas[]= new int[4];
        
        respuestas[0]= estadoAnimo;
        respuestas[1]= situacionEstresante;
        respuestas[2]= relacionComida;
        respuestas[3]= patronSueno;
        
        encuestaCatego.setRespuestas(respuestas);
        
        encuestaCatego.conteoRespuestas();
        encuestaCatego.categorizarArea();
        
        
        HttpSession miSesion= request.getSession();
        miSesion.setAttribute("encuestaCatego", encuestaCatego);
        
        response.sendRedirect("ResultadoEncuestaCategorizacion.jsp");
        
              /*
        System.out.println("estAnimo: "+ estadoAnimo);
        System.out.println("sitEstresante: "+ situacionEstresante);
        System.out.println("relacionComida: "+ relacionComida);
        System.out.println("patronSueno: "+ patronSueno);
        */
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
        
    }

}
