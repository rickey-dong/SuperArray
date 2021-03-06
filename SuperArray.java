public class SuperArray
{
  private String[] data;
  private int size;
  public SuperArray()
  {
    size = 0;
    data = new String[10];
  }
  public SuperArray(int initialCapacity)
  {
    if (initialCapacity < 0)
    {
      throw new IllegalArgumentException("The capacity " + initialCapacity + " cannot be negative");
    }
    size = 0;
    data = new String[initialCapacity];
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
    if (index < 0 || index >= size)
    {
      throw new IndexOutOfBoundsException("The index " + index + " cannot be out of bounds");
    }
    return data[index];
  }
  public String set(int index, String element)
  {
    if (index < 0 || index >= size)
    {
      throw new IndexOutOfBoundsException("The index " + index + " cannot be out of bounds");
    }
    String replaced = "";
    replaced = data[index];
    data[index] = element;
    return replaced;
  }
  private void resize()
  {
    String[] largerArray = new String[(data.length * 2) + 1];
    for (int value = 0; value < data.length; value++)
    {
      largerArray[value] = data[value];
    }
    data = largerArray;
  }
  public void clear()
  {
    for (int element = 0; element < size; element++)
    {
      data[element] = null;
    }
    size = 0;
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
      }
      else
      {
        newstr = newstr + data[element];
        newstr = newstr + ", ";
      }
    }
    newstr = newstr + "]";
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
  public void add(int index, String element)
  {
    if (index < 0 || index > size)
    {
      throw new IndexOutOfBoundsException("The index " + index + " cannot be out of bounds");
    }
    if (size == data.length)
    {
      resize();
    }
    for (int tempSize = size; tempSize >= index; tempSize--)
    {
      if (tempSize == index)
      {
        data[tempSize] = element;
        size = size + 1;
      }
      else
      {
        data[tempSize] = data[tempSize-1];
      }
    }
  }
  public String remove(int index)
  {
    if (index < 0 || index >= size)
    {
      throw new IndexOutOfBoundsException("The index " + index + " cannot be out of bounds");
    }
    String removed = data[index];
    for (int tempIndex = index; tempIndex <= size - 1; tempIndex++)
    {
      if (tempIndex == (size - 1))
      {
        data[tempIndex] = null;
        size = size - 1;
      }
      else
      {
        data[tempIndex] = data[tempIndex+1];
      }
    }
    return removed;
  }
  public int indexOf(String s)
  {
    if (contains(s))
    {
      for (int index = 0; index < size; index++)
      {
        if (data[index].equals(s))
        {
          return index;
        }
      }
    }
    return -1;
  }
  public String[] toArray()
  {
    String[] safeArray = new String[size];
    for (int element = 0; element < size; element++)
    {
      safeArray[element] = data[element];
    }
    return safeArray;
  }
  public int lastIndexOf(String value)
  {
    if (contains(value))
    {
      for (int lastIndex = (size - 1); lastIndex >= 0; lastIndex--)
      {
        if (data[lastIndex].equals(value))
        {
          return lastIndex;
        }
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other)
  {
    if (size == other.size)
    {
      for (int element = 0; element < size; element++)
      {
        if ( !(data[element].equals(other.get(element))) )
        {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
