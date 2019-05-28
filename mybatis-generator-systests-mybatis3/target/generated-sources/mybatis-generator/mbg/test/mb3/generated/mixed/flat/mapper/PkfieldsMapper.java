package mbg.test.mb3.generated.mixed.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.mixed.flat.model.Pkfields;
import mbg.test.mb3.generated.mixed.flat.model.PkfieldsExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface PkfieldsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    long countByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Delete({
        "delete from PKFIELDS",
        "where ID2 = @{id2,jdbcType=INTEGER}",
          "and ID1 = @{id1,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("id2") Integer id2, @Param("id1") Integer id1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Insert({
        "insert into PKFIELDS (ID2, ID1, ",
        "FIRSTNAME, LASTNAME, ",
        "DATEFIELD, TIMEFIELD, ",
        "TIMESTAMPFIELD, DECIMAL30FIELD, ",
        "DECIMAL60FIELD, DECIMAL100FIELD, ",
        "DECIMAL155FIELD, \"wierd$Field\", ",
        "\"birth date\", STRINGBOOLEAN)",
        "values (@{id2,jdbcType=INTEGER}, @{id1,jdbcType=INTEGER}, ",
        "@{firstname,jdbcType=VARCHAR}, @{lastname,jdbcType=VARCHAR}, ",
        "@{datefield,jdbcType=DATE}, @{timefield,jdbcType=TIME}, ",
        "@{timestampfield,jdbcType=TIMESTAMP}, @{decimal30field,jdbcType=DECIMAL}, ",
        "@{decimal60field,jdbcType=DECIMAL}, @{decimal100field,jdbcType=DECIMAL}, ",
        "@{decimal155field,jdbcType=DECIMAL}, @{wierdField,jdbcType=INTEGER}, ",
        "@{birthDate,jdbcType=DATE}, @{stringboolean,jdbcType=CHAR})"
    })
    int insert(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insertSelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Pkfields> selectByExampleWithRowbounds(PkfieldsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Pkfields> selectByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Select({
        "select",
        "B.ID2 as B_ID2, B.ID1 as B_ID1, B.FIRSTNAME as B_FIRSTNAME, B.LASTNAME as B_LASTNAME, ",
        "B.DATEFIELD as B_DATEFIELD, B.TIMEFIELD as B_TIMEFIELD, B.TIMESTAMPFIELD as B_TIMESTAMPFIELD, ",
        "B.DECIMAL30FIELD as B_DECIMAL30FIELD, B.DECIMAL60FIELD as B_DECIMAL60FIELD, ",
        "B.DECIMAL100FIELD as B_DECIMAL100FIELD, B.DECIMAL155FIELD as B_DECIMAL155FIELD, ",
        "B.\"wierd$Field\" as \"B_wierd$Field\", B.\"birth date\" as \"B_birth date\", ",
        "B.STRINGBOOLEAN as B_STRINGBOOLEAN",
        "from PKFIELDS B",
        "where B.ID2 = @{id2,jdbcType=INTEGER}",
          "and B.ID1 = @{id1,jdbcType=INTEGER}"
    })
    @ResultMap("mbg.test.mb3.generated.mixed.flat.mapper.PkfieldsMapper.BaseResultMap")
    Pkfields selectByPrimaryKey(@Param("id2") Integer id2, @Param("id1") Integer id1);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExample(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByPrimaryKeySelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    @Update({
        "update PKFIELDS",
        "set FIRSTNAME = @{firstname,jdbcType=VARCHAR},",
          "LASTNAME = @{lastname,jdbcType=VARCHAR},",
          "DATEFIELD = @{datefield,jdbcType=DATE},",
          "TIMEFIELD = @{timefield,jdbcType=TIME},",
          "TIMESTAMPFIELD = @{timestampfield,jdbcType=TIMESTAMP},",
          "DECIMAL30FIELD = @{decimal30field,jdbcType=DECIMAL},",
          "DECIMAL60FIELD = @{decimal60field,jdbcType=DECIMAL},",
          "DECIMAL100FIELD = @{decimal100field,jdbcType=DECIMAL},",
          "DECIMAL155FIELD = @{decimal155field,jdbcType=DECIMAL},",
          "\"wierd$Field\" = @{wierdField,jdbcType=INTEGER},",
          "\"birth date\" = @{birthDate,jdbcType=DATE},",
          "STRINGBOOLEAN = @{stringboolean,jdbcType=CHAR}",
        "where ID2 = @{id2,jdbcType=INTEGER}",
          "and ID1 = @{id1,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pkfields record);
}