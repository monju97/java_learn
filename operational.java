

import java.util.Scanner;


public class operational {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

    System.out.println("This is simple calculator");
    
    System.out.println("1st input");

    int num1=input.nextInt();
    System.out.println("Operator input");
    char i;
    
    // for (char i=ch; i=='+'|| i=='-';i++ ){
        
    //     System.out.println("invalid");

    // }
    
    
    do{
        i=input.next().charAt(0);
        // System.out.println("invalid");
        
    if (i=='+' ||i=='-'|| i=='*'|| i=='/'|| i=='%'){

         i=i;   
}else{
    System.out.print("Please Input + - / *   ");
    i++;
}

}while (i!='+'||i!='-'|| i!='*'|| i!='/'|| i!='%');
char ch=i;

System.out.println("2nd input");

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