package model;

import java.io.Serializable;



/**
 * The persistent class for the agents database table.
 *
 */

public class Agent implements Serializable {
    private static final long serialVersionUID = 1L;


    private int agentId;

    private Integer agencyId;

    private String agtBusPhone;

    private String agtEmail;

    private String agtFirstName;

    private String agtLastName;

    private String agtMiddleInitial;

    private String agtPosition;

    public Agent() {
    }

    public int getAgentId() {
        return this.agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public Integer getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgtBusPhone() {
        return this.agtBusPhone;
    }

    public void setAgtBusPhone(String agtBusPhone) {
        this.agtBusPhone = agtBusPhone;
    }

    public String getAgtEmail() {
        return this.agtEmail;
    }

    public void setAgtEmail(String agtEmail) {
        this.agtEmail = agtEmail;
    }

    public String getAgtFirstName() {
        return this.agtFirstName;
    }

    public void setAgtFirstName(String agtFirstName) {
        this.agtFirstName = agtFirstName;
    }

    public String getAgtLastName() {
        return this.agtLastName;
    }

    public void setAgtLastName(String agtLastName) {
        this.agtLastName = agtLastName;
    }

    public String getAgtMiddleInitial() {
        return this.agtMiddleInitial;
    }

    public void setAgtMiddleInitial(String agtMiddleInitial) {
        this.agtMiddleInitial = agtMiddleInitial;
    }

    public String getAgtPosition() {
        return this.agtPosition;
    }

    public void setAgtPosition(String agtPosition) {
        this.agtPosition = agtPosition;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId=" + agentId +
                ", agencyId=" + agencyId +
                ", agtBusPhone='" + agtBusPhone + '\'' +
                ", agtEmail='" + agtEmail + '\'' +
                ", agtFirstName='" + agtFirstName + '\'' +
                ", agtLastName='" + agtLastName + '\'' +
                ", agtMiddleInitial='" + agtMiddleInitial + '\'' +
                ", agtPosition='" + agtPosition + '\'' +
                '}';
    }
}