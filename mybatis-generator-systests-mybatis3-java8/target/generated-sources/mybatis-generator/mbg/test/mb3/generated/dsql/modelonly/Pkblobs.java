package mbg.test.mb3.generated.dsql.modelonly;

import java.util.Arrays;
import javax.annotation.Generated;

public class Pkblobs {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source field: PKBLOBS.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source field: PKBLOBS.BLOB1")
    private byte[] blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.BLOB2")
    private byte[] blob2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.CHARACTERLOB")
    private String characterlob;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source Table: PKBLOBS")
    public Pkblobs(Integer id, byte[] blob1, byte[] blob2, String characterlob) {
        this.id = id;
        this.blob1 = blob1;
        this.blob2 = blob2;
        this.characterlob = characterlob;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source Table: PKBLOBS")
    public Pkblobs() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source field: PKBLOBS.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.931+08:00", comments="Source field: PKBLOBS.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.BLOB1")
    public byte[] getBlob1() {
        return blob1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.BLOB1")
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.BLOB2")
    public byte[] getBlob2() {
        return blob2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.BLOB2")
    public void setBlob2(byte[] blob2) {
        this.blob2 = blob2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.CHARACTERLOB")
    public String getCharacterlob() {
        return characterlob;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source field: PKBLOBS.CHARACTERLOB")
    public void setCharacterlob(String characterlob) {
        this.characterlob = characterlob == null ? null : characterlob.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source Table: PKBLOBS")
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
        Pkblobs other = (Pkblobs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (Arrays.equals(this.getBlob1(), other.getBlob1()))
            && (Arrays.equals(this.getBlob2(), other.getBlob2()))
            && (this.getCharacterlob() == null ? other.getCharacterlob() == null : this.getCharacterlob().equals(other.getCharacterlob()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.932+08:00", comments="Source Table: PKBLOBS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + (Arrays.hashCode(getBlob1()));
        result = prime * result + (Arrays.hashCode(getBlob2()));
        result = prime * result + ((getCharacterlob() == null) ? 0 : getCharacterlob().hashCode());
        return result;
    }
}