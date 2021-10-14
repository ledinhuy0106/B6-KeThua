package Cicle;
   public class Cylinder extends Circle {
      private double height;
      public double getVolume() {
         return this.height * super.getArea();
     }public String toString() {
         return "Bán kính hình trụ = " + super.getRadius() + "V Trụ = " + this.getVolume();
    }
}