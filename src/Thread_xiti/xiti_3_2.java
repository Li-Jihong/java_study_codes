//package Thread_xiti;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* @ProjectName: java_study_codes
// * \* @FileName: xiti_3_2
// * \* @author: li-jihong
// * \* Date: 2023-05-29 12:38
// */
//
//public class xiti_3_2 {
//    public static void main(String[] args) {
//        Target target = new Target();
//        Thread thread = new Thread(target);
//        thread.run();
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