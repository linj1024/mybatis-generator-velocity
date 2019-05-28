package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AwfulTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source Table: awful table")
    public static final AwfulTable awfulTable = new AwfulTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.CuStOmEr iD")
    public static final SqlColumn<Integer> customerId = awfulTable.customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.first name")
    public static final SqlColumn<String> firstFirstName = awfulTable.firstFirstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.FIRST_NAME")
    public static final SqlColumn<String> secondFirstName = awfulTable.secondFirstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.FIRSTNAME")
    public static final SqlColumn<String> thirdFirstName = awfulTable.thirdFirstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.last name")
    public static final SqlColumn<String> lastName = awfulTable.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.E_MAIL")
    public static final SqlColumn<String> eMail = awfulTable.eMail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table._id1")
    public static final SqlColumn<Integer> id1 = awfulTable.id1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.$id2")
    public static final SqlColumn<Integer> id2 = awfulTable.id2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.id5_")
    public static final SqlColumn<Integer> id5 = awfulTable.id5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.id6$")
    public static final SqlColumn<Integer> id6 = awfulTable.id6;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source field: awful table.id7$$")
    public static final SqlColumn<Integer> id7 = awfulTable.id7;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.EMAILADDRESS")
    public static final SqlColumn<String> emailaddress = awfulTable.emailaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.from")
    public static final SqlColumn<String> from = awfulTable.from;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.ACTIVE")
    public static final SqlColumn<Boolean> active = awfulTable.active;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.ACTIVE1")
    public static final SqlColumn<Boolean> active1 = awfulTable.active1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.ACTIVE2")
    public static final SqlColumn<byte[]> active2 = awfulTable.active2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.919+08:00", comments="Source field: awful table.CLASS")
    public static final SqlColumn<String> dbClass = awfulTable.dbClass;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.918+08:00", comments="Source Table: awful table")
    public static final class AwfulTable extends SqlTable {
        public final SqlColumn<Integer> customerId = column("\"CuStOmEr iD\"", JDBCType.INTEGER);

        public final SqlColumn<String> firstFirstName = column("\"first name\"", JDBCType.VARCHAR);

        public final SqlColumn<String> secondFirstName = column("FIRST_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> thirdFirstName = column("FIRSTNAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("\"last name\"", JDBCType.VARCHAR);

        public final SqlColumn<String> eMail = column("E_MAIL", JDBCType.VARCHAR);

        public final SqlColumn<Integer> id1 = column("\"_id1\"", JDBCType.INTEGER);

        public final SqlColumn<Integer> id2 = column("\"$id2\"", JDBCType.INTEGER);

        public final SqlColumn<Integer> id5 = column("\"id5_\"", JDBCType.INTEGER);

        public final SqlColumn<Integer> id6 = column("\"id6$\"", JDBCType.INTEGER);

        public final SqlColumn<Integer> id7 = column("\"id7$$\"", JDBCType.INTEGER);

        public final SqlColumn<String> emailaddress = column("EMAILADDRESS", JDBCType.VARCHAR);

        public final SqlColumn<String> from = column("\"from\"", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> active = column("ACTIVE", JDBCType.BIT);

        public final SqlColumn<Boolean> active1 = column("ACTIVE1", JDBCType.BOOLEAN);

        public final SqlColumn<byte[]> active2 = column("ACTIVE2", JDBCType.BIT);

        public final SqlColumn<String> dbClass = column("CLASS", JDBCType.VARCHAR);

        public AwfulTable() {
            super("\"awful table\"");
        }
    }
}