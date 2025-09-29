class Box 
{
double length;
double width;
double height;
Box(double l, double w, double h) {
length = l;
width = w;
height = h;
}
double volume() {
return length * width * height;
}
}
class Demo 
{
public static void main(String args[]) {
Box b1 = new Box(5, 6, 8);
Box b2 = new Box(10, 7, 6);
System.out.println("Volume of Box 1 = " + b1.volume());
System.out.println("Volume of Box 2 = " + b2.volume());
}
}
