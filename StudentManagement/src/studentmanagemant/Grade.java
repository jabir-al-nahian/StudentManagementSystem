package studentmanagemant;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Grade
{
    String name;
    String id;
    String department;
    int marks[]; 
    
    public static void main(String[] args) throws Exception
    {
        
        Scanner  input = new Scanner(System.in);
        System.out.println("                         Student Management System        \r\n");
        System.out.println(""
                + ""
                + ""
                + "");
        
        
        System.out.println("Press 1 for Write \r\n");
        System.out.println("Press 2 for Read \r\n");
        System.out.println("Press 3 for Edit \r\n");
        
        int y =input.nextInt();
        switch(y)
        {
         
            
            case 1:
            System.out.println("How many Students: \r\n");
            int x = input.nextInt();
            
            for(int n=1;n<=x;n++)
            {
            System.out.println("Enter Student Name : \r\n");
            String name = input.next();
            System.out.println("Enter Student Id : \r\n");
            String id = input.next();
            System.out.println("Enter Student Department : \r\n");
            String department = input.next();
            
            int m1,m2,m3,m4,m5;
            double t,av;

            System.out.println("Enter 5 marks: \r\n");
            m1=input.nextInt();
            m2=input.nextInt();
            m3=input.nextInt();
            m4=input.nextInt();
            m5=input.nextInt();
            t=m1+m2+m3+m4+m5;
            av=t/5;
            String result = null;
            
            if(40>av){
                result = "Fail in the Exam";
            }
 else{
                result ="Pass in the Exam";
            }
try
                {    
                    FileWriter fw=new FileWriter("D:\\testtextfile.txt");    
                    fw.write("Name:"+name+"\r\n");        
                    fw.write("ID:"+id+"\r\n");
                    fw.write("Department:"+department+"\r\n");
                    fw.write("Marks:"+av+"\r\n");
                    fw.write("Result:"+result+"\r\n");
                    fw.close(); 
                    System.out.println("Success...");
                }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }    
                    
            }
break;
            case 2:
             FileReader fr=new FileReader("D:\\testtextfile.txt");    
                    int i;    
                    while((i=fr.read())!=-1)    
                    System.out.print((char)i);    
                    fr.close(); 
            break;
case 3:
                
        	BufferedReader reader;
                StringBuffer stringBuffer = new StringBuffer();
                Scanner  replaceValue = new Scanner(System.in);
                Scanner  replaceWith = new Scanner(System.in);
                System.out.print("Enter replace value: ");
                String string1 = replaceValue.nextLine();
                System.out.print("Replace with: ");
                String string2 = replaceWith.nextLine();
		try {
			reader = new BufferedReader(new FileReader("D:\\testtextfile.txt"));
			String line = reader.readLine();
			while (line != null) {
                            if(line.equals(string1)){
                                stringBuffer.append(string2 + "\r\n");
                            }
                            else{
                                stringBuffer.append(line+"\r\n");
                            }				
				line = reader.readLine();                              
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println(stringBuffer);
                try{
            FileWriter fw=new FileWriter("D:\\testtextfile.txt");        
                    fw.write(stringBuffer.toString());       
                    fw.close();    
                   }
        catch(Exception e){System.out.println(e);}
break;
default :
            System.out.println("Invalid Option");
      }
    }
}
