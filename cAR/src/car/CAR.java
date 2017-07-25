package car;


public class CAR {

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearowned() {
        return yearowned;
    }

    public void setYearowned(int yearowned) {
        this.yearowned = yearowned;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

   String make, model, nickname, color;
   int year, yearowned;
   boolean isOn;
   double miles;
   
   public CAR(String newMake, String newModel, int newYear, String newnickname, String newcolor, int newyearowned, double newmiles) {
       make=newMake;
       model=newModel;
       year=newYear;
       isOn = false;
       nickname = newnickname;
       color = newcolor;
       yearowned = newyearowned;
       miles = newmiles;
              
   }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
}