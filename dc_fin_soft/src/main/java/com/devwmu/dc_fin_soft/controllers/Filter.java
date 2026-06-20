package com.devwmu.dc_fin_soft.controllers;

public class Filter{
    private String col;
    private String op;
    private Object val;

    public String getCol(){
        return this.col;
    }

    public String getOp(){
        return this.op;
    }

    public Object getVal(){
        return this.val;
    }

}