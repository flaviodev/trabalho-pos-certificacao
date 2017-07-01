package br.com.delta.exercicios.exercicio05;

class SuperCool {
    static String os = "";

    void doStuff() {
        os += "super ";
    }
}

public class Cool extends SuperCool {
    public static void main(String[] args) {
        new Cool().go();
    }

    void go() {
        SuperCool s = new Cool();
        Cool c = (Cool) s;

        // não apresentam erro de compilação
        c.doStuff();
        s.doStuff();
        this.doStuff();
        super.doStuff();

        // apresentam erro de compilação
        //c.super.doStuff();
        //s.super.doStuff();
        //this.super.doStuff();
    }

    void doStuff() {
        os += "cool ";
    }
}
