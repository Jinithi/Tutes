package Tut4;

class A {
    void print(){
        System.out.println("print A!");
    }
}

class B extends A{
    @Override
    void print() {
        System.out.println("print B!");
    }
}

class C extends A{
    @Override
    void print() {
        System.out.println("print C!");
    }
}

class D extends B{
    @Override
    void print() {
        System.out.println("print D!");
    }
}

