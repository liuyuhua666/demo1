package com.lyh.model;

import java.io.Serializable;

public class Employee implements Serializable{
    private int e_id;//��
    private String e_name;//�û���
    private String e_password;//����
    private String e_realname;//��ʵ����
    private int e_age;//����
    private String e_ethnicity;//����
    private int e_phone;//�绰
    private String e_marrige;//����״̬
    private String e_address;//��ַ
    private String e_hiretime;//��ְʱ��
    private String e_cname;//��˾
    private String e_dname;//����
    private String e_jname;//ְλ
    private int e_basicwage;//��������
    private String e_workstarttime;//�ϰ�ʱ��
    private String e_workendtime;//�°�ʱ��
    private int e_workstatus;//״̬��0��ְʱֻ�ɲ鿴 1���� 2��ְ��

    public Employee() {
    }

    public Employee(int e_id, String e_name, String e_password, String e_realname,
                    int e_age, String e_ethnicity, int e_phone, String e_marrige,
                    String e_address, String e_hiretime, String e_cname, String e_dname,
                    String e_jname, int e_basicwage, String e_workstarttime,
                    String e_workendtime, int e_workstatus) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_password = e_password;
        this.e_realname = e_realname;
        this.e_age = e_age;
        this.e_ethnicity = e_ethnicity;
        this.e_phone = e_phone;
        this.e_marrige = e_marrige;
        this.e_address = e_address;
        this.e_hiretime = e_hiretime;
        this.e_cname = e_cname;
        this.e_dname = e_dname;
        this.e_jname = e_jname;
        this.e_basicwage = e_basicwage;
        this.e_workstarttime = e_workstarttime;
        this.e_workendtime = e_workendtime;
        this.e_workstatus = e_workstatus;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }

    public String getE_realname() {
        return e_realname;
    }

    public void setE_realname(String e_realname) {
        this.e_realname = e_realname;
    }

    public int getE_age() {
        return e_age;
    }

    public void setE_age(int e_age) {
        this.e_age = e_age;
    }

    public String getE_ethnicity() {
        return e_ethnicity;
    }

    public void setE_ethnicity(String e_ethnicity) {
        this.e_ethnicity = e_ethnicity;
    }

    public int getE_phone() {
        return e_phone;
    }

    public void setE_phone(int e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_marrige() {
        return e_marrige;
    }

    public void setE_marrige(String e_marrige) {
        this.e_marrige = e_marrige;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_hiretime() {
        return e_hiretime;
    }

    public void setE_hiretime(String e_hiretime) {
        this.e_hiretime = e_hiretime;
    }

    public String getE_cname() {
        return e_cname;
    }

    public void setE_cname(String e_cname) {
        this.e_cname = e_cname;
    }

    public String getE_dname() {
        return e_dname;
    }

    public void setE_dname(String e_dname) {
        this.e_dname = e_dname;
    }

    public String getE_jname() {
        return e_jname;
    }

    public void setE_jname(String e_jname) {
        this.e_jname = e_jname;
    }

    public int getE_basicwage() {
        return e_basicwage;
    }

    public void setE_basicwage(int e_basicwage) {
        this.e_basicwage = e_basicwage;
    }

    public String getE_workstarttime() {
        return e_workstarttime;
    }

    public void setE_workstarttime(String e_workstarttime) {
        this.e_workstarttime = e_workstarttime;
    }

    public String getE_workendtime() {
        return e_workendtime;
    }

    public void setE_workendtime(String e_workendtime) {
        this.e_workendtime = e_workendtime;
    }

    public int getE_workstatus() {
        return e_workstatus;
    }

    public void setE_workstatus(int e_workstatus) {
        this.e_workstatus = e_workstatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                ", e_password='" + e_password + '\'' +
                ", e_realname='" + e_realname + '\'' +
                ", e_age=" + e_age +
                ", e_ethnicity='" + e_ethnicity + '\'' +
                ", e_phone=" + e_phone +
                ", e_marrige='" + e_marrige + '\'' +
                ", e_address='" + e_address + '\'' +
                ", e_hiretime='" + e_hiretime + '\'' +
                ", e_cname='" + e_cname + '\'' +
                ", e_dname='" + e_dname + '\'' +
                ", e_jname='" + e_jname + '\'' +
                ", e_basicwage=" + e_basicwage +
                ", e_workstarttime='" + e_workstarttime + '\'' +
                ", e_workendtime='" + e_workendtime + '\'' +
                ", e_workstatus=" + e_workstatus +
                '}';
    }
}
