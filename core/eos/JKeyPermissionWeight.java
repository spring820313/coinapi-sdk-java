package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JKeyPermissionWeight {
    private String pubKey;
    private short weight;

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }
}
