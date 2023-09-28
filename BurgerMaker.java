/*
* Akif Islam
* 1910776135
*
* This goal of this program is to create a burger-maker program that makes burgers with m numbers of bun and n number of patty (where m and n are integers).
* */
public class BurgerMaker implements Bun,Patty,Sauce {
    public static int no_of_bun, no_of_patty,no_of_sachets;

    // Constructor
    BurgerMaker(int no_of_bun, int no_of_patty, int no_of_sachets){

        put_bun(no_of_bun);
        put_patty(no_of_patty);
        put_sauce(no_of_sachets);
    }

    // Interface 1
    @Override
    public void put_bun(int no_of_bun) {
        this.no_of_bun = no_of_bun;
    }

    // Interface 2
    @Override
    public void put_patty(int no_of_patty) {
        this.no_of_patty = no_of_patty;
    }

    // Interface 3
    @Override
    public void put_sauce(int no_of_sachets){
        this.no_of_sachets = no_of_sachets;
    }


    public static void make_burger(){
        System.out.println("Here is your burger with " + no_of_bun +" bun(s) and "+no_of_patty + " patty(s) and "+ no_of_sachets +" sachets of Sauces!\n"+"Have a great meal!\n");


        // Print Top Buns
        for (int i = 0; i < no_of_bun/2; i++) {
            System.out.println("------------");
        }
        // Print Sauce
        for (int i = 0; i < no_of_sachets; i++) {
            System.out.println("++++++++++++");
        }
        // Print Patties
        for (int i = 0; i < no_of_patty; i++) {
            System.out.println("||||||||||||");
        }
        // Print Bottom Buns
        for (int i = 0; i < no_of_bun/2; i++) {
            System.out.println("------------");
        }

    }
}

