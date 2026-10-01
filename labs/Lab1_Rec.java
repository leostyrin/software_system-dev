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
