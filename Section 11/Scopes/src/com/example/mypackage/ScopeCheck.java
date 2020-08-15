package com.example.mypackage;

public class ScopeCheck {

    public int publicVar = 0;
    private int var1 =1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = "+publicVar+" privateVar = "+ var1);
    }

    public int getVarOne(){
        return this.var1;
    }

    public void timesTwo(){
        int var2 = 2;
        for(int i=0; i<10; i++){
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("Var3 form outer class: "+ innerClass.var3);
    }

    public class InnerClass{
        public int var3 =3;

        public InnerClass(){
            System.out.println("InnerClass creadted, var1 is " + var1  + " var3 is " + var3);
        }
        public void timesTwo(){
           //ScopeCheck.this.timesTwo();
            System.out.println("Var 1 is still available here " + var1);
            for(int i=0; i<10; i++){
                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}
