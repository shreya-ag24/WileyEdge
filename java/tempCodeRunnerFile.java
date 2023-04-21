
       double amt = a+b+c+d;
       if(amt>10000){
        System.out.println("Congratulations! you are eligible for a discount");
        amt = amt - amt*0.1;
       }
       return amt;
    }
    static double cal2(int... a){
        double amt=0;
        for(double i:a)
            amt +=i;
       if(amt>10000){
        System.out.println("Congratulations! you are eligible for a discount");
        amt = amt - amt*0.1;
       }
       return amt;
    }
    public static void main(String[] args){
     System.out.println(cal(2000,5000,2000,300));
     System.out.println(cal2(3000,5000,5000,3000));