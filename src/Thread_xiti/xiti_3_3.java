//package Thread_xiti;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* @ProjectName: java_study_codes
// * \* @FileName: xiti_3_1
// * \* @author: li-jihong
// * \* Date: 2023-05-29 12:32
// */
//public class xiti_3_3 {
//    public static void main(String[] args) {
//        Target target = new Target();
//        Thread thread1 = new Thread(target);
//        Thread thread2 = new Thread(target);
//        thread1.start();
//        try{
//            Thread.sleep(1000);
//        }
//        catch (Exception exp){}
//        thread2.start();
//    }
//}
//
//class Target implements Runnable{
//    int i = 0;
//    public void run(){
//        i++;
//        System.out.println("i = " + i);
//    }
//}