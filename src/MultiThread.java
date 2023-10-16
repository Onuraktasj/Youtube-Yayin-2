
public class MultiThread extends Thread {

    private int threadNumber;
    public MultiThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 5; i++){
          //  System.out.println("Merhaba " + i);
            System.out.println(i + " calisan thread " + threadNumber);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
