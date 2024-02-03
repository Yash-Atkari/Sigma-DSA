// Object Oriented programming

// const student = {
//     fullName: "yash atkari", // State or properties
//     marks: 94.4,             // State or properties
//     printMarks: function () {           // behaviour or Method or function
//       console.log("marks =", this.marks); // this ->  student.marks
//     },
// };

// console.log(student.printMarks());

// Prototype

// const employee = {
//     calcTax() {     // functions also define like this in objects
//         console.log("Tax rate is 10%");
//     }
// };

// const karanArjun = {
//     salary: 50000,
//     calcTax() {
//         console.log("Tax rate is 50%");
//     }
// };

// karanArjun.__proto__= employee;

// console.log(employee);
// console.log(karanArjun);
// console.log(karanArjun.calcTax());

// Classes and Objects

// class ToyotaCar {
// constructor(brand, mileage) {
//     this.brand = brand;
//     this.mileage = mileage;
// }

//     start() {
//         console.log("start");
//     }                               // No need to separate with comma

//     stop() {
//         console.log("stop");
//     }
// }

// let fortuner = new ToyotaCar("fortuner", 10);
// console.log(fortuner);
// let lexus = new ToyotaCar("lexus", 12);
// console.log(lexus);

// Inheritance 

// class Parents {
//     hello() {
//         console.log("hello");
//     }
// }

// class Child extends Parents {}

// let obj = new Child();

// console.log(obj.hello());

// class Person {
//     constructor(name) {
//         this.species = "homosapiens";
//         this.name = name;
//     }

//     eat() {
//         console.log("eat");
//     }

//     sleep() {
//         console.log("sleep");
//     }

//     work() {
//         console.log("do nothing")
//     }
// }

// class Engineer extends Person {
//     constructor(name) {
//         super(name); // to invoke parent class constructor
//     }

//     work() {
//         super.eat();
//         console.log("solve problems and build something");
//     }
// }

// class Doctor extends Person {
//     constructor (name) {
//         super(name);
//     }
//     work() {
//         console.log("treat patients");
//         super.sleep();
//     }
// }

// let ShradhaObj = new Engineer("Shradha");
// let SahilObj = new Doctor("Sahil");

// console.log(ShradhaObj);
// console.log(ShradhaObj.eat());
// console.log(ShradhaObj.sleep());
// console.log(ShradhaObj.work());

// console.log(SahilObj);
// console.log(SahilObj.eat());
// console.log(SahilObj.sleep());
// console.log(SahilObj.work())

// super keyword

// let engObj = new Engineer("Shradha")
// console.log(engObj);

// console.log(engObj.work());

// Practice Que1

// let data = "Apna College";

// class User {
//     constructor (name, email) {
//         this.name = name;
//         this.email = email;
//     }

//     viewData() {
//         console.log("View Data", data);
//     }
// }

// class Admin extends User {
//     constructor(name, email) {
//         super(name, email);
//     }
//     editData() {
//         data = "edited data";
//     }
// }

// let student1 = new User("Yash", "yashaatkari7@gmail.com");
// let student2 = new User("Sahil", "sahilaatkari11@gmail.com");
// let student3 = new User("Atharva", "atharvaatkari2010@gmail.com");

// let admin1 = new Admin("Amit", "amitkhande1@gmail.com");

// Error Handling

// let a = 23;
// let b = 46;
// console.log("a =", a);
// console.log("b =", b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// try {
//     console.log("a + b =", a + c);
// } catch (err) {
//     console.log(err);
// }
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);
// console.log("a + b =", a + b);