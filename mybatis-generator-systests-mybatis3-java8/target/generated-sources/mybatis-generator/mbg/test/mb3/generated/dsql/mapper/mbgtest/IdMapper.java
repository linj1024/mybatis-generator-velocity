package mbg.test.mb3.generated.dsql.mapper.mbgtest;

import static mbg.test.mb3.generated.dsql.mapper.mbgtest.IdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.mbgtest.Id;
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
public interface IdMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.IDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.IDS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.IDS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Id> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("IdResult")
    Id selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="IdResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<Id> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(id);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, id);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, id)
                .where(id.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default int insert(Id record) {
        return insert(SqlBuilder.insert(record)
                .into(id)
                .map(id.id).toProperty("id")
                .map(description).toProperty("description")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default int insertSelective(Id record) {
        return insert(SqlBuilder.insert(record)
                .into(id)
                .map(id.id).toPropertyWhenPresent("id", record::getId)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Id>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id.id, description)
                .from(id);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Id>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id.id, description)
                .from(id);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default Id selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id.id, description)
                .from(id)
                .where(id.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Id record) {
        return UpdateDSL.updateWithMapper(this::update, id)
                .set(id.id).equalTo(record::getId)
                .set(description).equalTo(record::getDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Id record) {
        return UpdateDSL.updateWithMapper(this::update, id)
                .set(id.id).equalToWhenPresent(record::getId)
                .set(description).equalToWhenPresent(record::getDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default int updateByPrimaryKey(Id record) {
        return UpdateDSL.updateWithMapper(this::update, id)
                .set(description).equalTo(record::getDescription)
                .where(id.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.923+08:00", comments="Source Table: MBGTEST.IDS")
    default int updateByPrimaryKeySelective(Id record) {
        return UpdateDSL.updateWithMapper(this::update, id)
                .set(description).equalToWhenPresent(record::getDescription)
                .where(id.id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}