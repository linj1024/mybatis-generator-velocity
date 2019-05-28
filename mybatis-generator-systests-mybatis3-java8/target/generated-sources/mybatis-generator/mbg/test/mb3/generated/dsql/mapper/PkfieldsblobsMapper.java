package mbg.test.mb3.generated.dsql.mapper;

import static mbg.test.mb3.generated.dsql.mapper.PkfieldsblobsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.List;
import javax.annotation.Generated;
import mbg.test.mb3.generated.dsql.model.Pkfieldsblobs;
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
public interface PkfieldsblobsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Pkfieldsblobs> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PkfieldsblobsResult")
    Pkfieldsblobs selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PkfieldsblobsResult", value = {
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY)
    })
    List<Pkfieldsblobs> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(pkfieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkfieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default int deleteByPrimaryKey(Integer id1_, Integer id2_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, pkfieldsblobs)
                .where(id1, isEqualTo(id1_))
                .and(id2, isEqualTo(id2_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default int insert(Pkfieldsblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(pkfieldsblobs)
                .map(id1).toProperty("id1")
                .map(id2).toProperty("id2")
                .map(firstname).toProperty("firstname")
                .map(lastname).toProperty("lastname")
                .map(blob1).toProperty("blob1")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default int insertSelective(Pkfieldsblobs record) {
        return insert(SqlBuilder.insert(record)
                .into(pkfieldsblobs)
                .map(id1).toPropertyWhenPresent("id1", record::getId1)
                .map(id2).toPropertyWhenPresent("id2", record::getId2)
                .map(firstname).toPropertyWhenPresent("firstname", record::getFirstname)
                .map(lastname).toPropertyWhenPresent("lastname", record::getLastname)
                .map(blob1).toPropertyWhenPresent("blob1", record::getBlob1)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkfieldsblobs>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id1, id2, firstname, lastname, blob1)
                .from(pkfieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Pkfieldsblobs>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id1, id2, firstname, lastname, blob1)
                .from(pkfieldsblobs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default Pkfieldsblobs selectByPrimaryKey(Integer id1_, Integer id2_) {
        return SelectDSL.selectWithMapper(this::selectOne, id1, id2, firstname, lastname, blob1)
                .from(pkfieldsblobs)
                .where(id1, isEqualTo(id1_))
                .and(id2, isEqualTo(id2_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Pkfieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkfieldsblobs)
                .set(id1).equalTo(record::getId1)
                .set(id2).equalTo(record::getId2)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(blob1).equalTo(record::getBlob1);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Pkfieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkfieldsblobs)
                .set(id1).equalToWhenPresent(record::getId1)
                .set(id2).equalToWhenPresent(record::getId2)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(blob1).equalToWhenPresent(record::getBlob1);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default int updateByPrimaryKey(Pkfieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkfieldsblobs)
                .set(firstname).equalTo(record::getFirstname)
                .set(lastname).equalTo(record::getLastname)
                .set(blob1).equalTo(record::getBlob1)
                .where(id1, isEqualTo(record::getId1))
                .and(id2, isEqualTo(record::getId2))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.914+08:00", comments="Source Table: PKFIELDSBLOBS")
    default int updateByPrimaryKeySelective(Pkfieldsblobs record) {
        return UpdateDSL.updateWithMapper(this::update, pkfieldsblobs)
                .set(firstname).equalToWhenPresent(record::getFirstname)
                .set(lastname).equalToWhenPresent(record::getLastname)
                .set(blob1).equalToWhenPresent(record::getBlob1)
                .where(id1, isEqualTo(record::getId1))
                .and(id2, isEqualTo(record::getId2))
                .build()
                .execute();
    }
}