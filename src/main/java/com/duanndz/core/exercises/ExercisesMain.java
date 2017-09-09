package com.duanndz.core.exercises;

import com.duanndz.core.exercises.impl.Horse;
import com.duanndz.core.exercises.impl.sub.Equestrian;
import com.duanndz.core.exercises.impl.sub.Racer;
import com.duanndz.core.inheritance.hierarchies.impl.FibonacciProgression;

/**
 * @author by duannguyen at 09/09/2017
 */
public class ExercisesMain {

        public static void main(String args[]) throws Exception {
                //findFibonacci();
                testCast();
        }

        /**
         * R-2.6: Give a short fragment of Java code that uses the progression classes from Sec-tion 2.2.3
         * to find the eighth value of a Fibonacci progression that starts with 2 and 2 as its first two values.
         */
        private static void findFibonacci() {
                int position = 18;
                FibonacciProgression fibonacci = new FibonacciProgression(1, 2);
                for(int idx = 1; idx <= position; idx++) {
                        long current = fibonacci.nextValue();
                        if(idx == position) {
                                System.out.println(current);
                        }
                }
        }

        /**
         * R-2.13: Consider the inheritance of classes from Exercise R-2.12, and let d be an object variable of type Horse.
         * If d refers to an actual object of type Equestrian, can it be cast to the class Racer? Why or why not?
         */
        private static void testCast() {
                Horse horse;
                horse = new Equestrian();

                ((Racer) horse).race();
        }

}
