package com.duanndz.core.inheritance.hierarchies.impl;

import com.duanndz.core.inheritance.hierarchies.Progression;

/**
 * @author by duannguyen at 08/09/2017
 */
public class GeometricProgression extends Progression {

        private long base;

        public GeometricProgression() {
                this(2, 1);
        }

        public GeometricProgression(long base) {
                this(base, 1);
        }

        public GeometricProgression(long base, long start) {
                super(start);
                this.base = base;
        }

        @Override
        protected void advance() {
                current *= base;
        }
}
