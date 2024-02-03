// Synchronous Execution

// console.log("Hello!");
// console.log("Hello!");
// console.log("Hello!");

// Asynchronous Execution

// console.log("one");

// setTimeout(() => {
//     console.log("hello!");
// }, 2000); // timeout; 2s = 2000ms

// console.log("two");

// Callbacks

// function sum(a, b) {
//     console.log(a + b);
// }

// function calc(a, b, sumCallback) { // only sum is also allowed
//     sumCallback(a, b);
// }

// calc(1, 2, sum);

// or 

// calc(1, 2, (a, b) => {
//     console.log(a + b);
// });

// Asynchronous Execution

// const hello = () => {
//     console.log("hello");
// }

// setTimeout(hello, 3000); // It also takes callback 

// Callback Hell

// function getData(dataId, getNextData) {
//     setTimeout(() => {
//         console.log("data", dataId);
//         if (getNextData) {
//             getNextData();
//         }
//     }, 2000);
// }

// getData(1, () => {    // Callback hell
//     getData(2, () => {
//         getData(3, () => {
//             getData(4, () => {
//                 getData(5);
//             });
//         });
//     });
// });

// Promises   - resolve / fulfill, reject, pending 

// let promise = new Promise((resolve, reject) => {
//     console.log("I am a promise");
// });


// function getData(dataId, getNextData) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("data", dataId);
//             resolve("Success");
//             if (getNextData) {
//                 getNextData();
//             }
//         }, 5000);
//     });
// }     

// .then() and catch.()

// const getPromise = () => { 
//     return new Promise((resolve, reject) => {
//         console.log("I am a promise");
//         resolve("Success");
//         // reject("network Error occured");
//     });
// }

// let promise = getPromise();
// promise.then((res) => {
//     console.log("promise fulfilled", res);
// })

// promise.catch((err) => {
//     console.log("rejected", err);
// })

// Promise chains

// function asyncFunc1() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("some data1");
//             resolve("success");
//         }, 4000);
//     });
// }

// function asyncFunc2() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("some data2");
//             resolve("success");
//         }, 4000);
//     });
// }

// console.log("Fetching data1...")
// asyncFunc1().then((res) => {;         
//     console.log("Fetching data2...");
//     asyncFunc2().then((res) => {});
// });

// Async- Awaits

// function api() {
//     return new Promise((resolve, reject) => {
//         setTimeout( () => {
//             console.log("weather data");
//             resolve(200);
//         }, 2000);
//     });
// }

// async function getWeatherData() {
//     await api();// 1st
//     await api();// 2nd
// }  

// async function hello() {
//     console.log("hello");
// }

