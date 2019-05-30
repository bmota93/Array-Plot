/**
 * <pre>
 * 
 * Author:
 *  	Brandon Mota 
 *  
 *  
 * Description: 
 * 		This class is the child class to Geom.
 * 		It provides	the necessary methods for
 * 		a rectangle object.
 * 		
 * 
 * 
 * </pre>
 */

public class Rectangle extends Geom
{
	private double base, height;
	
	/**
	 * <pre>
	 * Description: 
	 * This is the constructor for the class.
	 * Pre:
	 * none. 
	 * Post:
	 * Rectangle is created.
	 * </pre>
	 * 
	 */
	public Rectangle()
	{
		super("Rectangle");
		base = 0;
		height = 0;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This provides a new instance of Rectangle.
	 * Pre:
	 * none. 
	 * Post:
	 * A new Rectangle is created.
	 * </pre>
	 * 
	 */
	public Rectangle(double base, double height)
	{
		super("Rectangle");
		this.base = base;
		this.height = height;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This returns the base caller.
	 * Pre:
	 * none. 
	 * Post:
	 * Base is returned.
	 * </pre>
	 * 
	 */
	public double getbase()
	{
		return base;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This returns the height back to the caller.
	 * Pre:
	 * none. 
	 * Post:
	 * Height is returned.
	 * </pre>
	 * 
	 */
	public double getheight()
	{
		return height;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This calculated the area of the shape and returns it.
	 * Pre:
	 * none. 
	 * Post:
	 * Area is returned.
	 * </pre>
	 * 
	 */
	public double computeArea()
	{
		return base * height;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This prints the shape data.
	 * Pre:
	 * none. 
	 * Post:
	 * Shape data is printed.
	 * </pre>
	 * 
	 */
	public void print()
	{
		System.out.println("rec " + base + " " + height + " "  + computeArea());
	}
	
	

}
