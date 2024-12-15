class laptops{
    String typeName;
    String companyName;
    int  priceRange;
    int Storage;
    String color;

public static void main(String args[]){
    laptops laptop1 = new laptops();

    laptop1.typeName = "Ultrabook";
    laptop1.companyName = "Apple";
    laptop1.priceRange = 220000;
    laptop1.Storage =  256;
    laptop1.color = "Silver";

    laptops laptop2 = new laptops();

    laptop2.typeName = "Business laptop";
    laptop2.companyName = "Lenovo";
    laptop2.priceRange = 120000;
    laptop2.Storage  = 256;
    laptop2.color = "Black";

    laptops laptop3 = new laptops();

    laptop3.typeName = "TouchScreen";
    laptop3.companyName = "hp";
    laptop3.priceRange = 50000;
    laptop3.Storage = 256;
    laptop3.color = "white";

    laptops laptop4 = new laptops();

    laptop4.typeName = "Traditional laptop";
    laptop4.companyName ="lenovo";
    laptop4.priceRange = 104000;
    laptop4.Storage = 256;
    laptop4.color = "Natural Silver";



    System.out.println("laptops objects:");
    System.out.println("typeName:"+laptop1.typeName);
    System.out.println("CompanyName:"+laptop1.companyName);
    System.out.println("Price Range:"+laptop1.priceRange);
    System.out.println("Storage:"+laptop1.Storage);
    System.out.println("Color:"+laptop1.color);

    System.out.println("");

    System.out.println("TypeName:"+laptop2.typeName);
    System.out.println("CompanyName:"+laptop2.companyName);
    System.out.println("Price Range:"+laptop2.priceRange);
    System.out.println("Storage:"+laptop2.Storage);
    System.out.println("Color:"+laptop2.color);

    System.out.println("");

    System.out.println("TypeName:"+laptop3.typeName);
    System.out.println("CompanyName:"+laptop3.companyName);
    System.out.println("Price Range:"+laptop3.priceRange);
    System.out.println("Storage:"+laptop3.Storage);
    System.out.println("Color:"+laptop3.color);

    System.out.println("");

    System.out.println("TypeName:"+laptop4.typeName);
    System.out.println("CompanyName:"+laptop4.companyName);
    System.out.println("Price Range:"+laptop4.priceRange);
    System.out.println("Storage:"+laptop4.Storage);
    System.out.println("Color:"+laptop4.color);

}

    
}
