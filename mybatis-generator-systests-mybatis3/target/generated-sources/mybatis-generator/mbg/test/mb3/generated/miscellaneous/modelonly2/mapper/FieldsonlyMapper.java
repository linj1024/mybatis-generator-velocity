package mbg.test.mb3.generated.miscellaneous.modelonly2.mapper;

import java.util.List;
import mbg.test.mb3.generated.miscellaneous.modelonly2.model.Fieldsonly;
import mbg.test.mb3.generated.miscellaneous.modelonly2.model.FieldsonlyExample;
import org.apache.ibatis.annotations.Param;

public interface FieldsonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    long countByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insert(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insertSelective(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Fieldsonly> selectByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExample(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);
}