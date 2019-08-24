package model4_prototype;

class Realizetype implements Cloneable {
    Realizetype(){
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }
}

public class RealizetypeTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1=obj2?"+(obj1==obj2));
    }
}