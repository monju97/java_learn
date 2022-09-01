import java.util.Scanner;


public class calt {
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
    //hi all
    
    do{
        i=input.next().charAt(0);
        // System.out.println("invalid");
        
    if (i=='+' ||i=='-'|| i=='*'|| i=='/'|| i=='%'){
System.out.println("2nd input");

    int num2=input.nextInt();
        int res;

        switch (i){
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
            case '%':
            res=(num1*num2)/100;
            System.out.print(res);
            break;
            default:
            System.out.println("Invalid Operation!!!");
    
            
        }
         
}else{
    System.out.print("Please Input + - / *   ");
    i++;
}

}while (i!='+'||i!='-'|| i!='*'|| i!='/'|| i!='%');




    }
}