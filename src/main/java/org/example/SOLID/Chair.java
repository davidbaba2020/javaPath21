package org.example.SOLID;


import java.util.Date;

public class Chair extends Furniture {
         private int noOfLegs;


        public Chair() {
            super();
        }

        public Chair(String colour, Date dateCreated, int noOfLegs) {
            super(colour, dateCreated);
            this.noOfLegs = noOfLegs;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }

        @Override
        public String toString() {
            return "Chair{" +
                    "noOfLegs=" + noOfLegs +
                    "} " + super.toString();
        }
    }