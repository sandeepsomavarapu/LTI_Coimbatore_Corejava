import java.io.*;
class FileEx
{
public static void main(String []args)throws IOException
{
	File f=new File("onmobile1.txt");
	System.out.println(f.exists());//false
	System.out.println(f.createNewFile());//false
	//System.out.println(f.mkdir());//true
	System.out.println(f.setReadOnly());//true
	System.out.println(f.exists());//true
	System.out.println(f.isDirectory());//true
	System.out.println(f.isFile());//false
}
}






