import java.util.*;

// import javax.naming.directory.SearchControls;;
public class Hashmap {
    public static void main(String[] args) {
       //         HashMap< String , Integer> map = new HashMap<>();

       // Insertion
//         map.put("India", 120);
//         map.put("China", 125);
//         map.put("USA", 30);

//         System.out.println(map);
        
//    map.put("India", 130);
//    map.put("Pakistan", 15);
//    System.out.println(map);

HashMap < String , Integer> map = new HashMap<>() ;
map.put("Shraddha",60);
map.put("Chetan", 65);
map.put("Akhil", 68);
map.put("Dheeraj", 70);
    System.out.println(map);
 
 

// //  Search karna ka liya
//   if (map.containsKey("Sumit")) {
//     System.out.println("key is present ");
    
//   }
//   else{
//     System.out.println("key are not present in the map");
//   }

//   // Perticular key ki value prient karwana h toh
//   System.out.println(map.get("Chetan"));

       int arr[] = {12, 34, 13 , 24 , 45};
              // first way 
      //  for(int i= 0 ; i<=5 ; i++){
      //   System.out.print(arr[i]+" ");
      //  }
      //  System.out.println();

       
      //  second way
        // for(int val :arr){
        //   System.out.print(val+" ");
        // }
        // System.out.println();


         for(Map.Entry<String , Integer> e :map.entrySet()){
          System.out.println(e.getKey());
          System.out.println(e.getValue());
         }

      

       

 
    }   
}
