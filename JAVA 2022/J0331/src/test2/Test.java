// 0331 #2 n�� name mid fin rpt chul class
// ���� max, who?
package test2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		String[] f_name = {"��","��","��","��","��","Ȳ","��","��"};
		String[] m_name = {"��","��","��","��","��","��","��","��"};
		String[] l_name = {"��","ö","��","��","��","��","��","��"};
		String name;
		int mid, fin, rpt, chul;
		Scanner s = new Scanner(System.in);
		//System.out.print("n: ");
		//int n=s.nextInt();
		int n = (int)(Math.random()*7+3);
		
		int max = 0;
		String max_person="";
		
		System.out.println("����  �߰� �⸻ ���� �⼮ ����");
		System.out.println("------------------------");
		for (int i=0; i<n; i++)
		{
			//input
			name = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
	               + l_name[(int)(Math.random()*7)];
			mid = (int)(Math.random()*30+1);
			fin = (int)(Math.random()*40+1);
			rpt = (int)(Math.random()*20+1);
			chul =(int)(Math.random()*10+1);
			
			//process
			int tot = mid + fin + rpt + chul;
			if (max < tot)
			{	
				max = tot;
				max_person = name;
			}
			
			//output
			System.out.printf("%3s %2d  %2d  %2d  %2d  %3d\n",name,mid,fin,rpt,chul,tot);
		}
		System.out.printf("%s : %d", max_person, max);
	}
}
