package mbg.test.mb3.generated.dsql.model;

import javax.annotation.Generated;

public class Fieldsonly {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.886+08:00", comments="Source field: FIELDSONLY.INTEGERFIELD")
    private Integer integerfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.DOUBLEFIELD")
    private Double doublefield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.FLOATFIELD")
    private Double floatfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.INTEGERFIELD")
    public Integer getIntegerfield() {
        return integerfield;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.INTEGERFIELD")
    public void setIntegerfield(Integer integerfield) {
        this.integerfield = integerfield;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.DOUBLEFIELD")
    public Double getDoublefield() {
        return doublefield;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.DOUBLEFIELD")
    public void setDoublefield(Double doublefield) {
        this.doublefield = doublefield;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.FLOATFIELD")
    public Double getFloatfield() {
        return floatfield;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source field: FIELDSONLY.FLOATFIELD")
    public void setFloatfield(Double floatfield) {
        this.floatfield = floatfield;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.889+08:00", comments="Source Table: FIELDSONLY")
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
        Fieldsonly other = (Fieldsonly) that;
        return (this.getIntegerfield() == null ? other.getIntegerfield() == null : this.getIntegerfield().equals(other.getIntegerfield()))
            && (this.getDoublefield() == null ? other.getDoublefield() == null : this.getDoublefield().equals(other.getDoublefield()))
            && (this.getFloatfield() == null ? other.getFloatfield() == null : this.getFloatfield().equals(other.getFloatfield()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.89+08:00", comments="Source Table: FIELDSONLY")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntegerfield() == null) ? 0 : getIntegerfield().hashCode());
        result = prime * result + ((getDoublefield() == null) ? 0 : getDoublefield().hashCode());
        result = prime * result + ((getFloatfield() == null) ? 0 : getFloatfield().hashCode());
        return result;
    }
}