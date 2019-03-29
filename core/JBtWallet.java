package core;

/**
 * Created by Administrator on 2017/12/28.
 */

public class JBtWallet {
    public JBtSeed getBtSeed() {
        return btSeed;
    }

    public void setBtSeed(JBtSeed btSeed) {
        this.btSeed = btSeed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public String getMaster3LevelPubKey() {
        return master3LevelPubKey;
    }

    public void setMaster3LevelPubKey(String master3LevelPubKey) {
        this.master3LevelPubKey = master3LevelPubKey;
    }

    private JBtSeed btSeed;
    private String pubkey;
    private String address;
    private String symbol;
    private String master3LevelPubKey;
}
