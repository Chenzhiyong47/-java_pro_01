
public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j = 0;
        
        
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 88);
        arr.setElem(7, 1);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        // print all data
        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + "   ");
        System.out.println("");

        // search
        int searchKey = 26;
        for (j = 0; j < nElems; j++)
            if (searchKey == arr.getElem(j))
                break;
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Find " + searchKey);

        // delete
        searchKey = 55;
        for (j = 0; j < nElems; j++)
            if (searchKey == arr.getElem(j))
                break;
        for (int k = j; k < nElems; k++)
            arr.setElem(k, arr.getElem(k+1));
        nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + "   ");
        System.out.println("");

    }
}


class LowArray{
    private long[] a;

    // constructor
    public LowArray(int size){
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }
}

