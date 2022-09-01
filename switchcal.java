import java.util.Scanner;


public class switchcal {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

    System.out.println("This is simple calculator");
    

    int num1=input.nextInt();
    char ch=input.next().charAt(0);
    char ch1;
    
    if (ch=='+'|| ch=='-'||ch=='/'||ch=='*'){

        ch=ch;
    }
    else{
        System.out.print("Please Input + - / *   ");
        ch=input.next().charAt(0);
    }
    int num2=input.nextInt();
        int res;
        

    switch (ch){
        case '+':
        res=num1+num2;
        System.out.print(res);
        break;
        case '-':
        res=num1-num2;
        System.out.print(res);
        break;
        case '/':
        res=num1/num2;
        System.out.print(res);
        break;
        case '*':
        res=num1*num2;
        System.out.print(res);
        break;
        default:
        System.out.println("Invalid Operation!!!");

        
    }


    }

}
