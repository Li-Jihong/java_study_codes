//package Thread_xiti;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* @ProjectName: java_study_codes
// * \* @FileName: xiti_3_8
// * \* @author: li-jihong
// * \* Date: 2023-05-29 13:18
// */
//public class xiti_3_8 {
//    public static void main(String[] args) {
//        Bank b = new Bank();
//        b.thread1.start();
//        b.thread2.start();
//    }
//}
//
//class Bank implements Runnable {
//    Thread thread1, thread2;
//
//    Bank() {
//        thread1 = new Thread(this);
//        thread2 = new Thread(this);
//    }
//
//    public void run() {
//        printMess();
//    }
//
//    public void printMess() {
//        System.out.println(Thread.currentThread().getName() + "正在使用这个方法");
//        synchronized (this) {
//            try {
//                Thread.sleep(2000);
//            } catch (Exception exp) {
//            }
//            System.out.println(Thread.currentThread().getName() + "正在使用这个同步块");
//        }
//    }
//}
//
