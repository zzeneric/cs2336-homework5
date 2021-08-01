// Raghav Pillai, 7/23/21

import java.lang.Comparable;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
  
    /** Construct a default geometric object */
    protected GeometricObject() {
      dateCreated = new java.util.Date();
    }
  
    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
    }
  
    /** Return color */
    public String getColor() {
      return color;
    }
  
    /** Set a new color */
    public void setColor(String color) {
      this.color = color;
    }
  
    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
      return filled;
    }
  
    /** Set a new filled */
    public void setFilled(boolean filled) {
      this.filled = filled;
    }
  
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
      return dateCreated;
    }
  
    @Override
    public String toString() {
      return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject obj) {
        if (getArea() > obj.getArea())
            return 1;
        else if (getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }
  
    /** Abstract method getArea */
    public abstract double getArea();
  
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

    public static void main(String[] args) {
        //create objects of the Rectangle classes
        Circle obj1 = new Circle(8);
        Circle obj2 = new Circle(8);
        boolean valid = obj1.equals(obj2);
        System.out.println("Circle1 and Circle2 are equal: " + valid);

        Rectangle obj3 = new Rectangle(8,9);
        Rectangle obj4 = new Rectangle(8,8);
        boolean valid2 = obj3.equals(obj4);
        System.out.println("Rectangle1 and Rectangle2 are equal: " + valid2);
    }
}