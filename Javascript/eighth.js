// Events handling // Highest priority in js file not inline event handling

// let btn1 = document.querySelector("#btn1");
// btn1.onclick = (evt) => { // evt - Event Object
//     console.log("btn1 was clicked");
//     console.log(evt);
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX, evt.clientY);
// };

// let div = document.querySelector("div");
// div.onmouseover = (evt) => { // evt - Event Object
//     console.log("hovering");
//     console.log(evt);
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX, evt.clientY);
// };

// Event Listener

// btn1.addEventListener("click", (evt) => {
//     console.log("btn1 was clicked");
//     console.log(evt);
//     console.log(evt.type);
//     console.log(evt.target);
// });

// btn1.addEventListener("click", () => {
//     console.log("btn1 was clicked");
// });

// Remove Events

// btn1.addEventListener("click", () => {
//     console.log("btn1 was clicked - handler1");
// });

// btn1.addEventListener("click", () => {
//     console.log("btn1 was clicked - handler2");
// });

// btn1.addEventListener("click", () => {
//     console.log("btn1 was clicked - handler3");
// });

// // Remove - can't work

// const handler3 = () => {
//     console.log("btn1 was clicked - handler3");
// };

// btn1.removeEventListener("click", handler3);
 
// Practice Que1

// let modeBtn = document.querySelector("#mode");
// let body = document.querySelector("body");
// let currMode = "light";

// modeBtn.addEventListener("click", () => {
//     if (currMode === "light") {
//         currMode = "dark";
//         body.classList.add("dark");
//         body.classList.remove("light");

//     } else {
//         currMode = "light";
//         body.classList.add("light");
//         body.classList.remove("dark");
//     }
//     console.log(currMode); 
// });