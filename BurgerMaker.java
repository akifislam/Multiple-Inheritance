/*
* Akif Islam
* 1910776135
*
* This goal of this program is to create a burger-maker program that makes burgers with m numbers of bun and n number of patty (where m and n are integers).
* */
public class BurgerMaker implements Bun,Patty,Sauce {
    public static int noOfBun, noOfPatty, noOfSachets;

    // Constructor
    BurgerMaker(int noOfBun, int noOfPatty, int noOfSachets){

        putBun(noOfBun);
        putPatty(noOfPatty);
        putSauce(noOfSachets);
    }

    // Interface 1
    @Override
    public void putBun(int noOfBun) {
        this.noOfBun = noOfBun;
    }

    // Interface 2
    @Override
    public void putPatty(int noOfPatty) {
        this.noOfPatty = noOfPatty;
    }

    // Interface 3
    @Override
    public void putSauce(int noOfSachets){
        this.noOfSachets = noOfSachets;
    }


    public static void makeBurger(){
        System.out.println("Here is your burger with " + noOfBun +" bun(s) and "+ noOfPatty + " patty(s) and "+ noOfSachets +" sachets of Sauces!\n"+"Have a great meal!\n");


        // Print Top Buns
        for (int i = 0; i < noOfBun /2; i++) {
            System.out.println("------------");
        }
        // Print Sauce
        for (int i = 0; i < noOfSachets; i++) {
            System.out.println("++++++++++++");
        }
        // Print Patties
        for (int i = 0; i < noOfPatty; i++) {
            System.out.println("||||||||||||");
        }
        // Print Bottom Buns
        for (int i = 0; i < noOfBun /2; i++) {
            System.out.println("------------");
        }

    }
}

