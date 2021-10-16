
import java.util.ArrayList;

public class BasicJava{

    public void print255(){ //Print numbers from 1 to 255
        int i;
        for(i=1; i<256;i++){
            System.out.println(i);
        }
    }

    public void printodd255(){ //Print odd numbers from 1 to 255
        int i;
        for(i=1; i<256;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    public int sigma255(){ //Returns sum of 1 to 255
        int sum=0, i;
        for(i=1;i<256;i++){
            sum+=i;
            }
        return sum;
    }

    public void printArray(int[] array){ //Print elements of array
        for (int j: array){
            System.out.println(j);
        }

    }

    public void findMax(int[] array){ //Print elements of array
        int max = array[0];
        for (int j: array){
            if (j>max){
                max =j;
            }
        }
        System.out.println(max);
    }

        public ArrayList<Integer> arrayodd255(){ //Return array with odd numbers
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1; i<256;i++){
            if(i%2!=0){
                myArray.add(i);
            }
        }
        return myArray;
    }

        public void findAvg(int[] array){ //Print average
        double avg=0.0;
        for (int j: array){
            avg += j;
        }
        avg = avg/array.length;
        System.out.println(avg);
    }

        public int greaterThan(int y, int[] array){ //Get average
        int result=0;
        for (int x: array){
            if(x>y){
                result +=1;
            }
        }
        
        return result;
    }

       public ArrayList<Integer> squareValues(int[] array){ //Return array with odd numbers
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int x: array){
            myArray.add(x*x);
        }
        return myArray;
    }

       public ArrayList<Integer> eliminateNegative(int[] array){ //Return array with odd numbers
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int x: array){
            if(x>0){
                myArray.add(x);
            }
            
        }
        return myArray;
    }

           public ArrayList<Double> maxMinAvg(int[] array){ //Return array with odd numbers
        Double avg = new Double (0);
        Double max = new Double(array[0]);
        Double min = new Double (array[0]);
        for (int x: array){
            if(x>max){
                max= new Double(x);
            }

            if(x<min){
                min = new Double(x);
            }

            avg += new Double(x);
            
        }
            avg = avg/(new Double (array.length));
            ArrayList<Double> myArray = new ArrayList<Double>();
            myArray.add(max);
            myArray.add(min);
            myArray.add(avg);
        return myArray;
    }

    
           public ArrayList<Integer> shiftingValues(int[] array){ //Return array with odd numbers
            ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1;i<array.length;i++){
            myArray.add((new Integer(array[i])));
        }
            myArray.add((new Integer (0)));
        return myArray;
    }


}