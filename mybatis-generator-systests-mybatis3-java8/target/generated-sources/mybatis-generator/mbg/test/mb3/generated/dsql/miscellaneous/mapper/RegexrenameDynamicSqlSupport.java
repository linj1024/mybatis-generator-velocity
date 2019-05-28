package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RegexrenameDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Regexrename regexrename = new Regexrename();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = regexrename.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = regexrename.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> address = regexrename.address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> zipCode = regexrename.zipCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Regexrename extends SqlTable {
        public final SqlColumn<Integer> id = column("CUST_ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("CUST_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("CUST_ADDRESS", JDBCType.VARCHAR);

        public final SqlColumn<String> zipCode = column("ZIP_CODE", JDBCType.CHAR);

        public Regexrename() {
            super("REGEXRENAME");
        }
    }
}