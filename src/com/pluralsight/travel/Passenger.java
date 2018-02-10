package com.pluralsight.travel;

public class Passenger extends Person implements Comparable<Passenger> {

   private int checkedBags;
   private final int freeBags;
   private double perBagFee;

   private int memberLevel; // 3(platinum), 2(Gold), 1(silver)
   private int memberDays;

    public void setLevelAndDays(int level, int memberDays, String name) {
        this.name = name;
        this.memberLevel = level;
        this.memberDays = memberDays;
    }

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

   public int compareTo(Passenger p) {

       if(memberLevel > p.memberLevel)
           return -1;
       else if(memberLevel < p.memberLevel)
           return 1;
       else {
           if(memberDays > p.memberDays)
               return -1;
           else if(memberDays < p.memberDays)
               return 1;
           else
               return 0;
       }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "checkedBags=" + checkedBags +
                ", freeBags=" + freeBags +
                ", perBagFee=" + perBagFee +
                ", memberLevel=" + memberLevel +
                ", memberDays=" + memberDays +
                '}';
    }
}
