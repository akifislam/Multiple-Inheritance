/*
* Akif Islam
* 1910776135
*
* This goal of this program is to create a burger-maker program that makes burgers with m numbers of bun and n number of patty (where m and n are integers).
* */
public class BurgerMaker extends Buns{

    public static void main(String[] args){

        BurgerMaker burger = new BurgerMaker();
        burger.set_bun(4); // calling parent class method to set bun count

        Patty patty = new Patty(1); //Initialize a patty class because make_burger() method takes a Patty object
        burger.make_burger(patty); // calling parent class method to make burger

    }
}

