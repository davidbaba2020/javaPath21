package org.example.SOLID;

import java.util.Date;

public class Table extends Furniture {
         private Integer surfaceArea;


         
        public Table() {
            super();
        }

        public Table(Integer surfaceArea) {
            this.surfaceArea = surfaceArea;
        }

        public Table(String colour, Date dateCreated, Integer surfaceArea) {
            super(colour, dateCreated);
            this.surfaceArea = surfaceArea;
        }

        public Integer getSurfaceArea() {
            return surfaceArea;
        }

        public void setSurfaceArea(Integer surfaceArea) {
            this.surfaceArea = surfaceArea;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "surfaceArea=" + surfaceArea +
                    "} " + super.toString();
        }
    }
