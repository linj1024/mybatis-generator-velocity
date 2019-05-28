package mbg.test.mb3.generated.annotated.conditional.mapper;

import java.util.List;
import mbg.test.mb3.generated.annotated.conditional.model.Fieldsblobs;
import mbg.test.mb3.generated.annotated.conditional.model.FieldsblobsExample;
import mbg.test.mb3.generated.annotated.conditional.model.FieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=FieldsblobsSqlProvider.class, method="countByExample")
    long countByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @DeleteProvider(type=FieldsblobsSqlProvider.class, method="deleteByExample")
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
    @InsertProvider(type=FieldsblobsSqlProvider.class, method="insertSelective")
    int insertSelective(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=FieldsblobsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB3", property="blob3", jdbcType=JdbcType.BINARY)
    })
    List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=FieldsblobsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR)
    })
    List<Fieldsblobs> selectByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=FieldsblobsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=FieldsblobsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=FieldsblobsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Fieldsblobs record, @Param("example") FieldsblobsExample example);
}