package com.duanndz.core.inheritance.hierarchies;

import com.duanndz.core.inheritance.hierarchies.impl.ArithmeticProgression;
import com.duanndz.core.inheritance.hierarchies.impl.FibonacciProgression;
import com.duanndz.core.inheritance.hierarchies.impl.GeometricProgression;

/**
 * @author by duannguyen at 08/09/2017
 */
public class ProgressionMain {

        public static void main(String args[]) {

                int number = 5;

                Progression progression = new Progression();
                progression.printProgression(number);

                ArithmeticProgression arithmetic = new ArithmeticProgression(2);
                arithmetic.printProgression(number);

                GeometricProgression geometric = new GeometricProgression(3);
                geometric.printProgression(number);

                FibonacciProgression fibonacci = new FibonacciProgression(1, 2);
                fibonacci.printProgression(number);

        }
}
