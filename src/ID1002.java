/*
 * 提交的时候出线了presentation error，参考http://jingyan.baidu.com/article/29697b913e1e2aab20de3c0d.html，是空格回车错误
 * 可以用BigInteger表示任意大小的数据，参考http://blog.csdn.net/qq7342272/article/details/6666497
 */

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ID1002 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(new BufferedInputStream(System.in));
		int total = 0;
		String m, n, temp;
		total = cin.nextInt();

		cin.nextLine();
		int cases = 0;
		for(int j=total;j>0;j--) {
			cases++;
			if(cases!=1) System.out.println();
			
			temp = cin.nextLine();
			m = temp.split(" ")[temp.split(" ").length-2];
			n = temp.split(" ")[temp.split(" ").length-1];
			ArrayList<Integer> mc = new ArrayList<Integer>();
			for (int i = m.length() - 1; i >= 0; i--) {
				mc.add(Integer.parseInt(m.substring(i, i + 1)));
			}
			ArrayList<Integer> nc = new ArrayList<Integer>();
			for (int i = n.length() - 1; i >= 0; i--) {
				nc.add(Integer.parseInt(n.substring(i, i + 1)));
			}
			System.out.println("Case " + cases + ":");
			for (int i = mc.size() - 1; i >= 0; i--) {
				System.out.print(mc.get(i));
			}
			System.out.print(" + ");
			for (int i = nc.size() - 1; i >= 0; i--) {
				System.out.print(nc.get(i));
			}
			System.out.print(" = ");
			ArrayList<Integer> result = new ArrayList<Integer>();
			//int length = Math.min(mc.size(), nc.size());
			if (mc.size() > nc.size()) {
				for (int i = nc.size(); i < mc.size(); i++)
					nc.add(0);
			} else {
				for (int i = mc.size(); i < nc.size(); i++)
					mc.add(0);
			}
			int jinwei = 0;
			for (int i = 0; i < nc.size(); i++) {
				if (mc.get(i) + nc.get(i) + jinwei >= 10) {
					result.add(mc.get(i) + nc.get(i) - 10 + jinwei);
					jinwei = 1;
				} else {
					result.add(mc.get(i) + nc.get(i) + jinwei);
					jinwei = 0;
				}
			}
			if (jinwei == 1)
				result.add(1);

			

			for (int i = result.size() - 1; i >= 0; i--) {
				System.out.print(result.get(i));
			}
			//if(cases!=total)
			System.out.println();
		}
		cin.close();
	}
}

//import java.math.BigInteger;  
//import java.util.Scanner;  
//public class Main {  
// public static void main(String[] args) {  
//  Scanner input=new Scanner(System.in);  
//  int n=input.nextInt();  
//  int k=1;  
//  while(n!=0)  
//  {  
//   BigInteger a=input.nextBigInteger();  
//   BigInteger b=input.nextBigInteger();  
//      BigInteger c=a.add(b);  
//                    n--;  
//      if(k!=1)  
//       System.out.println();//输出换行  
//            System.out.println("Case "+k+":");  
//            k++;  
//      System.out.println(a+" + "+b+" = "+c);  
//  }  
// }  
//} 
