package com.study.work;

import com.study.utils.DateFormat;
import com.study.utils.Gender;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 * @version V1.0
 * @Description:
 * @author: h'mm
 * @date: 2020-10-06 14:58
 */
public class TransRecord implements Comparable<TransRecord>, Serializable {
    private String userId;
    private String userName;
    private String mechanismId;
    private Gender gender;
    private String account;
    private Date happenDate;
    private BigDecimal dealMoney;

    public TransRecord() {
    }

    public TransRecord(String userId, String userName, String mechanismId, Gender gender, String account, Date happenDate, BigDecimal dealMoney) {

        this.userId = userId;
        this.userName = userName;
        this.mechanismId = mechanismId;
        this.gender = gender;
        this.account = account;
        this.happenDate = happenDate;
        this.dealMoney = dealMoney;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }


    public String getMechanismId() {
        return mechanismId;
    }

    public void setMechanismId(String mechanismId) {
        this.mechanismId = mechanismId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransRecord that = (TransRecord) o;
        return Objects.equals(dealMoney, that.dealMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dealMoney);
    }


    @Override
    public int compareTo(TransRecord o) {
        int code = this.dealMoney.compareTo(o.dealMoney);
        if (code == 0) {
            code = this.userName.compareTo(o.userName);
        }
        return code;
    }

    @Override
    public String toString() {
        return "TransRecord{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", happenDate=" + DateFormat.SIMPLE_DATE_FORMAT.format(happenDate) +
                ", dealMoney=" + dealMoney +
                '}';
    }
}
