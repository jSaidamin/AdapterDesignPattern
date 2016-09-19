package adapterpaternapp;

/**
 *
 * @author Saidamin
 */
public interface NewXPay {
    
    public String getCustCardNo();
    public void setCustCardNo(String custCardNo);
    
    public String getCardOwnerName();
    public void setCardOwnerName(String cardOwnerName);
    
    public String getCardExpMonthAndYear();
    public void setCardExpMonthAndYear(String cardExpMonthAndYear);
    
    public Integer getCVVNo();
    public void setCVVNo(Integer cVVNo);
    
    public Double getTotalAmount();
    public void setTotalAmount(Double totalAmount);    
}
