import java.util.*;
public class Source {

   public static void main(String[] args) {

    //Declare two variables of any numeric data type and swap their values without using a third variable.
    int a=1;
    System.out.println((double)a);
    //Declare two string variables and concatenate them to form a new string. Print the result.
    String name1="Subhodeep";
    String name2="Chatterjee";
    System.out.println(name1+" "+name2);
    //Declare a variable of one numeric data type (e.g., int) and convert it to another numeric data type (e.g., double). Print both values.
    int d=20;
    System.out.println(d);
    System.out.println((double)d);
    //Declare a char variable and perform the following operations:
   
    
    //Print its ASCII value.
    char myChar = 'a';
    int newChar=myChar;
    System.out.println(newChar);
    
    
    //Declare two boolean variables and perform the following operations:

    //Logical AND between them.
    //Logical OR between them.
    //Logical NOT for each variable.

    boolean bool1 = true;
    boolean bool2 = false;

        // Logical AND
    boolean andResult = bool1 && bool2;

        // Logical OR
    boolean orResult = bool1 || bool2;

        // Logical NOT
    boolean notResult1 = !bool1;
    boolean notResult2 = !bool2;

    System.out.println("Logical AND: " + andResult);
    System.out.println("Logical OR: " + orResult);
    System.out.println("Logical NOT for bool1: " + notResult1);
    System.out.println("Logical NOT for bool2: " + notResult2);
}
}
