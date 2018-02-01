package com.lyh.model;

import java.io.Serializable;

public class PersonalRecruitment implements Serializable{
    private int prm_id;
    private String prm_cname;//对应的公司
    private String prm_dname;//对应的部门
    private String prm_jname;//对应的职位
    private int prm_money;//职位工资
    private String prm_workplace;//工作地点
    private int prm_gid;//对应guest表

    public PersonalRecruitment() {
    }

    public PersonalRecruitment(int prm_id, String prm_cname, String prm_dname, String prm_jname, int prm_money, String prm_workplace, int prm_gid) {
        this.prm_id = prm_id;
        this.prm_cname = prm_cname;
        this.prm_dname = prm_dname;
        this.prm_jname = prm_jname;
        this.prm_money = prm_money;
        this.prm_workplace = prm_workplace;
        this.prm_gid = prm_gid;
    }

    public int getPrm_id() {
        return prm_id;
    }

    public void setPrm_id(int prm_id) {
        this.prm_id = prm_id;
    }

    public String getPrm_cname() {
        return prm_cname;
    }

    public void setPrm_cname(String prm_cname) {
        this.prm_cname = prm_cname;
    }

    public String getPrm_dname() {
        return prm_dname;
    }

    public void setPrm_dname(String prm_dname) {
        this.prm_dname = prm_dname;
    }

    public String getPrm_jname() {
        return prm_jname;
    }

    public void setPrm_jname(String prm_jname) {
        this.prm_jname = prm_jname;
    }

    public int getPrm_money() {
        return prm_money;
    }

    public void setPrm_money(int prm_money) {
        this.prm_money = prm_money;
    }

    public String getPrm_workplace() {
        return prm_workplace;
    }

    public void setPrm_workplace(String prm_workplace) {
        this.prm_workplace = prm_workplace;
    }

    public int getPrm_gid() {
        return prm_gid;
    }

    public void setPrm_gid(int prm_gid) {
        this.prm_gid = prm_gid;
    }

    @Override
    public String toString() {
        return "PersonalRecruitment{" +
                "prm_id=" + prm_id +
                ", prm_cname='" + prm_cname + '\'' +
                ", prm_dname='" + prm_dname + '\'' +
                ", prm_jname='" + prm_jname + '\'' +
                ", prm_money=" + prm_money +
                ", prm_workplace='" + prm_workplace + '\'' +
                ", prm_gid=" + prm_gid +
                '}';
    }
}
