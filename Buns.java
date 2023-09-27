/*
 * Akif Islam
 * 1910776135
 *
 * This class holds information about the bun count. User can set no of buns and make burger with this class.
 * Burger will be displayed with '=' and '-' sign.
 * N.B: '------' represents bun and '||||||' represents patty.
 * */

public class Buns {
    int no_of_bun = 0;
    public void set_bun(int no_of_bun){
        this.no_of_bun = no_of_bun;
    }
    public void make_burger(Patty patty){
        System.out.println("Here is your burger with " + no_of_bun +" bun(s) and "+patty.get_patty() + " patty(s)\n\n");
        for (int i = 0; i < no_of_bun/2; i++) {
            System.out.println("------------");
        }

        int no_of_patty = patty.get_patty();

        for (int i = 0; i < no_of_bun/2; i++) {
            System.out.println("||||||||||||");
        }

        for (int i = 0; i < no_of_bun/2; i++) {
            System.out.println("------------");
        }

    }

}

