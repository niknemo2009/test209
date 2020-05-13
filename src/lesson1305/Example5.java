package lesson1305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example5 {

    public static void main(String[] args) {
        String[] arr={"sdsds","dssdsd","sdeeew"};

      Stream<String> str1= Stream.of("qwe","asd","dfrf");
      Stream<String> str2= Stream.of(arr);
        Arrays.stream(arr);
        List<String> list=new ArrayList<>();
        Collections.addAll(list,arr);
        list.stream();
        Stream.Builder<String> builder=Stream.builder();
        Stream<String> str5=builder.add("wwewew").add("ssddsd").build();
        Predicate<String>   pr=w->w.length()>3;
        str2.filter(w->Character.isUpperCase(w.charAt(0)));
        str2.filter(rty->{
            String[] arr1=rty.split("");
            return arr1[0].toUpperCase().equals(arr1[0]);
        });
        str2.filter(q-> !q.substring(0,1).toLowerCase().equals(q.substring(0,1)));
str2.filter(q->q.matches("[A-Z]([A-Za-z]*)"));
Consumer<Integer> con= (Integer p)->System.out.println(p);
Consumer<Integer> con1= System.out::println;
        //public void accept(Integer integer) {
con1=Example5::print;
Example5 ex=new Example5();
con1=ex::print33;
Consumer<String> cons33=w-> System.out.println(w.charAt(w.length()-1));
Consumer<String> cons34=w-> System.out.println(w.substring(w.length()-2,w.length()-1));
Consumer<String> cons35=Example5::lastLetter;
Example5 ex33=new Example5();
cons35=ex33::lastLetter33;
        Function<Integer,String> qwe=w->String.valueOf(w);

            //public String apply(Integer integer) {

        }


   static  void  lastLetter(String str){
        System.out.println(str.split("")[str.length()-1]);
    }
      void  lastLetter33(String str){
        System.out.println(str.split("")[str.length()-1]);
    }
     static void print(int element){
        System.out.println(element);
    }
     void print33(int element){
        System.out.println(element);
    }
}

