package mbg.test.mb3.generated.dsql.miscellaneous.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import mbg.test.common.FirstName;
import mbg.test.common.MyTime;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyObjectDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MyObject myObject = new MyObject();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id2 = myObject.id2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id1 = myObject.id1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<FirstName> firstname = myObject.firstname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lastname = myObject.lastname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startDate = myObject.startDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<MyTime> timefield = myObject.timefield;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> timestampfield = myObject.timestampfield;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> decimal60field = myObject.decimal60field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> decimal100field = myObject.decimal100field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Double> decimal155field = myObject.decimal155field;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> wierdField = myObject.wierdField;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> birthDate = myObject.birthDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> stringboolean = myObject.stringboolean;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MyObject extends SqlTable {
        public final SqlColumn<Integer> id2 = column("ID2", JDBCType.INTEGER);

        public final SqlColumn<Integer> id1 = column("ID1", JDBCType.INTEGER);

        public final SqlColumn<FirstName> firstname = column("FIRSTNAME", JDBCType.VARCHAR, "mbg.test.mb3.common.FirstNameTypeHandler");

        public final SqlColumn<String> lastname = column("LASTNAME", JDBCType.VARCHAR);

        public final SqlColumn<Date> startDate = column("DATEFIELD", JDBCType.DATE);

        public final SqlColumn<MyTime> timefield = column("TIMEFIELD", JDBCType.TIME, "mbg.test.mb3.common.MyTimeTypeHandler");

        public final SqlColumn<Date> timestampfield = column("TIMESTAMPFIELD", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> decimal60field = column("DECIMAL60FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Long> decimal100field = column("DECIMAL100FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Double> decimal155field = column("DECIMAL155FIELD", JDBCType.DECIMAL);

        public final SqlColumn<Integer> wierdField = column("\"wierd$Field\"", JDBCType.INTEGER);

        public final SqlColumn<Date> birthDate = column("\"birth date\"", JDBCType.DATE);

        public final SqlColumn<String> stringboolean = column("STRINGBOOLEAN", JDBCType.CHAR);

        public MyObject() {
            super("PKFIELDS");
        }
    }
}