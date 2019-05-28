package mbg.test.mb3.generated.dsql.miscellaneous.model;

import javax.annotation.Generated;
import mbg.test.common.BaseClass;

public class Generatedalwaystestnoupdates extends BaseClass {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer idPlus1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer idPlus2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIdPlus1() {
        return idPlus1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdPlus1(Integer idPlus1) {
        this.idPlus1 = idPlus1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIdPlus2() {
        return idPlus2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdPlus2(Integer idPlus2) {
        this.idPlus2 = idPlus2;
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
        Generatedalwaystestnoupdates other = (Generatedalwaystestnoupdates) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdPlus1() == null ? other.getIdPlus1() == null : this.getIdPlus1().equals(other.getIdPlus1()))
            && (this.getIdPlus2() == null ? other.getIdPlus2() == null : this.getIdPlus2().equals(other.getIdPlus2()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdPlus1() == null) ? 0 : getIdPlus1().hashCode());
        result = prime * result + ((getIdPlus2() == null) ? 0 : getIdPlus2().hashCode());
        return result;
    }
}