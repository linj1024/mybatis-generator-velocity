package mbg.test.mb3.generated.annotated.hierarchical.model;

public class AwfulTableKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column awful table.CuStOmEr iD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column awful table.CuStOmEr iD
     *
     * @return the value of awful table.CuStOmEr iD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column awful table.CuStOmEr iD
     *
     * @param customerId the value for awful table.CuStOmEr iD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
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
        AwfulTableKey other = (AwfulTableKey) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        return result;
    }
}