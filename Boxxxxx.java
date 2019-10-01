/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author DELOS SANTOS, APRIL B. (BSIT 2102)
 */
public class Boxxxxx {
    public static void main (String[] args){
        Box box = new Box(0,0,0);
        
        box.boxA();
        System.out.print("\n Box a: " + box.toString());
        System.out.print("\n Box a: surface area " + box.getArea());
        
        box.boxB();
        System.out.print("\n Box b: " + box.toString());
        System.out.print("\n Box b: surface area " + box.getArea());
        
        System.out.print("\n Check if Box a and Box B is 'EQUAL'! ");
        
        IsoscelesRight test = new IsoscelesRight(3);
        GeometricTester tst = new GeometricTester();
        
        System.out.print("\n IsoscelesRight c: " + test.toString());
        System.out.print("\n IsoscelesRight c area: " + test.toString());
        
        System.out.print("\n IsoscelesRight d: " + test.toString());
        System.out.print("\n IsoscelesRight d area: " + test.toString());
        
        System.out.print("\n Check if IsoscelesRight C and IsoscelesRight D are 'EQUAL'! ");
         
    }// end the main methods of overriding
    
    // Rectangle2 method
    
    public static class Rectangle2{
        int area,l,w,h;
        String ans;
        
        public int getArea(){
            area=l*w*h;
            return area;
        }
        
         /**
         *
         * @return
         */
        @Override
        public String toString() {
            return " [Box: Length = " + l + ", Width = " + w + ", Height = " + h + "]";
        }
    } // end for Recyangle2
    
    // Box class subclass of Rectangle
    
    public static class Box extends Rectangle2{
        private int height;
        
        public Box(int l, int w, int h){
            Rectangle2 box = new Rectangle2();
        }
        
        public int getHeight(){
            return height;
        }
        
        /**
         *
         * @return
         */
        @Override
        public int getArea() {
            area= (2*l*w) + (2*l*h) + (2*h*w);
            return area;
        }
        
        public int boxA(){
            l=2;
            w=3;
            h=4;
            return l+w+h;
       }
        public int boxB(){
            l=4;
            w=7;
            h=4;
            return l+w+h;
       }
        public String equals(){
            if(boxA()==boxB()){
                ans="TRUE";
            }
            else{
                ans="FALSE";
            }
            return ans;
        }
    }// end of BOX class
    
    // Triangle class method
    
    public static class Triangle{
        double equalSide=3,area,sideC;
        String ans;
        
        public String equals(){
            if(equalSide==equalSide){
                ans="TRUE";
            }
            else{
                ans="FALSE";
            }
            return ans;
        }
        
        public double getArea(){
            area=(equalSide*equalSide)/2;
            return area;
        }
    }// end of TRIANGLE
    
    // Isosceles class subclass of Triangle
    
    public static class IsoscelesRight extends Triangle{
        
        public IsoscelesRight(double equalSize){
        }
        public double getEqualSide(){
            return equalSide;
        }
        public double getNotEqualSide(){
            sideC=equalSide*Math.sqrt(2);
            return sideC;
        }
        
        /**
         *
         * @return
         */
        @Override
        public String toString(){
            return " [IsoscelesRight: (equal_Side)  = " + getEqualSide() + ", not equal side = " + getNotEqualSide();
        }
    }// end of ISOSCELES RIGHT
    
    public static class GeometricTester{
        public GeometricTester(){
            IsoscelesRight tst= new  IsoscelesRight(3);
            tst.equalSide=3.0;
        }
    }
}// end of methods
