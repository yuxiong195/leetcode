package 设计模式.装饰模式;

public class Espresso extends Beverage{
    public Espresso() {
        this.description = "Espresso";
    }



    @Override
    double cost() {
        return 100;
    }
}
