
public class HighArrayApp{
    public static void main(String[] args){
        HighArray arr;
        arr = new HighArray(100);
        
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(1);
        arr.insert(33);
        arr.insert(66);

        arr.display();

        arr.find(66);
        arr.find(1);

        arr.delete(22);
        arr.delete(55);
        arr.delete(77);

        arr.display();
        
        return;
    }
}



class HighArray{
    private long[] a;
    private int nElems = 0;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j = 0;
        
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        
        if (j == nElems){
            System.out.println("Can't find " + searchKey);
            return true;
        }
        else {
            System.out.println("Find  " + searchKey);
            return false;
        }
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j = 0;

        for (j = 0; j < nElems; j++)
            if (a[j] == value)
                break;
        
        if (j == nElems)
            return false;
        else{
            for (int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + "   ");
        System.out.println("");

        return;
    }

}

