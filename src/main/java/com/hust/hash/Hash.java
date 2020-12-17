package com.hust.hash;

import java.math.BigInteger;

public interface Hash {
    String getHash(byte[] msg);
    BigInteger getIntHash(byte[] msg);

    int getMinBitLength();
}
