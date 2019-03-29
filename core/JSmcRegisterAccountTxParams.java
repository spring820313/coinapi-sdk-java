package core;

/**
 * Created by Administrator on 2018/3/19.
 */

public class JSmcRegisterAccountTxParams extends JSmcBaseTransactionSignParams {

    public JSmcRegisterAccountTxParams() {
        this.txType = Constants.TX_WICC_REGISTERACCOUNT;
        this.txVersion = 1;
    }
}
