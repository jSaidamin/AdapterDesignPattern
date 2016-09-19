package adapterpaternapp;

/**
 *
 * @author Saidamin
 */
public class XPayToNewXPayAdapter implements NewXPay {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthAndYear;
    private Integer cVVNo;
    private Double totalAmount;
    
    private final XPay xpay;

    
    public XPayToNewXPayAdapter(XPay xpay) {
        this.xpay = xpay;
        setProperties();
    }

    
    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthAndYear() {
        return cardExpMonthAndYear;
    }

    @Override
    public void setCardExpMonthAndYear(String cardExpMonthAndYear) {
        this.cardExpMonthAndYear = cardExpMonthAndYear;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }


    
    
    private void setProperties() {
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardExpMonthAndYear(this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount(this.xpay.getAmount());
    }    
}
