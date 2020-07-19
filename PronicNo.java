import java.util.*;
public class PronicNo{
	public static void main(String args[]){
		int n=93012630;
		String s=Integer.toString(n);
		int[] out=new int[s.length()];
		int[] ans=new int[out.length];
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(i,j);
				int a=Integer.valueOf(s1);
				for(int k=0;k<a;k++)
				{
					if(k*(k+1)==a)
					{
						out[c]=a;
						c++;
						break;
					}
				}
			}
		}
		Arrays.sort(out);
		int j = 0;
        	for (int i=0; i<out.length-1; i++)
 		{
            		if(out[i] != out[i+1])
            		{
                		ans[j++] = out[i];
            		}
        	}
        	ans[j++] = out[out.length-1];
		for(int i=0;i<j;i++)
		{
		       if(ans[i]!=0)
			{
		        	System.out.print(ans[i]);
		        	if(i!=j-1)
		        	{
		            		System.out.print(",");
		        	}
		       }
		}
	}
}			