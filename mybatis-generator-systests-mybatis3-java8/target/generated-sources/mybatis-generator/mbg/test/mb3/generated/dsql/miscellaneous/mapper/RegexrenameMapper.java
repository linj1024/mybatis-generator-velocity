package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import static mbg.test.mb3.generated.dsql.miscellaneous.mapper.RegexrenameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.miscellaneous.model.Regexrename;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface RegexrenameMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="call next value for TestSequence", keyProperty="record.id", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<Regexrename> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RegexrenameResult")
    Regexrename selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RegexrenameResult")
    List<Regexrename> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Function<SelectStatementProvider, List<Regexrename>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RegexrenameResult", value = {
        @Result(column="CUST_ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CUST_NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUST_ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZIP_CODE", property="zipCode", jdbcType=JdbcType.CHAR)
    })
    List<Regexrename> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, regexrename)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Regexrename record) {
        return insert(SqlBuilder.insert(record)
                .into(regexrename)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(address).toProperty("address")
                .map(zipCode).toProperty("zipCode")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Regexrename record) {
        return insert(SqlBuilder.insert(record)
                .into(regexrename)
                .map(id).toProperty("id")
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(zipCode).toPropertyWhenPresent("zipCode", record::getZipCode)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Regexrename>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), id, name, address, zipCode)
                .from(regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Regexrename>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, address, zipCode)
                .from(regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Regexrename>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), id, name, address, zipCode)
                .from(regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Regexrename>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, address, zipCode)
                .from(regexrename);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Regexrename selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, address, zipCode)
                .from(regexrename)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Regexrename record) {
        return UpdateDSL.updateWithMapper(this::update, regexrename)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(address).equalTo(record::getAddress)
                .set(zipCode).equalTo(record::getZipCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Regexrename record) {
        return UpdateDSL.updateWithMapper(this::update, regexrename)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(zipCode).equalToWhenPresent(record::getZipCode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Regexrename record) {
        return UpdateDSL.updateWithMapper(this::update, regexrename)
                .set(name).equalTo(record::getName)
                .set(address).equalTo(record::getAddress)
                .set(zipCode).equalTo(record::getZipCode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Regexrename record) {
        return UpdateDSL.updateWithMapper(this::update, regexrename)
                .set(name).equalToWhenPresent(record::getName)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(zipCode).equalToWhenPresent(record::getZipCode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}