package mbg.test.mb3.generated.mixed.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.mixed.miscellaneous.model.MyObject;
import mbg.test.mb3.generated.mixed.miscellaneous.model.MyObjectCriteria;
import mbg.test.mb3.generated.mixed.miscellaneous.model.MyObjectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MyObjectMapper extends BaseInterface {
    long countByExample(MyObjectCriteria example);

    int deleteByExample(MyObjectCriteria example);

    @Delete({
        "delete from PKFIELDS",
        "where ID2 = @{id2,jdbcType=INTEGER}",
          "and ID1 = @{id1,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(MyObjectKey key);

    @Insert({
        "insert into PKFIELDS (ID2, ID1, ",
        "FIRSTNAME, ",
        "LASTNAME, DATEFIELD, ",
        "TIMEFIELD, ",
        "TIMESTAMPFIELD, DECIMAL60FIELD, ",
        "DECIMAL100FIELD, DECIMAL155FIELD, ",
        "\"wierd$Field\", \"birth date\", ",
        "STRINGBOOLEAN)",
        "values (@{id2,jdbcType=INTEGER}, @{id1,jdbcType=INTEGER}, ",
        "@{firstname,jdbcType=VARCHAR,typeHandler=mbg.test.mb3.common.FirstNameTypeHandler}, ",
        "@{lastname,jdbcType=VARCHAR}, @{startDate,jdbcType=DATE}, ",
        "@{timefield,jdbcType=TIME,typeHandler=mbg.test.mb3.common.MyTimeTypeHandler}, ",
        "@{timestampfield,jdbcType=TIMESTAMP}, @{decimal60field,jdbcType=DECIMAL}, ",
        "@{decimal100field,jdbcType=DECIMAL}, @{decimal155field,jdbcType=DECIMAL}, ",
        "@{wierdField,jdbcType=INTEGER}, @{birthDate,jdbcType=DATE}, ",
        "@{stringboolean,jdbcType=CHAR})"
    })
    int insert(MyObject record);

    int insertSelective(MyObject record);

    List<MyObject> selectByExample(MyObjectCriteria example);

    @Select({
        "select",
        "A.ID2 as A_ID2, A.ID1 as A_ID1, A.FIRSTNAME as A_FIRSTNAME, A.LASTNAME as A_LASTNAME, ",
        "A.DATEFIELD as A_DATEFIELD, A.TIMEFIELD as A_TIMEFIELD, A.TIMESTAMPFIELD as A_TIMESTAMPFIELD, ",
        "A.DECIMAL60FIELD as A_DECIMAL60FIELD, A.DECIMAL100FIELD as A_DECIMAL100FIELD, ",
        "A.DECIMAL155FIELD as A_DECIMAL155FIELD, A.\"wierd$Field\" as \"A_wierd$Field\", ",
        "A.\"birth date\" as \"A_birth date\", A.STRINGBOOLEAN as A_STRINGBOOLEAN",
        "from PKFIELDS A",
        "where A.ID2 = @{id2,jdbcType=INTEGER}",
          "and A.ID1 = @{id1,jdbcType=INTEGER}"
    })
    @ResultMap("mbg.test.mb3.generated.mixed.miscellaneous.mapper.MyObjectMapper.BaseResultMap")
    MyObject selectByPrimaryKey(MyObjectKey key);

    int updateByExampleSelective(@Param("record") MyObject record, @Param("example") MyObjectCriteria example);

    int updateByExample(@Param("record") MyObject record, @Param("example") MyObjectCriteria example);

    int updateByPrimaryKeySelective(MyObject record);

    @Update({
        "update PKFIELDS",
        "set FIRSTNAME = @{firstname,jdbcType=VARCHAR,typeHandler=mbg.test.mb3.common.FirstNameTypeHandler},",
          "LASTNAME = @{lastname,jdbcType=VARCHAR},",
          "DATEFIELD = @{startDate,jdbcType=DATE},",
          "TIMEFIELD = @{timefield,jdbcType=TIME,typeHandler=mbg.test.mb3.common.MyTimeTypeHandler},",
          "TIMESTAMPFIELD = @{timestampfield,jdbcType=TIMESTAMP},",
          "DECIMAL60FIELD = @{decimal60field,jdbcType=DECIMAL},",
          "DECIMAL100FIELD = @{decimal100field,jdbcType=DECIMAL},",
          "DECIMAL155FIELD = @{decimal155field,jdbcType=DECIMAL},",
          "\"wierd$Field\" = @{wierdField,jdbcType=INTEGER},",
          "\"birth date\" = @{birthDate,jdbcType=DATE},",
          "STRINGBOOLEAN = @{stringboolean,jdbcType=CHAR}",
        "where ID2 = @{id2,jdbcType=INTEGER}",
          "and ID1 = @{id1,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MyObject record);
}