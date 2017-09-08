package com.duanndz.core.inheritance.hierarchies;

/**
 * @author by duannguyen at 08/09/2017
 * Generates a simple progression. By default: 0, 1, 2, ...
 */
public class Progression {

        protected long current;

        public Progression() {
                this(0);
        }

        public Progression(long start) {
                this.current = start;
        }

        /**
         * Advances the current value to the next value of the progression.
         */
        protected void advance() {
                current++;
        }

        /**
         * to get current value and advance current
         *
         * @return current value
         */
        public long nextValue() {
                long answer = current;
                advance();
                return answer;
        }

        public void printProgression(int n) {
                System.out.print(nextValue());
                for (int idx = 0; idx < n; idx++) {
                        System.out.print(" " + nextValue());
                }
                System.out.println("\n***************************");
        }
}
