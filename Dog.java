package Variables;

public class Dog {

    String name;
    float age;
    String bread;
    String gender;
    double weight;

    void display(){

        System.out.println("Name of the dog is : "+name);
        System.out.println("Age of the dog is : "+age);
        System.out.println("Bread of the dog is : "+bread);
        System.out.println("Gender of the dog is : "+gender);
        System.out.println("weight of the dog is : "+weight);
    }

    public static void main(String[] args) {
    
      Dog d1 = new Dog();
      d1.name="whiskey";
      d1.age=2.5f;
      d1.bread="mix";
      d1.gender="male";
      d1.weight=27.5;

      Dog d2 = new Dog();
      d2.name="tommy";
      d2.age=3;
      d2.bread="golden retriever";
      d2.gender="female";
      d2.weight=25.5;
    
      d1.display();
      System.out.println();
      d2.display();
    }
}
