package br.com.delta.exercicios.exercicio09;

class Parent {
    void show(Parent parent) {
        System.out.println("parent");
    }
}

class Child extends Parent {
    void show(Child child) {
        System.out.println("child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.show(parent);
    }
}
