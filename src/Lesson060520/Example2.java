package Lesson060520;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {
Example2 ex2=new Example2();
String[] ar33={"1","2","3"};
String[] ar34={"1","2","3"};
String[] ar35={"1","2","3"};
int[][] arr11={{1,33,55,77},{1,3,7}};
//Integer[] arr111={1,33,55,77};
//Integer[] arr112={1,33,55,77};
        System.out.println(ex2.unionArray(arr11));
        int[]  arr35={1,20,3};
        int[]  arr37={1,20,30};
       // ex2.metodStef(arr35,arr37);
        ex2.commonElements(arr35,arr37);
    }
    <W> Collection<W>  unionArray(W[]... arrrays){
        return Arrays.stream(arrrays).flatMap(x-> Stream.of(x)).
                collect(Collectors.toCollection(ArrayList::new));
        }

        void commonElements(int[] ... arr){
       Set<Integer> set=new HashSet<>();
        for(int[] temp:arr){
           for (int var:temp) {
              if( checkElement(var,arr)){
                  set.add(var);
              }

           }
       }            System.out.println("Спільний елементи -"+ set);


    }

    private boolean checkElement(int var, int[][] arr) {
        int counter = 0;
        boolean result = false;
        for (int[] temp : arr) {
            for (int temp2 : temp) {
                if (temp2 == var) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == arr.length) {
            result = true;
        }
        return result;
    }

    int  sum(int[] arr1,int[] arr2){
        return Arrays.stream(arr1).sum()+Arrays.stream(arr2).sum();
     }

    void  metodStef(int[] number1,int[] number2){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i: number1)
            for(int j: number2)
                if(!arr.contains(i) && i == j)
                    arr.add(i);
        arr.sort(null);
        System.out.println("Common elements");
        for(int i: arr) System.out.print(i + " ");

    }

    }


