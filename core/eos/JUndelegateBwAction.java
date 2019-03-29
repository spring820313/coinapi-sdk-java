package core.eos;

/**
 * Created by Administrator on 2018/8/28.
 */

public class JUndelegateBwAction extends JAction {
    @Override
    public String actionName() { return "undelegatebw";}

    private String from;
    private String to;
    private JEosAsset stakeNetQuantity;
    private JEosAsset stakeCpuQuantity;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public JEosAsset getStakeNetQuantity() {
        return stakeNetQuantity;
    }

    public void setStakeNetQuantity(JEosAsset stakeNetQuantity) {
        this.stakeNetQuantity = stakeNetQuantity;
    }

    public JEosAsset getStakeCpuQuantity() {
        return stakeCpuQuantity;
    }

    public void setStakeCpuQuantity(JEosAsset stakeCpuQuantity) {
        this.stakeCpuQuantity = stakeCpuQuantity;
    }
}
