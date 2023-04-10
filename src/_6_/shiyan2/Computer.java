package _6_.shiyan2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: lijihong
 * \* Date: 2023-04-10
 * \* Time: 16:47
 * \
 */
class Television implements ComputeWeight {
    public double computeWeight() {
        return 3.5;
    }
}

class Computer implements ComputeWeight {
    public double computeWeight() {
        return 2.67;
    }
}

class WashMachine implements ComputeWeight {
    public double computeWeight() {
        return 13.8;
    }
}
class Refrigerrator implements ComputeWeight {
    public double computeWeight() {
        return 15;
    }
}

