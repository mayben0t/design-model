package model2_template;


public class BasketBall extends Game{
    @Override
    void initialize() {
        System.out.println("BasketBall game initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("BasketBall game start");
    }

    @Override
    void endPlay() {
        System.out.println("BasketBall game end");
    }
}
