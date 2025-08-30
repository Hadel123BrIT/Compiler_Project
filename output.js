// Create <div id="app"></div>
const appDiv = document.createElement('div');
appDiv.id = 'app';

// Optional: Add some initial content or class
appDiv.className = 'container';
appDiv.textContent = 'App content will go here...';

// Append to <body> or a specific container
document.body.appendChild(appDiv);	let images = [{
	name:'Product 2',	source : 'https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_t.png',	details : 'Details of Product 2, (color):  black'
}
,{
	name:'Product 3',	source : 'https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_t.png',	details : 'Details of Product 3,(color): Beg'
}

,{
	name:'Product 4',	source : 'https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_t.png',	details : 'Details of Product 4,(color): light blue'
}

,{
	name:'Product 5',	source : 'https://fakestoreapi.com/img/71pWzhdJNwL._AC_UL640_QL65_ML3_t.png',	details : 'Details of Product 5, (color): Sliver'
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
  el.style.cssText = 'display: flex; justify-content: flex-start; align-items: flex-start;';

 el.appendChild((() => {
  const el = document.createElement('div');
  el.style.cssText = 'margin-right: 40px;';

 for (const image of images) {
el.appendChild((() => {
  const el = document.createElement('div');
  el.addEventListener('click',()=> selectProduct(image,3));
el.style.cssText = 'cursor: pointer; margin-bottom: 10px; padding: 10px; background-color:  #f0f0f0; border-radius: 5px;';

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
  el.style.cssText = 'padding: 50px; background-color: #f8f8f8; border-radius: 5px;';

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