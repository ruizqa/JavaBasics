public class BasicJavaTest{

    public static void main(String args[]){
        BasicJava test = new BasicJava();
        test.print255(); //Print numbers from 1 to 255
        test.printodd255(); //Print numbers from 1 to 255
        System.out.println(test.sigma255()); //Print numbers from 1 to 255
        int [] array = {1,3,-5,-7,9,13};
        int [] array2 = {-3,-5,-7};
        int [] array3 = {2, 10, 3};
        test.printArray(array); // Print elements of given array
        test.findMax(array2);
        System.out.println(test.arrayodd255());
        test.findAvg(array3);
        System.out.println(test.greaterThan(3,array));
        System.out.println(test.squareValues(array));
        System.out.println(test.eliminateNegative(array));
        System.out.println(test.maxMinAvg(array));
        System.out.println(test.shiftingValues(array));
    }
}