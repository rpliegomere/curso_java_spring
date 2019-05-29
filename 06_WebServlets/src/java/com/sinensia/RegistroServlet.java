/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.google.gson.Gson;
import com.sinensia.modelo.MySQLCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Admin
 */
public class RegistroServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest peticion,
            HttpServletResponse respuesta)
            throws ServletException, IOException {
        respuesta.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuesta.getWriter()) {
            salida.println("<html><head>");
            salida.println("<title>Web servlet desde Java</title>");
            salida.println("</head><body>");
            salida.println("<h1>Respuesta al registro</h1>");
            salida.println("<h2>Ruta del servlet: "
                    + peticion.getContextPath() + ", metodo: "
                    + peticion.getMethod() + "</h2>");
            salida.println("<ul>");
            for (int i = 0; i < 3; i++) {
                salida.println("<li>Num " + i + "</li>");
            }
            salida.println("</ul>");
            
            String nombre = peticion.getParameter("nombre");
            String strEdad = peticion.getParameter("edad");
            int edad = Integer.parseInt(strEdad);
            String email = peticion.getParameter("email");
            String strActivo = peticion.getParameter("activo");
            boolean activo = false;
            if (strActivo != null)  
                activo = true;
            // boolean activo = strActivo != null;
            
            salida.println("<p>nombre = " + nombre + "</p>");
            salida.println("<p>edad = " + edad+ "</p>");
            salida.println("<p>email = " + email+ "</p>");
            salida.println("<p>activo = " + activo+ "</p>");
            
            MySQLCliente bdCliente = new MySQLCliente();
            if (bdCliente.crear(nombre, email, "Passwd1234", edad, activo)) {                
                salida.println("<p>Guardado correctamente</p>");
            } else {
                salida.println("<p>Guardado ERRONEAMENTE</p>");
            }
            
            salida.println("</body></html>");
            salida.println("");
            salida.println("");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        
        Gson gson = new Gson();
        gson.toJson(request);
        
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password_encrip");
        String edad = request.getParameter("edad");
        String activo = request.getParameter("activo");
        
        System.out.println(">>>>" + nombre);
        
        try (PrintWriter salida = response.getWriter()) {
            out.println(nombre);
            
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Registro clientes";
    }
}
