package core.multiaddr;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/9/17.
 */

public class JMultiAddrOutput {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    private String address;
    private BigInteger value;
}
