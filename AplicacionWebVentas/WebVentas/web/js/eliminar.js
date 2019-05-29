/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var deleteButtons = document.getElementById()("btn_borrar");
  for(var i = 0; i < deleteButtons.length; i++){
    deleteButtons[i].addEventListener('click', deleteListItem, false);
  }
  
  function deleteListItem(){
  	alert("Item was deleted");
    // li.classList.add("delete");
}

