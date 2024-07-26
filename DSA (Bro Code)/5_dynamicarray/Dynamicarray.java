
public class Dynamicarray
{
    int size;
    int capacity = 10;
    Object[] array;
    
    public Dynamicarray()
    {
        this.array = new Object[capacity];
    }
    public Dynamicarray(int capacity)
    {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data)
    {
        if (size>=capacity)
        {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data)
    {
        if (size >= capacity)
        {
            grow();
        }
        for (int i=size; i > index; i--)
        {
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data)
    {
        for(int i=0; i<size; i++)
        {
            if(array[i] == data)
            {
                for (int j=0; j<(size-i-1); j++)
                {
                    array[i+j] = array[i + j +1];
                }
                array[size-1] = null;
                size--;
                if (size <= (int)(capacity/3))
                {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data)
    {
        for (int i=0; i<size; i++)
        {
            if (array[i]==data)
            {
                return i;
            }
        }
        return -1;
    }

    private void grow()
    {
        int newCap = (int ) (capacity * 2);
        Object[] newArr = new Object[newCap];
        for (int i = 0; i < size; i++)
        {
            newArr[i] = array[i];
        }
        capacity = newCap;
        array = newArr;

    }

    private void shrink()
    {
        int newCap = (int ) (capacity / 2);
        Object[] newArr = new Object[newCap];
        for (int i = 0; i < size; i++)
        {
            newArr[i] = array[i];
        }
        capacity = newCap;
        array = newArr;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < capacity; i++)
        {
            str += array[i] + ", ";
        }
        if (str != "")
        {
            str = "[" + str.substring(0,str.length()-2) + "]";
        }
        else
        {
            str = "[]";
        }
        return str;
    }
}
