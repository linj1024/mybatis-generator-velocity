package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GeneratedalwaystestnoupdatesDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Generatedalwaystestnoupdates generatedalwaystestnoupdates = new Generatedalwaystestnoupdates();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = generatedalwaystestnoupdates.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> idPlus1 = generatedalwaystestnoupdates.idPlus1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> idPlus2 = generatedalwaystestnoupdates.idPlus2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Generatedalwaystestnoupdates extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> idPlus1 = column("ID_PLUS1", JDBCType.INTEGER);

        public final SqlColumn<Integer> idPlus2 = column("ID_PLUS2", JDBCType.INTEGER);

        public Generatedalwaystestnoupdates() {
            super("GENERATEDALWAYSTESTNOUPDATES");
        }
    }
}