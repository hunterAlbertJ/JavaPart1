package com.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("James", LocalDate.of(1999, 9, 30));
        System.out.println(p1.getAge());
    }
}