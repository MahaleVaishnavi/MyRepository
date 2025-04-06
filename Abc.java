package practice_prm;

abstract class  Animal{
    void sound()
    {
       System.out.println("sound is Different"); 
    }
    abstract void eat();
}
    class Dog extends Animal
    {
       void eat()
       {
        System.out.println("Dog eating");//impliments the methods from abstract class
       }
       void Sleep()
       {
        System.out.println("Dog is sleeping");
       }
    }
    class Concept{
        public static void main(String[]args)
        {
            Dog d1=new Dog();
            d1.sound();
            d1.eat();
            d1.Sleep();
        }

    }


    

    

