package ClassandObject;

public class Prob1 {
	double h,w,d;

    Prob1(double width,double height,double depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   double volume()
   { double v;
   v=h*w*d;
   return v;
   }
  
   public static void main(String[] args) {
      
   Prob1 bc = new Prob1(8.5,80.3,9.6);
   System.out.println(bc.volume());

   }

}
