package core;

import java.math.BigInteger;

/**
 * Created by Administrator on 2018/3/19.
 */

public class JSmcContractTxParams extends JSmcCommonTxParams {

    public JSmcContractTxParams() {
        this.txType = Constants.TX_WICC_TRANSFER_SPC;
        this.txVersion = 1;
        this.setValue(new BigInteger("0"));
    }
    public byte[] getContract() {
        return contract;
    }

    public void setContract(byte[] contract) {
        this.contract = contract;
    }

    private byte[] contract;
}
