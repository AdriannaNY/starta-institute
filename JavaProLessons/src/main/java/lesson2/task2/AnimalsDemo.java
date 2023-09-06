package lesson2.task2;

public class AnimalsDemo {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3]; //create array of cats with length 3
        cats[0] = new Cat(); //create object of Cat and put it in the first element of array cats
        // cats[1] = new Dog(); //can't put object of Dog, will mistake

        LandAnimal[] landAnimals = new LandAnimal[3];
        landAnimals[0] = new Cat();
        landAnimals[1] = new Dog(); //no mistakes because Dog is subclass of class LandAnimals
        landAnimals[2] = new Cow();
        for (LandAnimal animal:landAnimals) {   //for each loop, objects will have own realisation of same method voice:mew! Gav! Mooo!
            animal.voice();   //method voice is in LandAnimal
        }

        Flyable[] flyables = new Flyable[2];
        flyables[0] = new Bird();
        flyables[1] = new Airplane();   //we put  in one array different entities that implements interface Flyable
        for (Flyable flyable: flyables) {
            flyable.fly();   //Полиморфизм времени выполнения. Не понимаем в коде, какой именно метод будет вызван. Поймем только во время выполнения программы
        }
        //Polymorphism - same method fly(), but different realisation
        //overloading (перегруженный метод) - полиморфизм времени компиляции. В коде понятно заранее, какой метод вызывется
        //когда методы имеют одинаковое название, но разные параметры
        Bird bird = new Bird();
        bird.fly();
        bird.fly(7);
        bird.live();

        //--------------------Lesson #4======================

        Flyable bird1 = new Bird(); //если создадим обьект bird1 через интерфейсную ссылку, будет доступен только метод интерфейса - fly()
        ((Bird) bird1).live(); // обьект bird1 привели к типу Bird,как и с примитивами int <-> long,  стали доступны все методы класса Bird(){}

    }
}
