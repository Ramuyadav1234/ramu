class human
{
double height;
double weight;
double age;
void dispage()
{
System.out.println("your age is"+age);
}
double ratio()
{
return weight/height;
}
void setval(double h,double w,double a)
	{
height=h;
weight=w;
age=a;
}
}
class Hum
{
public static void main(String args[])
{
human h1=new human();
human h2=new human();
h1.setval(6.5,60,49);
h2.setval(6.2,63,68);
h1.dispage();
System.out.println("ratio is"+h1.ratio());
h2.dispage();
System.out.println("ratio is"+h2.ratio());
}
}