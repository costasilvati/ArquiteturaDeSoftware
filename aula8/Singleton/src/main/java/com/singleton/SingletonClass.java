package com.singleton;

/**
 *
 * @author julianacostasilva
 */
public class SingletonClass {
    private static SingletonClass uniqueInstance;
    
    private SingletonClass(){
        System.out.println("Instanciei a classe");
    }
    
    public static SingletonClass getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonClass();
        }
        return uniqueInstance;
    }
}
