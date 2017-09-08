package com.duanndz.core.interfaces.impl;

import com.duanndz.core.interfaces.Sellable;
import com.duanndz.core.interfaces.Transportable;

/**
 * @author by duannguyen at 08/09/2017
 */
public class BoxedItem implements Sellable, Transportable {

        private String description;
        private int price;
        private int weight;
        private boolean haz;
        private int height = 0;
        private int width = 0;
        private int depth = 0;

        public BoxedItem(String description, int price, int weight, boolean haz) {
                this.description = description;
                this.price = price;
                this.weight = weight;
                this.haz = haz;
        }

        public String description() {
                return description;
        }

        public int listPrice() {
                return price;
        }

        public int lowestPrice() {
                return price / 2;
        }

        public int weight() {
                return weight;
        }

        public boolean isHazardous() {
                return haz;
        }

        public void setBox(int height, int width, int depth) {
                this.height = height;
                this.width = width;
                this.depth = depth;
        }
}
