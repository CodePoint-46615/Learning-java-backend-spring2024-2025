class NestedClass {
    int v1 = 100;
    static int v2 = 200;

    class NonStat{
        int v3 = 300;
        static int v4 = 400;
        //In nonstatic inner class => access outer all member directly both static and nonstatic
        public void print(){
            //outer class access
            System.out.println(v1);
            System.out.println(v2);
            //own class access
            System.out.println(v3);
            System.out.println(v4);
            //static nested class access
            Stat st = new Stat();
            System.out.println(st.v5);
            System.out.println(st.v6);
        }
    }

    static class Stat{
        int v5 = 500;
        static int v6 = 600;
        public void print(){
            //outer class access
            NestedClass ns = new NestedClass();
            System.out.println(ns.v1);  // access outer nonstatic member through an instance of outer class
            System.out.println(v2);     // access outer static member directly

            //nonstatic nested class access
            NestedClass.NonStat nsc = ns.new NonStat();
            System.out.println(nsc.v3);
            System.out.println(nsc.v4);

            //own class access
            System.out.println(v5);
            System.out.println(v6);
        }
    }
}

public class NestedClassMain{
    public static void main(String[] args){
        //access nonstatic
        NestedClass outer = new NestedClass();              // Outer class instance
        NestedClass.NonStat inner = outer.new NonStat();   // Inner class instance
        inner.print();

        //shorter syntax
        //new NestedClass().new NonStat().print();

        //access static
        NestedClass.Stat st = new NestedClass.Stat();
        st.print();

        //Shorter Syntax
        //new NestedClass.Stat().print();

    }
}