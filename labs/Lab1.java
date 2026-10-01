abstract class Shape{

    private int sides;

    public int getSides() {
        return sides;

    }

    public void setSides(int sides){
        this.sides = sides;
    }

    abstract public int getArea();

    Shape(int sides){
        this.sides = sides;
    }
}

abstract class Rectangle extends Shape{
    Rectangle(int sides){
        super(sides);
    }

    private int width;

    private int height;


    abstract public int getWidth{
        this.width = width;
    }

    abstract public int getHeight{
        this.height = height;
    }

    public int getArea(){
        return height * width;
    }

}