/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log("Generar tabla...");
generarTabla();
function generarTabla(){
    var table = document.getElementsByTagName("table");
    var nombrePrecio = "Precio cosasasasa";
    table = table[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    table.innerHTML += `<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th></tr>
</thead>`;
    
    var lista = new Array();
    lista  = [["algo1", "algo2", "algo3"]];
    lista [1] = ["algo4", "algo5", "algo6"];
    lista [2] = ["algo7", "algo8", "algo9"];
    
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