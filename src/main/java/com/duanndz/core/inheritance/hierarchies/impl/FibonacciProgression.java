package com.duanndz.core.inheritance.hierarchies.impl;

import com.duanndz.core.inheritance.hierarchies.Progression;

/**
 * @author by duannguyen at 08/09/2017
 */
public class FibonacciProgression extends Progression {

        private long prev;

        public FibonacciProgression() {
                this(0, 1);
        }

        public FibonacciProgression(long first, long second) {
                super(first);
                this.prev = second - first;
        }

        @Override
        protected void advance() {
                long temp = prev; //f(n-2)
                prev = current; //f(n-1)
                current = prev + temp; //f(n) = f(n-1) + f(n-2);
        }

}
