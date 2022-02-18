import java.util.Scanner;

enum Signal{
    RED,GREEN,YELLOW;
}
public class EnumDemo {
    Signal s;

    void showSignal(Signal s){
        switch (s){
            case RED :
                System.out.println("RED MEANS STOP.");
                break;
            case GREEN:
                System.out.println("GREEN MEANS GO.");
                break;
            case YELLOW:
                System.out.println("YELLOW MEANS GO SLOW.");
                break;
            default:
                System.out.println("Invalid Entry!");
                break;
        }
    }
    public static void main(String[] args) {
        EnumDemo obj_e=new EnumDemo();
        for(int i=0;i<3;i++){
            System.out.println("Enter Signal: ");
            Scanner inp=new Scanner(System.in);
            Signal signal= Signal.valueOf(inp.nextLine());
            obj_e.showSignal(signal);
        }
        Signal sarr[]=Signal.values();
        for(Signal s1:sarr){
            System.out.println(s1+" "+s1.ordinal());
        }
    }
}

/*
Enter Signal:
RED
RED MEANS STOP.
Enter Signal:
GREEN
GREEN MEANS GO.
Enter Signal:
YELLOW
YELLOW MEANS GO SLOW.
RED 0
GREEN 1
YELLOW 2
 */
