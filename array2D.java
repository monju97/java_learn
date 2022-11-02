import java.util.Scanner;

public class array2D {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //Declare 2D Array
        int first[][]=new int[2][3];
        int second[][]=new int[2][3];

        //Input Array Element From User
        System.out.println("Please Input Matrix First Elements");

        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("First[%d][%d]",row,col);
                first[row][col]=input.nextInt();

            }  
        }
        System.out.println("Please Input Matrix Second Elements");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.printf("Second[%d][%d]",row,col);
                second[row][col]=input.nextInt();

            }  
        }
        System.out.print("First Matrix=");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+first[row][col]);                

            }  
            System.out.print("\n");

        }
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+first[row][col]);                

            }  
            System.out.print("\n");

        }




         
    }

    
}
