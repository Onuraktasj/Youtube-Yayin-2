
public class MultiThreadMain {

    public static void main(String[] args) {

//        MultiThread multiThread = new MultiThread();
//        MultiThread multiThread2 = new MultiThread();
//
//          multiThread.run();
//          multiThread2.run();

//        multiThread.start();
//        multiThread2.start();

        for (int i = 0; i <= 3; i++){
            MultiThread multiThread3 = new MultiThread(i);
            multiThread3.start();
        }

    }

}

