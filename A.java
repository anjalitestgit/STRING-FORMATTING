import java.util.*;
import java.io.*;
class A
{dsfasfdasfd
	public static void main(String ar[])
	{
		
		String s[]=ar[0].split("\\\\");
		String s1[]=ar[1].split("\\\\");
		//for(String s1:s)
		for(int i=0;i<s.length;i++)
		{

			//System.out.println(s1);
		
			File dr=new File("c:\\javadir");
			System.out.println(dr.isDirectory());
			i++;
			System.out.println(s[i]);
			File f=new File(dr,s[i]);
			boolean b=f.isFile();
			System.out.println(b);
			if(b)
			{
			  String ex[]=s[i].split("\\.");						  System.out.println("ex="+ex[1]);
			  System.out.println(s[i]);
			  if(ex[1].equals("txt"))
			 {
				f.delete();	
				System.out.println("deleted");
			 }	
			}
		}
		for(int i=0;i<s1.length;i++)
		{

			//System.out.println(s1);
		
			File dr=new File("javadir");
			System.out.println(dr.isDirectory());
			i++;
			System.out.println(s1[i]);
			File f=new File(dr,s1[i]);
			System.out.println(f.isFile());
		}

	}


}