import java.util.Scanner;


public class vowelconsonant {
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
char lett=input.next().charAt(0);

System.out.print("Enter any letter: ");
if(lett=='a'|| lett=='A'|| lett =='e'|| lett=='E'||lett=='i'|| lett=='I'||lett=='o'|| lett=='O'||lett=='u'|| lett=='U'){

    System.out.print("\nIt\'s Vowel");

}
else{
    System.out.print("\nIt\'s Constant");
}




    }
    
}
