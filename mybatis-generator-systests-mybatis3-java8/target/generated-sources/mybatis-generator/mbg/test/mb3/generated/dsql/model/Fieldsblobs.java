package mbg.test.mb3.generated.dsql.model;

import javax.annotation.Generated;

public class Fieldsblobs {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.FIRSTNAME")
    private String firstname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.LASTNAME")
    private String lastname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB1")
    private byte[] blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB2")
    private byte[] blob2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB3")
    private byte[] blob3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.FIRSTNAME")
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.LASTNAME")
    public String getLastname() {
        return lastname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.LASTNAME")
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB1")
    public byte[] getBlob1() {
        return blob1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB1")
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB2")
    public byte[] getBlob2() {
        return blob2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB2")
    public void setBlob2(byte[] blob2) {
        this.blob2 = blob2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source field: FIELDSBLOBS.BLOB3")
    public byte[] getBlob3() {
        return blob3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.BLOB3")
    public void setBlob3(byte[] blob3) {
        this.blob3 = blob3;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
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
        Fieldsblobs other = (Fieldsblobs) that;
        return (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        return result;
    }
}