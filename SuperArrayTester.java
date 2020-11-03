public class SuperArrayTester
{
  public static void main(String[] args)
  {
    SuperArray laughter = new SuperArray();
    System.out.println(laughter.size() + " should be 0");
    laughter.add("lol");
    System.out.println(laughter.size() + " should be 1");
    System.out.println(laughter.get(0) + " should be lol");
    System.out.println(laughter.set(0, "LOL") + " should be lol");
    System.out.println(laughter.get(0) + " should be LOL");
    laughter.add("lel");
    laughter.add("lll");
    laughter.add("ooo");
    laughter.add("olo");
    laughter.add("haha");
    laughter.add("hehe");
    laughter.add("heh");
    laughter.add("hah");
    laughter.add("xd");
    System.out.println(laughter.size() + " should be 10");
    System.out.println(laughter.get(9) + " should be xd");
    laughter.add("lul");
    System.out.println(laughter.size() + " should be 11");
    System.out.println(laughter.get(10) + " should be lul");
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println("should print:\nkani\nuni\nebi");
  }
}
