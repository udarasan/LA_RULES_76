package org.example;
public class Boy {
    public static void main(String[] args) {
        //ways of injecting dependencies to dependable classes
        // 4 types of dependency injection
            // 1 - property injection
            // 2 - constructor through injection
            // 3 - setter method through injection
            // 4 - interface through injection
      Girl girl = new Girl(); //dependency
      girl.chat();
    }
}