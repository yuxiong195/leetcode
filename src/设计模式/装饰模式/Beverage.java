package 设计模式.装饰模式;

public abstract class Beverage {
    String description;

    String getDescription() {
        return this.description;
    }

    abstract double cost();
}
