package core;

import java.util.List;

/**
 * Created by Administrator on 2017/12/28.
 */

public class JBtSeed {
    public byte[] getSeed() {
        return seed;
    }

    public void setSeed(byte[] seed) {
        this.seed = seed;
    }

    public List<String> getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(List<String> mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public JEncryptedData getEncryptedMnemonicCode() {
        return encryptedMnemonicCode;
    }

    public void setEncryptedMnemonicCode(JEncryptedData encryptedMnemonicCode) {
        this.encryptedMnemonicCode = encryptedMnemonicCode;
    }

    public JEncryptedData getEncryptedSeed() {
        return encryptedSeed;
    }

    public void setEncryptedSeed(JEncryptedData encryptedSeed) {
        this.encryptedSeed = encryptedSeed;
    }

    public long getCreationTimeSeconds() {
        return creationTimeSeconds;
    }

    public void setCreationTimeSeconds(long creationTimeSeconds) {
        this.creationTimeSeconds = creationTimeSeconds;
    }

    public String getPwdhash() {
        return pwdhash;
    }

    public void setPwdhash(String pwdhash) {
        this.pwdhash = pwdhash;
    }

    public byte[] getRandomSalt() {
        return randomSalt;
    }

    public void setRandomSalt(byte[] randomSalt) {
        this.randomSalt = randomSalt;
    }

    private byte[] seed;
    private List<String>  mnemonicCode;
    private JEncryptedData encryptedMnemonicCode;
    private JEncryptedData encryptedSeed;
    private long creationTimeSeconds;
    private String pwdhash;
    private byte[] randomSalt;
}
