/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpaternapp;

/**
 *
 * @author Saidamin
 */
public class AdapterPaternApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        XPay xpay = new XPayImpl();
        
        xpay.setCreditCardNo("0123456789012345");
        xpay.setCustomerName("Shrek Fiona");
        xpay.setCardExpMonth("02");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)123);
        xpay.setAmount(1000.01);
        
        NewXPay newXPay = new XPayToNewXPayAdapter(xpay);
        testNewXPay(newXPay);
    }
    
    private static void testNewXPay(NewXPay newXPay){
        System.out.println(newXPay.getCardOwnerName());
        System.out.println(newXPay.getCustCardNo());
        System.out.println(newXPay.getCardExpMonthAndYear());
        System.out.println(newXPay.getCVVNo());
        System.out.println(newXPay.getTotalAmount());
    }    
}
