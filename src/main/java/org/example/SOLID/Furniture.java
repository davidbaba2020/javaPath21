package org.example.SOLID;

import java.util.Date;

public class Furniture {
         private String colour;
         private Date dateCreated;

        public Furniture() {
        }

        public Furniture(String colour, Date dateCreated) {
            this.colour = colour;
            this.dateCreated = dateCreated;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
        }

        @Override
        public String toString() {
            return "Furniture{" +
                    "colour='" + colour + '\'' +
                    ", dateCreated=" + dateCreated +
                    '}';
        }
    }