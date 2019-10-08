//Alex Ortega
//Minh Dang

public class Point{
  
  Read    read;
  double  x, y;

  public Point(double x, double y){
    
    this.x = x;
    this.y = y;    
  }  
  
  public Point(){  
    //empty constructor
  }
  
  public double getX(){
    return x;
  }  
  public double getY(){
    return y;
  }
  
  public void setX(double x){
    this.x = x;
  }  
  public void setY(double y){
    this.y = y; 
  }
  
  public String toString(){
    return "x = "+x+"\t y = "+y+"\n"; 
  }
}