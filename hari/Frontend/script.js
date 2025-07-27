
function check(){
    age=document.getElementById("age");
    age=parseInt(age.value);
    resultDisplay = document.getElementById("result");
     if (isNaN(age) || age<=18 || age>100) {
     resultDisplay.textContent = "You are NOT Eligible"; 
  } 
   else {
    resultDisplay.textContent = "You are Eligible";
   
  }
     console.log("Age entered:", age);
    
}