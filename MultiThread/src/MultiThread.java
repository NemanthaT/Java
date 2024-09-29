public class MultiThread extends Thread{
    public int threadNumber;
    public MultiThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("No " + i + " From Thread " + threadNumber);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("Error in timing");
            }
        }
    }
}
