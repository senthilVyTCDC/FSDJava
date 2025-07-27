
function loop(){
    const uname=document.getElementById("name");
    const name = uname.value.trim();
    const repeat=document.getElementById("nooftime");
    const count = parseInt(repeat.value);
    const output = document.getElementById("output");
    output.innerHTML = '';
      for (let i = 0; i < count; i++) {
        const p = document.createElement('p'); 
        p.textContent = `${i + 1}. ${name}`; 
        output.appendChild(p); 
    }
    uname.value = '';
    repeat.value = '';
}
