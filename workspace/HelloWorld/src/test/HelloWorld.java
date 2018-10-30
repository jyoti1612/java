package test;
import java.util.Scanner; //To take input from user
import java.time.LocalDate; //To parse date
import java.time.format.DateTimeFormatter; // To format date
import java.util.Locale; //ENGLISH
import java.util.Arrays; //array to string

public class HelloWorld {

	public static void main(String[] args) {
		
		//1. To print ascci value of char
		System.out.println("\nTo print ascci value of char");
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        
        // Compute Quotient and Remainder
        System.out.println("\nTo Compute Quotient and Remainder");
        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("dividend = " + dividend);
        System.out.println("divisor = " + divisor);
        System.out.println("dividend / divisor = Quotient = " + quotient);
        System.out.println("dividend % divisor = remainder = " + remainder);
        
        //Check if a string is numeric
        System.out.println("\nCheck if a string is numeric");
        String string = "12345.15";
        boolean numeric = true;
        
        //numeric = string.matches("-?\\d+(\\.\\d+)?"); //with regex
        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
        
        //to Convert String to Date
        System.out.println("\nTo Convert String to Date");
        String str1 = "2017-07-25";
        String str2="July 25, 2017";
        LocalDate date = LocalDate.parse(str1, DateTimeFormatter.ISO_DATE);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date1 = LocalDate.parse(str2, formatter);

        System.out.println("2017-07-25 to date is: "+ date);
        System.out.println("using pattern formatters : July 25, 2017 to date is: "+ date1);
        
        //To Get current working directory
        System.out.println("\nTo Get current working directory");
        String path = System.getProperty("user.dir");
    //OR
        // String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);
        
		
        //Compare two strings using equals()
        System.out.println("\nTo Compare two strings using equals()");
        // ** Note: we've used String constructor to create the strings. To compare these strings in Java, we need to use the equals() method of the string.You should not use == (equality operator) to compare these strings because they compare the reference of the string, i.e. whether they are the same object or not.
		//        String style = "Bold";
		//        String style2 = "Bold";
        
        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        
        //Different ways to compare two strings
        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2 == "Bold"; // false
        System.out.println(result);

        result = style == style2; // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
        
        
        //To Check Prime Number
        System.out.println("\nTo Check Prime Number");
        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        
        //To Check armstrong Number or not
        System.out.println("\nTo Check armstrong Number or not");
        int no1 = 371, originalNumber, rem, res = 0;

        originalNumber = no1;

        while (originalNumber != 0)
        {
        	rem = originalNumber % 10;
            res += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(res == no1)
            System.out.println(no1 + " is an Armstrong number.");
        else
            System.out.println(no1 + " is not an Armstrong number.");
        
        //pallindrom number
        System.out.println("\nTo Check pallindrom Number or not");
        int no2 = 121, reversedInteger = 0, rem1, originalInteger;

        originalInteger = no2;

        // reversed integer is stored in variable 
        while( no2 != 0 )
        {
            rem1 = no2 % 10;
            reversedInteger = reversedInteger * 10 + rem1;
            no2  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
        
        //String Reverse
        System.out.println("\nTo String Reverse");
        String sentence = "Go work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
        
        //Convert char array to string
        System.out.println("\nConvert char array to string");
        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch1);
        String st2 = new String(ch1);

        System.out.println(st);
        System.out.println(st2);
        
        
        // Convert String to char array
        System.out.println("\nConvert String to char array");
        String str3 = "This is great";

        char[] chars = str3.toCharArray();
        System.out.println(Arrays.toString(chars));
        
        
        //2. Print an Integer (Entered by the User)
		// Creates a reader instance which takes input from standard input - keyboard
        System.out.println("\nTo print an Integer (Entered by the User)");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
        
       
	}
	 public static String reverse(String sentence)
     {
         if (sentence.isEmpty())
             return sentence;

         return reverse(sentence.substring(1)) + sentence.charAt(0);
     }

}
