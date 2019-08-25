package model6_decorator.headFirst;
abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
abstract class CondimentDecorator extends Beverage {

    /**
     *所有的调料装饰者都必须重新实现该方法，因为调料的该方法应该得到扩充，方法实现不同于原来方法
     */
    public abstract String getDescription();

}
class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}

public class TestStarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+ " $" + beverage1.cost());
    }
}