public class Square implements Shape
{
    int ID, side;
    
    public Square()
    {
	
    }
    
    public String to_string()
    {
	return getKind() + " (ID# " + getID() + ")\n";
    }


    public String getKind()
    {
	return "Square";
    }


    public String getDetailString()
    {
	return to_string() + "Color: Red\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerim();
    }

    public int getArea()
    {
	int area = side * side;
	return area;
    }
    

    public int getPerim()
    {
	int perimeter = side+side+side+side;
	return perimeter;
    }

    public void setSide(int s)
    {
	side = s;
    }
    
    public void setID(int id)
    {
	ID = id;
    }


    public int getID()
    {
	return 0;
    }

}
