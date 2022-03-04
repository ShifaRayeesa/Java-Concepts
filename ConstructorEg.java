import java.util.Scanner;

public class ConstructorEg {
    Scanner sc = new Scanner(System.in);

    ConstructorEg() {
        System.out.println("Fill in the following details to Register");
        System.out.println();
        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Age : ");
        int age = sc.nextInt();
        System.out.println("Profession : ");
        String profession = sc.next();
        System.out.println("Password");
        String password = sc.next();
        System.out.println();
        System.out.println("Welcome.."+name+"\nAccount Created Successfully!!");
    }

    ConstructorEg(String name, String password) {

        System.out.println("Hi.." + name+"! You have logged in..");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConstructorEg obj;
        System.out.println("Do you have an account?");
        System.out.println("Enter Y for 'Yes' and N for 'No'");
        String yesOrNo = sc.next();
        if (yesOrNo.charAt(0)=='Y') {
            String name, password;
            System.out.println("Enter Name : ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter Password : ");
            password = sc.next();
            System.out.println("Enter age : ");
            int age= sc.nextInt();
            System.out.println(name+ " "+password+" "+ age);
            obj = new ConstructorEg(name,password);
        } else if(yesOrNo.charAt(0)=='N'){
            obj = new ConstructorEg();
        }
    }
}

