class Car2 {
    String name;
    int year;
    double price;
     static String Color;

     public static void main(String args[]){
        Car2 obj1 = new Car2();

        obj1.name = "Toyota camry";
        obj1.year = 2020;
        obj1.price =3400000;
        Car2.Color = "white";

        System.out.println("Object one");

        System.out.println(obj1.name);
        System.out.println(obj1.year);
        System.out.println(obj1.price);
        System.out.println(Car2.Color);

        System.out.println("");

        Car2 obj2= new Car2();

        obj2.name = "Honda Civic";
        obj2.year = 2022;
        obj2.price =3400000;

        System.out.println("Object Two");

        System.out.println(obj2.name);
        System.out.println(obj2.year);
        System.out.println(obj2.price);
        System.out.println(Car2.Color);

        Car2 obj3 = new Car2();

        obj3.name = "BMW 3 series";
        obj3.year = 2020;
        obj3.price =3000000;
        
     System.out.println("");

        System.out.println("Object three");

        System.out.println(obj3.name);
        System.out.println(obj3.year);
        System.out.println(obj3.price);
        System.out.println(Car2.Color);

        System.out.println("");
     }
    
}
