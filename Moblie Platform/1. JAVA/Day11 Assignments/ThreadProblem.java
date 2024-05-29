package April17thAssignments;

public class ThreadProblem {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));

        t1.start();
        t2.start();
    }

    static class NumberPrinter implements Runnable {
        private int tnumber;

        public NumberPrinter(int tnumber) {
            this.tnumber = tnumber;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + tnumber + ": " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
