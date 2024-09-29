package Servlets;


import Logica.ControladoraLogica;
import Logica.EncuestaDiariaVO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class SvEncuestaDiaria extends HttpServlet {
    ControladoraLogica controlLog = new ControladoraLogica();
   
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
      
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("controlLog", controlLog);
        response.sendRedirect("HistorialEncuestaDiaria.jsp");
    }

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        EncuestaDiariaVO encuestaDiariaVO = new EncuestaDiariaVO();
        
        String estadoAnimo = request.getParameter("EstadoAnimo");
        String nivelEnergia = request.getParameter("NivelEnergia");
        String estresAnsiedad = request.getParameter("EstresAnsiedad");
        
        encuestaDiariaVO.setEstadoAnimo(estadoAnimo);
        encuestaDiariaVO.setNivelEnergia(nivelEnergia);
        encuestaDiariaVO.setEstresAnsiedad(estresAnsiedad);
        
        encuestaDiariaVO.combinatoriaRespuestas();
        
        controlLog.registrarEncuestaDiaria(encuestaDiariaVO);
        
        
        
        
         HttpSession miSesion= request.getSession();
         miSesion.setAttribute("encuestaDiariaVO", encuestaDiariaVO);
        response.sendRedirect("BalanceGeneral.jsp");
        
    
    
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
