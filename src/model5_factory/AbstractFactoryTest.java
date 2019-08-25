package model5_factory;

//抽象产品：提供了产品的接口
interface Product{
    void show();
}

class ConcreateProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

class ConcreateProduct2 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}

//抽象工厂：提供了产品的生成方式
interface AbstractFactory{
    Product newProduct();
}

class ConcreateFactory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1..");
        return new ConcreateProduct1();
    }
}

class ConcreateFactory2 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2..");
        return new ConcreateProduct2();
    }
}


public class AbstractFactoryTest {
    public static void main(String[] args) {
        Product a;
        AbstractFactory af;
        af = new ConcreateFactory1();
        a = af.newProduct();
        a.show();
        af = new ConcreateFactory2();
        af.newProduct();
        a.show();
    }
}
