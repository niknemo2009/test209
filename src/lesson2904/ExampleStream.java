package lesson2904;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleStream {
    public static void main(String[] args) {
     List<Integer> list=new Vector<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(0);
        list.add(-3);
        list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>5;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });// 1 "1"
        ExampleStream ex=new ExampleStream();
        final int q=90;
        //q=100;
        final int[] index={0};
        index[0]=34;
        int arr[]={1,2,3};
        //index=arr;
//        Predicate<Integer>  lamd1= (Integer r)-> r>5;
//        list.stream().filter(lamd1).forEach(s-> System.out.println(s));
//        list.stream().filter(lamd1).forEach(System.out::println);
//        list.stream().filter(lamd1).forEach(ex::printOrdinary);
        list.stream().map(String::valueOf).forEach(w-> {
            System.out.println( index[0] +" "+w);
            index[0]++;
        });
           // public String apply(Integer integer) {



    }

   static void print(Integer par){
        System.out.println(par);
    }
     void printOrdinary(Integer par){
        System.out.println(par);
    }
}
