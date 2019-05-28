package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.AwfulTableDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.AwfulTable;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface AwfulTableMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.customerId")
    int insert(InsertStatementProvider<AwfulTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AwfulTableResult")
    AwfulTable selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AwfulTableResult", value = {
        @Result(column="CuStOmEr iD", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="first name", property="firstFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_NAME", property="secondFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRSTNAME", property="thirdFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="E_MAIL", property="eMail", jdbcType=JdbcType.VARCHAR),
        @Result(column="_id1", property="id1", jdbcType=JdbcType.INTEGER),
        @Result(column="$id2", property="id2", jdbcType=JdbcType.INTEGER),
        @Result(column="id5_", property="id5", jdbcType=JdbcType.INTEGER),
        @Result(column="id6$", property="id6", jdbcType=JdbcType.INTEGER),
        @Result(column="id7$$", property="id7", jdbcType=JdbcType.INTEGER),
        @Result(column="EMAILADDRESS", property="emailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="from", property="from", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTIVE", property="active", jdbcType=JdbcType.BIT),
        @Result(column="ACTIVE1", property="active1", jdbcType=JdbcType.BOOLEAN),
        @Result(column="ACTIVE2", property="active2", jdbcType=JdbcType.BIT),
        @Result(column="CLASS", property="dbClass", jdbcType=JdbcType.VARCHAR)
    })
    List<AwfulTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(awfulTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, awfulTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    default int deleteByPrimaryKey(Integer customerId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, awfulTable)
                .where(customerId, isEqualTo(customerId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    default int insert(AwfulTable record) {
        return insert(SqlBuilder.insert(record)
                .into(awfulTable)
                .map(firstFirstName).toProperty("firstFirstName")
                .map(secondFirstName).toProperty("secondFirstName")
                .map(thirdFirstName).toProperty("thirdFirstName")
                .map(lastName).toProperty("lastName")
                .map(eMail).toProperty("eMail")
                .map(id1).toProperty("id1")
                .map(id2).toProperty("id2")
                .map(id5).toProperty("id5")
                .map(id6).toProperty("id6")
                .map(id7).toProperty("id7")
                .map(emailaddress).toProperty("emailaddress")
                .map(from).toProperty("from")
                .map(active).toProperty("active")
                .map(active1).toProperty("active1")
                .map(active2).toProperty("active2")
                .map(dbClass).toProperty("dbClass")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source Table: awful table")
    default int insertSelective(AwfulTable record) {
        return insert(SqlBuilder.insert(record)
                .into(awfulTable)
                .map(firstFirstName).toPropertyWhenPresent("firstFirstName", record::getFirstFirstName)
                .map(secondFirstName).toPropertyWhenPresent("secondFirstName", record::getSecondFirstName)
                .map(thirdFirstName).toPropertyWhenPresent("thirdFirstName", record::getThirdFirstName)
                .map(lastName).toPropertyWhenPresent("lastName", record::getLastName)
                .map(eMail).toPropertyWhenPresent("eMail", record::geteMail)
                .map(id1).toPropertyWhenPresent("id1", record::getId1)
                .map(id2).toPropertyWhenPresent("id2", record::getId2)
                .map(id5).toPropertyWhenPresent("id5", record::getId5)
                .map(id6).toPropertyWhenPresent("id6", record::getId6)
                .map(id7).toPropertyWhenPresent("id7", record::getId7)
                .map(emailaddress).toPropertyWhenPresent("emailaddress", record::getEmailaddress)
                .map(from).toPropertyWhenPresent("from", record::getFrom)
                .map(active).toPropertyWhenPresent("active", record::isActive)
                .map(active1).toPropertyWhenPresent("active1", record::getActive1)
                .map(active2).toPropertyWhenPresent("active2", record::getActive2)
                .map(dbClass).toPropertyWhenPresent("dbClass", record::getDbClass)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AwfulTable>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, customerId, firstFirstName, secondFirstName, thirdFirstName, lastName, eMail, id1, id2, id5, id6, id7, emailaddress, from, active, active1, active2, dbClass)
                .from(awfulTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<AwfulTable>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, customerId, firstFirstName, secondFirstName, thirdFirstName, lastName, eMail, id1, id2, id5, id6, id7, emailaddress, from, active, active1, active2, dbClass)
                .from(awfulTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default AwfulTable selectByPrimaryKey(Integer customerId_) {
        return SelectDSL.selectWithMapper(this::selectOne, customerId, firstFirstName, secondFirstName, thirdFirstName, lastName, eMail, id1, id2, id5, id6, id7, emailaddress, from, active, active1, active2, dbClass)
                .from(awfulTable)
                .where(customerId, isEqualTo(customerId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(AwfulTable record) {
        return UpdateDSL.updateWithMapper(this::update, awfulTable)
                .set(firstFirstName).equalTo(record::getFirstFirstName)
                .set(secondFirstName).equalTo(record::getSecondFirstName)
                .set(thirdFirstName).equalTo(record::getThirdFirstName)
                .set(lastName).equalTo(record::getLastName)
                .set(eMail).equalTo(record::geteMail)
                .set(id1).equalTo(record::getId1)
                .set(id2).equalTo(record::getId2)
                .set(id5).equalTo(record::getId5)
                .set(id6).equalTo(record::getId6)
                .set(id7).equalTo(record::getId7)
                .set(emailaddress).equalTo(record::getEmailaddress)
                .set(from).equalTo(record::getFrom)
                .set(active).equalTo(record::isActive)
                .set(active1).equalTo(record::getActive1)
                .set(active2).equalTo(record::getActive2)
                .set(dbClass).equalTo(record::getDbClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(AwfulTable record) {
        return UpdateDSL.updateWithMapper(this::update, awfulTable)
                .set(firstFirstName).equalToWhenPresent(record::getFirstFirstName)
                .set(secondFirstName).equalToWhenPresent(record::getSecondFirstName)
                .set(thirdFirstName).equalToWhenPresent(record::getThirdFirstName)
                .set(lastName).equalToWhenPresent(record::getLastName)
                .set(eMail).equalToWhenPresent(record::geteMail)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(id2).equalToWhenPresent(record::getId2)
                .set(id5).equalToWhenPresent(record::getId5)
                .set(id6).equalToWhenPresent(record::getId6)
                .set(id7).equalToWhenPresent(record::getId7)
                .set(emailaddress).equalToWhenPresent(record::getEmailaddress)
                .set(from).equalToWhenPresent(record::getFrom)
                .set(active).equalToWhenPresent(record::isActive)
                .set(active1).equalToWhenPresent(record::getActive1)
                .set(active2).equalToWhenPresent(record::getActive2)
                .set(dbClass).equalToWhenPresent(record::getDbClass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default int updateByPrimaryKey(AwfulTable record) {
        return UpdateDSL.updateWithMapper(this::update, awfulTable)
                .set(firstFirstName).equalTo(record::getFirstFirstName)
                .set(secondFirstName).equalTo(record::getSecondFirstName)
                .set(thirdFirstName).equalTo(record::getThirdFirstName)
                .set(lastName).equalTo(record::getLastName)
                .set(eMail).equalTo(record::geteMail)
                .set(id1).equalTo(record::getId1)
                .set(id2).equalTo(record::getId2)
                .set(id5).equalTo(record::getId5)
                .set(id6).equalTo(record::getId6)
                .set(id7).equalTo(record::getId7)
                .set(emailaddress).equalTo(record::getEmailaddress)
                .set(from).equalTo(record::getFrom)
                .set(active).equalTo(record::isActive)
                .set(active1).equalTo(record::getActive1)
                .set(active2).equalTo(record::getActive2)
                .set(dbClass).equalTo(record::getDbClass)
                .where(customerId, isEqualTo(record::getCustomerId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: awful table")
    default int updateByPrimaryKeySelective(AwfulTable record) {
        return UpdateDSL.updateWithMapper(this::update, awfulTable)
                .set(firstFirstName).equalToWhenPresent(record::getFirstFirstName)
                .set(secondFirstName).equalToWhenPresent(record::getSecondFirstName)
                .set(thirdFirstName).equalToWhenPresent(record::getThirdFirstName)
                .set(lastName).equalToWhenPresent(record::getLastName)
                .set(eMail).equalToWhenPresent(record::geteMail)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(id2).equalToWhenPresent(record::getId2)
                .set(id5).equalToWhenPresent(record::getId5)
                .set(id6).equalToWhenPresent(record::getId6)
                .set(id7).equalToWhenPresent(record::getId7)
                .set(emailaddress).equalToWhenPresent(record::getEmailaddress)
                .set(from).equalToWhenPresent(record::getFrom)
                .set(active).equalToWhenPresent(record::isActive)
                .set(active1).equalToWhenPresent(record::getActive1)
                .set(active2).equalToWhenPresent(record::getActive2)
                .set(dbClass).equalToWhenPresent(record::getDbClass)
                .where(customerId, isEqualTo(record::getCustomerId))
                .build()
                .execute();
    }
}