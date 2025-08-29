// Create <div id="app"></div>
const appDiv = document.createElement('div');
appDiv.id = 'app';

// Optional: Add some initial content or class
appDiv.className = 'container';
appDiv.textContent = 'App content will go here...';

// Append to <body> or a specific container
document.body.appendChild(appDiv);	let images = [{
	name:'Product 1',	source : 'assets/Image/1.jpg',	details : 'Details of Product 1.'
}
,{
	name:'Product 2',	source : 'assets/Image/2.jpg',	details : 'Details of Product 2.'
}

,{
	name:'Product 3',	source : 'assets/Image/3.jpg ',	details : 'Details of Product 3.'
}

,{
	name:'Product 4',	source : 'assets/Image/4.jpg ',	details : 'Details of Product 4.'
}

]
;

	let selectedProduct = null
;

	function selectProduct(product,ima){
	selectedProduct = product;
render();
}
render();function render() {const main = document.getElementById('app');
 main.innerHTML = '';
main.appendChild((() => {
  const el = document.createElement('div');
  el.style.cssText = 'display: flex;';

 el.appendChild((() => {
  const el = document.createElement('div');
  el.style.cssText = 'margin-right: 20px;';

 for (const image of images) {
el.appendChild((() => {
  const el = document.createElement('div');
  el.addEventListener('click',()=> selectProduct(image,3));
el.style.cssText = 'cursor: pointer; margin-bottom: 10px;';

 el.appendChild((() => {
  const el = document.createElement('p');
  
   el.textContent = image.name;

  return el;
})())
;
el.appendChild((() => {
  const img = document.createElement('img');
  img.src = image.source;

  img.alt = image.name;

  img.style.cssText = 'width: 100px; display: block;';
  return img;
})());

  return el;
})());
}


  return el;
})())
;
if (selectedProduct) {
el.appendChild((() => {
  const el = document.createElement('div');
  
 el.appendChild((() => {
  const el = document.createElement('h2');
  
   el.textContent = selectedProduct.name;

  return el;
})())
;
el.appendChild((() => {
  const img = document.createElement('img');
  img.src = selectedProduct.source;

  img.alt = selectedProduct.name;

  img.style.cssText = 'width: 200px; display: block; margin-bottom: 10px;';
  return img;
})());
el.appendChild((() => {
  const el = document.createElement('p');
  
   el.textContent = selectedProduct.details;

  return el;
})())
;

  return el;
})());
}


  return el;
})())
;

}