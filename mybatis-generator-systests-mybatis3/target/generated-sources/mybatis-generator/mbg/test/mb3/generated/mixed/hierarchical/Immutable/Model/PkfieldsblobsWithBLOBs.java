package mbg.test.mb3.generated.mixed.hierarchical.Immutable.Model;

public class PkfieldsblobsWithBLOBs extends Pkfieldsblobs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.BLOB1
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private byte[] blob1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public PkfieldsblobsWithBLOBs(Integer id1, Integer id2, String firstname, String lastname, byte[] blob1) {
        super(id1, id2, firstname, lastname);
        this.blob1 = blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.BLOB1
     *
     * @return the value of PKFIELDSBLOBS.BLOB1
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public byte[] getBlob1() {
        return blob1;
    }
}