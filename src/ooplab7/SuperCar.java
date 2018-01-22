package ooplab7;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar () {}
    public SuperCar (String cb,String cc,String ce,String ms,String ct) {
        this.carbrand = cb;
        this.carcolor = cc;
        this.carenginesize = ce;
        this.maxspeed = ms;
        this.countryoforigin = ct;
    }//constructor
    //getter and setter methods


    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }
}//class
