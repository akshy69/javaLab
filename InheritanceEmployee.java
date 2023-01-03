import java.util.Scanner;
class employee {
    Scanner sc=new Scanner(System.in);
    String name;
    String addres;
    int age;
    int salary;
    int phone_number;
    void printSalary() {
        System.out.println("salary is "+salary);
    }
    void display(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("phonr number is "+phone_number);
        System.out.println("address is "+addres);
    }
}

class officer extends employee{
    String specialisation;
    officer(String name,String addres,int phone_number,int age,int salary){
        this.name=name;
        this.addres=addres;
        this.phone_number=phone_number;
        this.age=age;
        this.salary=salary;

    }
}
class manager extends employee{
    String department;
    manager(String name,String addres,int phone_number,int age,int salary){
        this.name=name;
        this.addres=addres;
        this.phone_number=phone_number;
        this.age=age;
        this.salary=salary;

    }
}
class detail{
    public static void main(String arr[]) {
        officer ob =new officer("akshay","cemp punnapra,alapuzha po",236723426,45,65000);
        System.out.println("\n\nprinting officer details...\n");
        ob.display();
        ob.printSalary();

        manager ob1 =new manager("saravana","tirupat,tamilnadu 252825",910003562,60,10000);
        System.out.println("\n\nprinting manager details...\n");
        ob1.display();
        ob1.printSalary();
    }
}