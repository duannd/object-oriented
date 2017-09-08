package com.duanndz.core.inheritance.hierarchies.impl;

import com.duanndz.core.inheritance.hierarchies.Progression;

/**
 * @author by duannguyen at 08/09/2017
 */
public class ArithmeticProgression extends Progression {

        private long increment;

        public ArithmeticProgression() {
                this(1, 0);
        }

        public ArithmeticProgression(long step) {
                this(step, 0);
        }

        public ArithmeticProgression(long step, long start) {
                super(start);
                this.increment = step;
        }

        @Override
        protected void advance() {
                current += increment;
        }

}
