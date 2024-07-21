// Defination -> Array is the Linear data Structure which  store homogeneoius data in a sigle variable.Array is imutable
// Array is define is two type->
//     1) Single dimensional    
//           Ex-> 1D
//     2) Multidimensional
//           Ex-> 2D , 3D , Jagged Array

// syntax of 1D array->
//   =>   datatype[] variable_name = new datatype[Size];

// syntax of 2D array->
//   =>   datatype[][] variable_name = new datatype[row][column];





//  write a program to take user input in an 1D array 



import java.util.Scanner;
public class oneD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take size of array 
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        //Insert element in Array
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        // Display Array(This is use only display and print perpose)
        for(int var:arr){
            System.out.println(var);
        }
            
        sc.close();
    }


}
