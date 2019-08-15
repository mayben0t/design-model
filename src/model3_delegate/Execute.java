package model3_delegate;

import java.util.Objects;

interface I{
    void f();
    void g();
}

class A implements I{
    @Override
    public void f() {
        System.out.println("A.f()");
    }

    @Override
    public void g() {
        System.out.println("A.g()");
    }
}

class B implements I{
    @Override
    public void f() {
        System.out.println("B.f()");
    }

    @Override
    public void g() {
        System.out.println("B.g()");
    }
}

class DelegateOfInterfaceI implements I{
    A a = new A();
    B b = new B();
    I realI;

    public void setIToA(){
        realI = a;
    }


    public void setIToB(){
        realI = b;
    }

    @Override
    public void f() {
        if(Objects.isNull(realI)){
            throw new NullPointerException();
        }
        realI.f();
    }

    @Override
    public void g() {
        if(Objects.isNull(realI)){
            throw new NullPointerException();
        }
        realI.g();
    }
}


public class Execute {
    public static void main(String[] args) {
        DelegateOfInterfaceI delegateOfInterfaceI = new DelegateOfInterfaceI();
        delegateOfInterfaceI.setIToA();
        delegateOfInterfaceI.f();
        /****************************/
        delegateOfInterfaceI.setIToB();
        delegateOfInterfaceI.g();
    }
}
