import java.util.Scanner;

public class FindDayO {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int i=0,date,month,Fmonth,year,Fyear,Lyear,day,sum;
        System.out.println("***Please Enter Your Date of Birth***");
        System.out.print("Please Enter Date: ");
        do{
            
            date=input.nextInt();
            i=date;
        if (i<1 || i>31){       
            
        System.out.print("Invalid Date! Please enter valid date ");
        
    }
    
    }while (i<1 || i>31);

    System.out.print("Plese Enter Month: ");
    do{
            
        month=input.nextInt();
        i=month;
    if (i<1 || i>12){       
        
    System.out.print("Invalid month! Please enter valid month ");
    
}

}while (i<1 || i>12);
        
        System.out.print("Please Enter Year: ");        
        year=input.nextInt();
        System.out.println("\nYour Date of Birth Is: "+date+"-"+month+"-"+year);

        Fyear=year-1900;
        
        // if(Fyear%4==0){
        //         if(month==2){
        //             if(date<=28){

        //                 Lyear=Fyear/4-1;
        //             }

        //         }
        //         else if(month<2){
        //             Lyear=Fyear/4-1;

        //         }
            
        // }else{
            Lyear=Fyear/4;
            
        // month
        if(month==1 || month ==10){
            Fmonth=1;
            sum=date+Fmonth+Fyear+Lyear;
        day=sum%7;

        if(day==0){
            System.out.print("Its Saturday");
        
        }else if(day==1){
            System.out.print("Its Sunday");
        
        }else if(day==2){
            System.out.print("Its Monday");
        
        }else if(day==3){
            System.out.print("Its Tuesday");
        
        }else if(day==4){
            System.out.print("Its Wednesday");
        
        }else if(day==5){
            System.out.print("Its Thrusday");
        
        }else if(day==6){
            System.out.print("Its Friday");
        }
        
    
        // }else if(month==2||month==3||month==11){
        //     Fmonth=4;
        // }else if(month==4||month==7){
        //     Fmonth=0;
        // }else if(month==5){
        //     Fmonth=2;
        // }else if(month==6){
        //     Fmonth=5;
        // }else if(month==7){
        //     Fmonth=0;
        // }else if(month==8){
        //     Fmonth=3;
        // }else if(month==9||month==12){
        //     Fmonth=6;
        // }
        // sum=date+Fmonth+Fyear+Lyear;
        // day=sum%7;

        // if(day==0){
        //     System.out.print("Its Saturday");
        
        // }else if(day==1){
        //     System.out.print("Its Sunday");
        
        // }else if(day==2){
        //     System.out.print("Its Monday");
        
        // }else if(day==3){
        //     System.out.print("Its Tuesday");
        
        // }else if(day==4){
        //     System.out.print("Its Wednesday");
        
        // }else if(day==5){
        //     System.out.print("Its Thrusday");
        
        // }else if(day==6){
        //     System.out.print("Its Friday");
        // }
        // }
    
        

    }
    
}
    }
