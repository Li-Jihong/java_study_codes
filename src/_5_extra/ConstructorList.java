package _5_extra;

class Game {
    public Game() {
        System.out.println("Game constructor");
    }

    public Game(int i) {
        System.out.println("Game constructor" + i);
    }
}

class BoardGame extends Game {
    public BoardGame() {
        super();
        System.out.println("BoardGame constructor");
    }

    public BoardGame(int i) {
        super();
        System.out.println("BoardGame constructor" + i);
    }
}

class Chess extends BoardGame {
    public Chess() {
        super();
        System.out.println("Chess constructor");
    }

    public Chess(int i) {
        super(i);
        System.out.println("Chess constructor" + i);
    }

    public static void main(String[] args) {
        Chess x = new Chess();
        Chess y = new Chess(5);
    }
}