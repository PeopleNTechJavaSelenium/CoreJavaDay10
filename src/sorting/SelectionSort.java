package sorting;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {8,5,9,1,3,4,6};
        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                //checking if index value is greater/smaller
                if (array[i] < array[min])
                    min = i;
            }//end of inner loop
                  //swap
                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
        }//end of outer loop
        //print the sorted numbers
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }//end of main
}// end of class
