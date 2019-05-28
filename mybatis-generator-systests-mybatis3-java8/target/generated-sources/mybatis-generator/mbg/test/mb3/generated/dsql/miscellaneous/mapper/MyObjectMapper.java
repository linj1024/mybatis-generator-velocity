package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import static mbg.test.mb3.generated.dsql.miscellaneous.mapper.MyObjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import mbg.test.mb3.common.FirstNameTypeHandler;
import mbg.test.mb3.common.MyTimeTypeHandler;
import mbg.test.mb3.generated.dsql.miscellaneous.model.MyObject;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
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
public interface MyObjectMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MyObject> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyObjectResult")
    MyObject selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyObjectResult")
    List<MyObject> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Function<SelectStatementProvider, List<MyObject>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyObjectResult", value = {
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", typeHandler=FirstNameTypeHandler.class, jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATEFIELD", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="TIMEFIELD", property="timefield", typeHandler=MyTimeTypeHandler.class, jdbcType=JdbcType.TIME),
        @Result(column="TIMESTAMPFIELD", property="timestampfield", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DECIMAL60FIELD", property="decimal60field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL100FIELD", property="decimal100field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL155FIELD", property="decimal155field", jdbcType=JdbcType.DECIMAL),
        @Result(column="wierd$Field", property="wierdField", jdbcType=JdbcType.INTEGER),
        @Result(column="birth date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="STRINGBOOLEAN", property="stringboolean", jdbcType=JdbcType.CHAR)
    })
    List<MyObject> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id2_, Integer id1_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myObject)
                .where(id2, isEqualTo(id2_))
                .and(id1, isEqualTo(id1_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MyObject record) {
        return insert(SqlBuilder.insert(record)
                .into(myObject)
                .map(id2).toProperty("id2")
                .map(id1).toProperty("id1")
                .map(firstname).toProperty("firstname")
                .map(lastname).toProperty("lastname")
                .map(startDate).toProperty("startDate")
                .map(timefield).toProperty("timefield")
                .map(timestampfield).toProperty("timestampfield")
                .map(decimal60field).toProperty("decimal60field")
                .map(decimal100field).toProperty("decimal100field")
                .map(decimal155field).toProperty("decimal155field")
                .map(wierdField).toProperty("wierdField")
                .map(birthDate).toProperty("birthDate")
                .map(stringboolean).toProperty("stringboolean")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(MyObject record) {
        return insert(SqlBuilder.insert(record)
                .into(myObject)
                .map(id2).toPropertyWhenPresent("id2", record::getId2)
                .map(id1).toPropertyWhenPresent("id1", record::getId1)
                .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
                .map(lastname).toPropertyWhenPresent("lastname", record::getLastname)
                .map(startDate).toPropertyWhenPresent("startDate", record::getStartDate)
                .map(timefield).toPropertyWhenPresent("timefield", record::getTimefield)
                .map(timestampfield).toPropertyWhenPresent("timestampfield", record::getTimestampfield)
                .map(decimal60field).toPropertyWhenPresent("decimal60field", record::getDecimal60field)
                .map(decimal100field).toPropertyWhenPresent("decimal100field", record::getDecimal100field)
                .map(decimal155field).toPropertyWhenPresent("decimal155field", record::getDecimal155field)
                .map(wierdField).toPropertyWhenPresent("wierdField", record::getWierdField)
                .map(birthDate).toPropertyWhenPresent("birthDate", record::getBirthDate)
                .map(stringboolean).toPropertyWhenPresent("stringboolean", record::getStringboolean)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyObject>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id2, id1, firstname, lastname, startDate, timefield, timestampfield, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyObject>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id2, id1, firstname, lastname, startDate, timefield, timestampfield, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyObject>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id2, id1, firstname, lastname, startDate, timefield, timestampfield, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyObject>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id2, id1, firstname, lastname, startDate, timefield, timestampfield, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(myObject);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default MyObject selectByPrimaryKey(Integer id2_, Integer id1_) {
        return SelectDSL.selectWithMapper(this::selectOne, id2, id1, firstname, lastname, startDate, timefield, timestampfield, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(myObject)
                .where(id2, isEqualTo(id2_))
                .and(id1, isEqualTo(id1_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MyObject record) {
        return UpdateDSL.updateWithMapper(this::update, myObject)
                .set(id2).equalTo(record::getId2)
                .set(id1).equalTo(record::getId1)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(startDate).equalTo(record::getStartDate)
                .set(timefield).equalTo(record::getTimefield)
                .set(timestampfield).equalTo(record::getTimestampfield)
                .set(decimal60field).equalTo(record::getDecimal60field)
                .set(decimal100field).equalTo(record::getDecimal100field)
                .set(decimal155field).equalTo(record::getDecimal155field)
                .set(wierdField).equalTo(record::getWierdField)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(stringboolean).equalTo(record::getStringboolean);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MyObject record) {
        return UpdateDSL.updateWithMapper(this::update, myObject)
                .set(id2).equalToWhenPresent(record::getId2)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(startDate).equalToWhenPresent(record::getStartDate)
                .set(timefield).equalToWhenPresent(record::getTimefield)
                .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
                .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
                .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
                .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
                .set(wierdField).equalToWhenPresent(record::getWierdField)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(stringboolean).equalToWhenPresent(record::getStringboolean);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(MyObject record) {
        return UpdateDSL.updateWithMapper(this::update, myObject)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(startDate).equalTo(record::getStartDate)
                .set(timefield).equalTo(record::getTimefield)
                .set(timestampfield).equalTo(record::getTimestampfield)
                .set(decimal60field).equalTo(record::getDecimal60field)
                .set(decimal100field).equalTo(record::getDecimal100field)
                .set(decimal155field).equalTo(record::getDecimal155field)
                .set(wierdField).equalTo(record::getWierdField)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(stringboolean).equalTo(record::getStringboolean)
                .where(id2, isEqualTo(record::getId2))
                .and(id1, isEqualTo(record::getId1))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(MyObject record) {
        return UpdateDSL.updateWithMapper(this::update, myObject)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(startDate).equalToWhenPresent(record::getStartDate)
                .set(timefield).equalToWhenPresent(record::getTimefield)
                .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
                .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
                .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
                .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
                .set(wierdField).equalToWhenPresent(record::getWierdField)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(stringboolean).equalToWhenPresent(record::getStringboolean)
                .where(id2, isEqualTo(record::getId2))
                .and(id1, isEqualTo(record::getId1))
                .build()
                .execute();
    }
}