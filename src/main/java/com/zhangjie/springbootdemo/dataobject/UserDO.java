package com.zhangjie.springbootdemo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jason
 */
@Entity
@Data
public class UserDO {
    @Id
    private String name;
}
