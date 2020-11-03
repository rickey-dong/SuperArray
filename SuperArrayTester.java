public class SuperArrayTester
{
  public static void main(String[] args)
  {
    SuperArray a1 = new SuperArray();
    System.out.println(a1.size() + " should be 0");
    a1.add("lol");
    System.out.println(a1.size() + " should be 1");
  }
}
