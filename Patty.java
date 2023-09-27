/*
 * Akif Islam
 * 1910776135
 *
 * This class holds information about the burger patty count
 * */

public class Patty {
    public int no_of_patty = 0;

    Patty(int no_of_patty){
        set_patty(no_of_patty);
    }
    public void set_patty(int no_of_patty){
        this.no_of_patty = no_of_patty;
    }
    public int get_patty(){
        return no_of_patty;
    }
}
