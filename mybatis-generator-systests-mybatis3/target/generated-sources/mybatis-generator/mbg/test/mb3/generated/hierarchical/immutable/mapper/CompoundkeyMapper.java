package mbg.test.mb3.generated.hierarchical.immutable.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.immutable.model.Compoundkey;
import mbg.test.mb3.generated.hierarchical.immutable.model.CompoundkeyExample;
import mbg.test.mb3.generated.hierarchical.immutable.model.CompoundkeyKey;
import org.apache.ibatis.annotations.Param;

public interface CompoundkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    long countByExample(CompoundkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByExample(CompoundkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByPrimaryKey(CompoundkeyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insert(Compoundkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insertSelective(Compoundkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Compoundkey> selectByExample(CompoundkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    Compoundkey selectByPrimaryKey(CompoundkeyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Compoundkey record, @Param("example") CompoundkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByExample(@Param("record") Compoundkey record, @Param("example") CompoundkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByPrimaryKeySelective(Compoundkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMPOUNDKEY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int updateByPrimaryKey(Compoundkey record);
}