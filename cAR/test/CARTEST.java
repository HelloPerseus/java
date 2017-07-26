/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import car.CAR;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class CARTEST {
    
        String make1 = "Dumb";
        String model1 = "Lollipop derp";
        int year1= 999;
        String nickname1 = "Stupid car";
        String color1 = "White";
        int yearowned1 = 1;
        double miles1 = 1234567890;
        
        
      CAR car1= new CAR(make1, model1, year1, nickname1, color1, yearowned1, miles1);
     
      @Test
      public void makeGetterTest(){
        assertEquals(car1.getMake(),"Dumb");
    }
      @Test
      public void makeeGetterTest(){
        assertEquals(car1.getMake(),"Dumb");
    }
      @Test
      public void makeSetterTest(){
        assertEquals(car1.getModel(),"Lollipop derp");
    }
      @Test
      public void modelGetterTest(){
        assertEquals(car1.getModel(),"Lollipop derp");
    }
    
    
}
//SLEEP! ! ! ! ! ! ! ! ! ! ! ! ! 