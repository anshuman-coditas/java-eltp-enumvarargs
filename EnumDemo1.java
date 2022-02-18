enum Signal1{
    RED("STOP"),GREEN("GO"),YELLOW("DRIVE VERY SLOWLY");
    String str;
    Signal1(String s) {
        str=s;
    }
    void getmsg(){
        System.out.println(str);
    }
}
public class EnumDemo1 {
    public static void main(String[] args) {
       Signal1.RED.getmsg();
       Signal1.GREEN.getmsg();
       Signal1.YELLOW.getmsg();
    }
}
/*
STOP
GO
DRIVE VERY SLOWLY
 */