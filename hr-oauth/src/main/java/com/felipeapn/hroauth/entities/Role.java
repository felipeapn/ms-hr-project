package com.felipeapn.hroauth.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {

    private static  final  long serialVersionUid = 1l;

    private Long id;
    private String roleName;

}
