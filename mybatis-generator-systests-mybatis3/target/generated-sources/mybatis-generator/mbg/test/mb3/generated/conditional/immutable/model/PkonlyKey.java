package mbg.test.mb3.generated.conditional.immutable.model;

public class PkonlyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.ID
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.SEQ_NUM
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Integer seqNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public PkonlyKey(Integer id, Integer seqNum) {
        this.id = id;
        this.seqNum = seqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKONLY.ID
     *
     * @return the value of PKONLY.ID
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKONLY.SEQ_NUM
     *
     * @return the value of PKONLY.SEQ_NUM
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Integer getSeqNum() {
        return seqNum;
    }
}