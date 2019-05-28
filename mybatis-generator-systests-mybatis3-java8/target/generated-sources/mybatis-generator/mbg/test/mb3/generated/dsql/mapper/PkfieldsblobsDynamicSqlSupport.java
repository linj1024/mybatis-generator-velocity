package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PkfieldsblobsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    public static final Pkfieldsblobs pkfieldsblobs = new Pkfieldsblobs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source field: PKFIELDSBLOBS.ID1")
    public static final SqlColumn<Integer> id1 = pkfieldsblobs.id1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source field: PKFIELDSBLOBS.ID2")
    public static final SqlColumn<Integer> id2 = pkfieldsblobs.id2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source field: PKFIELDSBLOBS.FIRSTNAME")
    public static final SqlColumn<String> firstname = pkfieldsblobs.firstname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source field: PKFIELDSBLOBS.LASTNAME")
    public static final SqlColumn<String> lastname = pkfieldsblobs.lastname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source field: PKFIELDSBLOBS.BLOB1")
    public static final SqlColumn<byte[]> blob1 = pkfieldsblobs.blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.913+08:00", comments="Source Table: PKFIELDSBLOBS")
    public static final class Pkfieldsblobs extends SqlTable {
        public final SqlColumn<Integer> id1 = column("ID1", JDBCType.INTEGER);

        public final SqlColumn<Integer> id2 = column("ID2", JDBCType.INTEGER);

        public final SqlColumn<String> firstname = column("FIRSTNAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lastname = column("LASTNAME", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> blob1 = column("BLOB1", JDBCType.VARBINARY);

        public Pkfieldsblobs() {
            super("PKFIELDSBLOBS");
        }
    }
}