package aliquot;

public class AliquotSum 
{
    public static void main(String args[])
    {       
        int i=1, sum=0;
       
        int number;
        for(number=1;number<=100;number++)
       {	
            for(i=1; i<number; i++)
            {
               if(number%i == 0)
                {
            	sum += i;
                }
            }
        System.out.println("Given number is "+number);
        System.out.println("----Aliquot sum is " +sum);
                if(sum == number)
                {
                System.out.println("-------This is a perfect number.");           
                }
                else
                {
                System.out.println("-------This is not a perfect number.");
                }  
                sum=0;
        }
     }
    
}