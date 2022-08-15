package 设计模式.装饰模式;

public class Milk extends CondimentDecorator{

     Beverage beverage;

    @Override
    double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
