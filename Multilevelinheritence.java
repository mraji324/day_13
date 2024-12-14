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
class c extends b
{
    public void r1()
    {
        System.out.println("hello professors");
    }
}
public class Multilevelinheritence
{
    public static void main(String[] args)
    {
        c h=new c();
        h.r();
        h.pl();
        h.r1();
    }
}