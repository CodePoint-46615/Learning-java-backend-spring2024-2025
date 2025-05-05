//WildCard argument (?) => modify method without using class

class Cal<T extends Number, M extends Number> {
    T a;
    M b;

    void add(Cal<? extends Number, ? extends Number> obj) {
        //System.out.println(this.a.intValue() + this.b.intValue());
        System.out.println(obj.a.intValue() + obj.b.intValue());
    }
}

public class WildCard {
    public static void main(String[] args) {
        Cal<Integer, Double> obj1 = new Cal<>();
        obj1.a = 10;
        obj1.b = 20.0;
        obj1.add(obj1);

        Cal<Double, Float> obj2 = new Cal<>();
        obj2.a = 30.5;
        obj2.b = 40.56f;
        obj2.add(obj2);
    }
}
