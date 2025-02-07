package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException("Возраст недопустимый");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
            throw new IllegalStateException("Не хватает обязательных полей");
        } else {
            return new Person(name, surname, age, address);
        }
    }
}
