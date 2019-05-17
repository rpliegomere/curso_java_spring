/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log("Generar tabla...");
generarTabla();
function generarTabla(){
    var nomTipo = document.getElementById("tipo3").value;
    var nomNombre = document.getElementById("nombre2").value;
    var nomPrecio = document.getElementById("precio").value;
    var nomStock = document.getElementById("stock").value;
    
    var table = document.getElementsByTagName("table");
    var nombrePrecio = "Precio cosas";
    table = table[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    table.innerHTML += `<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
        <th>Stock</th></tr>
</thead>`;
    
    var lista = new Array();
    lista [0]= ["algo1", "algo2", "algo3", "7"];
    lista [1] = ["algo4", "algo5", "algo6", "2"];
    lista [2] = ["algo7", "algo8", "algo9", "6"];
    lista [3] = [nomTipo, nomNombre, nomPrecio, nomStock];
    
    for (var i = 0; i < lista.length; i++){
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]){
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
            
        }
    }
}


function generarTablaV2(){
    var nomTipo = document.getElementById("tipo3").value;
    var nomNombre = document.getElementById("nombre2").value;
    var nomPrecio = document.getElementById("precio").value;
    var nomStock = document.getElementById("stock").value;
    
    var table = document.getElementsByTagName("table");
    var nombrePrecio = "Precio cosas";
    table = table[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    table.innerHTML += `<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
        <th>Stock</th></tr>
</thead>`;
    
    var lista = new Array();
    lista [lista.length] = [nomTipo, nomNombre, nomPrecio, nomStock];
   for (var i = 0; i < lista.length; i++){
   
    lista [i] = [nomTipo, nomNombre, nomPrecio, nomStock];
    
     
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]){
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
            
        }
    }
}