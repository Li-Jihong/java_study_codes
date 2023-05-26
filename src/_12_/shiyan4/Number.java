package _12_.shiyan4;

/**
 * \* Created with IntelliJ IDEA.
 * \* @ProjectName: java_study_codes
 * \* @FileName: Number
 * \* @author: li-jihong
 * \* Date: 2023-05-26 20:06
 */
public class Number implements Runnable {
        private static int theNumber;
    final int SMALLER = -1, LARGER = 1, SUCCESS = 8;
//    int realNumber, guessNumber, min = 0, max = 100, message = SMALLER;
        int guessNumber1, guessNumber2, min = 0, max = 100, message = SMALLER, message2 = SMALLER;
//    boolean pleaseGuess = false, isGiveNumber = false;
        boolean pleaseGuess = false, isGiveNumber = false, pleaseGuess2 = false, isGiveNumber2 = false;
//    Thread giveNumberThread, guessNumberThread;
    Thread giveNumberThread, guessNumberThread1, guessNumberThread2;

    Number() {
        giveNumberThread = new Thread(this);
        guessNumberThread1 = new Thread(this);
        guessNumberThread2 = new Thread(this);
    }

//    public void run() {
//        for (int count = 1; true; count++) {
//            setMessage(count);
//            if (message == SUCCESS)
//                return;
//        }
//    }

    public void run() {
        for (int count = 1; true; count++) {
            setMessage(count);
            if (message == SUCCESS || message2 == SUCCESS)
                return;
        }
    }

//    public synchronized void setMessage(int count) {
//
//        if (Thread.currentThread() == giveNumberThread && isGiveNumber == false) {
//            realNumber = (int) (Math.random() * 100) + 1;
//            System.out.println("随机给你一个1至100之间的数，猜猜是多少？");
//            isGiveNumber = true;
//            pleaseGuess = true;
//        }
//        if (Thread.currentThread() == giveNumberThread) {
//            while (pleaseGuess == true)
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                }
//            if (realNumber == guessNumber) {
//                message = SMALLER;
//                System.out.println("你猜小了");
//            } else if (realNumber < guessNumber) {
//                message = LARGER;
//                System.out.println("你猜大了");
//            } else {
//                message = SUCCESS;
//                System.out.println("恭喜，你猜对了");
//            }
//            pleaseGuess = true;
//        }
//        if (Thread.currentThread() == guessNumberThread && isGiveNumber == true) {
//            while (pleaseGuess == false)
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                }
//            if (message == SMALLER) {
//                min = guessNumber;
//                guessNumber = (min + max) / 2;
//                System.out.println("A第" + count + "次猜这个数是：" + guessNumber);
//            } else if (message == LARGER) {
//                max = guessNumber;
//                guessNumber = (min + max) / 2;
//                System.out.println("A第" + count + "次猜这个数是：" + guessNumber);
//            }
//            pleaseGuess = false;
//        }
//        notifyAll();
//    }


    public synchronized void setMessage(int count) {

        if (Thread.currentThread() == giveNumberThread && isGiveNumber == false) {
            theNumber = (int) (Math.random() * 100) + 1;
            System.out.println("随机给你一个1至100之间的数，猜猜是多少？" + theNumber);
            isGiveNumber = true;
            pleaseGuess = true;
            pleaseGuess2 = true;
        }
        if (Thread.currentThread() == giveNumberThread) {
            while (pleaseGuess == true || pleaseGuess2 == true)
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            if (theNumber == guessNumber1 || theNumber == guessNumber2) {
                message = SUCCESS;
                System.out.println("恭喜，你猜对了");
                return;
            }
            pleaseGuess = true;
            pleaseGuess2 = true;
        }
        if (Thread.currentThread() == guessNumberThread1 && isGiveNumber == true) {
            while (pleaseGuess == false)
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            if (message == SMALLER) {
                min = guessNumber1;
                guessNumber1 = (min + max) / 2;
                System.out.println("A第" + count + "次猜这个数是：" + guessNumber1);
            } else if (message == LARGER) {
                max = guessNumber1;
                guessNumber1 = (min + max) / 2;
                System.out.println("A第" + count + "次猜这个数是：" + guessNumber1);
            }
            if (theNumber > guessNumber1) {
                message = SMALLER;
                System.out.println("你猜小了");
            } else if (theNumber < guessNumber1) {
                message = LARGER;
                System.out.println("你猜大了");
            }

            pleaseGuess = false;
        }
        if (Thread.currentThread() == guessNumberThread2 && isGiveNumber == true) {
            while (pleaseGuess2 == false)
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            if (message2 == SMALLER) {
                min = guessNumber2;
                guessNumber2 = (min + max) / 2;
                System.out.println("B第" + count + "次猜这个数是：" + guessNumber2);
            } else if (message2 == LARGER) {
                max = guessNumber2;
                guessNumber2 = (min + max) / 2;
                System.out.println("B第" + count + "次猜这个数是：" + guessNumber2);
            }
            if (theNumber > guessNumber2) {
                message2 = SMALLER;
                System.out.println("你猜小了");
            } else if (theNumber < guessNumber2) {
                message2 = LARGER;
                System.out.println("你猜大了");
            }
            pleaseGuess2 = false;
        }
        notifyAll();
    }
}




