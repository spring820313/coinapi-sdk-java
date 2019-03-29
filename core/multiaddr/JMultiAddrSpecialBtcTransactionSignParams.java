package core.multiaddr;

import java.util.List;
import core.JBtcVout;

/**
 * Created by Administrator on 2018/12/27.
 */

public class JMultiAddrSpecialBtcTransactionSignParams extends JMultiAddrBtcTransactionSignParams {
    private String changePrivate;
    private List<JBtcVout> changeVoutFormList;

    public String getChangePrivate() {
        return changePrivate;
    }

    public void setChangePrivate(String changePrivate) {
        this.changePrivate = changePrivate;
    }

    public List<JBtcVout> getChangeVoutFormList() {
        return changeVoutFormList;
    }

    public void setChangeVoutFormList(List<JBtcVout> changeVoutFormList) {
        this.changeVoutFormList = changeVoutFormList;
    }
}
