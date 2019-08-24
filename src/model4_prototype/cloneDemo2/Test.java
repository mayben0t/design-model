package model4_prototype.cloneDemo2;


public class Test {

    static class Body implements Cloneable{
        int id;
        Head head;

        public Body(int id, Head head) {
            this.id = id;
            this.head = head;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Body clone = (Body) super.clone();
            clone.head = (Head)head.clone();
            return clone;
        }
    }

    static class Head implements Cloneable{
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return (Head)super.clone();
        }
    }


    public static void main(String[] args) throws Exception{
        Head h1 = new Head();
        Body body = new Body(1, h1);
        Body clone = (Body) body.clone();
        System.out.println(body==clone);
        System.out.println(body.head == clone.head);
    }
}
