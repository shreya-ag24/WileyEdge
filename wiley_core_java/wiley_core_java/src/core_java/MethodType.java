package core_java;

class test{
    public static int sub(int v1 , int v2){
        int val =v1-v2;
        //System.out.println("Instance method: " +val);
        return val;
    }
}

public class MethodType {

    public  void sub(int v1 , int v2){
        int val =v1-v2;
        System.out.println("Instance method: " +val);
    }

    public  void add(int v1 , int v2){
        int val =v1+v2;
        System.out.println("Instance method: " +val);

        this.sub(9, 5);
    }
    public static void mul(int v1 , int v2){
        int val =v1*v2;
        System.out.println("Static method: " +val);
    }
    
    public static void main(String[] args){

        mul(26,36);
        MethodType mt = new MethodType();
        mt.add(25,27);

        System.out.println(test.sub(5,3));
    }
}
