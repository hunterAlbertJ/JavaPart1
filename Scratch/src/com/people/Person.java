package com.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class
 * More correct = the class definition is written in such a way that
 * instances of it once created can not have their properties change value
 * getters but no setters
 */
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString(){
        return String.format("com.people.Person: name= %s, birthDate = %s, ", getName(), getBirthDate());
    }
}