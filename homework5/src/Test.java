/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-05-09
 * Time: 22:06
 */
public class Test {
    public static void transform(int []array){
        for (int x:array
             ) {
            x=x*2;
            System.out.println(x+" ");
        }
    }
    public static void main1(String[] args) {
        int [] array={1,2,3};
        transform(array);
    }

    public static void main2(String[] args) {
        int []array=new int [100];
        int i=1;
        for (int x:array
             ) {
            x=i++;
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {

    }
}
