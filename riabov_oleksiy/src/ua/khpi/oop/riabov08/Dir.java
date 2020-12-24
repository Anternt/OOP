package ua.khpi.oop.riabov08;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;


public class Dir {
	
	public static String directoryForDownload() {
		
		Scanner scan = new Scanner(System.in);
		String path = new String("C:\\Users\\Acer\\eclipse-workspace\\riabov oleksiy");
		File dial = new File(path);
		
		String choose = new String();
		do {
			String [] list = dial.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File f, String name)
				  {

				    
				      if(new File(f, name).isDirectory()) 
				    	  return true;
				    else
				      return(name.endsWith("xml"));  
				  
				}
			});
			System.out.println();
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println();
		System.out.println("Choose: ");
		choose = scan.nextLine();
		if (choose.equals("quit"))
			break;
		if (choose.equals("..."))
		{
			path = path.substring(0,path.lastIndexOf('\\'));
			  dial = new File(path);
			  continue;
		}
		path = path.concat("\\"+choose);
		dial = new File(path);
		if(!dial.exists())
		{
		  System.out.println("\nNot found: " + choose);
		  path = path.substring(0,path.length()-(choose.length()+1));
		  dial = new File(path);
		  continue;
		}
		
		if(dial.isFile())
		{
		
		
		 return path;
		}
		
		
		}while(true);

		
		return new String("DONTDOWNLOAD");
	}

	public Dir() {
		super();
		// TODO Auto-generated constructor stub
	};
	
	
	
	
}





