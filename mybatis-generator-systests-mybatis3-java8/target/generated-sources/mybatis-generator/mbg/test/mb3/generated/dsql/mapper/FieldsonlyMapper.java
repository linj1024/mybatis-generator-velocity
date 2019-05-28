package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.FieldsonlyDynamicSqlSupport.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.Fieldsonly;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface FieldsonlyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.894+08:00", comments="Source Table: FIELDSONLY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.895+08:00", comments="Source Table: FIELDSONLY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.896+08:00", comments="Source Table: FIELDSONLY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Fieldsonly> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.896+08:00", comments="Source Table: FIELDSONLY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FieldsonlyResult", value = {
        @Result(column="INTEGERFIELD", property="integerfield", jdbcType=JdbcType.INTEGER),
        @Result(column="DOUBLEFIELD", property="doublefield", jdbcType=JdbcType.DOUBLE),
        @Result(column="FLOATFIELD", property="floatfield", jdbcType=JdbcType.DOUBLE)
    })
    List<Fieldsonly> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.897+08:00", comments="Source Table: FIELDSONLY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.898+08:00", comments="Source Table: FIELDSONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(fieldsonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.898+08:00", comments="Source Table: FIELDSONLY")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, fieldsonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.899+08:00", comments="Source Table: FIELDSONLY")
    default int insert(Fieldsonly record) {
        return insert(SqlBuilder.insert(record)
                .into(fieldsonly)
                .map(integerfield).toProperty("integerfield")
                .map(doublefield).toProperty("doublefield")
                .map(floatfield).toProperty("floatfield")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.9+08:00", comments="Source Table: FIELDSONLY")
    default int insertSelective(Fieldsonly record) {
        return insert(SqlBuilder.insert(record)
                .into(fieldsonly)
                .map(integerfield).toPropertyWhenPresent("integerfield", record::getIntegerfield)
                .map(doublefield).toPropertyWhenPresent("doublefield", record::getDoublefield)
                .map(floatfield).toPropertyWhenPresent("floatfield", record::getFloatfield)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.9+08:00", comments="Source Table: FIELDSONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Fieldsonly>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, integerfield, doublefield, floatfield)
                .from(fieldsonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.901+08:00", comments="Source Table: FIELDSONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Fieldsonly>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, integerfield, doublefield, floatfield)
                .from(fieldsonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.902+08:00", comments="Source Table: FIELDSONLY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Fieldsonly record) {
        return UpdateDSL.updateWithMapper(this::update, fieldsonly)
                .set(integerfield).equalTo(record::getIntegerfield)
                .set(doublefield).equalTo(record::getDoublefield)
                .set(floatfield).equalTo(record::getFloatfield);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.902+08:00", comments="Source Table: FIELDSONLY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Fieldsonly record) {
        return UpdateDSL.updateWithMapper(this::update, fieldsonly)
                .set(integerfield).equalToWhenPresent(record::getIntegerfield)
                .set(doublefield).equalToWhenPresent(record::getDoublefield)
                .set(floatfield).equalToWhenPresent(record::getFloatfield);
    }
}