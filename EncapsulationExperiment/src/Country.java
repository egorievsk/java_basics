public class Country {
    public String name;
    public int countPeople;
    public double squareCountry;
    public String nameMetropolis;
    public boolean IsExistSea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public double getSquareCountry() {
        return squareCountry;
    }

    public void setSquareCountry(double squareCountry) {
        this.squareCountry = squareCountry;
    }

    public String getNameMetropolis() {
        return nameMetropolis;
    }

    public void setNameMetropolis(String nameMetropolis) {
        this.nameMetropolis = nameMetropolis;
    }

    public boolean isExistSea() {
        return IsExistSea;
    }

    public void setExistSea(boolean existSea) {
        IsExistSea = existSea;
    }

    public Country(String name) {
        this.name = name;
    }



}
