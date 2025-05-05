//Concept => Generics

/*class Message{
    String msg;
    void show(){
        System.out.println(msg);
    }
}*/

//generics
class Message<T> {
    T msg;
    void show(){
        System.out.println(msg);
    }
}

public class Generics1{
    public static void main(String[] args){

        //using basic class
        /*Msg m1 = new Msg();
        m1.msg = "Something";
        m1.show();*/

        //using generics
        Message<String> m1 = new Message<String>();
        m1.msg = "Generic Solution";
        m1.show();
    }
}
