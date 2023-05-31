// Напишите функцию, которая принимает два числовых аргумента и возвращает наименьшее из них.
console.log("TASK 1");
function findMin(a, b) {
  if (a > b) {
    return b;
  } else {
    return a;
  }
}
console.log(findMin(5, 10));
console.log(findMin(10, 5));

// Напишите функцию, которая принимает два числовых аргумента и выводит в консоль все четные числа от большего к меньшему.
console.log("TASK 2");
function showEvens(a, b) {
  for (let i = b; i >= a; i--) {
    if (i % 2 === 0) {
      console.log(i);
    }
  }
  for (let i = a; i >= b; i--) {
    if (i % 2 === 0) {
      console.log(i);
    }
  }
}
showEvens(8, 10);
showEvens(8, 0);

// Напишите функцию power, которая принимает два числовых аргумента (основание степени и саму степень) и возвращает число в указанной степени. Значение степени должно быть указано по умолчанию 2.
console.log("TASK 3");
function power(a, b = 2) {
  return a ** b;
}
console.log(power(2, 2));
console.log(power(2));
console.log(power(9));
console.log(power(3, 4));

// Напишите функцию, которая принимает числовой аргумент n и считает сумму чисел от 1 до n.
console.log("TASK 4");
function findSumm(n) {
  return (n * (n + 1)) / 2;
}
console.log(findSumm(5));
console.log(findSumm(6));
console.log(findSumm(7));

// Напишите функцию, которая принимает два числовых аргумента n и m и считает сумму четных чисел и нечетных чисел от n до m. Суммы выведите в консоль (в начале сумму четных чисел, а затем сумму нечетных).
console.log("TASK 5");
function findSummEvenOdd(n, m) {
  let sumEven = 0;
  let sumOdd = 0;
  for (let i = n; i <= m; i++) {
    if (i % 2 === 0) {
      sumEven += i;
    } else {
      sumOdd += i;
    }
  }
  console.log(sumEven);
  console.log(sumOdd);
}
findSummEvenOdd(1, 7);

// Напишите функцию, которая принимает в качестве аргументов массив строк, а возвращает первый самый длинный элемент массива. Если входной массив пуст, функция возвращает null. Если есть несколько одинаковых по длине элементов - функция возвращает первый из этих элементов.
// // Пример: [ 'one', 'two', 'three' ] => 'three'
console.log("TASK 6");
function findLongestWord(array) {
  let longestWord = "";
  array.forEach(function (word) {
    if (word.length > longestWord.length) {
      longestWord = word;
    }
  });
  return longestWord;
}
let word = findLongestWord(["one", "two", "three"]);
console.log(word);

// *Создайте элемент select с 5 опциями с текстом "Опция 1", "Опция 2" и т.д., и добавьте его на страницу:
console.log("TASK 7");
const array = ["Option 1", "Option 2", "Option 3", "Option 4", "Option 5"];
const selectElem = document.createElement("select");
const divElem = document.querySelector(".select");
for (let i = 0; i < array.length; i++) {
  const optionElem = document.createElement("option");
  optionElem.innerText = array[i];
  selectElem.append(optionElem);
}
divElem.append(selectElem);
console.log(selectElem);

// **Создайте таблицу с 3 столбцами и 3 строками и заполните ее следующими числами соотвественно:
// 1 2 3
// 4 5 6
// 7 8 9
console.log("TASK 8");
const table = document.createElement("table");
for (let index = 0; index < 3; index++) {
  const trElem = document.createElement("tr");
  for (let index = 0; index < 3; index++) {
    const tdElem = document.createElement("td");
    trElem.append(tdElem);
    table.append(trElem);
  }
}
// }
document.body.append(table);
console.log(table);
