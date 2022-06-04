class accounting{
    public double valueOfSupply;
    public double vatRate = 0.1;
    public accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class accountingAPP {
    public static void main(String[] args) {
    	accounting a1 = new accounting(10000.0);
        	accounting a2 = new accounting(20000.0);
    
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
 
    }
 
}