/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cequality.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Gilberto
 */
public class LambdaSearch {
        public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        
        print(animals, a -> a.canHop());
        System.out.println("-----------------------------------");
        print(animals, a -> a.canSwim());
        System.out.println("-----------------------------------");
        print2(animals, a -> a.canHop());
        System.out.println("-----------------------------------");
        print2(animals, a -> a.canSwim());
    }
    
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }

    private static void print2(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }

    
}


/*
a -> a.canSwim()	//Sólo si es un parámetro y no se especifica el tipo, se puede omitir los paréntesis de los parámetros
(Animal a) -> { return a.canSwim(); }


*/