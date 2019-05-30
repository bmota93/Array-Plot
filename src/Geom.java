/**
 * <pre>
 * 
 * Author:
 *  	Brandon Mota 
 *  
 *  
 * Description: 
 * 		This abstract class is the parent
 * 		class to Rectangle and Triangle. It provides
 * 		abstract methods.
 * 		
 * 
 * 
 * </pre>
 */

public abstract class Geom
{
	
	private String shape;
	private double base;
	private double height;
	
	/**
	 * <pre>
	 * Description: 
	 * This is the constructor for the class,
	 * although not used. 
	 * Pre:
	 * none. 
	 * Post:
	 * Geom is created.
	 * </pre>
	 * 
	 */
	protected Geom(String shapename)
	{
		shape = "";
		this.shape = shapename;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This returns the shape name back to the caller.
	 * Pre:
	 * none. 
	 * Post:
	 * Shape name is returned.
	 * </pre>
	 * 
	 */
	public String getShapeName()
	{
		return shape;
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This provides abstract methods for the child classes.
	 * Pre:
	 * none. 
	 * Post:
	 * Child classes inherit methods.
	 * </pre>
	 * 
	 */
	public abstract double computeArea();
	public abstract double getbase();
	public abstract double getheight();
	public abstract void print();
	
}
