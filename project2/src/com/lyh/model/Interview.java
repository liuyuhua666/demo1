package com.lyh.model;

import java.io.Serializable;

public class Interview implements Serializable{
    private int i_id;//��
    private String i_cname;//��Ӧcompany��
    private int i_gid;//��Ӧguest��
    private String i_interviewtime;//����ʱ��
    private String i_interviewaddress;//���Եص�
    private int i_rmid;//��Ӧ��recruitment��
    private int i_gstatus;//��ְ��ȷ��״̬��0û�� 1���� 2ȷ�ϣ�
    private String i_result;//���Խ����������Ա��ʱ�����ƣ�
    private String i_jname;//��Ӧjobְλ��

    public Interview() {
    }

    public Interview(int i_id, String i_cname, int i_gid, String i_interviewtime, String i_interviewaddress,
                     int i_rmid, int i_gstatus, String i_result,String i_jname) {
        this.i_id = i_id;
        this.i_cname = i_cname;
        this.i_gid = i_gid;
        this.i_interviewtime = i_interviewtime;
        this.i_interviewaddress = i_interviewaddress;
        this.i_rmid = i_rmid;
        this.i_gstatus = i_gstatus;
        this.i_result = i_result;
        this.i_jname = i_jname;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public String getI_cname() {
        return i_cname;
    }

    public void setI_cname(String i_cid) {
        this.i_cname = i_cid;
    }

    public int getI_gid() {
        return i_gid;
    }

    public void setI_gid(int i_gid) {
        this.i_gid = i_gid;
    }

    public String getI_interviewtime() {
        return i_interviewtime;
    }

    public void setI_interviewtime(String i_interviewtime) {
        this.i_interviewtime = i_interviewtime;
    }

    public String getI_interviewaddress() {
        return i_interviewaddress;
    }

    public void setI_interviewaddress(String i_interviewaddress) {
        this.i_interviewaddress = i_interviewaddress;
    }

    public int getI_rmid() {
        return i_rmid;
    }

    public void setI_rmid(int i_rmid) {
        this.i_rmid = i_rmid;
    }

    public int getI_gstatus() {
        return i_gstatus;
    }

    public void setI_gstatus(int i_gstatus) {
        this.i_gstatus = i_gstatus;
    }

    public String getI_result() {
        return i_result;
    }

    public void setI_result(String i_result) {
        this.i_result = i_result;
    }

    public String getI_jname() {
        return i_jname;
    }

    public void setI_jname(String i_jname) {
        this.i_jname = i_jname;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "i_id=" + i_id +
                ", i_cname='" + i_cname + '\'' +
                ", i_gid=" + i_gid +
                ", i_interviewtime='" + i_interviewtime + '\'' +
                ", i_interviewaddress='" + i_interviewaddress + '\'' +
                ", i_rmid=" + i_rmid +
                ", i_gstatus=" + i_gstatus +
                ", i_result='" + i_result + '\'' +
                ", i_jname='" + i_jname + '\'' +
                '}';
    }
}
