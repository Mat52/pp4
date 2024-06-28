getProducts = () => {
  return fetch("/api/products")
      .then(response => response.json());
}

getCurrentOffer = () => {
  return fetch("/api/current-offer")
      .then(response => response.json());
}

createProductHtmlEl = (productData) => {
  const template = `
        <div>
            <img src="https://th.bing.com/th/id/OIP.3l6m4ceUVdN0Ij5Rsk9dmwHaHa?rs=1&pid=ImgDetMain">
            <h4>${productData.name}</h4>
            <span>${productData.description}</span>
            <span>${productData.price}</span>
            <button data-id ="${productData.id}"> Add to cart</button>
        </div>
    `;
  const newEl = document.createElement("li");
  newEl.innerHTML = template.trim();
  return newEl;
}

document.addEventListener("DOMContentLoaded", () => {
  console.log("it works");
  const productsList = document.querySelector("#productsList");
  getProducts()
      .then(products => products.map(createProductHtmlEl))
      .then(productsHtmls => {
        productsHtmls.forEach(htmlEl => productsList.appendChild(htmlEl))
      });
})