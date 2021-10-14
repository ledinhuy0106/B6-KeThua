package Cicle;

   public class Circle {
      private double radius = 1;
      private String Color;
      public double getRadius() {
        return this.radius;
      }
      public String getColor() {
        return this.Color;
      }
      public double setRadius(double radius) {
        return this.radius = radius;
      }
      public String setColor(String color) {
        return this.Color = Color;
      }
      public double getArea() {
        return Math.PI * this.radius * this.radius;
      }
       public String toString() {
        return "hình tròn có bán kính là: " + this.getRadius() + " màu sắc:" + this.getColor();
      }
   }