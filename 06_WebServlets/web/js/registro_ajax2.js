window.onload = function () {
    var btn_reg = document.getElementById("btn_registro_ajax");

    var pulsarBotonAjax = function () {
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


        var clienteJSON = JSON.stringify(cliente);
        alert("Cliente...\n" + clienteJSON);
        
        var form1 = document.getElementById("form1");
        var infoCli = new XMLHttpRequest();
        infoCli.open("POST", "http://localhost:8084/06_WebServlets/registro", true);
        infoCli.setRequestHeader("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        infoCli.send(clienteJSON);

        //console.log(">>>>>>" + clienteJSON);

    };

    document.getElementById("btn_registro_ajax").onclick = pulsarBotonAjax;
};

