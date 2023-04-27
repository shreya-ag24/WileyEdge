package core_java;

public class InstanceOrder {

    String name;
    int age;

    {
        name="Shreya";
        age = 21;
        System.out.println("Instance block");

    }

    public InstanceOrder(){
        System.out.println(name +" "+ age);
        System.out.println("constructor block");
    }


    public InstanceOrder(int a , int b){
        System.out.println("constructor parametrized"+(a+b));
    }

    public static void main(String[] args){
        InstanceOrder io = new InstanceOrder();

        new InstanceOrder(2,3);
    }
    
}
