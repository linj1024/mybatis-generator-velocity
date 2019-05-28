package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import mbg.test.mb3.common.TestEnum;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EnumtestDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Enumtest enumtest = new Enumtest();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = enumtest.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<TestEnum> name = enumtest.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Enumtest extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<TestEnum> name = column("NAME", JDBCType.VARCHAR);

        public Enumtest() {
            super("ENUMTEST");
        }
    }
}