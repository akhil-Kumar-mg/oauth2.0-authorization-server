package com.devOrg.authenticationservice.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "updated_by")
    private String updatedBy;

    public BaseEntity() {
    }

    public BaseEntity(Date createdOn, String createdBy, Date updatedOn, String updatedBy) {
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }
}
