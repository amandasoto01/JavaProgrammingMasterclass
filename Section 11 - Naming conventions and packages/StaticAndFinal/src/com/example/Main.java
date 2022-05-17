package com.example;

import com.example._final.ExtendedPassword;
import com.example._final.Password;
import com.example._final.SIBTest;
import com.example._final.SomeClass;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
     /*   StaticTest firstInstance = new StaticTest("First instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("Second instance");
        System.out.println(secondInstance.getName() + " is instance number "+StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("Third instance");
        System.out.println(thirdInstance.getName() + "  is instance number "+StaticTest.getNumInstances());*/

        System.out.println("-----STATIC-----\n");
        int answer = multiply(6);
        System.out.println("The answer is "+answer);
        System.out.println("Multiplier is "+multiplier);

        System.out.println("\n-----FINAL-----\n");
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber=4
        System.out.println(Math.PI);
        //Math m = new Math( );

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

        System.out.println("\n-----STATIC INITIALIZATION BLOCK-----\n");
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+SIBTest.owner);

    }

    public static int multiply(int number){
        return number * multiplier;
    }
}
