package mbg.test.mb3.generated.dsql.miscellaneous.model;

import java.util.Date;
import javax.annotation.Generated;
import mbg.test.common.BaseClass;
import mbg.test.common.FirstName;
import mbg.test.common.MyTime;

public class MyObject extends BaseClass {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private FirstName firstname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date startDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private MyTime timefield;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date timestampfield;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private int decimal60field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long decimal100field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Double decimal155field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer wierdField;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date birthDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String stringboolean;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId2() {
        return id2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId1() {
        return id1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public FirstName getFirstname() {
        return firstname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFirstname(FirstName firstname) {
        this.firstname = firstname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getStartDate() {
        return startDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public MyTime getTimefield() {
        return timefield;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTimefield(MyTime timefield) {
        this.timefield = timefield;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getTimestampfield() {
        return timestampfield;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTimestampfield(Date timestampfield) {
        this.timestampfield = timestampfield;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int getDecimal60field() {
        return decimal60field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDecimal60field(int decimal60field) {
        this.decimal60field = decimal60field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getDecimal100field() {
        return decimal100field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDecimal100field(Long decimal100field) {
        this.decimal100field = decimal100field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Double getDecimal155field() {
        return decimal155field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDecimal155field(Double decimal155field) {
        this.decimal155field = decimal155field;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getWierdField() {
        return wierdField;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWierdField(Integer wierdField) {
        this.wierdField = wierdField;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getBirthDate() {
        return birthDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStringboolean() {
        return stringboolean;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStringboolean(String stringboolean) {
        this.stringboolean = stringboolean == null ? null : stringboolean.trim();
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
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
        MyObject other = (MyObject) that;
        return (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getTimefield() == null ? other.getTimefield() == null : this.getTimefield().equals(other.getTimefield()))
            && (this.getTimestampfield() == null ? other.getTimestampfield() == null : this.getTimestampfield().equals(other.getTimestampfield()))
            && (this.getDecimal60field() == other.getDecimal60field())
            && (this.getDecimal100field() == null ? other.getDecimal100field() == null : this.getDecimal100field().equals(other.getDecimal100field()))
            && (this.getDecimal155field() == null ? other.getDecimal155field() == null : this.getDecimal155field().equals(other.getDecimal155field()))
            && (this.getWierdField() == null ? other.getWierdField() == null : this.getWierdField().equals(other.getWierdField()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getStringboolean() == null ? other.getStringboolean() == null : this.getStringboolean().equals(other.getStringboolean()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getTimefield() == null) ? 0 : getTimefield().hashCode());
        result = prime * result + ((getTimestampfield() == null) ? 0 : getTimestampfield().hashCode());
        result = prime * result + getDecimal60field();
        result = prime * result + ((getDecimal100field() == null) ? 0 : getDecimal100field().hashCode());
        result = prime * result + ((getDecimal155field() == null) ? 0 : getDecimal155field().hashCode());
        result = prime * result + ((getWierdField() == null) ? 0 : getWierdField().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getStringboolean() == null) ? 0 : getStringboolean().hashCode());
        return result;
    }
}