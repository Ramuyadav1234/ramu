public class OneInterfaceOneClass
{
public static void main(String args[])
{
shape circleshape =new circle();
circleshape.Draw();
}
}
interface shape
{
public String baseclass="shape";
public void Draw();
}
class circle implements shape
{
public void Draw()
{
System.out.println("drawing circle here");
}
}