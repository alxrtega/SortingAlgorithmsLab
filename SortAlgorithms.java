//Alex Ortega
//Minh Dang

import java.io.*;

public class SortAlgorithms{
  
  public static void bubble(Point[] p){ //BUBBLE 
    long    startTime = System.nanoTime();
    
    bubble(p, 0);
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime);
    System.out.println(time);
    //print(p);
  }  
  private static void bubble(Point[] a, int x){
    
    Point  temp;
    
    for(x = 0; x < a.length-1; x++){
      for(int y = 1; y < a.length-x; y++){
        
        if(a[y-1].getX() > a[y].getX()){
          
          temp = a[y-1];          
          a[y-1] = a[y];
          a[y] = temp;
        }        
        
      }
    }
  }//end of bubble
  
  public static void selection(Point[] p){ //SELECTION
    long startTime = System.nanoTime();
    
    selection(p, 0); 
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime
                                                           / 1000000000);
    System.out.println(time);
    //print(p);
  }  
  private static void selection(Point[] b, int x){    
        
    int i;    
    for(x = 0; x < b.length; x++){
      i = x;
      
      for(int y = x; y < b.length; y++){
        if(b[y].getX() < b[i].getX())
          i = y;
      }
      
      Point temp = b[x];
      b[x] = b[i];
      b[i] = temp;
      
    }
  }//end of selection
  
  public static void insertion(Point[] p){ //INSERTION
    long startTime = System.nanoTime();
    
    insertion(p, 0); 
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime
                                                           / 1000000000);
    System.out.println(time);
    //print(p);
  }
  private static void insertion(Point[] c, int s){
    
    Point x;    
    for(int i = 1; i < c.length; i++){
      
      x = c[i];
      s = i;
      while(s > 0 && c[s-1].getX() > x.getX()){
        c[s] = c[s-1];
        s--;
      }
      c[s] = x;
    }    
  }//end of insertion
  
  public static void merge(Point[] p){ //MERGE
    long startTime = System.nanoTime();
    
    merge(p, 0); 
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime
                                                           / 1000000000);
    System.out.println(time);
  }
  private static void merge(Point[] d, int x){    
    
    Point[] temp = new Point[d.length]; 
    merge(d, temp, x, d.length-1);
  }  
  private static void merge(Point[] d, Point[] temp,
                                      int left, int right){
    
    if(left < right){
      int center = (left + right) / 2;
      merge(d, temp, left, center);
      merge(d, temp, center+1, right);
      merge(d, temp, left, center+1, right);
    }
  }  
  private static void merge(Point[] d, Point[] temp,
                     int left, int right, int rightEnd){
    
    int leftEnd = right-1;
    int k = left;
    int num = rightEnd - left + 1;
    
    while(left <= leftEnd && right <= rightEnd)
      if(d[left].getX() < d[right].getX())
      temp[k++] = d[left++];
    else
      temp[k++] = d[right++];
    while(left <= leftEnd)
      temp[k++] = d[left++];
    
    while(right <= rightEnd)
      temp[k++] = d[right++];
    
    for(int x = 0; x < num; x++, rightEnd--)
      d[rightEnd] = temp[rightEnd];
  }//end of merge
  
  public static void quick(Point[] p){ //QUICK
    long startTime = System.nanoTime();
    
    quick(p, 0); 
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime
                                                           / 1000000000);
    System.out.println(time);
    //print(p);
  }  
  private static void quick(Point[] e, int x){    
        
    doQuickSort(e, x, e.length-1); 
  }
  private static void doQuickSort(Point[] e, int start, int end){
    
    int pivot;
    if(start < end){
      pivot = partition(e, start, end);
      doQuickSort(e, start, pivot-1);
      doQuickSort(e, pivot+1, end);
    }
  }
  private static int partition(Point[] e, int start, int end){
    
    double pivot;
    int endLeft;
    int mid;     
    mid = (start + end)/2;     
    swap(e, start, mid);     
    pivot = e[start].getX();     
    endLeft = start;     
    for(int s = start+1; s <= end; s++){
      if(e[s].getX() < pivot){
        endLeft++;
        swap(e, endLeft, s);
      }
    }
    swap(e, start, endLeft);
    return endLeft;
  }
  private static void swap(Point[] e, int a, int b){
    
    Point temp;
     
    temp = e[a];
      e[a] = e[b];
      e[b] = temp;
  }//end of quick
    
  public static void heap(Point[] p){ //HEAP
    long startTime = System.nanoTime();
    
    heap(p, p.length);
    
    long estimatedTime = System.nanoTime()-startTime;
    String time = String.format("%.5f seconds.", (double)estimatedTime
                                                           / 1000000000);
    System.out.println(time);
    //print(p);
  }  
  private static void heap(Point[] f, int n){
      
 
        for (int x = n / 2 - 1; x >= 0; x--)
            heapify(f, n, x);
 
        for (int y = n-1; y >= 0; y--){

          Point temp = f[0];
            f[0] = f[y];
            f[y] = temp;
          
            heapify(f, y, 0);
        }
    }
 
  private static void heapify(Point f[], int n, int x){
        int largest = x;  
        int l = 2*x + 1;  
        int r = 2*x + 2;  
 
        if (l < n && f[l].getX() > f[largest].getX())
            largest = l;
 
        if (r < n && f[r].getX() > f[largest].getX())
            largest = r;
 
        if (largest != x){
          
          Point swap = f[x];
            f[x] = f[largest];
            f[largest] = swap;
 
            heapify(f, n, largest);
        }
    }//end of heap
  
  public static void print(Point[] array){ //PRINT
    
    for(Point x: array)
      System.out.print(x); 
    System.out.println();
  }//end of print
}