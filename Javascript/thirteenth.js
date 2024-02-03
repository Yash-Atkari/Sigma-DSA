// fetch API

// const URL = "https://cat-fact.herokuapp.com/facts";
// const factPara = document.querySelector("#fact");


// const  getFacts = async () => {
//     console.log("Getting data...");
//     let response = await fetch(URL);
//     console.log(response);        // JSON format
//     let data = await response.json();
//     factPara.innerText = data[4].text;
//     // console.log(response.status);
// };                              

// function getFacts() {
//     fetch(URL).then((response) => {
//         return response.json();
//     })

//     .then((data) => {
//         console.log(data);
//         factPara.innerText = data[4].text;
//     });

// }

// btn.addEventListener("click", getFacts);