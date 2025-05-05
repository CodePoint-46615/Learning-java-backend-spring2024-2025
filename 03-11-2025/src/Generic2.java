//multiple variable in generics

class Calculator<T extends Number,M extends Number> {
    T a;
    M b;
    void add(){
        System.out.println(a.intValue()+b.intValue());
    }
}

public class Generic2{
    public static void main(String[] args){
       Calculator<Integer, Integer> add = new Calculator<>();
       add.a = 10;
       add.b = 20;
       add.add();
    }
}

