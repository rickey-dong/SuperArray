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
    data[size] = element;
    size = size + 1;
    return true;
  }
  public String get(int index)
  {
    return data[index];
  }
}
