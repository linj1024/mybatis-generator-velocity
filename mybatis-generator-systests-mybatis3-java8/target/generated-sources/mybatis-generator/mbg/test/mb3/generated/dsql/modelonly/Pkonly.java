package mbg.test.mb3.generated.dsql.modelonly;

import javax.annotation.Generated;

public class Pkonly {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source field: PKONLY.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source field: PKONLY.SEQ_NUM")
    private Integer seqNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source Table: PKONLY")
    public Pkonly(Integer id, Integer seqNum) {
        this.id = id;
        this.seqNum = seqNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source field: PKONLY.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source field: PKONLY.SEQ_NUM")
    public Integer getSeqNum() {
        return seqNum;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source Table: PKONLY")
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
        Pkonly other = (Pkonly) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeqNum() == null ? other.getSeqNum() == null : this.getSeqNum().equals(other.getSeqNum()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.93+08:00", comments="Source Table: PKONLY")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeqNum() == null) ? 0 : getSeqNum().hashCode());
        return result;
    }
}