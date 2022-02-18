class  AdditionWithoutVar{
    void add1(int a,int b){
        int sum=0;
        sum=a+b;
        System.out.println("Sum is: "+sum);
    }
    void add1(int a,int b,int c){
        int sum=0;
        sum=a+b+c;
        System.out.println("Sum is: "+sum);
    }
    void add1(int a,int b,int c,int d,int e){
        int sum=0;
        sum=a+b+c+d+e;
        System.out.println("Sum is: "+sum);
    }
}
class AdditionVar{
    void add(int...a){
        int sum=0;
        System.out.println("No. of Numbers to add: "+a.length);
        for(int i:a){
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
    }
}
public class VarArgsDemo {
    public static void main(String[] args) {
        AdditionVar obj_a=new AdditionVar();
        AdditionWithoutVar obj_aw=new AdditionWithoutVar();
        System.out.println("****WITH VARARGS*****");
        obj_a.add(1,2);
        obj_a.add(23,45,67,890);
        obj_a.add(234,56,78651,902876,22);
        obj_a.add(12,23,34,56,67,78,89);
        obj_a.add(1,2,3,4,5,6,7,8,9,10);
        System.out.println("****WITHOUT VARARGS*****");
        obj_aw.add1(2,3);
        obj_aw.add1(4,5,6);
        obj_aw.add1(1,2,3,4,5);
    }
}
/*
****WITH VARARGS*****
No. of Numbers to add: 2
Sum is: 3
No. of Numbers to add: 4
Sum is: 1025
No. of Numbers to add: 5
Sum is: 981839
No. of Numbers to add: 7
Sum is: 359
No. of Numbers to add: 10
Sum is: 55
****WITHOUT VARARGS*****
Sum is: 5
Sum is: 15
Sum is: 15
 */