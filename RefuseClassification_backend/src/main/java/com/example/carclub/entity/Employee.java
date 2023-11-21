package com.example.carclub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 
     */
    @TableId
    private String Enum;

    /**
     * 
     */
    private String ename;

    /**
     * 
     */
    private String esex;

    /**
     * 
     */
    private Integer eage;

    /**
     * 
     */
    private String telephone;

    /**
     * 
     */
    private String depnum;

    /**
     * 
     */
    private String epower;

    /**
     * 
     */
    private String user;

    /**
     * 
     */
    private String password;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getEnum() == null ? other.getEnum() == null : this.getEnum().equals(other.getEnum()))
            && (this.getEname() == null ? other.getEname() == null : this.getEname().equals(other.getEname()))
            && (this.getEsex() == null ? other.getEsex() == null : this.getEsex().equals(other.getEsex()))
            && (this.getEage() == null ? other.getEage() == null : this.getEage().equals(other.getEage()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getDepnum() == null ? other.getDepnum() == null : this.getDepnum().equals(other.getDepnum()))
            && (this.getEpower() == null ? other.getEpower() == null : this.getEpower().equals(other.getEpower()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEnum() == null) ? 0 : getEnum().hashCode());
        result = prime * result + ((getEname() == null) ? 0 : getEname().hashCode());
        result = prime * result + ((getEsex() == null) ? 0 : getEsex().hashCode());
        result = prime * result + ((getEage() == null) ? 0 : getEage().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getDepnum() == null) ? 0 : getDepnum().hashCode());
        result = prime * result + ((getEpower() == null) ? 0 : getEpower().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enum=").append(Enum);
        sb.append(", ename=").append(ename);
        sb.append(", esex=").append(esex);
        sb.append(", eage=").append(eage);
        sb.append(", telephone=").append(telephone);
        sb.append(", depnum=").append(depnum);
        sb.append(", epower=").append(epower);
        sb.append(", user=").append(user);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}