class Shape{
    private int edges ;
    private int vertices ;

    public Shape(int edges, int vertices){
        this.edges = edges ;
        this.vertices = vertices ;
    }

    public String GetDetails(){
        return "Edges-> " + edges + 
                "Vertices-> " + vertices ;
    }
}

class Rectangle extends Shape{
    private int length ;
    private int breadth ;

    public Rectangle(int length, int breadth){
        super(4,4) ;
        this.length= length ;
        this.breadth= breadth ;
    }

    public int GetArea(){
        return length*breadth ;
    }

    public String GetDetails(){
        return "Length-> " + length +
                " Breadth-> " + breadth + 
                "\n Shape details-> " + super.GetDetails();
    }
}

public class SimpleInhertiance {
    public static void main(String[] args){
        Rectangle rect= new Rectangle(10,20) ;
        System.out.println(rect.GetDetails());
        System.out.println("Area of shape is-> " + rect.GetArea()) ;
    }
}

