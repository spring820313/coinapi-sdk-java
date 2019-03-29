package core;

/**
 * Created by Administrator on 2017/12/28.
 */

public class JNetParams {
    private String symbol;
    private int coinType = -1;
    private int nettype = -1;
    private JKeyPath keyPath;
    private int version = 0x02;

    private int HDprivate;
    private int HDpublic;
    private int P2KH;
    private int P2SH;
    private int keyprefixes;

    private int ApiVersion = 0x01;

    private int N = 32768;
    private int R = 8;
    private int P = 1;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCoinType() {
        return coinType;
    }

    public void setCoinType(int coinType) {
        this.coinType = coinType;
    }

    public int getNettype() {
        return nettype;
    }

    public void setNettype(int nettype) {
        this.nettype = nettype;
    }

    public JKeyPath getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(JKeyPath keyPath) {
        this.keyPath = keyPath;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getHDprivate() {
        return HDprivate;
    }

    public void setHDprivate(int HDprivate) {
        this.HDprivate = HDprivate;
    }

    public int getHDpublic() {
        return HDpublic;
    }

    public void setHDpublic(int HDpublic) {
        this.HDpublic = HDpublic;
    }

    public int getP2KH() {
        return P2KH;
    }

    public void setP2KH(int p2KH) {
        P2KH = p2KH;
    }

    public int getP2SH() {
        return P2SH;
    }

    public void setP2SH(int p2SH) {
        P2SH = p2SH;
    }

    public int getKeyprefixes() {
        return keyprefixes;
    }

    public void setKeyprefixes(int keyprefixes) {
        this.keyprefixes = keyprefixes;
    }

    public int getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(int apiVersion) {
        ApiVersion = apiVersion;
    }
}
