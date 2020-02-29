public class Stock {
    private String stoc;
    private String simbol;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String stoc, double closingPrice, double currentPrice) {
        this.simbol = simbol;
        this.stoc = stoc;
        this.closingPrice = closingPrice;
        this.currentPrice = currentPrice;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getStoc() {
        return stoc;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangedPercent(){
        this.currentPrice = currentPrice;
        this.closingPrice= closingPrice;
        return currentPrice;
        //aici stiu ca nu e bine dar nu stiu cum ar trebui sa fac
    }
}
