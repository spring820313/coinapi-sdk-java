package core;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import core.eos.JBuyRamAction;
import core.eos.JBuyRamBytesAction;
import core.eos.JDelegateBwAction;
import core.eos.JDeleteAuthAction;
import core.eos.JNewAccountAction;
import core.eos.JRefundAction;
import core.eos.JSellRamAction;
import core.eos.JTransferAction;
import core.eos.JUndelegateBwAction;
import core.eos.JUpdateAuthAction;
import core.multiaddr.JMultiAddrBtcTransactionSignParams;
import core.multiaddr.JMultiAddrSpecialBtcTransactionSignParams;


/**
 * Created by Administrator on 2017/12/28.
 */

public class CoinApi {
    /*
    库初始化
     */
    public native boolean init();

    /*
    库销毁
     */
    public native void cleanup();

    /*
    获取助记词列表
   */
    public native List<String> createAllCoinMnemonicCode();

    /*
   检查助记词列表
   */
    public native boolean checkMnemonicCode(List<String> words);

    /*
    一次创建一个地址
    */
    public native JBtWallet createWallet(String words, String password, JNetParams jnetParams);

    /*
    一次创建多种币种钱包
    */
    public native List<JBtWallet> createWallets(String words, String password, List<JNetParams> jnetParamsList);

    /*
    根据 加密种子获取 解密后的私钥
    */
    public native String getPriKeyFromBtSeed(JBtSeed jbtSeed, String password, JNetParams jnetParams);

    /*
    根据 加密种子获取 解密后的助记词
    */
    public native List<String> getMnemonicCodeFromBtSeed(JBtSeed jbtSeed, String password, JNetParams jnetParams);

    /*
    验证地址有效性
    */
    public native boolean validateAddress(String address, JNetParams jnetParams);

    /*
    修改密码
    */
    public native JBtSeed changePassword(JBtSeed joldBtSeed, String password, String newPassword, JNetParams jnetParams);

    /*
    创建签名交易
    */
    public native Map createSignTransaction(JTransactionSignParams signParams, JNetParams jnetParams);

    /*
    生成Transfer二进制
     */
    public native byte[] getTokenTransferBinary(String destAddress, BigInteger value);

    /*
    lbtc注册
    */
    public native byte[] getLbtcRegister(String address, String prikey, String name, JNetParams jnetparams);

    /*
     lbtc投票
     */
    public native byte[] getLbtcVote(String address, String prikey, List<String> voteAddressList, JNetParams netparams);

    /*
     lbtc取消投票
     */
    public native byte[] getLbtcCancelVote(String address, String prikey, List<String> voteAddressList, JNetParams netparams);

    /*
    wicc 超级币转账合约
     */
    public native byte[] getSpcContractData(String address, BigInteger spc);

    /*
    wicc 投注合约
     */
    public native byte[] getBetContractData(String lid, String address, byte ltype, List<JBetItem> betList);

    /*
    eth私钥签名
    */
    public native Map ethSign(String eth_priv, String wicc_address);

    /*
     根据 加密种子获取 解密后的主私钥和主公钥
     */
    public native Map getHdKeyFromBtSeed(JBtSeed jbtSeed, String jpassword, JNetParams jnetParams);

    /*
     根据 主公钥和path，获取地址
     */
    public native String getAddressFromMasterPubKey(String masterPubkey, JNetParams netParams);

    /*
     根据主私钥和path，获取私钥
     */
    public  native String getPriKeyFromMasterPriKey(String masterPrikey, JNetParams netParams);

    /*
    根据私钥获取地址
    */
    public native String getAddressFromPriKey(String priKey, JNetParams netParams);

    /*
    根据私钥获取公钥
     */
    public native String getPubKeyFromPriKey(String priKey, JNetParams netParams);

    /*
    多签：获取地址
     */
    public native String multiGetAddress(int m, List<String> pubkeys, JNetParams jnetParams);

    /*
    多签：获取原始未签名交易
     */
    public native Map multiGetUnsignedTransaction(JTransactionSignParams signParams, int m, List<String> pubkeys, JNetParams jnetParams);

    /*
    多签：用私钥签名原始交易
     */
    public native Map multiSign(String hex, int m, List<String> pubkeys, String prikey, JNetParams jnetParams);

    /*
    多签：获取签名交易
     */
    public native String multiGetSignedTransaction(String hex, int m, List<String> pubkeys, Map< Integer, List<String> > signs, JNetParams jnetParams);

    /*
    多签：获取签名交易
    */
    public native Map multiGetSignedTransactionEx(String hex, int m, List<String> pubkeys, Map< Integer, List<String> > signs, JNetParams jnetParams);

    /*
    EOS：转代币
     */
    public native String eosTransfer(JTransactionSignParams signParams, JNetParams jnetParams, JTransferAction transfer);

    /*
    EOS：买RAM
     */
    public native String eosBuyRam(JTransactionSignParams signParams, JNetParams jnetParams, JBuyRamAction buyRamAction);

    /*
    EOS：买RAM（字节）
     */
    public native String eosBuyRamBytes(JTransactionSignParams signParams, JNetParams jnetParams, JBuyRamBytesAction buyRamBytesAction);

    /*
    EOS：抵押
     */
    public native String eosDelegateBw(JTransactionSignParams signParams, JNetParams jnetParams, JDelegateBwAction delegateBwAction);

    /*
    EOS：撤销抵押
     */
    public native String eosUndelegateBw(JTransactionSignParams signParams, JNetParams jnetParams, JUndelegateBwAction undelegateBwAction);

