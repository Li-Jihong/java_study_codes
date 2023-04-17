package _7_.shiyan1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-17
 * \* Time: 16:30
 * \
 */
public class DangerException extends Exception {
    String message;

    public DangerException() {
        message = "危险品";
    }

    public void toShow() {
        System.out.print(message + " ");
    }
}
