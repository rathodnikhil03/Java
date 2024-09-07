package arrays;

import java.util.ArrayList;
import java.util.List;

public class ListOfArray{

@SuppressWarnings("unchecked")
public static void main(String[] a){

   @SuppressWarnings("rawtypes")
   
    List list = new ArrayList();

     list.add("india");
     list.add("china");
     list.add("pakistan");

     list.remove(2);
     list.add("US");

     System.out.println(list);

   }

}


