package core.trx;

import core.JBtSeed;
import core.JTransactionSignParams;

/**
 * Created by Administrator on 2019/1/8.
 */

public class JTrxTransactionSignParams extends JTransactionSignParams {
    private JBtSeed btSeed;
    private String password;
    private String rawJson;
    private String priKey;

    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRawJson() {
        return rawJson;
    }

    public void setRawJson(String rawJson) {
        this.rawJson = rawJson;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

}
