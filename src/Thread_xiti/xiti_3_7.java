//package Thread_xiti;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* @ProjectName: java_study_codes
// * \* @FileName: xiti_3_7
// * \* @author: li-jihong
// * \* Date: 2023-05-29 13:02
// */
//public class xiti_3_7 implements Runnable{
//    StringBuffer buffer = new StringBuffer();
//    Thread t1, t2;
//    xiti_3_7(){
//        t1 = new Thread(this);
//        t2 = new Thread(this);
//    }
//    public synchronized void addChar(char c){
//        if(Thread.currentThread() == t1){
//            while(buffer.length() == 0){
//                try{wait();}
//                catch (Exception e){}
//            }
//            buffer.append(c);
//        }
//        if(Thread.currentThread() == t2){
//            buffer.append(c);
//            notifyAll();
//        }
//    }
//
//    public static void main(String[] args) {
//        xiti_3_7 hello = new xiti_3_7();
//        hello.t1.start();
//        hello.t2.start();
//        while(hello.t1.isAlive() ||hello.t2.isAlive()){}
//        System.out.println(hello.buffer);
//    }
//    public void run(){
//        if(Thread.currentThread() == t1)
//            addChar('A');
//        if(Thread.currentThread() == t2)
//            addChar('B');
//    }
//}
