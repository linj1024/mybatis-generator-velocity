package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FieldsonlyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.893+08:00", comments="Source Table: FIELDSONLY")
    public static final Fieldsonly fieldsonly = new Fieldsonly();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.893+08:00", comments="Source field: FIELDSONLY.INTEGERFIELD")
    public static final SqlColumn<Integer> integerfield = fieldsonly.integerfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.893+08:00", comments="Source field: FIELDSONLY.DOUBLEFIELD")
    public static final SqlColumn<Double> doublefield = fieldsonly.doublefield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.894+08:00", comments="Source field: FIELDSONLY.FLOATFIELD")
    public static final SqlColumn<Double> floatfield = fieldsonly.floatfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.893+08:00", comments="Source Table: FIELDSONLY")
    public static final class Fieldsonly extends SqlTable {
        public final SqlColumn<Integer> integerfield = column("INTEGERFIELD", JDBCType.INTEGER);

        public final SqlColumn<Double> doublefield = column("DOUBLEFIELD", JDBCType.DOUBLE);

        public final SqlColumn<Double> floatfield = column("FLOATFIELD", JDBCType.DOUBLE);

        public Fieldsonly() {
            super("FIELDSONLY");
        }
    }
}