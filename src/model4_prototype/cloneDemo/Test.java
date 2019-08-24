package model4_prototype.cloneDemo;

public class Test {
    public static void main(String[] args) throws Exception{
        Person p1 = new Person(1, "张三");
        Person p2 = p1.clone();
        System.out.println(p1.getName() == p2.getName()?"浅拷贝":"深拷贝");

        AnnotherPerson pp1 = new AnnotherPerson(1,"张三");
        AnnotherPerson pp2 = pp1.clone();
        System.out.println(pp1.getName() == pp2.getName()?"浅拷贝":"深拷贝");
    }
}
