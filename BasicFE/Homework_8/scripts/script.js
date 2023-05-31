// Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). Добавить созданные параграфы в div с классом numbers.
console.log("TASK 1");
const divNumbers = document.querySelector(".numbers");
for (let index = 100; index >= 50; index -= 10) {
  const pElem = document.createElement("p");
  pElem.innerText = index;
  divNumbers.append(pElem);
}
console.log(divNumbers);

// Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container. Строки взять произвольные.
console.log("TASK 2");
const divStrings = document.querySelector(".strings_container");
const stringsContainer = [
  "String 1",
  "String 2",
  "String 3",
  "String 4",
  "String 5",
];
for (let index = 0; index < stringsContainer.length; index++) {
  const pElem = document.createElement("p");
  pElem.innerText = stringsContainer[index];
  divStrings.append(pElem);
}
console.log(divStrings);

// Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) - и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. Добавить все карточки в div с классом users_container.
console.log("TASK 3");
const divUsers = document.querySelector(".users_container");
const usersContainer = [
  {
    first_name: "Bob",
    last_name: "Nills",
    age: 5,
  },
  {
    first_name: "Andy",
    last_name: "Darling",
    age: 18,
  },
  {
    first_name: "Sara",
    last_name: "Smith",
    age: 17,
  },
  {
    first_name: "Tailor",
    last_name: "Brown",
    age: 19,
  },
];

for (let index = 0; index < usersContainer.length; index++) {
  const { first_name, last_name, age } = usersContainer[index];
  if (age >= 18) {
    const pElem = document.createElement("p");
    pElem.innerText = `User's name: ${first_name} ${last_name}. Age: ${age}`;
    divUsers.append(pElem);
  }
}
console.log(divUsers);

// **Создать кнопку и таблицу с 9 ячейками. При клике на кнопку случайным образом менять цвет и содержимое каждой ячейки.
console.log("TASK 4");
const button = document.createElement("button");
button.innerText = "Table Changer";
const table = document.createElement("table");
for (let index = 0; index < 3; index++) {
  const trElem = document.createElement("tr");
  for (let index = 0; index < 3; index++) {
    const tdElem = document.createElement("td");
    button.addEventListener("click", function () {
      tdElem.innerText = Math.floor(Math.random() * 1000000 + 1);
      tdElem.style.backgroundColor =
        "#" + Math.floor(Math.random() * 16777215).toString(16);
    });
    trElem.append(tdElem);
    table.append(trElem);
  }
}
document.body.append(button, table);
console.log(table);

// **Создать страницу с кнопкой и блоком с текстом. При клике на кнопку реализовать следующую логику:
// 1.Сгенерировать случайный цвет и установить его в качестве фона блока с текстом.
// 2.Создать массив из нескольких произвольных строк.
// 3.Сгенерировать случайный индекс элемента в массиве и выбрать соответствующую строку.
// 4.Вставить выбранную строку в блок с текстом.
console.log("TASK 5");
const buttonElem = document.createElement("button");
buttonElem.innerText = "Text Changer";
const divElem = document.querySelector(".text");
const pElem = document.createElement("p");
pElem.innerText =
  "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta, officia, iure voluptatum quidem accusantium, magni deserunt eum sequi saepe suscipit commodi. Cumque architecto dignissimos unde veritatis debitis earum quasi illum.Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta, officia, iure voluptatum quidem accusantium, magni deserunt eum sequi saepe suscipit commodi. Cumque architecto dignissimos unde veritatis debitis earum quasi illum.";
divElem.append(buttonElem,pElem);
buttonElem.addEventListener("click", function () {
  divElem.style.backgroundColor =
    "#" + Math.floor(Math.random() * 16777215).toString(16);
  let arrayStrings = [
    "I love Java Script",
    "This is my Homework number 8",
    "This is some random text",
    "Hello",
    "Have a nice day",
    "This is text from array",
    "Random is a super power",
    "My name is Kate",
  ];
  const pRandom = document.createElement("p");
  let rand = Math.floor(Math.random() * arrayStrings.length);
  pRandom.innerText = arrayStrings[rand];
  divElem.append(pRandom);
});
console.log(divElem);
