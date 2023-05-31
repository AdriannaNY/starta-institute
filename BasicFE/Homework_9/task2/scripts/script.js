
// Создать галерею изображений с кнопками для перемещения между изображениями. Написать скрипт, который при клике на кнопку "Следующее" или "Предыдущее" (вместо слов могут быть стрелки) меняет текущее изображение на следующее или предыдущее в зависимости от нажатой кнопки. Также при клике на изображение должна выводиться информация об этом изображении снизу в прозрачном контейнере.
// Доработать процесс таким образом, чтобы при клике на кнопку "Добавить изображение" появлялось модальное окно с формой для добавления ссылки на изображение и его описания. После заполнения формы и нажатия на кнопку "Добавить" новое изображение должно добавляться в галерею.
// Добавить кнопку удаления в углу изображения и написать код который при нажатии на эту кнопку удалит это изображения из массива.
// Реализовать функцию rerender. Эта функция очищает контейнер с изображениями и создает множество изображений из массива. Настроить rerender при добавлении и удалении изображения.
console.log("Task2");
const imageContainers = document.querySelectorAll(".card");
const gallery = document.querySelector(".gallery-container");
const prevButton = document.querySelector(".prev-button");
const nextButton = document.querySelector(".next-button");
const deleteBtn = document.querySelector('.delete-image');
let currentIndex = 0;
const images = [];

function showImage(index) {
  imageContainers.forEach((container, i) => {
    if (i === index) {
      container.querySelector(".gallery-image").style.opacity = "1";
      container.querySelector(".image-info").style.opacity = "1";
    } else {
      container.querySelector(".gallery-image").style.opacity = "0.2";
      container.querySelector(".image-info").style.opacity = "0";
    }
  })
  }
showImage(currentIndex);
images.push(imageContainers)
deleteBtn.addEventListener("click", function() {
  modal.style.display = "none";
  rerender()
})

prevButton.addEventListener("click", () => {
  currentIndex--;
  if (currentIndex < 0) {
    currentIndex = imageContainers.length - 1;
  }
  showImage(currentIndex);
});

nextButton.addEventListener("click", () => {
  currentIndex++;
  if (currentIndex >= imageContainers.length) {
    currentIndex = 0;
  }
  showImage(currentIndex);
});

const addBtn = document.querySelector('.add-image');
const urlInp = document.querySelector("#url");
const infoInp = document.querySelector("#info");
const modal = document.querySelector('.modal');
gallery.classList.add("gallery-container")
const modalForm = modal.querySelector('form');
const modalImageUrl = modal.querySelector('#url');
const modalImageDescription = modal.querySelector('#info');

addBtn.onclick = function() {
  modal.style.display = "block";
}

// Когда пользователь отправляет форму, добавить новое изображение в галерею
modalForm.onsubmit = function(event) {
    event.preventDefault(); // Остановить стандартную отправку формы

    // Получить значения из формы
    const imageUrl = urlInp.value
    const imageDescription = infoInp.value;

    // Создать новый элемент с изображением и описанием
    const newImage = document.createElement("div");
    newImage.innerHTML = '<img src="' + imageUrl + '" alt="' + imageDescription + '"><p>' + imageDescription + '</p>';
    newImage.classList.add("gallery-container")

    // Добавить новый элемент в галерею
    gallery.append(newImage);

    // Закрыть модальное окно
    modal.style.display = "none";

    // Очистить форму
    modalForm.reset();
  }

 

  // Функция для перерендеринга галереи изображений
function rerender() {
    gallery.innerHTML = '';
    imageContainers.forEach((image) => {
      const img = image.img;
      const info = image.info;
    })
}

