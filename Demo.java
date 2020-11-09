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
    SuperArray overlapA = new SuperArray();
    overlapA.add("9");
    overlapA.add("1");
    overlapA.add("2");
    overlapA.add("2");
    overlapA.add("3");
    overlapA.add("4");
    SuperArray overlapB = new SuperArray();
    overlapB.add("0");
    overlapB.add("4");
    overlapB.add("2");
    overlapB.add("2");
    overlapB.add("9");
    System.out.println(findOverlap(overlapA, overlapB) + " should be [9, 2, 4]");
    SuperArray overlapC = new SuperArray();
    overlapC.add("cat"); overlapC.add("dog"); overlapC.add("mouse"); overlapC.add("rat");
    SuperArray overlapD = new SuperArray();
    overlapD.add("rat"); overlapD.add("cat"); overlapD.add("moose"); overlapD.add("mouse");
    System.out.println(findOverlap(overlapC, overlapD) + " should be [cat, mouse, rat]");
    SuperArray zipA = new SuperArray();
    zipA.add("a"); zipA.add("b"); zipA.add("c"); zipA.add("d"); zipA.add("e"); zipA.add("f");
    SuperArray zipB = new SuperArray();
    zipB.add("0"); zipB.add("1"); zipB.add("2"); zipB.add("3");
    System.out.println(zip(zipA, zipB) + " should be [a, 0, b, 1, c, 2, d, 3, e, f]");
    SuperArray zipC = new SuperArray();
    zipC.add("a"); zipC.add("b"); zipC.add("c");
    SuperArray zipD = new SuperArray();
    zipD.add("0"); zipD.add("1"); zipD.add("2"); zipD.add("3"); zipD.add("4");
    System.out.println(zip(zipC, zipD) + " should be [a, 0, b, 1, c, 2, 3, 4]");
    SuperArray zipBlank = new SuperArray();
    System.out.println(zip(zipC, zipBlank) + " should be [a, b, c]");
    System.out.println(zip(zipBlank, zipC) + " should be [a, b, c]");
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
  public static SuperArray findOverlap(SuperArray a, SuperArray b)
  {
    SuperArray intersect = new SuperArray(a.size());
    for (int element = 0; element < a.size(); element++)
    {
      if (b.contains(a.get(element)))
      {
        intersect.add(a.get(element));
      }
    }
    removeDuplicates(intersect);
    return intersect;
  }
  public static SuperArray zip(SuperArray a, SuperArray b)
  {
    int maxIterator = 0;
    if (a.size() < b.size())
    {
      maxIterator = b.size();
    }
    else
    {
      maxIterator = a.size();
    }
    SuperArray zipped = new SuperArray(a.size() + b.size());
    for (int element = 0; element < maxIterator; element++)
    {
      if (element >= b.size())
      {
        zipped.add(a.get(element));
      }
      else if (element >= a.size())
      {
        zipped.add(b.get(element));
      }
      else
      {
        zipped.add(a.get(element));
        zipped.add(b.get(element));
      }
    }
    return zipped;
  }
}
