package com.pluralsight.travel;

public class Passenger {

   private int checkedBags;
   private final int freeBags;
   private double perBagFee;


   public int getCheckedBags() {
       return checkedBags;
   }
   public void setCheckedBags(int checkedBags) {
       this.checkedBags = checkedBags;
   }
   /*public int getFreeBags() {
       return freeBags;
   }
   public void setFreeBags(int freeBags) {
       this.freeBags = freeBags;
   }*/
   public double getPerBagFee() {
       return perBagFee;
   }
   public void setPerBagFee(double perBagFee) {
       this.perBagFee = perBagFee;
   }

   public Passenger(){
       this.freeBags = 0;
   }

   public Passenger( int freeBags) {
       //this(freeBags > 1 ? 25.0d : 50.0d);
       this.freeBags = freeBags;
   }

   public Passenger(int freeBags, int checkedBags) {
      // this.freeBags = freeBags;
       this(freeBags);
     //  this.qwerty = 2;
       this.checkedBags = checkedBags;
   }

   private Passenger(double perBagFee) {
       this.perBagFee = perBagFee;
       this.freeBags = 0;
   }
}
