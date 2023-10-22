public class MultithreadingThing2 extends Thread{

    private int threadNumber;

    public MultithreadingThing2(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){
            System.out.println("Hej from thread number " + threadNumber);

            try {
                Thread.sleep(1000);  // 1 sekund
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
