package com.billing.entities;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.*;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.*;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseClass<U> {
    
    @CreatedBy
    @Column(name="created_by")
    private U CreatedBy;

    @CreatedDate
    @Column(name="created_date")
    private Date createdDate;

    @LastModifiedBy
    @Column(name="updated_by")
    private U updatedBy;

    @LastModifiedDate
    @Column(name="updated_date")
    private Date updatedDate;
}