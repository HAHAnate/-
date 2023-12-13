import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            test Allpeople = new test();

        while(true){
                System.out.println ("\n Choose Option");
                System.out.println ("r Register");
                System.out.println ("s ShowallData ");
                System.out.println ("x Exit");


            String choice = scanner.nextLine();
            switch(choice){
            case "r":
                System.out.println("Enter ID :");
                int ID = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Name :");
                String name = scanner.nextLine();
                System.out.println("Enter Age :");
                String age = scanner.nextLine();
                people People = new people(ID, name, age);
                Allpeople.addpeople(People);
                break;
            case "s":
                Allpeople.ShowAlldata();
                break;
            case "x":
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Input");

        }
    
    
    }

}
}


    

        