    /*
    EOS：卖RAM
     */
    public native String eosSellRam(JTransactionSignParams signParams, JNetParams jnetParams, JSellRamAction sellRamAction);

    /*
    EOS：赎回
     */
    public native String eosRefund(JTransactionSignParams signParams, JNetParams jnetParams, JRefundAction refundAction);

    /*
    EOS：新建账户
     */
    public native String eosNewAccount(JTransactionSignParams signParams, JNetParams jnetParams, JNewAccountAction newAccountAction, JBuyRamBytesAction buyRamBytesAction, JDelegateBwAction delegateBwAction);

    /*
    EOS：修改权限
     */
    public native String eosUpdateAuth(JTransactionSignParams signParams, JNetParams jnetParams, JUpdateAuthAction updateAuthAction);

    /*
    EOS：删除权限
     */
    public native String eosDeleteAuth(JTransactionSignParams signParams, JNetParams jnetParams, JDeleteAuthAction deleteAuthAction);

    /*
    BTS：估算Memo大小
     */
    public native int estimateMemoSize(JMemoData memoData, String addressPrefix);

    /*
    生成Usdt script数据
    */
    public native byte[] getUsdtContract(long propertyId, long amount);

    /*
    消息签名
    */
    public native Map signMessage(String jpriKey, byte[] message, JNetParams jnetParams);

    /*
    验证签名
     */
    public native boolean verifySign(String jpubKey, String jhash, String jsignature, JNetParams jnetParams);

    /*
    创建多地址签名交易
    */
    public native Map createMultiAddrSignTransaction(JMultiAddrBtcTransactionSignParams multiAddrSignParams, JNetParams jnetParams);

    /*
    根据公钥，获取地址
    */
    public native String getAddressFromPubKey(String pubkey, JNetParams netParams);

    /*
    一次获取多种币种主公钥，主私钥
    */
    public native List<JHdKeys> getMultiHdKeyFromBtSeed(JBtSeed jbtSeed, String jpassword, List<JNetParams> jnetParamsList);

    /*
    EOS：验证私钥有效性
    */
    public native boolean validateWif(String jpriKey, JNetParams jnetParams);

    /*
    验证密码
    */
    public native boolean verifyPassword(JBtSeed jbtSeed, String password);

    /*
    lbtc注册V2
    */
    public native byte[] getLbtcRegisterV2(byte[] name);

    /*
     lbtc投票V2
     */
    public native byte[] getLbtcVoteV2(List<String> voteAddressList);

    /*
     lbtc取消投票V2
     */
    public native byte[] getLbtcCancelVoteV2(List<String> voteAddressList);

    /*
    根据 加密种子获取 解密后的3级主私钥和主公钥
    */
    public native Map get3LevelHdKeyFromBtSeed(JBtSeed jbtSeed, String jpassword, JNetParams jnetParams);

    /*
     根据 3级主公钥和path，获取地址
     */
    public native String getAddressFrom3LevelMasterPubKey(String masterPubkey, JNetParams netParams);

    /*
     根据 3级主私钥和path，获取私钥
     */
    public  native String getPriKeyFrom3LevelMasterPriKey(String masterPrikey, JNetParams netParams);

    /*
    根据 3级主公钥和path，获取公钥
    */
    public native String getPubKeyFrom3LevelMasterPubKey(String masterPubkey, JNetParams netParams);

    /*
    创建多地址签名交易(全部转出)
    */
    public native Map createSpecialMultiAddrSignTransaction(JMultiAddrSpecialBtcTransactionSignParams multiAddrSignParams, JNetParams jnetParams);

    /*
    估算btc手续费
    */
    public native String estimateFees(JMultiAddrBtcTransactionSignParams multiAddrSignParams, JNetParams jnetParams);

    /*
    一次创建一个地址(可以选择地址格式)
    */
    public native JBtWallet createWalletV2(String words, String password, JNetParamsV2 jnetParams);

    /*
    一次创建多种币种钱包(可以选择地址格式)
    */
    public native List<JBtWallet> createWalletsV2(String words, String password, List<JNetParamsV2> jnetParamsList);

    /*
    创建多地址签名交易(兼容P2SH segwit,只支持btc, ltc, bhd 16.0以上版本)
    */
    public native Map createMultiAddrSignTransactionV2(JMultiAddrBtcTransactionSignParams multiAddrSignParams, JNetParamsV2 jnetParams);

    /*
    创建签名交易(兼容P2SH 1:1 multi sign)
    */
    public native Map createSignTransactionV2(JTransactionSignParams signParams, JNetParams jnetParams);

    /*
    创建Omni多地址签名交易
    */
    public native Map createOmniMultiAddrSignTransaction(JMultiAddrBtcTransactionSignParams multiAddrSignParams, JNetParams jnetParams, int height);

    /*
    Omni多签：获取原始未签名交易
    */
    public native Map multiOmniGetUnsignedTransaction(JMultiAddrBtcTransactionSignParams multiAddrSignParams, JNetParams jnetParams);

    /*
    Omni多签：用私钥签名原始交易
     */
    public native Map multiOmniSign(String hex, String prikey, int startIndex, int indexCount, JNetParams jnetParams);

    /*
    Omni多签：获取签名交易
     */
    public native Map multiOmniGetSignedTransaction(String hex, Map< Integer, String > signs, JNetParams jnetParams);

    public long commCoinRef = 0;
}
