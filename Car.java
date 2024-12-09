class Car{
    String name;
    String color;
    String companyName;
    int price;
    String modelName;

//public class Car{
    public static void main(String args[]){
        Car Car1 = new Car();
        Car1.name = "Alto car";
        Car1.color = "White";
        Car1.companyName = "Suzuki";
        Car1.price = 1849000;
        Car1.modelName = "Suzuki Alto VXR";
        
        Car Car2 = new Car();
        Car2.name = "Fortuner";
        Car2.color = "Black";
        Car2.companyName = "Toyota";
        Car2.price = 7499000;
        Car2.modelName = "Toyota Fortuner 2.7L 4x2";

        Car Car3 = new Car();

        Car3.name = "Civic";
        Car3.color = "Silver";
        Car3.companyName = "Honda";
        Car3.price = 3899000;
        Car3.modelName = "Honda Civic 1.8L VTEC";

        Car Car4 = new Car();

        Car4.name = "Picanto";
        Car4.color = "Gray";
        Car4.companyName= "Kia";
        Car4.price = 1999000;
        Car4.modelName = "Kia Picanto 1.0L Automatic";

        Car Car5 = new Car();
        Car5.name = "Santro";
        Car5.color = "White";
        Car5.companyName = "Hyundri";
        Car5.price = 19999000;
        Car5.modelName= "Hyundri Santro";



        System.out.println("Car Objects:");
        System.out.println("Name:"+Car1.name);
        System.out.println("Color:"+Car1.color);
        System.out.println("Company:"+Car1.companyName);
        System.out.println("Price:"+Car1.price);
        System.out.println("ModelName:"+Car1.modelName);

        System.out.println(" ");

        System.out.println("Name:" +Car2.name);
        System.out.println("Color:"+Car2.color);
        System.out.println("Company:"+Car2.companyName);
        System.out.println("Price:"+Car2.price);
        System.out.println("ModelName:"+Car2.modelName);

        System.out.println("");

        System.out.println("Name: "+Car3.name);
        System.out.println("Color:"+Car3.color);
        System.out.println("Company:"+Car3.companyName);
        System.out.println("Price:"+Car3.price);
        System.out.println("ModelName:"+Car3.modelName);

        System.out.println("");

        System.out.println("Name:"+Car4.name);
        System.out.println("Color:"+Car4.color);
        System.out.println("Company:"+Car4.companyName);
        System.out.println("Price:"+Car4.price);
        System.out.println("ModelName:"+Car4.modelName);

        System.out.println("");

        System.out.println("Name:"+Car5.name);
        System.out.println("Color:"+Car5.color);
        System.out.println("Company:"+Car5.price);
        System.out.println("Price:"+Car5.companyName);
        System.out.println("Model:"+Car5.modelName);
       
    }

}
    

