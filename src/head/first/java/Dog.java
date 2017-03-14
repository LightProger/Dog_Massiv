package head.first.java;

public class Dog {

    private String name;

    public static void main(String[] args) {
	// Создаем объект Dog
        Dog dog1 = new Dog();
        dog1.name = "Барт";
        dog1.bark();

        // Создаем массив типа Dog
        Dog[] myDog = new Dog[3];

        // Помещаем в него несколько элементов
        myDog[0] = new Dog();
        myDog[1] = new Dog();
        myDog[2] = dog1;

        // Теперь получаем доступ к объектам с помощью ссылок из массива
        myDog[0].name = "Фред";
        myDog[1].name = "Джордж";

        // Для каждой собаки определим метод bark()
        int x = 0;
        while (x < myDog.length){
            myDog[x].bark();
            x += 1;
        }
    }
    private void bark() {
        System.out.println(name + " сказал Гав!");
    }
}
