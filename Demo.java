public class Demo
{
  public static void main(String[] args)
  {
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words + " should be [kani, uni, ebi, una, toro]");
    SuperArray foods = new SuperArray();
    foods.add("food");  foods.add("apple"); foods.add("pie"); foods.add("pie"); foods.add("pie");
    System.out.println(foods);
    removeDuplicates(foods);
    System.out.println(foods + " should be [food, apple, pie]");
    SuperArray small = new SuperArray();
    small.add("medium"); small.add("medium");
    System.out.println(small);
    removeDuplicates(small);
    System.out.println(small + " should be [medium]");
  }
  public static void removeDuplicates(SuperArray s)
  {
    for (int element = (s.size() - 1); element > 0; element--)
    {
      if (s.indexOf(s.get(element)) == element)
      {
        element = element;
      }
      else
      {
        s.remove(element);
      }
    }
  }
}
