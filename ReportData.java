public class ReportData {

    private String selectionName;
    private String currency;
    private double numBets;
    private double totalStakes;
    private double totalLiability;


    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getNumBets() {
        return numBets;
    }

    public void setNumBets(double numBets) {
        this.numBets = numBets;
    }

    public double getTotalStakes() {
        return totalStakes;
    }

    public void setTotalStakes(double totalStakes) {
        this.totalStakes = totalStakes;
    }

    public double getTotalLiability() {
        return totalLiability;
    }

    public void setTotalLiability(double totalLiability) {
        this.totalLiability = totalLiability;
    }

    @Override
    public String toString() {
        return "" +
                "Selection Name:" +" " + selectionName  + ", "+
                "Currency:" + " " + currency + ", " +
                "Num Bets:" + " " + numBets + ", " +
                "Total Stakes:" + " " + totalStakes + ", " +
                "Total Liability:" + " " + totalLiability;
    }

}
