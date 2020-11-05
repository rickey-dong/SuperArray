public class SuperArrayTester
{
  public static void main(String[] args)
  {
    SuperArray laughter = new SuperArray();
    System.out.println(laughter.size() + " should be 0");
    laughter.add("lol");
    System.out.println(laughter.size() + " should be 1");
    System.out.println(laughter.get(0) + " should be lol");
    System.out.println(laughter.get(1) + " should be null");
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
    System.out.println(laughter.isEmpty() + " should be false");
    System.out.println(laughter);
    System.out.println(laughter.contains("xd") + " should be true");
    System.out.println(laughter.contains("hm") + " should be false");
    laughter.add(2,"kek");
    System.out.println(laughter + " should be [LOL, lel, kek, lll, ooo, olo, haha, hehe, heh, hah, xd, lul]");
    laughter.clear();
    System.out.println(laughter.size() + " should be 0");
    System.out.println(laughter.get(0) + " should be null");
    System.out.println(laughter.get(1) + " should be null");
    SuperArray food = new SuperArray(3); //[null, null, null]
    food.add("cheese");
    food.add(null);
    food.add("pizza"); //[cheese,null,pizza]
    food.add(1,"crust"); //[cheese,crust,null,pizza]
    System.out.println(food + " should be [cheese, crust, null, pizza]");
    food.add(3,"pepper"); //[cheese,crust,null,pepper,pizza]
    System.out.println(food + " should be [cheese, crust, null, pepper, pizza]");
    food.remove(0);
    System.out.println(food + " should be [crust, null, pepper, pizza]");
    food.remove(2);
    System.out.println(food + " should be [crust, null, pizza]");
  }
}
