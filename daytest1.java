import java.util.Scanner;

public class daytest1{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("enter month ");
        int month=input.nextInt();
        int fmonth=0;
        if(month==1 || month ==10){
            fmonth=1;
        }else if(month==2){
            fmonth=4;
            
        }
        System.out.println(fmonth);
    }
}