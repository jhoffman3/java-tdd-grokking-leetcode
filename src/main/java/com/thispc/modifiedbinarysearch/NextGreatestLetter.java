package com.thispc.modifiedbinarysearch;

public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length;

        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            System.out.println("Begin loop lo " + lo + " hi " + hi + " mi " + mi);
            if (letters[mi] <= target) {
                lo = mi + 1;
            }
            else {
                hi = mi;
            }
            System.out.println("End loop lo " + lo + " hi " + hi + " mi " + mi);
        }
        System.out.println("returning letters[" + lo %  letters.length + "]");

        return letters[lo % letters.length];
    }
}