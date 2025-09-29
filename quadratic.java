import java.util.Scanner;
class Quad 
{
int a, b, c;         
double root1, root2;  
double real, imag;    
void input() 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter coefficients a, b, c:");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
}
void calcRoots() {
double d = (b * b) - (4 * a * c);  
		
if (d > 0) {
root1 = (-b + Math.sqrt(d)) / (2 * a);
root2 = (-b - Math.sqrt(d)) / (2 * a);
System.out.println("Roots are real and different:");
System.out.println("Root1 = " + root1);
System.out.println("Root2 = " + root2);
}
 else if (d == 0) {
root1 = root2 = -b / (2.0 * a);
System.out.println("Roots are real and equal:");
System.out.println("Root1 = Root2 = " + root1);
} 
else 
{
real = -b / (2.0 * a);
imag = Math.sqrt(-d) / (2 * a);
System.out.println("Roots are complex:");
System.out.println("Root1 = " + real + " + i" + imag);
System.out.println("Root2 = " + real + " - i" + imag);
}
}
}

public class QuadRun 
{
public static void main(String[] args) {
Quad q = new Quad(); 
q.input();           
q.calcRoots();      
}
}
