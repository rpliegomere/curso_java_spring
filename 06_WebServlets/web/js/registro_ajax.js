window.onload = function(){
    var btn_reg = document.getElementById("btn_registro_ajax");
    
    var alPulsarModificar = function () {
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    var cliente = {
        "nombre": nombre,
        email: email,
        'edad': edad
    };
    
    cliente["activo"] = activo;
    
    var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
    alert("Enviando...\n" + clienteJSON);    
   
    // ActiveX para IE 7
    var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX
    // ¿Que tiene que hacer al recibir la respuesta?
    peticionHTTP.onreadystatechange = function () {
        // alert("Ha cambiado de estado");
        if (this.readyState === 4 && this.status === 200) {
             alert("Hemos recibido algo!" + this.responseText);     
            var jsonResp = this.responseText;
            var objResp = JSON.parse(jsonResp); // Deserializar JSON  en un objeto JS
            alert ("¿Email recibido?  "  + objResp["email"]
                    + " Y el nombre es  " + objResp.nombre + " El id es " + objResp.id);
            
            var divInfo = document.getElementById("div_info");
            divInfo.style = "display: block";
            
            document.getElementById("span_nombre").innerHTML = objResp.nombre;
            document.getElementById("span_email").innerHTML = objResp.email;
            document.getElementById("span_edad").innerHTML = objResp.edad;
            
            document.getElementById("span_activo").innerHTML = objResp.activo;
            
            
        } else {
            alert("Aun NO hemos recibido nada!");
        }
    };
    // Definimos la petición
    // document.location = "www.otraweb.com";
    peticionHTTP.open("POST", "http://localhost:8084/06_WebServlets/registro", true);
    peticionHTTP.setRequestHeader("Content-type" , 
            "application/x-www-form-urlencoded");
    // lanzamos la petición
    var form1 = document.getElementById("form1");
    var formData = new FormData(form1);
    var cadenaEnvio = 
          "nombre=" + encodeURIComponent(document.getElementById("nombre").value)
          + "&email=" + encodeURIComponent(document.getElementById("email").value)
         
          + "&activo=" + encodeURIComponent(document.getElementById("activo").value)
          + "&edad=" + encodeURIComponent(document.getElementById("edad").value);
    
    alert("¿Qué se va a enviar?\n" + cadenaEnvio);
    peticionHTTP.send(cadenaEnvio);
};
//};
// document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar );
document.getElementById("btn_registro_ajax").onclick = alPulsarModificar;

};

