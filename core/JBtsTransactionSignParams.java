package core;

import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 */

public class JBtsTransactionSignParams extends JTransactionSignParams {

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

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public int getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(int refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public int getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(int refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public List<JBaseOperation> getOps() {
        return ops;
    }

    public void setOps(List<JBaseOperation> ops) {
        this.ops = ops;
    }
    private JBtSeed btSeed;
    private String password;
    private String priKey;

    private String chainId;
    private int refBlockNum;
    private int refBlockPrefix;
    private int expiration;
    private List<JBaseOperation> ops;
}
