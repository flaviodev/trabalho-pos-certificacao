## Trabalho Certificação Java

### Alunos: Flávio de Souza e Werlon Guilherme ###

#### Questões de simulado sobre os temas: ####

* 9.1 Implementando herança 
* 9.2 Desenvolva código que mostra o uso de polimorfismo


##### Segue abaixo a relação completa das questões (que também está disposta em pdf). Bem como, cada uma das questões está no README de cada pacote e acompanham o código e sua respectiva resposta #####

### 01 - Given the code. What is the result? ###

```
class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v;
        
        v.printSound();
        b.printSound();
    }   
}

```
 ### Options: ###
 * A) Compilation fails.
 * B) An exception is thrown at runtime.
 * C) "vehiclecar" is printed.
 * D) "vehiclebike" is printed.
 * E) "carcar" is printed.
 * F) "bikebike" is printed