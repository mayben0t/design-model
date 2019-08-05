package model2_template;

public class MainClass {
    public static void main(String[] args) {
        Game basketBall = new BasketBall();
        Game footBall = new FootBall();

        basketBall.play();
        footBall.play();
    }
}
