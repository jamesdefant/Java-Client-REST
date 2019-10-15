package model;

import java.io.Serializable;


/**
 * The persistent class for the agencies database table.
 *
 */

public class Agency implements Serializable {
    private static final long serialVersionUID = 1L;

    private int agencyId;

    private String agncyAddress;

    private String agncyCity;

    private String agncyCountry;

    private String agncyFax;

    private String agncyPhone;

    private String agncyPostal;

    private String agncyProv;

    public Agency() {
    }

    public int getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgncyAddress() {
        return this.agncyAddress;
    }

    public void setAgncyAddress(String agncyAddress) {
        this.agncyAddress = agncyAddress;
    }

    public String getAgncyCity() {
        return this.agncyCity;
    }

    public void setAgncyCity(String agncyCity) {
        this.agncyCity = agncyCity;
    }

    public String getAgncyCountry() {
        return this.agncyCountry;
    }

    public void setAgncyCountry(String agncyCountry) {
        this.agncyCountry = agncyCountry;
    }

    public String getAgncyFax() {
        return this.agncyFax;
    }

    public void setAgncyFax(String agncyFax) {
        this.agncyFax = agncyFax;
    }

    public String getAgncyPhone() {
        return this.agncyPhone;
    }

    public void setAgncyPhone(String agncyPhone) {
        this.agncyPhone = agncyPhone;
    }

    public String getAgncyPostal() {
        return this.agncyPostal;
    }

    public void setAgncyPostal(String agncyPostal) {
        this.agncyPostal = agncyPostal;
    }

    public String getAgncyProv() {
        return this.agncyProv;
    }

    public void setAgncyProv(String agncyProv) {
        this.agncyProv = agncyProv;
    }

    @Override
    public String toString() {
        return "Agency [agencyId=" + agencyId + ", agncyAddress=" + agncyAddress + ", agncyCity=" + agncyCity
                + ", agncyCountry=" + agncyCountry + ", agncyFax=" + agncyFax + ", agncyPhone=" + agncyPhone
                + ", agncyPostal=" + agncyPostal + ", agncyProv=" + agncyProv + "]";
    }

}