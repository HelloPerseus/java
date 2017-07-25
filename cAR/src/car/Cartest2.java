package car;



public class Cartest2 {
   
    public static void main(String[] args) {
        String make2 = "HHH";
        String model2 = "PXSUDFJHSDF-123456789";
        int year2= 1999;
        String nickname2 = "SMART car";
        String color2 = "BLACK";
        int yearowned2 = 10;
        double miles2 = 987654321;
        
        
      CAR car1= new CAR(make2, model2, year2, nickname2, color2, yearowned2, miles2);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + "called" +  car1.getNickname() + "the color is" +  car1.getColor() + "i owned it" +  car1.getYearowned() + "Miles" +  car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }