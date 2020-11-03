public class SuperArray
{
  private String[] data;
  private int size;
  public SuperArray()
  {
    size = 0;
    data = new String[10];
  }
  public int size()
  {
    return size;
  }
  public boolean add(String element)
  {
    if (size == data.length)
    {
      resize();
    }
    data[size] = element;
    size = size + 1;
    return true;
  }
  public String get(int index)
  {
    return data[index];
  }
  public String set(int index, String element)
  {
    String replaced = "";
    replaced = data[index];
    data[index] = element;
    return replaced;
  }
  private void resize()
  {
    String[] largerArray = new String[(data.length + 1)];
    for (int value = 0; value < data.length; value++)
    {
      largerArray[value] = data[value];
    }
    data = largerArray;
  }
  public boolean isEmpty()
  {
    return size == 0;
  }
  public String toString()
  {
    String newstr = "[";
    for (int element = 0; element < size; element++)
    {
      if (element == (size - 1))
      {
        newstr = newstr + data[element];
        newstr = newstr + "]";
      }
      else
      {
        newstr = newstr + data[element];
        newstr = newstr + ", ";
      }
    }
    return newstr;
  }
  public boolean contains(String s)
  {
    for (int element = 0; element < size; element++)
    {
      if (data[element].equals(s))
      {
        return true;
      }
    }
    return false;
  }
}
