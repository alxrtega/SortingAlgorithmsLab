//Alex Ortega
//Minh Dang

import java.io.*;

public class Tester{
  public static void main(String [] args)throws IOException{
    
    Read read= new Read("100000Points.txt");
    
    System.out.print("Bubble:\t\t");    
    SortAlgorithms.bubble(read.getPointA());
    
    System.out.print("Selection:\t\t");
    SortAlgorithms.selection(read.getPointB());
    
    System.out.print("Insertion:\t\t");
    SortAlgorithms.insertion(read.getPointC());
    
    System.out.print("Merge:\t\t");
    SortAlgorithms.merge(read.getPointD());
    
    System.out.print("Quick:\t\t");
    SortAlgorithms.quick(read.getPointE());
    
    System.out.print("Heap:\t\t");
    SortAlgorithms.heap(read.getPointF());
  }
}