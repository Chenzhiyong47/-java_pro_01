public class First {
    public static void main(String[] args) {
        
        int[] intArray;
        intArray = new int[100];

        int arrayLength = intArray.length;

        for (int i=0; i<100; i++){
            System.out.println(i + intArray[i]);
            // System.out.println("\n");
        }

        System.out.println(arrayLength);
    }
}


