package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PkblobsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.91+08:00", comments="Source Table: PKBLOBS")
    public static final Pkblobs pkblobs = new Pkblobs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source field: PKBLOBS.ID")
    public static final SqlColumn<Integer> id = pkblobs.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source field: PKBLOBS.BLOB1")
    public static final SqlColumn<byte[]> blob1 = pkblobs.blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source field: PKBLOBS.BLOB2")
    public static final SqlColumn<byte[]> blob2 = pkblobs.blob2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.911+08:00", comments="Source field: PKBLOBS.CHARACTERLOB")
    public static final SqlColumn<String> characterlob = pkblobs.characterlob;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.91+08:00", comments="Source Table: PKBLOBS")
    public static final class Pkblobs extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<byte[]> blob1 = column("BLOB1", JDBCType.VARBINARY);

        public final SqlColumn<byte[]> blob2 = column("BLOB2", JDBCType.VARBINARY);

        public final SqlColumn<String> characterlob = column("CHARACTERLOB", JDBCType.CLOB);

        public Pkblobs() {
            super("PKBLOBS");
        }
    }
}