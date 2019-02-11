package com.example.demo;

public class simplePOJO implements java.io.Serializable {
   private String clientName;
   private String clientAddress;
   private int clientNumber;
   private String clientEmail;

    public String getCleintName() {
        return clientName;
    }

    public void setCleintName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }


}

