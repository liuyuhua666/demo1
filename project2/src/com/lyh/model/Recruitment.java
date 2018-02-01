package com.lyh.model;

import java.io.Serializable;

public class Recruitment implements Serializable{
    private int rm_id;//
    private String rm_cname;//��Ӧ�Ĺ�˾����
    private String rm_dname;//��Ӧ�Ĳ�������
    private String rm_jname;//��Ӧ��ְλ����
    private int rm_peopleneeded;//���������
    private String rm_requirements;//rm_requirement ְλ����
    private int rm_money;//ְλ����
    private String rm_workplace;//�����ص�
    private int rm_gid;//��Ӧ��ӦƸ��

    public Recruitment() {
    }

    public Recruitment(int rm_id, String rm_cname, String rm_dname, String rm_jname, int rm_peopleneeded, String rm_requirements, int rm_money, String rm_workplace, int rm_gid) {
        this.rm_id = rm_id;
        this.rm_cname = rm_cname;
        this.rm_dname = rm_dname;
        this.rm_jname = rm_jname;
        this.rm_peopleneeded = rm_peopleneeded;
        this.rm_requirements = rm_requirements;
        this.rm_money = rm_money;
        this.rm_workplace = rm_workplace;
        this.rm_gid = rm_gid;
    }

    public int getRm_id() {
        return rm_id;
    }

    public void setRm_id(int rm_id) {
        this.rm_id = rm_id;
    }

    public String getRm_cname() {
        return rm_cname;
    }

    public void setRm_cname(String rm_cname) {
        this.rm_cname = rm_cname;
    }

    public String getRm_dname() {
        return rm_dname;
    }

    public void setRm_dname(String rm_dname) {
        this.rm_dname = rm_dname;
    }

    public String getRm_jname() {
        return rm_jname;
    }

    public void setRm_jname(String rm_jname) {
        this.rm_jname = rm_jname;
    }

    public int getRm_peopleneeded() {
        return rm_peopleneeded;
    }

    public void setRm_peopleneeded(int rm_peopleneeded) {
        this.rm_peopleneeded = rm_peopleneeded;
    }

    public String getRm_requirements() {
        return rm_requirements;
    }

    public void setRm_requirements(String rm_requirements) {
        this.rm_requirements = rm_requirements;
    }

    public int getRm_money() {
        return rm_money;
    }

    public void setRm_money(int rm_money) {
        this.rm_money = rm_money;
    }

    public String getRm_workplace() {
        return rm_workplace;
    }

    public void setRm_workplace(String rm_workplace) {
        this.rm_workplace = rm_workplace;
    }

    public int getRm_gid() {
        return rm_gid;
    }

    public void setRm_gid(int rm_gid) {
        this.rm_gid = rm_gid;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "rm_id=" + rm_id +
                ", rm_cname=" + rm_cname +
                ", rm_dname=" + rm_dname +
                ", rm_jname=" + rm_jname +
                ", rm_peopleneeded=" + rm_peopleneeded +
                ", rm_requirements='" + rm_requirements + '\'' +
                ", rm_money=" + rm_money +
                ", rm_workplace='" + rm_workplace + '\'' +
                ", rm_gid=" + rm_gid +
                '}';
    }
}
