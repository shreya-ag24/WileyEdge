package core_java;

public class Constructors {

    public Constructors(int a , int b){
        System.out.println(a+b);
    }

    public Constructors(float a , int b){
        System.out.println(a+b);
    }

    public Constructors(){
        System.out.println("0 args cons.");
    }

    public void add(){

    }

    public static void main(String[] args){

        Constructors c = new Constructors();
        Constructors c1 = new Constructors(2,3);


    }
}
