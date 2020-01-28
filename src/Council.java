import java.util.Scanner;

public class Council {

    public static  void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("How many persons would you like in your council?");
        int councilNumber = read.nextInt();
        read.nextLine();

        Person[]council = new Person[councilNumber];

        int[] bob = new int[50];
        bob[4]=9;
        for(int i = 1 ; i< council.length+1; i++) {
            System.out.println("name of council person " + i +":");
            String name = read.nextLine();
            System.out.println("age of council person " + i +":");
            String age = read.nextLine();
            System.out.println("Favourite food of council person " + i +":");
            String food = read.nextLine();

            Person person = new Person(name,age,food);
            council[i-1] = person;
        }

        for(int i = 0; i<council.length; i++){
            int sumAges=0;
            System.out.println(council[i]);

            sumAges = Integer.parseInt(council[i].getAge());
        }
    }
}
