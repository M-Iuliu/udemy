package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String species;

    public Person(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void findHumanOrAnomaly(String name, String species) {
        if((!Objects.equals(species, "Alien")) && (Objects.equals(species, "Human"))){
            System.out.println("Is not an alien, it`s a " + species + ".");
            System.out.println("Hello " + name + "!");
        }

        if ((Objects.equals(species, "Alien")) || (Objects.equals(species, "Demon"))){
            System.out.println("Strange things are happening!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}

