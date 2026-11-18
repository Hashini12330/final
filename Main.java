public class Main{
    public static void main(String[] args){

        // 01 -- variable
        student s = new student();
        s.show();
        System.out.println("--------------------------------------");
 
        // 02 -- constructor
        student2 s2 = new student2();
        System.out.println("--------------------------------------");


        // 03 -- IIB
        student3 s3 = new student3();
        
        

    }
}

// 01- Final variable

class student{
    final int age = 24;     // allowed
    

    // final int age;
    void show(){
        // age = 24;    // not allowed in normal method

        System.out.println("Age: " + age);  // allowed
    }
}



// 02 - constructor
class student2{
    final int age;

    // final int age = 25;  // valid

    public student2(){
        age = 25;   
        System.out.println("Age2: " + age);
    }

}


// IIB
class student3{
    final int age;

    {
        age = 26;
        System.out.println("Age: " + age);
    }
}