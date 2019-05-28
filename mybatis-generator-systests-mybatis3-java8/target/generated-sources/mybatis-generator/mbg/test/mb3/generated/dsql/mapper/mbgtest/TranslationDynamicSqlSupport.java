package mbg.test.mb3.generated.dsql.mapper.mbgtest;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TranslationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    public static final Translation translation = new Translation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.ID")
    public static final SqlColumn<Integer> id = translation.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    public static final class Translation extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> translation = column("TRANSLATION", JDBCType.VARCHAR);

        public Translation() {
            super("MBGTEST.TRANSLATIONS");
        }
    }
}