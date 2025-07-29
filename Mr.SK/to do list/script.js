function Display() {
  let data = document.getElementById('input').value;
  let mainContainer = document.getElementById('container');

  let element = document.createElement('div');
  element.setAttribute('id', 'ind-task');
  element.innerHTML = `<label>${data}</label> 
                       <button onclick="DeleteTask(event)">Delete</button>`;

  mainContainer.appendChild(element);
  document.getElementById('input').value = ""; // Clear input
}

function DeleteTask(event) {
  event.target.parentNode.remove();
}