for (let index = 0; index < 11; index++) {
  if (index % 2 !== 0) {
    console.log(index);
  }
}

for (let i = 55; i >= 20; i--) {
  console.log(i);
}

const numbers = [3, 5, 11, 2, 8, 1, 6];
const numbers_squared = [];
for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
  numbers_squared.push(numbers[i] ** 2);
}
console.log(numbers_squared);
const last_elem = numbers_squared[6];
console.log(last_elem);

const user = {
  first_name: "Ivan",
  last_name: "Ivanov",
  age: 20,
  salary: 500,
};
console.log(
  `User's name is ${user.first_name} ${user.last_name}. He is ${user.age} years old`
);
