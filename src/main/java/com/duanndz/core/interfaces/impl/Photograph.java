package com.duanndz.core.interfaces.impl;

import com.duanndz.core.interfaces.Sellable;

/**
 * @author by duannguyen at 08/09/2017
 */
public class Photograph implements Sellable {

        private String description;
        private int price;
        private boolean color;

        public Photograph(String description, int price, boolean color) {
                this.description = description;
                this.price = price;
                this.color = color;
        }

        public String description() {
                return description;
        }

        public int listPrice() {
                return price;
        }

        public int lowestPrice() {
                return price/2;
        }

        public boolean isColor() {
                return color;
        }

}
