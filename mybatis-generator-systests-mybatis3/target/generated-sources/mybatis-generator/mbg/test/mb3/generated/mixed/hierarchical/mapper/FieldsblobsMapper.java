package mbg.test.mb3.generated.mixed.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.mixed.hierarchical.model.Fieldsblobs;
import mbg.test.mb3.generated.mixed.hierarchical.model.FieldsblobsExample;
import mbg.test.mb3.generated.mixed.hierarchical.model.FieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface FieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    long countByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Insert({
        "insert into FIELDSBLOBS (FIRSTNAME, LASTNAME, ",
        "BLOB1, BLOB2, ",
        "BLOB3)",
        "values (@{firstname,jdbcType=VARCHAR}, @{lastname,jdbcType=VARCHAR}, ",
        "@{blob1,jdbcType=VARBINARY}, @{blob2,jdbcType=VARBINARY}, ",
        "@{blob3,jdbcType=BINARY})"
    })
    int insert(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insertSelective(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Fieldsblobs> selectByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExample(@Param("record") Fieldsblobs record, @Param("example") FieldsblobsExample example);
}