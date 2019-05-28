package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.PkfieldsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.common.StringBooleanTypeHandler;
import mbg.test.mb3.generated.dsql.model.Pkfields;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
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
public interface PkfieldsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Pkfields> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PkfieldsResult")
    Pkfields selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PkfieldsResult", value = {
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATEFIELD", property="datefield", jdbcType=JdbcType.DATE),
        @Result(column="TIMEFIELD", property="timefield", jdbcType=JdbcType.TIME),
        @Result(column="TIMESTAMPFIELD", property="timestampfield", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DECIMAL30FIELD", property="decimal30field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL60FIELD", property="decimal60field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL100FIELD", property="decimal100field", jdbcType=JdbcType.DECIMAL),
        @Result(column="DECIMAL155FIELD", property="decimal155field", jdbcType=JdbcType.DECIMAL),
        @Result(column="wierd$Field", property="wierdField", jdbcType=JdbcType.INTEGER),
        @Result(column="birth date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="STRINGBOOLEAN", property="stringboolean", typeHandler=StringBooleanTypeHandler.class, jdbcType=JdbcType.CHAR)
    })
    List<Pkfields> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source Table: PKFIELDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(pkfields);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkfields);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default int deleteByPrimaryKey(Integer id2_, Integer id1_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkfields)
                .where(id2, isEqualTo(id2_))
                .and(id1, isEqualTo(id1_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default int insert(Pkfields record) {
        return insert(SqlBuilder.insert(record)
                .into(pkfields)
                .map(id2).toProperty("id2")
                .map(id1).toProperty("id1")
                .map(firstname).toProperty("firstname")
                .map(lastname).toProperty("lastname")
                .map(datefield).toProperty("datefield")
                .map(timefield).toProperty("timefield")
                .map(timestampfield).toProperty("timestampfield")
                .map(decimal30field).toProperty("decimal30field")
                .map(decimal60field).toProperty("decimal60field")
                .map(decimal100field).toProperty("decimal100field")
                .map(decimal155field).toProperty("decimal155field")
                .map(wierdField).toProperty("wierdField")
                .map(birthDate).toProperty("birthDate")
                .map(stringboolean).toProperty("stringboolean")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default int insertSelective(Pkfields record) {
        return insert(SqlBuilder.insert(record)
                .into(pkfields)
                .map(id2).toPropertyWhenPresent("id2", record::getId2)
                .map(id1).toPropertyWhenPresent("id1", record::getId1)
                .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
                .map(lastname).toPropertyWhenPresent("lastname", record::getLastname)
                .map(datefield).toPropertyWhenPresent("datefield", record::getDatefield)
                .map(timefield).toPropertyWhenPresent("timefield", record::getTimefield)
                .map(timestampfield).toPropertyWhenPresent("timestampfield", record::getTimestampfield)
                .map(decimal30field).toPropertyWhenPresent("decimal30field", record::getDecimal30field)
                .map(decimal60field).toPropertyWhenPresent("decimal60field", record::getDecimal60field)
                .map(decimal100field).toPropertyWhenPresent("decimal100field", record::getDecimal100field)
                .map(decimal155field).toPropertyWhenPresent("decimal155field", record::getDecimal155field)
                .map(wierdField).toPropertyWhenPresent("wierdField", record::getWierdField)
                .map(birthDate).toPropertyWhenPresent("birthDate", record::getBirthDate)
                .map(stringboolean).toPropertyWhenPresent("stringboolean", record::isStringboolean)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkfields>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id2, id1, firstname, lastname, datefield, timefield, timestampfield, decimal30field, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(pkfields);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkfields>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id2, id1, firstname, lastname, datefield, timefield, timestampfield, decimal30field, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(pkfields);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default Pkfields selectByPrimaryKey(Integer id2_, Integer id1_) {
        return SelectDSL.selectWithMapper(this::selectOne, id2, id1, firstname, lastname, datefield, timefield, timestampfield, decimal30field, decimal60field, decimal100field, decimal155field, wierdField, birthDate, stringboolean)
                .from(pkfields)
                .where(id2, isEqualTo(id2_))
                .and(id1, isEqualTo(id1_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Pkfields record) {
        return UpdateDSL.updateWithMapper(this::update, pkfields)
                .set(id2).equalTo(record::getId2)
                .set(id1).equalTo(record::getId1)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(datefield).equalTo(record::getDatefield)
                .set(timefield).equalTo(record::getTimefield)
                .set(timestampfield).equalTo(record::getTimestampfield)
                .set(decimal30field).equalTo(record::getDecimal30field)
                .set(decimal60field).equalTo(record::getDecimal60field)
                .set(decimal100field).equalTo(record::getDecimal100field)
                .set(decimal155field).equalTo(record::getDecimal155field)
                .set(wierdField).equalTo(record::getWierdField)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(stringboolean).equalTo(record::isStringboolean);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Pkfields record) {
        return UpdateDSL.updateWithMapper(this::update, pkfields)
                .set(id2).equalToWhenPresent(record::getId2)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(datefield).equalToWhenPresent(record::getDatefield)
                .set(timefield).equalToWhenPresent(record::getTimefield)
                .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
                .set(decimal30field).equalToWhenPresent(record::getDecimal30field)
                .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
                .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
                .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
                .set(wierdField).equalToWhenPresent(record::getWierdField)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(stringboolean).equalToWhenPresent(record::isStringboolean);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.909+08:00", comments="Source Table: PKFIELDS")
    default int updateByPrimaryKey(Pkfields record) {
        return UpdateDSL.updateWithMapper(this::update, pkfields)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(datefield).equalTo(record::getDatefield)
                .set(timefield).equalTo(record::getTimefield)
                .set(timestampfield).equalTo(record::getTimestampfield)
                .set(decimal30field).equalTo(record::getDecimal30field)
                .set(decimal60field).equalTo(record::getDecimal60field)
                .set(decimal100field).equalTo(record::getDecimal100field)
                .set(decimal155field).equalTo(record::getDecimal155field)
                .set(wierdField).equalTo(record::getWierdField)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(stringboolean).equalTo(record::isStringboolean)
                .where(id2, isEqualTo(record::getId2))
                .and(id1, isEqualTo(record::getId1))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.91+08:00", comments="Source Table: PKFIELDS")
    default int updateByPrimaryKeySelective(Pkfields record) {
        return UpdateDSL.updateWithMapper(this::update, pkfields)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(datefield).equalToWhenPresent(record::getDatefield)
                .set(timefield).equalToWhenPresent(record::getTimefield)
                .set(timestampfield).equalToWhenPresent(record::getTimestampfield)
                .set(decimal30field).equalToWhenPresent(record::getDecimal30field)
                .set(decimal60field).equalToWhenPresent(record::getDecimal60field)
                .set(decimal100field).equalToWhenPresent(record::getDecimal100field)
                .set(decimal155field).equalToWhenPresent(record::getDecimal155field)
                .set(wierdField).equalToWhenPresent(record::getWierdField)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(stringboolean).equalToWhenPresent(record::isStringboolean)
                .where(id2, isEqualTo(record::getId2))
                .and(id1, isEqualTo(record::getId1))
                .build()
                .execute();
    }
}