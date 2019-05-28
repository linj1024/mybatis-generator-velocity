package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FieldsblobsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    public static final Fieldsblobs fieldsblobs = new Fieldsblobs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.FIRSTNAME")
    public static final SqlColumn<String> firstname = fieldsblobs.firstname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.LASTNAME")
    public static final SqlColumn<String> lastname = fieldsblobs.lastname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.BLOB1")
    public static final SqlColumn<byte[]> blob1 = fieldsblobs.blob1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.BLOB2")
    public static final SqlColumn<byte[]> blob2 = fieldsblobs.blob2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source field: FIELDSBLOBS.BLOB3")
    public static final SqlColumn<byte[]> blob3 = fieldsblobs.blob3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.915+08:00", comments="Source Table: FIELDSBLOBS")
    public static final class Fieldsblobs extends SqlTable {
        public final SqlColumn<String> firstname = column("FIRSTNAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lastname = column("LASTNAME", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> blob1 = column("BLOB1", JDBCType.VARBINARY);

        public final SqlColumn<byte[]> blob2 = column("BLOB2", JDBCType.VARBINARY);

        public final SqlColumn<byte[]> blob3 = column("BLOB3", JDBCType.BINARY);

        public Fieldsblobs() {
            super("FIELDSBLOBS");
        }
    }
}