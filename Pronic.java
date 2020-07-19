import java.util.*;
class Pronic{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i*(i+1)==n)
			{
				ans=1;
				break;
			}
		}
		if(ans==1)
		{
			System.out.println("Pronic");
		}
		else
		{
			System.out.println("Not Pronic");
		}
	}
}