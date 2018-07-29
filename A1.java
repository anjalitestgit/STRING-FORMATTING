import java.util.*;
import java.io.*;
class A1
{sdddddddddddddddddd
	public static void main(String ar[])
	{
		File f=new File("c:\\javadir");
		String s[]=f.list();
		for(int i=0;i<s.length;i++)
		{	
			String s1=s[i];
			System.out.println(s1);
			File old=new File(f,s1);
			String s2=s1+".html";
			File new1=new File(f,s2);
			old.renameTo(new1);
		}
	}


}		