// list 2.5


class ClassDataApp 
{
    public static void main(String[] args){
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        // ****************** insert ************
        arr.insert("Evans", "Patty", 9);
        arr.insert("Smith", "Lorrains", 22);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adom", "Hentry", 21);
        arr.insert("Handsome", "Sato", 42);
        arr.insert("Stimson", "Hentry", 12);

        arr.displayA();

        String searchKey = "Stimson";
        Person found;
        found = arr.find(searchKey);

        if (found != null)
        {
            System.out.println("Found:  ");
            found.displayPersion();
        }
        else
            System.out.println("Can't find " + searchKey);

        String deleteName = "Adom";
        boolean flag = arr.delete(deleteName);

        if (flag)
            System.out.println("Success to elete " + deleteName);
        else
            System.out.println("not found " + deleteName);

        arr.displayA();

    }
} 


class Person
{
    private String lastName;
    private String firstName;
    private int age;

    // init function
    public Person(String last, String first, int a)
    {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPersion()
    {
        System.out.print("   Last name:  " + lastName);
        System.out.print(", First name:  " + firstName);
        System.out.println(", Age:  " + age);
    }

    public String getLast()
    {
        return lastName;
    }
}


class ClassDataArray
{
    private Person[] a;
    private int nElems;

    public ClassDataArray(int max)
    {
        a = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName)
    {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j].getLast().equals(searchName))
                break;
        
        if (j == nElems)
            return null;
        else
            return a[j];
    }

    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName)
    {
        int j;

        for (j = 0; j < nElems; j++)
            if (a[j].getLast().equals(searchName))
                break;

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

    public void displayA()
    {
        for (int j = 0; j < nElems; j++)
            a[j].displayPersion();
    }

}


