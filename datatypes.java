public class datatypes {
    public static void main(String[] args) {
        //  int rollno = 64;
          //char letter = 'r';
          //float marks = 92.65f;
          //double largeDecimalNumbers = 4587687.4556;
          //long largeInteger = 3845787586734L;
          //boolean check = false;
          
         // Scanner input = new Scanner(System.in);
          //System.out.println("enter your rollno:");
          //int rollno = input.nextInt();
          //System.out.println("Your roll no is "+ rollno);
  
          //String name = input.next();
          //System.out.println(name);
  
         //float marks = input.nextFloat();
          //System.out.println(marks);
  
        //  float num = input.nextFloat();
  
        // type casting - compressing a bigger number in smaller type
       // float num  = (int)(674567);
         // System.out.println(num);
  
          // type promotion
          //int a = 257;
          //byte b =(byte)(a);
          //System.out.println(b);
  
          byte b = 42;
          char c = 'a';
          short s = 1024;
          int i = 50000;
          float f = 5.64f;
          double d = 0.65656;
          double result = (f*b) + (i/c) - (d*s);
          // float + int - double = double (all the datatypes are converted to bigger one)
          System.out.println((f*b) + " " + (i/c)+ " " + (d*s));
          System.out.println(result);
  
          //int a = 10;
          //if (a==10){
             // System.out.println("Hello World");
         // }
         
          //while loop
          //int count = 1;
          //while(count <= 5) {
              //System.out.println(count);
              //count++;
          //}
  
          // for loop
          for(int count = 2; count !=5; count++ ){
              System.out.println(count);
          }
    
        }
}
