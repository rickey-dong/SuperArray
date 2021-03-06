public class SuperArrayTester
{
  public static void main(String[] args)
  {
    SuperArray laughter = new SuperArray();
    System.out.println(laughter.size() + " should be 0");
    laughter.add("lol");
    System.out.println(laughter.size() + " should be 1");
    System.out.println(laughter.get(0) + " should be lol");
    try
    {
      System.out.println(laughter.get(1));
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
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
    try
    {
      System.out.println(laughter.get(0) + " should be null");
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    SuperArray food = new SuperArray(3); //[null, null, null]
    food.add("cheese");
    food.add("sauce");
    food.add("pizza"); //[cheese,sauce,pizza]
    food.add(1,"crust"); //[cheese,crust,sauce,pizza]
    System.out.println(food + " should be [cheese, crust, sauce, pizza]");
    food.add(3,"pepper"); //[cheese,crust,sauce,pepper,pizza]
    System.out.println(food + " should be [cheese, crust, sauce, pepper, pizza]");
    System.out.println(food.remove(0) + " should be cheese");
    System.out.println(food + " should be [crust, sauce, pepper, pizza]");
    System.out.println(food.remove(2) + " should be pepper");
    System.out.println(food + " should be [crust, sauce, pizza]");
    System.out.println(food.indexOf("crust") + " should be 0");
    System.out.println(food.indexOf("pizza") + " should be 2");
    SuperArray items = new SuperArray();
    items.add("pencil"); items.add("marker"); items.add("sharpie"); items.add("pencil"); items.add("paper");
    System.out.println(items.lastIndexOf("pencil") + " should be 3");
    System.out.println(items.lastIndexOf("pen") + " should be -1");
    SuperArray stationery = new SuperArray();
    stationery.add("pencil"); stationery.add("marker"); stationery.add("sharpie"); stationery.add("pencil"); stationery.add("paper");
    System.out.println(items.equals(stationery) + " should be true");
    SuperArray fakeItems = new SuperArray();
    fakeItems.add("pen"); fakeItems.add("paper"); fakeItems.add("looseleaf"); fakeItems.add("marker");
    System.out.println(items.equals(fakeItems) + " should be false");
    System.out.println("=========================Exception Testing with Try/Catch=========================");
    try
    {
      SuperArray testing = new SuperArray(-3);
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e);
    }
    try
    {
      System.out.println(food.set(6,"chicken"));
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    try
    {
      food.add(-5,"beans");
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    try
    {
      System.out.println(food.remove(10));
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
    System.out.println(food);
  }
}
