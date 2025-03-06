package Models;

public class Rectangle {
    private double Width;
    private double Height;

    public Rectangle(double width, double height){
        this.Width = width;
        this.Height = height;
    }
    public double Area(){
        return Width * Height; 
    }
    public double Perimeter(){
        return 2 * (Width + Height);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }

}
