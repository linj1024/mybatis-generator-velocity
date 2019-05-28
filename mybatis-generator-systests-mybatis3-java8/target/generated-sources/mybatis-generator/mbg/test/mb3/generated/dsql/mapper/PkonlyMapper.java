package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.PkonlyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.Pkonly;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
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
public interface PkonlyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Pkonly> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="SEQ_NUM", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true)
    })
    List<Pkonly> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(pkonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    default int deleteByPrimaryKey(Integer id_, Integer seqNum_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkonly)
                .where(id, isEqualTo(id_))
                .and(seqNum, isEqualTo(seqNum_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    default int insert(Pkonly record) {
        return insert(SqlBuilder.insert(record)
                .into(pkonly)
                .map(id).toProperty("id")
                .map(seqNum).toProperty("seqNum")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.905+08:00", comments="Source Table: PKONLY")
    default int insertSelective(Pkonly record) {
        return insert(SqlBuilder.insert(record)
                .into(pkonly)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(seqNum).toPropertyWhenPresent("seqNum", record::getSeqNum)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.905+08:00", comments="Source Table: PKONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkonly>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, seqNum)
                .from(pkonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.905+08:00", comments="Source Table: PKONLY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkonly>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, seqNum)
                .from(pkonly);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.905+08:00", comments="Source Table: PKONLY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Pkonly record) {
        return UpdateDSL.updateWithMapper(this::update, pkonly)
                .set(id).equalTo(record::getId)
                .set(seqNum).equalTo(record::getSeqNum);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.905+08:00", comments="Source Table: PKONLY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Pkonly record) {
        return UpdateDSL.updateWithMapper(this::update, pkonly)
                .set(id).equalToWhenPresent(record::getId)
                .set(seqNum).equalToWhenPresent(record::getSeqNum);
    }
}