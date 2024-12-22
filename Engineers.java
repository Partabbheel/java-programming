class Engineers {
    String name;
    int age;
    String specialty;
    static String companyName;

    public static void main(String arga[]){
        Engineers E1 = new Engineers();

        E1.name = "Aslam";
        E1.age = 28;
        E1.specialty ="Civil Enginner";
        Engineers.companyName = "ABC";

        System.out.println("Object One");
        System.out.println(E1.name);
        System.out.println(E1.age);
        System.out.println(E1.specialty);
        System.out.println(Engineers.companyName);

        System.out.println("");

        Engineers E2 = new Engineers();

        E2.name = "Iqbal";
        E2.age = 30;
        E2.specialty ="Mechanical Enginner";
    

        System.out.println("Object Two");
        System.out.println(E2.name);
        System.out.println(E2.age);
        System.out.println(E2.specialty);
        System.out.println(Engineers.companyName);

        System.out.println("");

        Engineers E3 = new Engineers();

        E3.name = "Yasir";
        E3.age = 33;
        E3.specialty ="Electrical Engineer";
       

        System.out.println("Object Three");
        System.out.println(E3.name);
        System.out.println(E3.age);
        System.out.println(E3.specialty);
        System.out.println(Engineers.companyName);

        System.out.println("");
        
        Engineers E4 = new Engineers();

        E4.name = "Hassan";
        E4.age = 29;
        E4.specialty ="Software Engineer";
        

        System.out.println("Object four");
        System.out.println(E4.name);
        System.out.println(E4.age);
        System.out.println(E4.specialty);
        System.out.println(Engineers.companyName);

        System.out.println("");
    }
}
    

