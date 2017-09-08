package com.duanndz.core.generics;

/**
 * @author by duannguyen at 08/09/2017
 */
public class Pair<A, B> {

        private A first;
        private B second;

        public Pair(A first, B second) {
                this.first = first;
                this.second = second;
        }

        public A getFirst() {
                return first;
        }

        public B getSecond() {
                return second;
        }

}
