/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

/**
 *
 * @author ARAFAT
 */
public class Points {

  float x;
  float y;

  public  Point(float a ,float b){
  x=a; y=b;
  }
  
  public float  getx(){
      retourn x;
  }
  public float getY(){
    retourn y ; 
  }
  
  
    public  void ffichercoordonnee() {
        System.out.println("abscisse"+x);
        System.out.println("coordonée"+y);
    }
  
    public static void main(String[] args) {
           
    
      {
         Point P = new Point(2,3);
         P.x =2;  P.y=3;
         P.AfficherCoordonnee();
         P.CalculDistance(P.x,P.y);
     }
    }
    


