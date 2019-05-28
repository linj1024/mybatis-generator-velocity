package mbg.test.mb3.generated.annotated.hierarchical.Immutable.Mapper;

import java.util.List;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsKey;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsWithBLOBs;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PkblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="countByExample")
    long countByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @DeleteProvider(type=PkblobsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Delete({
        "delete from PKBLOBS",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PkblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Insert({
        "insert into PKBLOBS (ID, BLOB1, ",
        "BLOB2, CHARACTERLOB)",
        "values (@{id,jdbcType=INTEGER}, @{blob1,jdbcType=VARBINARY}, ",
        "@{blob2,jdbcType=VARBINARY}, @{characterlob,jdbcType=CLOB})"
    })
    int insert(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @InsertProvider(type=PkblobsSqlProvider.class, method="insertSelective")
    int insertSelective(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="BLOB1", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="BLOB2", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="CHARACTERLOB", javaType=String.class, jdbcType=JdbcType.CLOB)
    })
    List<PkblobsWithBLOBs> selectByExampleWithBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true)
    })
    List<PkblobsKey> selectByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Select({
        "select",
        "ID, BLOB1, BLOB2, CHARACTERLOB",
        "from PKBLOBS",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="BLOB1", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="BLOB2", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="CHARACTERLOB", javaType=String.class, jdbcType=JdbcType.CLOB)
    })
    PkblobsWithBLOBs selectByPrimaryKey(PkblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PkblobsWithBLOBs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PkblobsWithBLOBs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PkblobsKey record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Update({
        "update PKBLOBS",
        "set BLOB1 = @{blob1,jdbcType=VARBINARY},",
          "BLOB2 = @{blob2,jdbcType=VARBINARY},",
          "CHARACTERLOB = @{characterlob,jdbcType=CLOB}",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(PkblobsWithBLOBs record);
}