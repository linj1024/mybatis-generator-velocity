package mbg.test.mb3.generated.mixed.miscellaneous.model;

import java.util.Date;
import mbg.test.common.FirstName;
import mbg.test.common.MyTime;

public class MyObject extends MyObjectKey {
    private FirstName firstname;

    private Date startDate;

    private MyTime timefield;

    private Date timestampfield;

    private int decimal60field;

    private Long decimal100field;

    private Double decimal155field;

    private Integer wierdField;

    private Date birthDate;

    private String stringboolean;

    public FirstName getFirstname() {
        return firstname;
    }

    public void setFirstname(FirstName firstname) {
        this.firstname = firstname;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public MyTime getTimefield() {
        return timefield;
    }

    public void setTimefield(MyTime timefield) {
        this.timefield = timefield;
    }

    public Date getTimestampfield() {
        return timestampfield;
    }

    public void setTimestampfield(Date timestampfield) {
        this.timestampfield = timestampfield;
    }

    public int getDecimal60field() {
        return decimal60field;
    }

    public void setDecimal60field(int decimal60field) {
        this.decimal60field = decimal60field;
    }

    public Long getDecimal100field() {
        return decimal100field;
    }

    public void setDecimal100field(Long decimal100field) {
        this.decimal100field = decimal100field;
    }

    public Double getDecimal155field() {
        return decimal155field;
    }

    public void setDecimal155field(Double decimal155field) {
        this.decimal155field = decimal155field;
    }

    public Integer getWierdField() {
        return wierdField;
    }

    public void setWierdField(Integer wierdField) {
        this.wierdField = wierdField;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getStringboolean() {
        return stringboolean;
    }

    public void setStringboolean(String stringboolean) {
        this.stringboolean = stringboolean == null ? null : stringboolean.trim();
    }

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