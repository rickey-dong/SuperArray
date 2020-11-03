public class SuperArrayTester
{
  public static void main(String[] args)
  {
    SuperArray a1 = new SuperArray();
    System.out.println(a1.size() + " should be 0");
    a1.add("lol");
    System.out.println(a1.size() + " should be 1");
    System.out.println(a1.get(0) + " should be lol");
    System.out.println(a1.set(0, "LOL") + " should be lol");
    System.out.println(a1.get(0) + " should be LOL");
    a1.add("lel");
    a1.add("lll");
    a1.add("ooo");
    a1.add("olo");
    a1.add("haha");
    a1.add("hehe");
    a1.add("heh");
    a1.add("hah");
    a1.add("xd");
    System.out.println(a1.size() + " should be 10");
    System.out.println(a1.get(9) + " should be xd");
    a1.add("lul");
    System.out.println(a1.size() + " should be 11");
    System.out.println(a1.get(10) + " should be lul");
  }
}
