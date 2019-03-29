package core;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JEosTransactionSignParams extends JTransactionSignParams {
    private JBtSeed btSeed;
    private String priKey;
    private String password;
    private String chainId;
    private String headBlockId;
    private int expiration;

    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

}
