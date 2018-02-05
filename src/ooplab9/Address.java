package ooplab9;

public class Address {
    private String homenumber;
    private String privince;
    private String postcode;

    public Address(String homenumber, String privince, String postcode) {
        this.homenumber = homenumber;
        this.privince = privince;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homenumber='" + homenumber + '\'' +
                ", privince='" + privince + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public String getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(String homenumber) {
        this.homenumber = homenumber;
    }

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}//class
