package tom;

import tom.jiafei.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-03-27
 * \* Time: 14:39
 * \
 */
public class _4_SunRise {
    public static void main(String args[]) {
        _4_SquareEquation equation = new _4_SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}
