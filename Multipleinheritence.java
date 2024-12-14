import java.util.*;
interface a
{
    public void r1();
}
interface b
{
    public void r();
}
class c implements a,b
{
    public void r1()
    {
        System.out.println("hello professors");
    }
     public void r()
    {
        System.out.println("hello teachers");
    }
}
public class Multipleinheritence
{
    public static void main(String[] args)
    {
        c h=new c();
        h.r1();
        h.r();
    }
}