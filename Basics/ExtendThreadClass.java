package Basics;

public class ExtendThreadClass {
   public static void main(String[] args) {
        Thread one = new Thread1();
        Thread two = new Thread2();

        one.start();
        two.start();
   } 
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 : " + i);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 : " + i);
        }
    }
}

/*
 * Output
 */
/*
Thread 2 : 0
Thread 2 : 1
Thread 2 : 2
Thread 2 : 3
Thread 1 : 0
Thread 1 : 1
Thread 1 : 2
Thread 1 : 3
Thread 1 : 4
Thread 1 : 5
Thread 1 : 6
Thread 2 : 4
Thread 1 : 7
Thread 1 : 8
Thread 1 : 9
Thread 2 : 5
Thread 2 : 6
Thread 2 : 7
Thread 2 : 8
Thread 2 : 9
*/