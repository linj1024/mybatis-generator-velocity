package mbg.test.mb3.generated.mixed.miscellaneous.model;

import mbg.test.common.BaseClass;

public class MyObjectKey extends BaseClass {
    private Integer id2;

    private Integer id1;

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
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
        MyObjectKey other = (MyObjectKey) that;
        return (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        return result;
    }
}