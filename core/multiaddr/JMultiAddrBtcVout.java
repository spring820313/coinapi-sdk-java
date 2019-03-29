package core.multiaddr;


import core.JBtcVout;

/**
 * Created by Administrator on 2018/9/17.
 */

public class JMultiAddrBtcVout extends JBtcVout {
    private String priKey;
    private String address;

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
