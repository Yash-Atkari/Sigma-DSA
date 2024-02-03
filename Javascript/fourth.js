// Arrays in JS - collection of key(index)-value pairs

// let heroes = ["ironman", "thor", "hulk", "shaktiman",  "antman", "spiderman"];
// console.log(heroes);
// console.log(typeof heroes);
// console.log(heroes.length);// length property

// Array indices -> Mutable

// let cars = ["Suzuki", "Honda", "Audi", "Ford", "Mercedes"];
// console.log(cars);
// console.log(cars[4]); // Individual element access
// cars[1] = "Scoda";  // Update element
// console.log(cars);

// Loops over an Array

// let heroes = ["ironman", "thor", "hulk", "shaktiman",  "antman", "spiderman"];

// for (let i = 0; i < heroes.length; i++) {    // for loop
//     console.log(heroes[i]);
// }

// for (let val of heroes) {    // for-of loop
//     console.log(val);
// }

// for (let idx in heroes) {   // for-in loop
//     console.log(heroes[idx]);
// }

// Array Methods 

// Push Method

// let foodItems = ["potato", "apple", "lichi", "tomato"];
// foodItems.push("chips", "paneer", "butter");
// console.log(foodItems);

// Pop Method

// let deletedItem = foodItems.pop();
// console.log(foodItems);
// console.log("Deleted item =", deletedItem);

// toString Method

// console.log(foodItems);
// console.log(foodItems.toString());

// let marks = [45, 67, 76, 87, 68];
// console.log(marks.toString());

// Concatination Method

// let marvel_heroes = ["thor", "spiderman", "ironman"];
// let dc_heroes = ["superman", "batman"];
// let indian_heroes = ["shaktiman", "krish"];

// let heroes = marvel_heroes.concat(dc_heroes, indian_heroes);
// console.log(heroes);

// Unshift Method

// marvel_heroes.unshift("antman");
// console.log(marvel_heroes);
 
// Shift Method

// let deletedVal = marvel_heroes.shift();
// console.log("Deleted item =", deletedVal);
// console.log(marvel_heroes);

// Slice Methods
 
// let heroes = ["Tiger", "Varun", "Hritik", "Sidharth", "Shushant", "Amitabh"];
// console.log(heroes.slice(1,4));
// console.log(heroes.slice(1));
// console.log(heroes.slice());

// Splice Method - add, remove, replace

let arr = [1, 2, 3, 4, 5, 6];

// Add Element
// arr.splice(3, 2, 101, 102);
// console.log(arr);

// Remove Element
// arr.splice(2, 1);
// console.log(arr);

// Replace Element
// arr.splice(3, 1, 420);
// console.log(arr);

// Practice - Que1

// let studentMarks = [85, 97, 44, 37, 76, 60];

// let sum = 0;

// for (let val of studentMarks) {
//     sum = sum + val;                                    
// }

// let avg = sum / studentMarks.length;
// console.log(`The average marks of the class is ${avg}`);

// Practice - Que2

// let prices = [250, 645, 300, 900, 50];

// for (let i = 0; i < prices.length; i++) {
//     let offer = prices[i] * 0.1;
//     prices[i] = prices[i] - offer;
// }

// console.log(prices);

// Practice - Que3

// let companies = ["Bloomberg", "Microsoft", "Uber", "Google", "IBM", "Netflix"];

// companies.shift()
// console.log(companies);

// companies.splice(1, 1, "Ola"); 
// console.log(companies);

// companies.push("Amazon");
// console.log(companies);










