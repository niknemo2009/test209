import java.util.Arrays;

public class Proba {
// test message
    //test345

    public static void main(String[] args) {
Proba proba=new Proba();
//int[] qwe={1,1,1};
//proba.one(qwe);
//        System.out.println(Arrays.toString(qwe));
        proba.print(new Integer(23));

    }

    void one(int[] arr){
        arr[0]=45;
        int[] arr1={1,3,5};
        arr=arr1;
        System.out.println(Arrays.toString(arr));
    }

    public void print(Integer i) {
        System.out.println("Integer");
    }
    public void print(int i) {
        System.out.println("int");
    }
    public void print(long i) {
        System.out.println("long");
    }

}
