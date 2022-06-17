package aleksandr.zasinets.area;

 abstract class Shape {

     private String color;

     public Shape(String color) {
         this.color = color;
     }

      abstract double perimeter();

 }
