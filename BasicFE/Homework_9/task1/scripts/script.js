// Создать в html форму с тремя инпутами (имя, фамилия, возраст). Написать скрипт, который при отправке формы выводит собранные данные в консоль.
// Доработать процесс таким образом, чтобы при отправке формы данные из нее добавлялись в массив users в виде объекта.
// Реализовать функцию rerender. Эта функция очищает контейнер с карточками и создает множество карточек с пользователями из массива. Настроить rerender при добавлении нового пользователя.
// Доработать rerender таким образом, чтобы при двойном клике по карточке из массива удалялся пользователь по id и вызывался rerender.
console.log("Task1");
const users = [];
const form = document.querySelector("form");
const usersDiv = document.querySelector(".users");
const nameInp = document.querySelector("#name");
const surnameInp = document.querySelector("#surname");
const ageInp = document.querySelector("#age");

function createUsersCard(name, surname, age) {
  const cardDiv = document.createElement("div");
  cardDiv.classList.add("card");
  const pElemName = document.createElement("p");
  pElemName.innerText = `Name: ${name}`;
  const pElemSurname = document.createElement("p");
  pElemSurname.innerText = `Surname: ${surname}`;
  const pElemAge = document.createElement("p");
  pElemAge.innerText = `Surname: ${age}`;
  cardDiv.append(pElemName, pElemSurname, pElemAge);
  return cardDiv;
}

function rerender() {
  usersDiv.innerHTML = "";
  for (let index = 0; index < users.length; index++) {
    const { name, surname, age } = users[index];
    const card = createUsersCard(name, surname, age);
    usersDiv.append(card);
    card.addEventListener("dblclick", function () {
      users.splice(index, 1);
      rerender();
    });
  }
}

form.addEventListener("submit", function (event) {
  event.preventDefault();
  const userInfo = {
    name: nameInp.value,
    surname: surnameInp.value,
    age: ageInp.value,
  };
  users.push(userInfo);
  console.log(users);
  rerender();
  form.reset();
});

