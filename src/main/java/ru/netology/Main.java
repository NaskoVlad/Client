package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAddress("Сидней")
                .setAge(31)
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        mom.happyBirthday();
        System.out.println("У " + mom + " есть сын, " + son);
        System.out.println(son.hasAge());
        System.out.println(mom.getAge());
        System.out.println(son.getAge());

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}