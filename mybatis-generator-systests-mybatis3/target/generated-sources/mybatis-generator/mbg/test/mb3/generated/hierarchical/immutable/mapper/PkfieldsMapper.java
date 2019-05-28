package mbg.test.mb3.generated.hierarchical.immutable.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.immutable.model.Pkfields;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsExample;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsKey;
import org.apache.ibatis.annotations.Param;

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
    int deleteByPrimaryKey(PkfieldsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
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
    List<Pkfields> selectByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    Pkfields selectByPrimaryKey(PkfieldsKey key);

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
    int updateByPrimaryKey(Pkfields record);
}