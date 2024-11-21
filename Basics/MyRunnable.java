package Basics;

public class MyRunnable {

    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());

        one.start();
        two.start();
    }
}

class ThreadOne implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 : " + i);
        }
    }
}

class ThreadTwo implements Runnable {

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
What we noticed here is there's no sequenc e here.
Once the thread scheduler gets time it make another thread perform so the
back and forth od threads is there which make the execution faster
And save resource at OS level 
 Thread 2 : 0
 Thread 2 : 1
 Thread 1 : 0
 Thread 2 : 2
 Thread 2 : 3
 Thread 1 : 1
 Thread 1 : 2
 Thread 1 : 3
 Thread 1 : 4
 Thread 1 : 5
 Thread 2 : 4
 Thread 2 : 5
 Thread 1 : 6
 Thread 1 : 7
 Thread 2 : 6
 Thread 2 : 7
 Thread 2 : 8
 Thread 1 : 8
 Thread 1 : 9
 Thread 2 : 9
*/