package core_java;

public class CreateClass implements Cloneable{
    
   
        int a =10;
        public void add(){
            System.out.println("Number Adding");
        }
    
        public static void main(String[] args) throws InstantiationException , IllegalAccessException , CloneNotSupportedException{
    
            // Create object with new keyword
            CreateClass cc= new CreateClass();
            cc.add();
    
            // Create Object with newInstance()
        try{
            Class c = Class.forName("core_java.CreateClass"); // qualified class name - package.class
           
            CreateClass ci =(CreateClass) c.newInstance();
            ci.add();
            System.out.println(ci);
    
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    
        // Create object with Object.clone()
        CreateClass objClone = (CreateClass) cc.clone();
        objClone.add();
        System.out.println("object clone : "+objClone);

        }
    }





