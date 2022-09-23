/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.singleton;

/**
 *
 * @author julianacostasilva
 */
public class Singleton {

    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        SingletonClass sc2 = SingletonClass.getInstance();
        SingletonClass sc3 = SingletonClass.getInstance();
        
        System.out.println("Objeto sc "+ sc.toString());
        System.out.println("Objeto sc2 "+ sc2.toString());
        System.out.println("Objeto sc3 "+ sc3.toString());
    }
}
