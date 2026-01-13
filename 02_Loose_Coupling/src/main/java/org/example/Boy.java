package org.example;

public class Boy {
    public static void main(String[] args) {
       Agreement agreement = new Girl();
       agreement.chat();
    }
}

//Tight coupling - components are directly dependent
//                on each other's implementation

//Loose coupling - components depend on abstractions(interfaces)
//                 , not a concrete implementations.