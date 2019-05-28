package mbg.test.mb3.generated.hierarchical.immutable.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkonlyExample;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkonlyKey;
import org.apache.ibatis.annotations.Param;

public interface PkonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    long countByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByPrimaryKey(PkonlyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insert(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insertSelective(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<PkonlyKey> selectByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") PkonlyKey record, @Param("example") PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExample(@Param("record") PkonlyKey record, @Param("example") PkonlyExample example);
}