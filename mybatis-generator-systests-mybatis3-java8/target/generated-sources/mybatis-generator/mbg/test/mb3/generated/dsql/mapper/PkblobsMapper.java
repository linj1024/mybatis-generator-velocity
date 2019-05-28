package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.PkblobsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.Pkblobs;
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
public interface PkblobsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Pkblobs> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="BLOB1", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="BLOB2", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="CHARACTERLOB", javaType=String.class, jdbcType=JdbcType.CLOB)
    })
    Pkblobs selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="BLOB1", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="BLOB2", javaType=byte[].class, jdbcType=JdbcType.VARBINARY),
        @Arg(column="CHARACTERLOB", javaType=String.class, jdbcType=JdbcType.CLOB)
    })
    List<Pkblobs> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(pkblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkblobs)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default int insert(Pkblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(pkblobs)
                .map(id).toProperty("id")
                .map(blob1).toProperty("blob1")
                .map(blob2).toProperty("blob2")
                .map(characterlob).toProperty("characterlob")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default int insertSelective(Pkblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(pkblobs)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(blob1).toPropertyWhenPresent("blob1", record::getBlob1)
                .map(blob2).toPropertyWhenPresent("blob2", record::getBlob2)
                .map(characterlob).toPropertyWhenPresent("characterlob", record::getCharacterlob)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkblobs>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, blob1, blob2, characterlob)
                .from(pkblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source Table: PKBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkblobs>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, blob1, blob2, characterlob)
                .from(pkblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.912+08:00", comments="Source Table: PKBLOBS")
    default Pkblobs selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, blob1, blob2, characterlob)
                .from(pkblobs)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.912+08:00", comments="Source Table: PKBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Pkblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkblobs)
                .set(id).equalTo(record::getId)
                .set(blob1).equalTo(record::getBlob1)
                .set(blob2).equalTo(record::getBlob2)
                .set(characterlob).equalTo(record::getCharacterlob);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.912+08:00", comments="Source Table: PKBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Pkblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkblobs)
                .set(id).equalToWhenPresent(record::getId)
                .set(blob1).equalToWhenPresent(record::getBlob1)
                .set(blob2).equalToWhenPresent(record::getBlob2)
                .set(characterlob).equalToWhenPresent(record::getCharacterlob);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.912+08:00", comments="Source Table: PKBLOBS")
    default int updateByPrimaryKey(Pkblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkblobs)
                .set(blob1).equalTo(record::getBlob1)
                .set(blob2).equalTo(record::getBlob2)
                .set(characterlob).equalTo(record::getCharacterlob)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.912+08:00", comments="Source Table: PKBLOBS")
    default int updateByPrimaryKeySelective(Pkblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkblobs)
                .set(blob1).equalToWhenPresent(record::getBlob1)
                .set(blob2).equalToWhenPresent(record::getBlob2)
                .set(characterlob).equalToWhenPresent(record::getCharacterlob)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}