/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.sinensia.modelo.MySQLCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        respuesta.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuesta.getWriter()) {
            salida.println("<html><head>");
            salida.println("<title>Web servlet desde Java</title>");
            salida.println("</head><body>");
            salida.println("<h1>Respuesta al registro</h1>");
            salida.println("<h2>Ruta del servlet: " + peticion.getContextPath() + peticion.getMethod() + "</h2>");
            salida.println("<ul>");
            for (int i = 0; i < 3; i++) {
                salida.println("<li> " + i + "</li>");
            }
            salida.println("</ul>");
            String nombre = peticion.getParameter("nombre");
            String strEdad = peticion.getParameter("edad");
            int edad = Integer.parseInt(strEdad);
            String email = peticion.getParameter("email");
            String activo = peticion.getParameter("activo");

            salida.println("<p>Nombre = " + nombre + "</p>");
            salida.println("<p>Edad = " + edad + "</p>");
            salida.println("<p>Email = " + email + "</p>");
            salida.println("<p>Activo = " + activo + "</p>");
            
            MySQLCliente bdCliente = new MySQLCliente();
            if (bdCliente.crear(nombre, email, "PASSWORD", edad, activo)){
                salida.println("<p>Guardado Correctamente</p>");
            }else {
                
            }
            
            salida.println("</body></html>");
            
            

        }
    }

    @Override
    public String getServletInfo() {
        return "Registro clientes";
    }
}
