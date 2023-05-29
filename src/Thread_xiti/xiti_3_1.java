//package Thread_xiti;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* @ProjectName: java_study_codes
// * \* @FileName: xiti_3_1
// * \* @author: li-jihong
// * \* Date: 2023-05-29 12:32
// */
//public class xiti_3_1 {
//    public static void main(String[] args) {
//        Target target = new Target();
//        Thread thread = new Thread(target);
//        thread.start();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("yes");
//            try{
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException exp){}
//        }
//    }
//}
//
//class Target implements Runnable{
//    public void run(){
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("ok");
//            try{
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException exp){}
//        }
//    }
//}