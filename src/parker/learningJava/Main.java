package parker.learningJava;

public class Main {

    public static void main(String[] args) {
        int[]myIntArray = new int[25];
        //how to define the array and assigning the array
//	int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//    //saving in element 6;
//
//	double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i *10;
        }
        printArray(myIntArray);
//        for (int i=0; i<myIntArray.length; i++){
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
    }
    public static void printArray(int [] array){
        for (int i=0; i<array.length; i++){
       System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
