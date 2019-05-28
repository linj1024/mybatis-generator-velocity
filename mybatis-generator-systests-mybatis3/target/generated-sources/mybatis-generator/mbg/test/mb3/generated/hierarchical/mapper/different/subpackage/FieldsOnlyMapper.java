package mbg.test.mb3.generated.hierarchical.mapper.different.subpackage;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.subpackage.FieldsOnlyEntity;
import mbg.test.mb3.generated.hierarchical.model.subpackage.FieldsOnlyEntityExample;
import org.apache.ibatis.annotations.Param;

public interface FieldsOnlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    long countByExample(FieldsOnlyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    int deleteByExample(FieldsOnlyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    int insert(FieldsOnlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    int insertSelective(FieldsOnlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    List<FieldsOnlyEntity> selectByExample(FieldsOnlyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    int updateByExampleSelective(@Param("record") FieldsOnlyEntity record, @Param("example") FieldsOnlyEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated 2019-05-28
     */
    int updateByExample(@Param("record") FieldsOnlyEntity record, @Param("example") FieldsOnlyEntityExample example);
}