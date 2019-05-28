package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GeneratedalwaystestDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Generatedalwaystest generatedalwaystest = new Generatedalwaystest();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = generatedalwaystest.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = generatedalwaystest.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> idPlus1 = generatedalwaystest.idPlus1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> idPlus2 = generatedalwaystest.idPlus2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> blob1 = generatedalwaystest.blob1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Generatedalwaystest extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> idPlus1 = column("ID_PLUS1", JDBCType.INTEGER);

        public final SqlColumn<Integer> idPlus2 = column("ID_PLUS2", JDBCType.INTEGER);

        public final SqlColumn<byte[]> blob1 = column("BLOB1", JDBCType.VARBINARY);

        public Generatedalwaystest() {
            super("GENERATEDALWAYSTEST");
        }
    }
}