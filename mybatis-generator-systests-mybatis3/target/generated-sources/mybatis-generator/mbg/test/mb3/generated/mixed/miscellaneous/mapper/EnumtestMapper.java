package mbg.test.mb3.generated.mixed.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.mixed.miscellaneous.model.Enumtest;
import mbg.test.mb3.generated.mixed.miscellaneous.model.EnumtestCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EnumtestMapper extends BaseInterface {
    long countByExample(EnumtestCriteria example);

    int deleteByExample(EnumtestCriteria example);

    @Delete({
        "delete from ENUMTEST",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ENUMTEST (ID, NAME)",
        "values (@{id,jdbcType=INTEGER}, @{name,jdbcType=VARCHAR})"
    })
    int insert(Enumtest record);

    int insertSelective(Enumtest record);

    List<Enumtest> selectByExample(EnumtestCriteria example);

    @Select({
        "select",
        "ID, NAME",
        "from ENUMTEST",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    @ResultMap("mbg.test.mb3.generated.mixed.miscellaneous.mapper.EnumtestMapper.BaseResultMap")
    Enumtest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    int updateByExample(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    int updateByPrimaryKeySelective(Enumtest record);

    @Update({
        "update ENUMTEST",
        "set NAME = @{name,jdbcType=VARCHAR}",
        "where ID = @{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Enumtest record);
}