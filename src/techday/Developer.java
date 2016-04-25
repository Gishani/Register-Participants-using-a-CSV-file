/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techday;

/**
 *
 * @author gishanir
 */
public class Developer implements Comparable<Developer>{
    private String emailId;
    private String name;
    private int designation;
    private String product;
    //private boolean registration;
    private int registartionNo;
    private int group;
    private String next;

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return the designation
     */
    public int getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(int designation) {
        this.designation = designation;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    
    /*public boolean getRegistration() {
        return registration;
    }

  
    public void setRegistration(boolean registration) {
        this.registration = registration;
    }*/

   
    public int getGroup() {
        return group;
    }

  
    public void setGroup(int group) {
        this.group = group;
    }

    
    public String getNext() {
        return next;
    }

    
    public void setNext(String next) {
        this.next = next;
    }

    
     @Override
     public int compareTo(Developer dev) {
        return ((this.getDesignation() < dev.getDesignation()) ? -1: (this.getDesignation()> dev.getDesignation() ) ? 1:0) ;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the registartionNo
     */
    public int getRegistartionNo() {
        return registartionNo;
    }

    /**
     * @param registartionNo the registartionNo to set
     */
    public void setRegistartionNo(int registartionNo) {
        this.registartionNo = registartionNo;
    }
}
