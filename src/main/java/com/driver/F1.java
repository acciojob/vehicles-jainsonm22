package com.driver;

public class F1 extends Car {
  int gear;
    public F1(String name, boolean isManual) {
        super(name,isManual);
        gear=0;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int rate){

        int newSpeed =getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop();
            setGears(1);
            //Stop the car, set gear as 1
        }
        if(newSpeed >0 && newSpeed <= 50) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(1);
            //Stop the car, set gear as 1
        }
        if(newSpeed >50 && newSpeed <= 150) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(2);
            //Stop the car, set gear as 1
        }
        if(newSpeed >100 && newSpeed <= 150) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(3);
            //Stop the car, set gear as 1
        }

        if(newSpeed >150 && newSpeed <= 200) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(4);
            //Stop the car, set gear as 1
        }

        if(newSpeed >200 && newSpeed <= 250) {
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(5);
            //Stop the car, set gear as 1
        }
        if(newSpeed >250 ){
            changeSpeed(newSpeed, getCurrentDirection());
            setGears(6);
            //Stop the car, set gear as 1
        }





        //for all other cases, change the gear accordingly

        /*if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }*/
    }
}
