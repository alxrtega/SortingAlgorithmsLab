//Alex Ortega
//Minh Dang

import java.io.*;
import java.util.Scanner;

public class Read{
  
  Point[]     a, b, c, d, e, f;
  double[][]  array;
  Scanner     input;
  String      s;  
  public final boolean DEBUG = true;
  
  public Read(String file)throws IOException{
    
    array  = new double[100000][2];
    a      = new Point[100000];
    b      = new Point[100000];
    c      = new Point[100000];
    d      = new Point[100000];
    e      = new Point[100000];
    f      = new Point[100000];
    input  = new Scanner(new File(file));
    
    for(int row = 0; row < 100000; row++){
      s = input.nextLine();
      String[] temp = s.split("\t");      
      
      this.array[row][0] = Double.parseDouble(temp[0]);
      this.array[row][1] = Double.parseDouble(temp[1]);
    }
    
    for(int x = 0; x < 100000; x++){
      
      this.a[x] = new Point();
      this.b[x] = new Point();
      this.c[x] = new Point();
      this.d[x] = new Point();
      this.e[x] = new Point();
      this.f[x] = new Point();
      
      this.a[x].setX(array[x][0]);
      this.a[x].setY(array[x][1]);
      this.b[x].setX(array[x][0]);
      this.b[x].setY(array[x][1]);
      this.c[x].setX(array[x][0]);
      this.c[x].setY(array[x][1]);
      this.d[x].setX(array[x][0]);
      this.d[x].setY(array[x][1]);
      this.e[x].setX(array[x][0]);
      this.e[x].setY(array[x][1]);
      this.f[x].setX(array[x][0]);
      this.f[x].setY(array[x][1]);
    }
  }
  
  public Point[] getPointA(){
    return a; 
  }  
  public Point[] getPointB(){
    return b; 
  }
  public Point[] getPointC(){
    return c; 
  }
  public Point[] getPointD(){
    return d; 
  }
  public Point[] getPointE(){
    return e; 
  }
  public Point[] getPointF(){
    return f; 
  }
  
  private void printPoint(Point[] point){
    for(Point current: point){
      System.out.println(current); 
    }
  }
}