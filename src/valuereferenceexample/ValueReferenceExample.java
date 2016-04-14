/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuereferenceexample;

/**
 *
 * @author GIBSON_A
 */

class Dog {
    private String dogName;
    
    public Dog(String name) {
        dogName = name;
    }
    
    public String getName() {
        return dogName;
    }
}
public class ValueReferenceExample {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ){
    Dog aDog = new Dog("Max");
    foo(aDog);

    if (aDog.getName().equals("Max")) { //true
        System.out.println( "Java passes by value." );

    } else if (aDog.getName().equals("Fifi")) {
        System.out.println( "Java passes by reference." );
    }
}

public static void foo(Dog d) {
    if (! d.getName().equals("Max")) {
        System.out.println( "No Max" );
    }

    d = new Dog("Fifi");
    if (! d.getName().equals("Fifi")) {
        System.out.println( "No Fifi" );
    } // true
}
    
}
