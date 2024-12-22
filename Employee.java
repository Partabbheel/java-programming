class Employee {
    String name;
    int age;
    double salary; 
    static String companyName;

    public static void main(String arga[]){
        Employee E1 = new Employee();

        E1.name = "Aslam";
        E1.age = 28;
        E1.salary = 100000;
        Employee.companyName = "ABC";

        System.out.println("Object One");
        System.out.println(E1.name);
        System.out.println(E1.age);
        System.out.println(E1.salary);
        System.out.println(Employee.companyName);

        System.out.println("");

        Employee E2 = new Employee();

        E2.name = "Muzamil";
        E2.age = 31;
        E2.salary = 10000;
       // Employee.companyName = "ABC";

        System.out.println("Object Two");
        System.out.println(E2.name);
        System.out.println(E2.age);
        System.out.println(E2.salary);
        System.out.println(Employee.companyName);

        System.out.println("");

        Employee E3= new Employee();

        E3.name = "Sagar";
        E3.age = 30;
        E3.salary = 90000;
       // Employee.companyName = "ABC";

        System.out.println("Object Three");
        System.out.println(E3.name);
        System.out.println(E3.age);
        System.out.println(E3.salary);
        System.out.println(Employee.companyName);
    }
}