import java.io.BufferedInputStream;
import java.util.Scanner;

public class ID1001{
    public static void main(String args[]){
      Scanner cin = new Scanner(new BufferedInputStream(System.in));
      int m,sum=0;
      while(cin.hasNext()){
          sum=0;
          m=cin.nextInt();
          for(int i=1;i<=m;i++)
              sum+=i;
          System.out.println(sum);
          System.out.println();
      }
    }
}