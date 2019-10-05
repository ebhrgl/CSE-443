package SUITS;
import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a type of suits : (DEC - ORA - TOR)");
        s = sc.nextLine();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of suits: ");
        int num = scan.nextInt();

        if(s.equals("DEC"))
        {
            SUITS suits = new DEC(num);

            for(int i=0;i<4;++i){
                String str;
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a accessory: AutoRifle - FlameThrower - Laser - RocketLauncher ");
                str = scn.nextLine();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number of accessory: ");
                int number = scanner.nextInt();
                if(str.equals("AutoRifle")){
                    suits = new AutoRifle(suits,number);
                }
                if(str.equals("FlameThrower")){
                    suits = new FlameThrower(suits,number);
                }
                if(str.equals("Laser")){
                    suits = new Laser(suits,number);
                }
                if(str.equals("RocketLauncher")){
                    suits = new RocketLauncher(suits,number);
                }

            }
             System.out.println("Total Cost: "+ suits.getCost());
             System.out.println("Total Weight: "+ suits.getWeight());
        }

        else if(s.equals("ORA")){

            SUITS suits = new ORA(num);

            for(int i=0;i<4;++i){
                String str;
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a accessory: AutoRifle - FlameThrower - Laser - RocketLauncher ");
                str = scn.nextLine();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number of accessory: ");
                int number = scanner.nextInt();
                if(str.equals("AutoRifle")){
                    suits = new AutoRifle(suits,number);
                }
                if(str.equals("FlameThrower")){
                    suits = new FlameThrower(suits,number);
                }
                if(str.equals("Laser")){
                    suits = new Laser(suits,number);
                }
                if(str.equals("RocketLauncher")){
                    suits = new RocketLauncher(suits,number);
                }

            }
            System.out.println("Total Cost: "+ suits.getCost());
            System.out.println("Total Weight: "+ suits.getWeight());
        }
        else if(s.equals("TOR")) {

            SUITS suits = new TOR(num);

            for (int i = 0; i < 4; ++i) {
                String str;
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a accessory: AutoRifle - FlameThrower - Laser - RocketLauncher ");
                str = scn.nextLine();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number of accessory: ");
                int number = scanner.nextInt();
                if (str.equals("AutoRifle")) {
                    suits = new AutoRifle(suits, number);
                }
                if (str.equals("FlameThrower")) {
                    suits = new FlameThrower(suits, number);
                }
                if (str.equals("Laser")) {
                    suits = new Laser(suits, number);
                }
                if (str.equals("RocketLauncher")) {
                    suits = new RocketLauncher(suits, number);
                }

            }
            System.out.println("Total Cost: " + suits.getCost());
            System.out.println("Total Weight: " + suits.getWeight());

        }
    }
}
