package LabTest4;
import java.util.regex.*;
       public class InvalidMailException 
       
   {
       public static boolean isValid(String email)
   {
         String regex = "^(.+)@(.+)$";
         Pattern pattern = Pattern.compile(regex);
               if (email == null)
         return false;
         return pattern.matcher(email).matches();
    }
           public static void main(String args[])
           
        {
           String email = "prachi..sharma@gmail.com";
               boolean result = isValid(email);
            if (result == true)
                    System.out.println("Provided email address "+ email+ " is valid \n");
        else
                    System.out.println("Provided email address "+ email+ " is invalid \n");
         }
 }