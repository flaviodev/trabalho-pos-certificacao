## Exercício 02 ##

### Give the code. What is the result? ###

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