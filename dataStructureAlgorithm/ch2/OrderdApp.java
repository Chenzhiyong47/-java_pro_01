/*
*   二分法查找：
*
*       插入的数组已经有序排列
*       
*   
*/


public class OrderdApp {
    public static void main(String[] args){
        
        int maxSize = 100;
        OrdArray arr;
        arr = new OrdArray(maxSize);

        arr.insert(17);
        arr.insert(99);
        arr.insert(12);
        arr.insert(11);
        arr.insert(27);
        arr.insert(29);
        arr.insert(22);
        arr.insert(21);
        arr.insert(37);
        arr.insert(39);
        arr.insert(32);
        arr.insert(31);
        arr.display();

        int searchKey = 32;

        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);  
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(searchKey);

        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);  
        else
            System.out.println("Can't find " + searchKey);

        arr.display();

    }
}


class OrdArray {
    // elements
    private long[] a;
    private int nElems;

    // methods
    // init class
    public OrdArray(int max)
    {
        a = new long[max];
        nElems = 0;
    }

    public int size()
    {
        return nElems;
    }

    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true)
        {
            curIn = (lowerBound + upperBound) / 2;

            if (a[curIn] == searchKey)
                return curIn;           // found it
            else if (lowerBound > upperBound)
                return nElems;          // can't find it
            else 
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value)
    {
        int j;
        
        for (j = 0; j < nElems; j++)
            if (a[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            a[k] = a[k-1];
        
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value)
    {
        int j = find(value);

        if (j == nElems)
            return false;
        else
        {
            for (int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void display()
    {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + "  ");
        System.out.println("");
    }

}

