// DOM - Way to access HTML in/through JS or To do Dynamic changes/manipulation in HTML code

// console.log("Hello!"); // To print

// alert("Hello!"); // pop-up

// console.dir(window);
// console.dir(window.document); // To print Properties and Methods of document object or any object
// // OR
// console.dir(document) 

// console.dir(document.body); 
// console.log(document.body); 
// console.dir(document.body.childNodes[1]); 
// console.log(document.body.childNodes[1]); 

// console.dir(document.body.childNodes[1].innerText = "Shradha Khapra"); 

// DOM Manipulation - Ways To access elements from HTML Document

// let heading = document.getElementById("heading");
// console.dir(heading); 
// console.log(heading); 

// let content = document.getElementsByClassName("content");
// console.dir(content);
// console.log(content);

// let mybutton = document.getElementById("mybutton");
// console.dir(mybutton);
// console.log(mybutton);


// let p = document.getElementsByTagName("p");
// console.log(p);


// Frequently used way - Query Selector 

// let firstEle = document.querySelector("p");// First matching element
// console.dir(firstEle);

// let EleAll1 = document.querySelectorAll("p");// All matching element - - It returns Node
// console.dir(EleAll1);

// let EleAll2 = document.querySelectorAll(".content");// Class matching element - - It returns Node
// console.dir(EleAll2);

// let EleAll3 = document.querySelector("#heading");// id matching element
// console.dir(EleAll3);

// console.dir(firstEle);
// console.dir(firstEle.tagName);

// console.dir(EleAll3);
// console.dir(EleAll3.tagName);

// Types of node - text, comment and *Element node

// console.dir(document.body.firstChild); // firstChild property
// console.dir(document.querySelector("body").children); // To print children of parent node

// innerText and innerHTML property 

// let div = document.querySelector("div");
// console.dir(div);
// console.dir(div.innerText); // to get (check) values
// console.dir(div.innerHTML); // to get (check) values

// console.dir(div.innerText = "Yash"); // to set values
// console.dir(div.innerHTML = "<div>inner div</div>"); // to set values

// let heading = document.querySelector("h1");
// console.dir(heading);
// console.dir(heading.innerHTML = "<i>Yash Atkari</i>");
                         
// let heading = document.querySelector("h1");
// console.dir(heading);
// console.dir(heading.innerText);

// textContent property

// console.dir(heading.textContent); // Show hidden content