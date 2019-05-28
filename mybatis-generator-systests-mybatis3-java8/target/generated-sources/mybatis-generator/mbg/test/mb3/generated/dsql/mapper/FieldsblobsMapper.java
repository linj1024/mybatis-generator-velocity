package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.FieldsblobsDynamicSqlSupport.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.Fieldsblobs;
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
public interface FieldsblobsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Fieldsblobs> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FieldsblobsResult", value = {
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB3", property="blob3", jdbcType=JdbcType.BINARY)
    })
    List<Fieldsblobs> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(fieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, fieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    default int insert(Fieldsblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(fieldsblobs)
                .map(firstname).toProperty("firstname")
                .map(lastname).toProperty("lastname")
                .map(blob1).toProperty("blob1")
                .map(blob2).toProperty("blob2")
                .map(blob3).toProperty("blob3")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    default int insertSelective(Fieldsblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(fieldsblobs)
                .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
                .map(lastname).toPropertyWhenPresent("lastname", record::getLastname)
                .map(blob1).toPropertyWhenPresent("blob1", record::getBlob1)
                .map(blob2).toPropertyWhenPresent("blob2", record::getBlob2)
                .map(blob3).toPropertyWhenPresent("blob3", record::getBlob3)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Fieldsblobs>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, firstname, lastname, blob1, blob2, blob3)
                .from(fieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.916+08:00", comments="Source Table: FIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Fieldsblobs>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, firstname, lastname, blob1, blob2, blob3)
                .from(fieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.916+08:00", comments="Source Table: FIELDSBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Fieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, fieldsblobs)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(blob1).equalTo(record::getBlob1)
                .set(blob2).equalTo(record::getBlob2)
                .set(blob3).equalTo(record::getBlob3);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.916+08:00", comments="Source Table: FIELDSBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Fieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, fieldsblobs)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(blob1).equalToWhenPresent(record::getBlob1)
                .set(blob2).equalToWhenPresent(record::getBlob2)
                .set(blob3).equalToWhenPresent(record::getBlob3);
    }
}