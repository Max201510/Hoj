import java.io.BufferedInputStream;
import java.util.Scanner;

public class ID1000{
    public static void main(String args[]){
      Scanner cin = new Scanner(new BufferedInputStream(System.in));
      int n,m;
      while(cin.hasNext()){
          n=cin.nextInt();
          m=cin.nextInt();
          System.out.println(n+m);
      }
    }

}