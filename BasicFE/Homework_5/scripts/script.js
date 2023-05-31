const num_1 = prompt("Write a number")
console.log(num_1*0.1)
const num_a = prompt("Write a first number")
const num_b = prompt("Write a second number, different from first")
const a = Number(num_a)
const b = Number(num_b)
if (a < b) {
    console.log(a)
} else {
    console.log(b)
}
const num_2 = prompt("Write a number")
const numb_2 = Number(num_2)
const hund = 100
if (numb_2 < hund) {
    console.log("The number is less then 100")
} else if (numb_2 == hund) {
    console.log("The number is 100")
} else {
    console.log("The number is more then 100")
}
const name = prompt("Write your name")
const age = prompt("Write your age")
const ageNumb = Number(age)
const adult = 18
if (ageNumb >= adult) {
    console.log(`Hello, ${name}`)
} else {
    console.log(`Hi, ${name}`)
}