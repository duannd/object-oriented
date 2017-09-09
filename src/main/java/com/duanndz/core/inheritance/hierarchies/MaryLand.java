package com.duanndz.core.inheritance.hierarchies;

/**
 * @author by duannguyen at 09/09/2017
 */
public class MaryLand extends State {

        @Override
        void printMe() {
                System.out.println("Read it.");
        }

        public static void main(String args[]) {
                Region east = new State();
                State md = new MaryLand();
                Object obj = new Place();
                Place usa = new Region();
                md.printMe();
                east.printMe();
                ((Place) obj).printMe();
                obj = md;
                ((MaryLand) obj).printMe();
                obj = usa;
                ((Place) obj).printMe();
                usa = md;
                ((Place) usa).printMe();
        }

}

class Place extends Object {

        void printMe() {
                System.out.println("Buy it.");
        }
}

class Region extends Place {
        @Override
        void printMe() {
                System.out.println("Box it.");
        }
}

class State extends Region {
        @Override
        void printMe() {
                System.out.println("Ship it.");
        }
}
