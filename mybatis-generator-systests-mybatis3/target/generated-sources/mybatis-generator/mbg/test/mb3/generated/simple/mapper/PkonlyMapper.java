package mbg.test.mb3.generated.simple.mapper;

import java.util.List;
import mbg.test.mb3.generated.simple.model.Pkonly;
import org.apache.ibatis.annotations.Param;

public interface PkonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("seqNum") Integer seqNum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    int insert(Pkonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    List<Pkonly> selectAll();
}