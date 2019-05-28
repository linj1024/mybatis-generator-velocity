package mbg.test.mb3.generated.dsql.mapper.mbgtest;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IdDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.IDS")
    public static final Id id = new Id();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source field: MBGTEST.IDS.DESCRIPTION")
    public static final SqlColumn<String> description = id.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.922+08:00", comments="Source Table: MBGTEST.IDS")
    public static final class Id extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

        public Id() {
            super("MBGTEST.IDS");
        }
    }
}