import java.util.*;
class a
{
    public void pl()
    {
        System.out.println("hello students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("hello teachers");
    }
}
class c extends a
{
    public void r1()
    {
        System.out.println("hello professors");
    }
}
public class Heirarichalinheritence
{
    public static void main(String[] args)
    {
        b h=new b();
        h.r();
        h.pl();
        c h1=new c();
        h1.r1();
        h1.pl();
    }
}