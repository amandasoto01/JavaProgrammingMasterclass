package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	    String var4 = "This is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
	    scopeInstance.useInner();

	    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("Var3 is not accessible here "+innerClass.var3);

//	    System.out.println("scopeInstance var1 is "+scopeInstance.getVarOne());
//        System.out.println(var4);
//
//        scopeInstance.timesTwo();
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();


    }
}
