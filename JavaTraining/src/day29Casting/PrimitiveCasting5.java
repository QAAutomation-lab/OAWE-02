package day29Casting;

class Sample
{
    void test1(double d)
    {
        System.out.println("d value="+d);
    }
    void test1(float k)
    {
        System.out.println("k value="+k);
    }
    void test1(long j)
    {
        System.out.println("j value="+j);
    }
}
public class PrimitiveCasting5 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample s=new Sample();
        s.test1(7);
        System.out.println("Program ends");         
    }
}