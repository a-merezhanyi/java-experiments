package in28minutes.spring.learnspringframework.game;

public class SuperContraGame implements GameConsole {
    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("sit");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("run");
    }
}
