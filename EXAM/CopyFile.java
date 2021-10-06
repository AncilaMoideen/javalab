import java.io.*;
public class CopyFile
	{
	public static void main(String args[])
		{
		int i;
		File F1 = new File("/home/exam/f1.txt");
		File F2 = new File("/home/exam/f2.txt");
		FileInputStream Fin = new FileInputStream(F1); 
		FileOutputStream Fout = new FileOutputStream(F2);
		i=Fin.read();
		do
		 {
		 Fout.write(i);
		}
		 while(i!=0);
		 
		 Fin.Close();
		 Fout.Close();
		 
       
         }
         }

