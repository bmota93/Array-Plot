/**
 * <pre>
 * 
 * Author:
 *  	Brandon Mota 
 *  
 *  
 * Description: 
 * 		This program will plot several shapes without any
 * 		graphics. An array object will be used. Requires "../pics.txt"
 * 
 *   	This class in particular is the main class that
 *   	controls the flow of the program.
 * 
 * 
 * </pre>
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayDrawer
{
	private Geom[] geoms;
	private int sz;
	
	/**
	 * <pre>
	 * Description: 
	 * This is the constructor for the class.
	 * Pre:
	 * none. 
	 * Post:
	 * Creates the new array object.
	 * </pre>
	 * 
	 */
	public ArrayDrawer(int szx)
	{
		sz = szx;
		geoms = new Geom[sz];
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will add a new shape to the array.
	 * Pre:
	 * An array position has to be available.
	 * Post:
	 * A shape is added to the array.
	 * </pre>
	 * 
	 */
	public void addGeom(Geom g)
	{
		for (int i = 0; i < sz; i++)
		{
			if (geoms[i] == null)
			{
				geoms [i] = g;
				return;
			}
		}
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will delete a shape from the array
	 * depending on the base.
	 * Pre:
	 * The base size has to exist.
	 * Post:
	 * The shape is deleted from the array.
	 * </pre>
	 * 
	 */
	public void deleteGeom(double basex)
	{
		for (int i=0; i < sz; i++)
		{
			if (geoms[i] != null)
			{
				if (geoms[i].getbase() == basex)
				{
					System.out.print("The first shape with base " + basex + " has been deleted.\n\n");
					geoms [i] = null;
					return;
				}
			}
		}
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will print the entire array.
	 * Pre:
	 * The array must contain at least one shape.
	 * Post:
	 * The array is printed.
	 * </pre>
	 * 
	 */
	public void printAll()
	{
		System.out.println("Printing......");
		System.out.println("Start Array");
		for (int i = 0; i < sz; i++)			
		{
			if (geoms[i] != null)
			{
				geoms[i].print();
			}
		}
		System.out.println("End Array\n");
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will compute the areas to all shapes
	 * in the array.
	 * Pre:
	 * A shape has to be present in the array.
	 * Post:
	 * The area for the shapes are calculated.
	 * </pre>
	 * 
	 */
	public void compAreaAll()
	{
		for (int i=0; i < sz; i++)
		{
			if (geoms [i] != null)
			geoms[i].computeArea();
		}
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This is the main method that controls the flow
	 * of the program.
	 * </pre>
	 * 
	 */
	public static void main(String[] args)
	{
		ArrayDrawer arraydraw = new ArrayDrawer(10);
				
		try
		{		
		
			File file = new File("pics.txt");
			Scanner scan = new Scanner (file);
			while (scan.hasNext())
			{
				String line = scan.next();
				
				if (line.equalsIgnoreCase("add"))
				{
					String shape = scan.next();
					
					if (shape.equalsIgnoreCase("rec"))
					{				
						double a = scan.nextDouble();
						double b = scan.nextDouble();						
						Geom g = new Rectangle(a, b);						
						arraydraw.addGeom(g);						
					}
					if (shape.equalsIgnoreCase("tri"))
					{						
						double a = scan.nextDouble();
						double b = scan.nextDouble();
						Geom g = new Triangle(a, b);						
						arraydraw.addGeom(g);
					}					
				}
				if (line.equalsIgnoreCase("del"))				
				{			
					double delbase = scan.nextDouble();
					arraydraw.deleteGeom(delbase);
					
				}
				if (line.equalsIgnoreCase("compAreaAll"))
				{
					arraydraw.compAreaAll();
				}
				if (line.equalsIgnoreCase("printAll"))
				{
					arraydraw.printAll();
				}
			}
			scan.close();
			System.out.println("End of File. Program Terminated....");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.out.println("Ensure that pics.txt is present and in the correct location.");
			System.out.println("Program Terminated......");
		}
		

	}

} //end program
