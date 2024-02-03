// Attributes - To get the attribute value  

// let div = document.querySelector("div");
// console.dir(div);

// let attr1 = div.getAttribute("id"); // Access Attribute of any Element
// console.dir(attr1);

// let attr2 = div.getAttribute("name"); // Access Attribute of any Element
// console.dir(attr2);  

// let para = document.querySelector("p");
// console.dir(para.getAttribute("class"));

// Attributes - To set the attribute value 

// let para = document.querySelector("p");
// para.setAttribute("class", "para1");
// console.dir(para.getAttribute("class"));

// Access Style of any element

// let div = document.querySelector("div");
// console.dir(div.style); // Access Style

// div.style.backgroundColor = "green"; // Change Style

// div.style.fontSize = "26px"; // Change Style

// div.innerText = "Hello!"; // Change content

// div.style.visibility = "hidden"

//Insert Element

// Creating a node 

// let newBtn = document.createElement("button");
// newBtn.innerText = "Click me";

// Adding a node 

// let div = document.querySelector("div");
// div.append(newBtn); // At the end and inside
// div.prepend(newBtn); // At the start and inside

// div.before(newBtn); // At the start and outside
// div.after(newBtn); // At the end and outside

// Creating a node

// let newHding = document.createElement("h1");
// newHding.innerHTML = "<i>May I come in</i>";

// Adding a node 

// let body = document.querySelector("body");
// body.prepend(newHding);

// Remove Element

// let para = document.querySelector("p");
// para.remove();                       

// Practice Que1

// let h2 = document.querySelector("h2");
// console.dir(h2.innerText);
// h2.innerText = h2.innerText + "from Apna College students";
// console.dir(h2.innerText);

// Practice Que2

// let divs = document.querySelectorAll(".box");
// console.log(divs);

// let idx = 0;
// for (let div of divs) {
//     div.innerText = `Unique value ${idx}`
//     idx++;
// }

// Practice Que3

// // Creating an Element

// let newBtn = document.createElement("button");
// newBtn.innerText = "click me";

// newBtn.style.backgroundColor = "red";
// newBtn.style.color = "white";

// // Adding an Element

// let body = document.querySelector("body");
// body.prepend(newBtn);

// Practice Que4 *new

// let p = document.querySelector(".content");
// console.log(p.classList);
// console.log(p.classList.add("newClass"));
// console.log(p.classList);
// console.log(p.classList.remove("newClass"));
// console.log(p.classList);