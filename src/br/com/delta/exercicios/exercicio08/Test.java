package br.com.delta.exercicios.exercicio08;

class Parent {
    String message = "parent";
}

class Child extends Parent {
    String message = "child";
}

public class Test {
    public static void main(String[] args) {
        System.out.println(new Child().message);
    }
}
