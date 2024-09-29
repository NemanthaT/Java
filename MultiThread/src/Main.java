public class Main {
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            MultiThread thread = new MultiThread(i);
            MultiThread thread2 = new MultiThread(i);
            thread.start();
            //thread2.start();
        }
    }
}