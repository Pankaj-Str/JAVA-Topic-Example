package Threading;

public class SingleThread implements Runnable {


    @Override
    public void run() {
        
        try{
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }


    public static void main(String[] args) {
        
        // Create a new thread

        Thread thread = new Thread(new SingleThread());
        thread.start();



    }
    
}
