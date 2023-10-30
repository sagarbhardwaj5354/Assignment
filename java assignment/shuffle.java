import java.util.Random;
import java.util.Arrays;
public class shuffle{

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        Random ran=new Random();
        for (int i = 0; i < a.length; i++) {

            
                int temp;
                temp = ran.nextInt(a.length);
                int temp1=a[temp];
                a[temp]=a[i];
                a[i]=temp;
            
        

        }
        System.out.println("the shuffling of the array is:..."+Arrays.toString(a));
    }
}
