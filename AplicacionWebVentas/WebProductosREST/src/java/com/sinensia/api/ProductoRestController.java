package com.sinensia.api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

// Decoradores en forma de anotación
@WebServlet( asyncSupported = true, urlPatterns = "/api/productos" )
public class ProductoRestController extends HttpServlet    
{
    private ServicioProductoSingleton servProd;
    
    @Override
    public void init(){
        servProd = ServicioProductoSingleton.getInstancia();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter escritorRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");
        // 
        BufferedReader bufRead = request.getReader();

      StringBuilder textoJson = new StringBuilder();
        for (String lineaJson = bufRead.readLine(); 
                lineaJson != null; 
                lineaJson = bufRead.readLine()) {
            
            textoJson.append(lineaJson);
        }
        bufRead.close();
      
        JSONObject json = new JSONObject(textoJson.toString());
        
        System.out.println(">>>>>>" + json);
        
        JSONArray jsonArray = json.getJSONArray("productos");
for (int i = 0; i < jsonArray.length(); i++) {
    JSONObject explrObject = jsonArray.getJSONObject(i);
    String nombre = jsonArray.getString(0);
}

JSONObject
       
        
        
        
        System.out.println(">>>> " + jsonArray.getString(0));
       
        /*Gson gson = new Gson();
        Producto producto = gson.fromJson(jsonArray, Producto.class);*/
        
        servProd.insertar();
        
        System.out.println(">>>> " + producto.getNombre());
        
       /* producto.setNombre(producto.getNombre().toUpperCase());
        producto.setPrecio("5000 bolivares");
        
       
                
        servProd.modificar(producto);*/
        
        String jsonRespuesta = gson.toJson(producto);
        escritorRespuesta.println(jsonArray);
    }
}
