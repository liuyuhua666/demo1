package com.lyh.model;

import java.io.Serializable;

public class Guest implements Serializable{
    private int g_id;//����
    private String g_name;//�û���
    private String g_password;//����
    private int g_applicationstatus;//����״̬ 0û�� 1��������Ϣ 2��¼ȡ��������Ͷ������

    public Guest() {
    }

    public Guest(int g_id, String g_name, String g_password, int g_applicationstatus) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_password = g_password;
        this.g_applicationstatus = g_applicationstatus;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_password() {
        return g_password;
    }

    public void setG_password(String g_password) {
        this.g_password = g_password;
    }

    public int getG_applicationstatus() {
        return g_applicationstatus;
    }

    public void setG_applicationstatus(int g_applicationstatus) {
        this.g_applicationstatus = g_applicationstatus;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                ", g_password='" + g_password + '\'' +
                ", g_applicationstatus=" + g_applicationstatus +
                '}';
    }
}
