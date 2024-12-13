public class Country {
    private String nameCountry;
    private int amountPeoples;
    private double square;
    private String capital;
    private boolean isExitToSea;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

//    public Country(String nameCountry, String capital, boolean isExitToSea) {
//        this.nameCountry = nameCountry;
//        this.capital = capital;
//        this.isExitToSea = isExitToSea;
//    }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getCapital() {
        return capital;
    }

    public Boolean getIsExitToSea() {
        return isExitToSea;
    }

    public int getAmountPeoples() {
        return amountPeoples;
    }

    public double getSquare() {
        return square;
    }

    public void setNameCountry (String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setIsExitToSea(Boolean isExitToSea) {
        this.isExitToSea = isExitToSea;
    }

    public void setAmountPeoples(int amountPeoples) {
        this.amountPeoples = amountPeoples;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
