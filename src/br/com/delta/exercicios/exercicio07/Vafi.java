package br.com.delta.exercicios.exercicio07;

class IcelandicHorse {
    void tolt() {
        System.out.print("4-beat ");
    }
}

public class Vafi extends IcelandicHorse {
    public static void main(String[] args) {
        new Vafi().go();
        new IcelandicHorse().tolt();
    }

    void go() {
        IcelandicHorse h1 = new Vafi();
        h1.tolt();
        Vafi v = (Vafi) h1;
        v.tolt();
    }

    void tolt() {
        System.out.print("pacey ");
    }
}