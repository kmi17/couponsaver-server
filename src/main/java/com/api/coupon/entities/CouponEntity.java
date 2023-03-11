package com.api.coupon.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CouponEntity {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "company_name")
    @JsonProperty("company_name")
    private String companyName;
    @Column(name = "expires_on")
    @JsonProperty("expires_on")
    private Date expiresOn;
    @Column(name = "valid_from")
    @JsonProperty("valid_from")
    private Date validFrom;
    private String code;

    protected CouponEntity() {}

    public CouponEntity(String companyName, Date expiresOn, Date validFrom, String code) {
        this.companyName = companyName;
        this.expiresOn = expiresOn;
        this.validFrom = validFrom;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(Date expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
