
class Gen<T extends Number>{
    //Instance create
    T[] obj1;

    //constructor call
    Gen(T[] obj1){
        this.obj1 = obj1;
    }

    //method - 1
     double avg(){
        double sum = 0.0;
        int size = obj1.length;

        for(T t: obj1){
            sum += t.doubleValue();
        }
        return sum/size;
    }

    //method - 2 => pass parameter with wildcard argument
    boolean isSame(Gen<?> obj2){
        return avg() == obj2.avg();
    }
}
public class Generics3 {
    public static void main(String[] args){
        Gen<Integer> value1 = new Gen<>(new Integer[] {10, 20, 30});
        double avg1 = value1.avg();

        Gen<Double> value2 = new Gen<>(new Double[] {10.0, 20.50, 30.0});
        double avg2 = value2.avg();

        System.out.println(value1.isSame(value2));
    }

}
