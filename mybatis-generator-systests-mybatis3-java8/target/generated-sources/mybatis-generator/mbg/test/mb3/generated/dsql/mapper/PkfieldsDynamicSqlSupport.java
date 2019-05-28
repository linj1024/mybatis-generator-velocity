package mbg.test.mb3.generated.dsql.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PkfieldsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source Table: PKFIELDS")
    public static final Pkfields pkfields = new Pkfields();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.ID2")
    public static final SqlColumn<Integer> id2 = pkfields.id2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.ID1")
    public static final SqlColumn<Integer> id1 = pkfields.id1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.FIRSTNAME")
    public static final SqlColumn<String> firstname = pkfields.firstname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.LASTNAME")
    public static final SqlColumn<String> lastname = pkfields.lastname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.DATEFIELD")
    public static final SqlColumn<LocalDate> datefield = pkfields.datefield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source field: PKFIELDS.TIMEFIELD")
    public static final SqlColumn<LocalTime> timefield = pkfields.timefield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.TIMESTAMPFIELD")
    public static final SqlColumn<LocalDateTime> timestampfield = pkfields.timestampfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.DECIMAL30FIELD")
    public static final SqlColumn<Short> decimal30field = pkfields.decimal30field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.DECIMAL60FIELD")
    public static final SqlColumn<Integer> decimal60field = pkfields.decimal60field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.DECIMAL100FIELD")
    public static final SqlColumn<Long> decimal100field = pkfields.decimal100field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.DECIMAL155FIELD")
    public static final SqlColumn<BigDecimal> decimal155field = pkfields.decimal155field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.wierd$Field")
    public static final SqlColumn<Integer> wierdField = pkfields.wierdField;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.birth date")
    public static final SqlColumn<LocalDate> birthDate = pkfields.birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.908+08:00", comments="Source field: PKFIELDS.STRINGBOOLEAN")
    public static final SqlColumn<Boolean> stringboolean = pkfields.stringboolean;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.907+08:00", comments="Source Table: PKFIELDS")
    public static final class Pkfields extends SqlTable {
        public final SqlColumn<Integer> id2 = column("ID2", JDBCType.INTEGER);

        public final SqlColumn<Integer> id1 = column("ID1", JDBCType.INTEGER);

        public final SqlColumn<String> firstname = column("FIRSTNAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lastname = column("LASTNAME", JDBCType.VARCHAR);

        public final SqlColumn<LocalDate> datefield = column("DATEFIELD", JDBCType.DATE);

        public final SqlColumn<LocalTime> timefield = column("TIMEFIELD", JDBCType.TIME);

        public final SqlColumn<LocalDateTime> timestampfield = column("TIMESTAMPFIELD", JDBCType.TIMESTAMP);

        public final SqlColumn<Short> decimal30field = column("DECIMAL30FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Integer> decimal60field = column("DECIMAL60FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Long> decimal100field = column("DECIMAL100FIELD", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> decimal155field = column("DECIMAL155FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Integer> wierdField = column("\"wierd$Field\"", JDBCType.INTEGER);

        public final SqlColumn<LocalDate> birthDate = column("\"birth date\"", JDBCType.DATE);

        public final SqlColumn<Boolean> stringboolean = column("STRINGBOOLEAN", JDBCType.CHAR, "mbg.test.mb3.common.StringBooleanTypeHandler");

        public Pkfields() {
            super("PKFIELDS");
        }
    }
}