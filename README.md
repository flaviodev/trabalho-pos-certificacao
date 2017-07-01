## Trabalho Certificação Java

### Alunos: Flávio de Souza e Werlon Guilherme ###

#### Questões de simulado sobre os temas: ####

* 9.1 Implementando herança 
* 9.2 Desenvolva código que mostra o uso de polimorfismo


##### Segue abaixo a relação completa das questões (que também está disposta em pdf). Bem como, cada uma das questões está no README de cada pacote e acompanham o código e sua respectiva resposta #####

---

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
 
 ---
 
 ### 2 - Give the code. What is the result? ###
 
 ```
 class Hotel {
     public int bookings;
     public void book() {
         bookings++;
     }
 }
 
 public class SuperHotel extends Hotel {
     public void book() {
         bookings--;
     }
     
     public void book(int size) {
         book();
         super.book();
         bookings += size;
     }
     
     public static void main(String args[]) {
         SuperHotel hotel = new SuperHotel();
         hotel.book(2);
         System.out.print(hotel.bookings);
     }
 }
 ```
  ### Options: ###
  * A) Compilation fails.
  * B) An exception is thrown at runtime.
  * C) 0
  * D) 1
  * E) 2
  * F) -1
  
  ---
  
  ### 3 - Given: ###
  
  ```
  public class RediMix extends Concrete {
      RediMix() {
          System.out.println("r ");
      }
  
      public static void main(String[] args) {
          new RediMix();
      }
  }
  
  class Concrete extends Sand {
      Concrete() {
          System.out.print("c ");
      }
  
      private Concrete(String s) {
      }
  }
  
  abstract class Sand {
      Sand() {
          System.out.print("s ");
      }
  }
  ```
   ### What is the result? ###
   * A) r
   * B) c r
   * C) r c
   * D) s c r
   * E) r c s
   * F) Compilation fails due to a single error in the code.
   * G) Compilation fails due to multiple errors in the code.
   
   ---
   
   ### 4 - Given: ###
   
   ```
   public class Clover extends Harrier {
       String bark() {
           return "feed me ";
       }
   
       public static void main(String[] args) {
           Dog[] dogs = new Dog[3];
           dogs[0] = new Harrier();
           dogs[1] = (Dog) new Clover();
           dogs[2] = (Dog) new Harrier();
           for (Dog d : dogs) System.out.print(d.bark());
       }
   }
   
   class Dog {
       String bark() {
           return "bark ";
       }
   }
   
   class Harrier extends Dog {
       String bark() {
           return "woof ";
       }
   }
   ```
    ### What is the result? (Choose all that apply.) ###
    * A) bark bark bark
    * B) woof bark bark
    * C) woof feed me woof
    * D) Compilation fails due to an error on line 6.
    * E) Compilation fails due to an error on line 7.
    * F) Compilation fails due to an error on line 8.
    * G) Compilation fails due to an error on line 9. 
    
    ---
    
    ### 5 - Given: ###
    
    ```
     2. class SuperCool {
     3.     static String os = "";
     4.     void doStuff() { os += "super "; }
     5. }
     6. public class Cool extends SuperCool {
     7.     public static void main(String[] args) {
     8.         new Cool().go();
     9.     }
    10.     void go() {
    11.        SuperCool s = new Cool();
    12.         Cool c = (Cool)s;
    13.         // insert code here
    14.     }
    15.     void doStuff() { os += "cool "; }
    16. }
    ```
     ### If the rest of the code compiles, which line(s) of code, inserted independently at line 13, compile? (Choose all that apply.) ###
    * A) c.doStuff();
    * B) s.doStuff();
    * C) this.doStuff();
    * D) super.doStuff();
    * E) c.super.doStuff();
    * F) s.super.doStuff();
    * G) this.super.doStuff();
    * H) There are other errors in the code 
    
    ---
    
    ### 6 - Given: ###
    
    ```
     4. class MySuper { protected MySuper() { System.out.print("ms "); } }
     5. public class MyTester extends MySuper {
     6.     private MyTester() { System.out.print("mt "); }
     7.     public static void main(String[] args) {
     8.         new MySuper(); 
     9.         class MyInner {
    10.              private MyInner() { System.out.print("mi "); }
    11.              { new MyTester(); }
    12.              { new MySuper(); }
    13.         }
    14.         new MyInner();
    15. } }
    ```
     ### What is the result? ###
    * A) ms mi mt ms
    * B) ms mt ms mi
    * C) ms mi ms mt ms
    * D) ms ms mt ms mi
    * E) Compilation fails.
    * F) An exception is thrown at runtime. 
    
    ---
    
    ### 7 - Given: ###
    
    ```
     3. class IcelandicHorse {
     4.     void tolt() { System.out.print("4-beat "); }
     5. }
     6. public class Vafi extends IcelandicHorse {
     7.     public static void main(String[] args) {
     8.         new Vafi().go();
     9.         new IcelandicHorse().tolt();
    10.     }
    11.     void go() {
    12.         IcelandicHorse h1 = new Vafi();
    13.         h1.tolt();
    14.         Vafi v = (Vafi) h1;
    15.         v.tolt();
    16.     }
    17.     void tolt() { System.out.print("pacey "); }
    18. }
    ```
     ### What is the result? (Choose all that apply.) ###
     * A) 4-beat pacey pacey
     * B) pacey pacey 4-beat
     * C) 4-beat 4-beat 4-beat
     * D) 4-beat pacey 4-beat
     * E) pacey, followed by an exception
     * F) 4-beat, followed by an exception  
     
     ---
     
     ### 8 - These classes are defined in the same file. What is the output?  ###
     
     ```
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
     ```
      ### Options: ###
      * A) parent
      * B) child 
      
      ---
      
      ### 9 - These classes are defined in the same file. What is the output?  ###
      
      ```
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
      ```
       ### What is the result? ###
       * A) parent
       * B) child
       * C) Compilation fails. 
       
       ---
       
       ### 10 - These classes are defined in the same file. Will this code compile successfully? ###
       
       ```
        class Parent {
            Integer number;
        }
        
        class Child extends Parent {
            static Integer number;
        }
       ```
        ### Options: ###
        * A) Yes
        * B) No
