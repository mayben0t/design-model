package model8_explain;

import java.util.HashMap;
import java.util.Map;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 13:27 2018/4/8
 *@Modified By:
 *
 */
interface Expression {
    int interpreter(Context context);//一定会有解释方法
}

abstract class NonTerminalExpression implements Expression {
    Expression e1,e2;
    public NonTerminalExpression(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }
}

class MinusOperation extends NonTerminalExpression {

    public MinusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    //将两个表达式相减
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) - this.e2.interpreter(context);
    }
}

class TerminalExpression implements Expression {

    String variable;
    public TerminalExpression(String variable){

        this.variable = variable;
    }
    @Override
    public int interpreter(Context context) {
        return context.lookup(this);
    }
}

class PlusOperation extends NonTerminalExpression {

    public PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    //将两个表达式相加
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }
}

class Context {
    private Map<Expression, Integer> map = new HashMap<>();

    //定义变量
    public void add(Expression s, Integer value){
        map.put(s, value);
    }
    //将变量转换成数字
    public int lookup(Expression s){
        return map.get(s);
    }
}

public class Test {
    public static void main(String[] args) {

        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");
        context.add(a, 4);
        context.add(b, 8);
        context.add(c, 2);

        System.out.println(new MinusOperation(new PlusOperation(a,b), c).interpreter(context));
    }
}