package mbg.test.mb3.generated.dsql.mapper.mbgtest;

import static mbg.test.mb3.generated.dsql.mapper.mbgtest.TranslationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.mbgtest.Translation;
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
public interface TranslationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Translation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TranslationResult")
    Translation selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TranslationResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TRANSLATION", property="translation", jdbcType=JdbcType.VARCHAR)
    })
    List<Translation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(translation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, translation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, translation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default int insert(Translation record) {
        return insert(SqlBuilder.insert(record)
                .into(translation)
                .map(id).toProperty("id")
                .map(translation.translation).toProperty("translation")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default int insertSelective(Translation record) {
        return insert(SqlBuilder.insert(record)
                .into(translation)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(translation.translation).toPropertyWhenPresent("translation", record::getTranslation)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Translation>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, translation.translation)
                .from(translation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Translation>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, translation.translation)
                .from(translation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default Translation selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, translation.translation)
                .from(translation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Translation record) {
        return UpdateDSL.updateWithMapper(this::update, translation)
                .set(id).equalTo(record::getId)
                .set(translation.translation).equalTo(record::getTranslation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.921+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Translation record) {
        return UpdateDSL.updateWithMapper(this::update, translation)
                .set(id).equalToWhenPresent(record::getId)
                .set(translation.translation).equalToWhenPresent(record::getTranslation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default int updateByPrimaryKey(Translation record) {
        return UpdateDSL.updateWithMapper(this::update, translation)
                .set(translation.translation).equalTo(record::getTranslation)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    default int updateByPrimaryKeySelective(Translation record) {
        return UpdateDSL.updateWithMapper(this::update, translation)
                .set(translation.translation).equalToWhenPresent(record::getTranslation)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}