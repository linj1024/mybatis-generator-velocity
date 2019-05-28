package mbg.test.mb3.generated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.Pkfields;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsExample;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsKey;
import org.apache.ibatis.annotations.Param;

public interface PkfieldsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    long countByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int deleteByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int deleteByPrimaryKey(PkfieldsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int insert(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int insertSelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    List<Pkfields> selectByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    Pkfields selectByPrimaryKey(PkfieldsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int updateByExampleSelective(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int updateByExample(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int updateByPrimaryKeySelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated 2019-05-28
     */
    int updateByPrimaryKey(Pkfields record);
}