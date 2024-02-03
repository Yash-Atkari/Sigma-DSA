// Functions in JS 

// function myFunction(msg) { // parameter
//     console.log(msg);
// }   

// myFunction("Goood Morning"); // argument

// Sum of two numbers

// function sum(a, b) { // a & b are local variables having block scope 
//     return a + b;
// }

// let result = sum(2, 3);
// console.log(result);

// Arrow Functions - Generally used

// const arrowSum = (a, b) => {
//     return a + b;
// };

// console.log(arrowSum);
// console.log(arrowSum(2, 3));

// const arrowMul = (x, y) => {
//     return x * y;
// };

// console.log(arrowMul);
// console.log(arrowMul(2, 3));

// for-Each loop in Arrays - to iterate over an Array - Method

// let arr = ["Yash", "Sahil", "Atharva", "Kalash", "Arohi"];

// arr.forEach(function printVal(val) {
//     console.log(val);
// });

// In the form of an arrow function - right way

// arr.forEach((val) => { 
//     console.log(val);
// });

// Contain 3 optional parameters 

// arr.forEach((val, idx, arr) => { 
//     console.log(val, idx, arr);
// });

// Higher order Functions/Methods - That either take another function as parameter inside them or they return another function as their output

// Some More Array Methods

// Map

// let nums = [89, 99, 79];

// let newArr = nums.map((val) => {
//     return val*2;
// });

// console.log(newArr);
// console.log(nums);
// OR

// let newArr = nums.map((val) => {
//     return val * val;
// });

// console.log(newArr);
// console.log(nums);

 // Filter Method

//  let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];

//  let evenArr = arr.filter( (val) => {
//     return val % 2 === 0;
//  });

//  let oddArr = arr.filter( (val) => {
//     return val % 2 !== 0;
//  });

//  console.log(evenArr);
//  console.log(oddArr);

//  console.log(arr);

// Reduce Method - to perform operations on multiple inputs and returns single value

// let arr = [5, 6, 2, 1, 3];

// const output = arr.reduce((prev, curr) => {
//     return prev > curr ? prev : curr;
// });

// console.log(output);

// Practice Que1

// let count = 0;

// function countVowel(str) {
//     for (let char of str) {                                                                   
//         if (char === "a" || char === "e"|| char === "i"|| char === "o"||char === "u") {
//             count++;
//         }
//     }
//     console.log(`The total number of vowels are ${count}`);
// }

// countVowel("atharva");

// Practice Que2

// let count = 0;

// const countVowel = (str) => {
//     for (let char of str) {
//         if (char === "a" || char === "e"|| char === "i"|| char === "o"||char === "u") {
//             count++;
//         }
//     }
//     console.log(`The total number of vowels are ${count}`);
// };

// countVowel("yash");

// Practice Que3

// let numbers = [2, 3, 6, 7, 8, 9];

// numbers.forEach( (num) => {
//     console.log(num * num);
// });

// this is also possible

// let calcSquare = (num) => {
//     console.log(num * num);
// };

// numbers.forEach(calcSquare);

// Practice Que4

// let marks = [56, 89, 99, 94, 97, 91];

// let toppers = marks.filter((val) => {
//     return val > 90;
// });

// console.log(toppers);

// Practice Que5

// let n = prompt("Enter a number:");

// let arr = [];

// for (let i = 1; i <= n; i++) {
//     arr[i-1] = i;
// }
// console.log(arr);

// const sum = arr.reduce((res, curr) => {
//     return res + curr;
// })
// console.log(sum);

// const product = arr.reduce((res, curr) => {
//     return res * curr;
// })
// console.log(product);


