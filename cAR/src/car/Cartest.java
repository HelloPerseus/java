package car;



public class Cartest {
   
    public static void main(String[] args) {
        String make1 = "Dumb";
        String model1 = "Lollipop derp";
        int year1= 999;
        String nickname1 = "Stupid car";
        String color1 = "White";
        int yearowned1 = 1;
        double miles1 = 1234567890;
        
        
      CAR car1= new CAR(make1, model1, year1, nickname1, color1, yearowned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + "called" +  car1.getNickname() + "the color is" +  car1.getColor() + "i owned it" +  car1.getYearowned() + "Miles" +  car1.getMiles());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}


