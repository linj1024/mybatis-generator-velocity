package mbg.test.mb3.generated.dsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PkonlyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    public static final Pkonly pkonly = new Pkonly();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source field: PKONLY.ID")
    public static final SqlColumn<Integer> id = pkonly.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source field: PKONLY.SEQ_NUM")
    public static final SqlColumn<Integer> seqNum = pkonly.seqNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.904+08:00", comments="Source Table: PKONLY")
    public static final class Pkonly extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> seqNum = column("SEQ_NUM", JDBCType.INTEGER);

        public Pkonly() {
            super("PKONLY");
        }
    }
}