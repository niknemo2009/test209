package lesson150420;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
FunctionOne fun=new FunctionOne();
Example1 example1=new Example1();
FunctionTwo fun33=new FunctionTwo();//5*element*element+3*element+2 10 28 56
int[] array={1,2,3};
//example1.modifyArrayWithInterface(array,fun33);
       final int koef=5;
example1.modifyArrayWithInterface(array, new Algoritmic() {
    @Override
    public int function(int element) {
        //koef=45;
        return (int) (koef*Math.pow(element,2)+3*element+2);
    }
});
// int function(int element);
example1.modifyArrayWithInterface(array,w->5*w*w+3*w+2);
//koef=34;
        System.out.println(Arrays.toString(array));
Sportable  sport=( do3, wood) ->{
    System.out.println();
    return "aasasa";
};

    }

    void  modifyArrayWithInterface(int[] arr, Algoritmic fun){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=fun.function(arr[i]);
        }
    }

    // 3*x+2 //5*x*x +3*x -12
    void  modify(int[]arr,int koef,int digit ){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]*3+2;
        }
    }
}

interface  Sportable{
    String play(String nameGame,int countPlayers);
}