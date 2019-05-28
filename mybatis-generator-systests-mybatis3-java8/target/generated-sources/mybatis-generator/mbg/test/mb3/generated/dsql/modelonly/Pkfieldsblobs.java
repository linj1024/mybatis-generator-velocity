package mbg.test.mb3.generated.dsql.modelonly;

import java.util.Arrays;
import javax.annotation.Generated;

public class Pkfieldsblobs {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID1")
    private Integer id1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID2")
    private Integer id2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.FIRSTNAME")
    private String firstname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.LASTNAME")
    private String lastname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.BLOB1")
    private byte[] blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID1")
    public Integer getId1() {
        return id1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID1")
    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID2")
    public Integer getId2() {
        return id2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.ID2")
    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.FIRSTNAME")
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.LASTNAME")
    public String getLastname() {
        return lastname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.LASTNAME")
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.BLOB1")
    public byte[] getBlob1() {
        return blob1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKFIELDSBLOBS.BLOB1")
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source Table: PKFIELDSBLOBS")
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
        Pkfieldsblobs other = (Pkfieldsblobs) that;
        return (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
            && (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (Arrays.equals(this.getBlob1(), other.getBlob1()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source Table: PKFIELDSBLOBS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + (Arrays.hashCode(getBlob1()));
        return result;
    }
}