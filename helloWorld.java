class helloWorld{
public static void main(String args[]){
 System.out.println("hello world");
}
}
class Variables{
public static void main(String args[]){
int age;
age=22;
float height=5.6f;
System.out.println("age="+age);
System.out.println("height="+height);
}
}

class UnaryOperators{
 public static void main(String args[]){
//post incrementation
/* int a=10;
int b=a++;
*/

int a=10;
//post incrementation
/*int b=++a;
System.out.println(a);
System.out.println(b);
*/
/*System.out.println("a: "+a);
a++;
System.out.println("a: "+a);
a++;
System.out.println("a: "+a);
a--;
System.out.println("a: "+a); 
--a;
System.out.println("a: "+a);
*/
int b=a++ + ++a + a++ + ++a - a-- + --a;
System.out.println(a);
System.out.println(b);
}
}
class BinaryOperators{

 public static void main(String args[]){
 int num1=5;
 int num2=10;
 int sum=num1+num2;
 System.out.println("Sum of num1 and num2 : "+sum);
 int sub=num1-num2;
 System.out.println("Difference of num1 and num2 : "+sub);
 float div=num2/num1;
 System.out.println("Quotient of num1 and num2 : "+div);
 int mul=num1*num2;
 System.out.println("Multiplication of num1 and num2 : "+mul);
 int mod=num1%num2;
 System.out.println("Remainder of num1 and num2 : "+mod); 
 
}
}