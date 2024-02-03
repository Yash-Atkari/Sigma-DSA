// Loops in JS - for loop

// Print 5 times

// for (let i = 1; i <= 5; i++) { // try with var 
//     console.log("Hello JS!",i);
// }
// console.log("loop has ended");

// Print 1 - 5

// for (let i = 1; i <= 5; i++) { // try with var 
//     console.log("i =",i);
// }
// console.log("i =",i);


// Sum of first n numbers

// let n = prompt("Enter a number:");
// let sum = 0;
// for (let i = 1; i <= n; i++) {
//     sum = sum + i;
// }
// console.log("Sum of first",n,"natural numbers is",sum);

// Loops in JS - infinite loop

// for (let i = 1; i >= 0; i++) {
//     console.log("i =", i);
// }

// Loops in JS - while loop

// Print 5 times

// let i = 1;
// while (i <= 5) {
//     console.log("Hello JS!"); 
//     i++;
// }

// Loops in JS - do - while loop

// let i = 1;
// do {                     //Run at least one time
//     console.log("i =",i)
//     i++;
// }while(i >= 10);

// Loops in JS - for-of loop : To iterate on string / arrays

// let str = "Javascript";

// let length = 0;
// for (let val of str) { // iterator -> characters
//     console.log(val);
//     length++;
// }
// console.log("String length =",length);

// Loops in JS - for-in loop : To iterate on keys of an objects

// let student = {
//     name : "Yash Atkari",
//     age : 18,
//     cgpa : 9.5,
//     isPass : true
// };

// for (let key in student) { // iterator -> key
//     console.log(`The value of key ${key} is ${student[key]}`);
// }

// Strings in JS 

// let str = "Version2.0"; // or 'Version2.0'
// console.log(str);
// console.log(str.length);
// console.log(str[4]);

// Template Literals in JS 

// let specialString = `This is a Template Literal ${1 + 2 + 3}`;
// console.log(specialString);
// console.log(typeof specialString);

// Why this??

// let obj = {
//     item : "pen",
//     price : 10
// } 

// console.log(`The cost of ${obj.item} is ${obj.price} rupees.`);// adding placeholders -> String Interpolation

// Escape characters - \n , \t

// let str = "Yash\tAtkari";
// console.log(str);
// console.log(str.length);
// console.log(str[6]);

// String Methods - Strings are immutable

// let str = "Yash Atkari";
// console.log(str.toUpperCase()); // new str
// console.log(str.toLowerCase()); // new str
// console.log(str); // original string is as it is

// let str = "   Yash Atkari   ";
// console.log(str.trim()); // remove whitespaces

// Slice Method

// let str = "01234567";
// console.log(str.slice(1,4));

// Concatinate Method

// let str1 = "Yash";
// let str2 = "Atkari";
// let result  = str1.concat(str2); // Using + also -> str1 + str2
// console.log(result);

// Replace Method - not create a new string

// let str = "Hellololo";
// console.log(str.replace("lo","p")); // replace first matching
// console.log(str.replaceAll("lo","p")); // replace all matching
// console.log(str);

// charAt Method

// let str = "ILoveJS";
// console.log(str.charAt(6)); // To access characters using their index

// Practice - Que1

// for (let num = 0; num <= 100; num++) {
//     if (num % 2 ===0) {
//         console.log(`${num} is a even number`);
//     }
// }
                          
// Practice - Que2

// let gameNum = 21;

// let userNum = prompt("Guess the Game Number:");
// console.log(`Your guessed number is ${userNum}`);

// while (userNum != gameNum) {
//     userNum = prompt("You guess wrong number, guess again:");
// }
// alert("Congratulations, You guessed the right game number.");

// Practice - Que3

// let fullName = prompt("Enter full name without spaces:").toLowerCase();
// let userName = "@" + fullName + fullName.length;
// alert(`Your Username is ${userName}`);














