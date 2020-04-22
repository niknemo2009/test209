package lesson2209;

public class ExampleTDD {

    void one(){

    }

    public int[] addElement(int[] arr, int element) {
        int[] result=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
        result[result.length-1]=element;
        return  result;
    }

    public int convert(int ball) {
        int result=0;
        if(ball<60){
            result=2;
        }else if(ball<75){
            result=3;
        }else if(ball<90){
            result=4;
        }else{
            result=5;
        }
        return result;
    }
}
