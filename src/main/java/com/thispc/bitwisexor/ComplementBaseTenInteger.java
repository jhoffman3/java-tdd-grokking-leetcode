package com.thispc.bitwisexor;

public class ComplementBaseTenInteger {

//    public int bitwiseComplement(int n) {
//        if(n == 0) return 1;
//        int bitWiseComplement = n;
//
//        // where |= performs an in-place+ operation between pairs of objects
//        bitWiseComplement |= (bitWiseComplement >> 1);
//        bitWiseComplement |= (bitWiseComplement >> 2);
//        bitWiseComplement |= (bitWiseComplement >> 4);
//        bitWiseComplement |= (bitWiseComplement >> 8);
//        bitWiseComplement |= (bitWiseComplement >> 16);
//        bitWiseComplement |= (bitWiseComplement >> 32);
//
//        return bitWiseComplement ^ n;
//    }

    /*
    5 -> 101 ^ 010 -> 111 // taking XOR of it's no and complement we get 111

            10 - > 1010 ^ 0101 -> 1111

    So, looking at above example we can say that,
    A ^ B = C
            then,
    A ^ A ^ B = A ^ C
    but                 A ^ A is 0;
    therefore,          0 ^ B is B;
    Hence we can say    B = A ^ C

    So, these property of XOR apply in our case

    Let say our no is "N" and no we have to find is "X"
    let say N ^ X gives [111....] something,
    where 111 is length of our N
    and X = [1111..] length is same as binary representation of N

    So, from this the formula we get is :
    -----------------
    X = [1111...] ^ N
    -----------------

    But here thing is how we will get [1111...], in java we have method by taking Integer.toBinaryString().
    After taking length we will do first bitwise left shift of 1
    i.e  1 << 3  gives   1000
    and if i subtract      -1
    gives                 111

    this is what i need in case of N = 5, where the length of my binary representation is 3
    */
    public int bitwiseComplement(int n) {
        return n == 0 ? 1 : ((1 << Integer.toBinaryString(n).length()) - 1) - n;
    }
}
