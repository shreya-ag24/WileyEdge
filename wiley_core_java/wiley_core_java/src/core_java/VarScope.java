package core_java;

public class VarScope {

    int ins =20;     // instance variable
    static String name = "Shreya";

    int val = 18;
    int val2= 12;

    public void sum(){
        int val=10;
        int val2=25;
        System.out.println("sum methods: "+ (val+val2));
        System.out.println("sum methods: "+ (this.val+this.val2));
    }

    public static void main(String[] args){

        int loc =10; // local variable

         VarScope vso = new VarScope();
        System.out.println("Local variable :" +loc);
        System.out.println("Instance variable :" +vso.ins);
        System.out.println("Static variable :" +name);
        vso.sum();

    }
    
}
