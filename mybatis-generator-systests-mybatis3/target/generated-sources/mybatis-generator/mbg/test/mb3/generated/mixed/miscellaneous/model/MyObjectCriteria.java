package mbg.test.mb3.generated.mixed.miscellaneous.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import mbg.test.common.FirstName;
import mbg.test.common.MyTime;

public class MyObjectCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyObjectCriteria() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> firstnameCriteria;

        protected List<Criterion> timefieldCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
            firstnameCriteria = new ArrayList<>();
            timefieldCriteria = new ArrayList<>();
        }

        public List<Criterion> getFirstnameCriteria() {
            return firstnameCriteria;
        }

        protected void addFirstnameCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            firstnameCriteria.add(new Criterion(condition, value, "mbg.test.mb3.common.FirstNameTypeHandler"));
            allCriteria = null;
        }

        protected void addFirstnameCriterion(String condition, FirstName value1, FirstName value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            firstnameCriteria.add(new Criterion(condition, value1, value2, "mbg.test.mb3.common.FirstNameTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getTimefieldCriteria() {
            return timefieldCriteria;
        }

        protected void addTimefieldCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            timefieldCriteria.add(new Criterion(condition, value, "mbg.test.mb3.common.MyTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addTimefieldCriterion(String condition, MyTime value1, MyTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            timefieldCriteria.add(new Criterion(condition, value1, value2, "mbg.test.mb3.common.MyTimeTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || firstnameCriteria.size() > 0
                || timefieldCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(firstnameCriteria);
                allCriteria.addAll(timefieldCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andId2IsNull() {
            addCriterion("A.ID2 is null");
            return (Criteria) this;
        }

        public Criteria andId2IsNotNull() {
            addCriterion("A.ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andId2EqualTo(Integer value) {
            addCriterion("A.ID2 =", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotEqualTo(Integer value) {
            addCriterion("A.ID2 <>", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThan(Integer value) {
            addCriterion("A.ID2 >", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("A.ID2 >=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThan(Integer value) {
            addCriterion("A.ID2 <", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThanOrEqualTo(Integer value) {
            addCriterion("A.ID2 <=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2In(List<Integer> values) {
            addCriterion("A.ID2 in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotIn(List<Integer> values) {
            addCriterion("A.ID2 not in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2Between(Integer value1, Integer value2) {
            addCriterion("A.ID2 between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotBetween(Integer value1, Integer value2) {
            addCriterion("A.ID2 not between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andId1IsNull() {
            addCriterion("A.ID1 is null");
            return (Criteria) this;
        }

        public Criteria andId1IsNotNull() {
            addCriterion("A.ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andId1EqualTo(Integer value) {
            addCriterion("A.ID1 =", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotEqualTo(Integer value) {
            addCriterion("A.ID1 <>", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1GreaterThan(Integer value) {
            addCriterion("A.ID1 >", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("A.ID1 >=", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1LessThan(Integer value) {
            addCriterion("A.ID1 <", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1LessThanOrEqualTo(Integer value) {
            addCriterion("A.ID1 <=", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1In(List<Integer> values) {
            addCriterion("A.ID1 in", values, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotIn(List<Integer> values) {
            addCriterion("A.ID1 not in", values, "id1");
            return (Criteria) this;
        }

        public Criteria andId1Between(Integer value1, Integer value2) {
            addCriterion("A.ID1 between", value1, value2, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotBetween(Integer value1, Integer value2) {
            addCriterion("A.ID1 not between", value1, value2, "id1");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("A.FIRSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("A.FIRSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(FirstName value) {
            addFirstnameCriterion("A.FIRSTNAME not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<FirstName> values) {
            addFirstnameCriterion("A.FIRSTNAME in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<FirstName> values) {
            addFirstnameCriterion("A.FIRSTNAME not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(FirstName value1, FirstName value2) {
            addFirstnameCriterion("A.FIRSTNAME between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(FirstName value1, FirstName value2) {
            addFirstnameCriterion("A.FIRSTNAME not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("A.LASTNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("A.LASTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("A.LASTNAME =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("A.LASTNAME <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("A.LASTNAME >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("A.LASTNAME >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("A.LASTNAME <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("A.LASTNAME <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("A.LASTNAME like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("A.LASTNAME not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("A.LASTNAME in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("A.LASTNAME not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("A.LASTNAME between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("A.LASTNAME not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("A.DATEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("A.DATEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("A.DATEFIELD <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("A.DATEFIELD in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("A.DATEFIELD not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("A.DATEFIELD between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("A.DATEFIELD not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andTimefieldIsNull() {
            addCriterion("A.TIMEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andTimefieldIsNotNull() {
            addCriterion("A.TIMEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andTimefieldEqualTo(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD =", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldNotEqualTo(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD <>", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldGreaterThan(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD >", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldGreaterThanOrEqualTo(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD >=", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldLessThan(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD <", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldLessThanOrEqualTo(MyTime value) {
            addTimefieldCriterion("A.TIMEFIELD <=", value, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldIn(List<MyTime> values) {
            addTimefieldCriterion("A.TIMEFIELD in", values, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldNotIn(List<MyTime> values) {
            addTimefieldCriterion("A.TIMEFIELD not in", values, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldBetween(MyTime value1, MyTime value2) {
            addTimefieldCriterion("A.TIMEFIELD between", value1, value2, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimefieldNotBetween(MyTime value1, MyTime value2) {
            addTimefieldCriterion("A.TIMEFIELD not between", value1, value2, "timefield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldIsNull() {
            addCriterion("A.TIMESTAMPFIELD is null");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldIsNotNull() {
            addCriterion("A.TIMESTAMPFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldEqualTo(Date value) {
            addCriterion("A.TIMESTAMPFIELD =", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldNotEqualTo(Date value) {
            addCriterion("A.TIMESTAMPFIELD <>", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldGreaterThan(Date value) {
            addCriterion("A.TIMESTAMPFIELD >", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldGreaterThanOrEqualTo(Date value) {
            addCriterion("A.TIMESTAMPFIELD >=", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldLessThan(Date value) {
            addCriterion("A.TIMESTAMPFIELD <", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldLessThanOrEqualTo(Date value) {
            addCriterion("A.TIMESTAMPFIELD <=", value, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldIn(List<Date> values) {
            addCriterion("A.TIMESTAMPFIELD in", values, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldNotIn(List<Date> values) {
            addCriterion("A.TIMESTAMPFIELD not in", values, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldBetween(Date value1, Date value2) {
            addCriterion("A.TIMESTAMPFIELD between", value1, value2, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andTimestampfieldNotBetween(Date value1, Date value2) {
            addCriterion("A.TIMESTAMPFIELD not between", value1, value2, "timestampfield");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldIsNull() {
            addCriterion("A.DECIMAL60FIELD is null");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldIsNotNull() {
            addCriterion("A.DECIMAL60FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldEqualTo(int value) {
            addCriterion("A.DECIMAL60FIELD =", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldNotEqualTo(int value) {
            addCriterion("A.DECIMAL60FIELD <>", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldGreaterThan(int value) {
            addCriterion("A.DECIMAL60FIELD >", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldGreaterThanOrEqualTo(int value) {
            addCriterion("A.DECIMAL60FIELD >=", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldLessThan(int value) {
            addCriterion("A.DECIMAL60FIELD <", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldLessThanOrEqualTo(int value) {
            addCriterion("A.DECIMAL60FIELD <=", value, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldIn(List<Integer> values) {
            addCriterion("A.DECIMAL60FIELD in", values, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldNotIn(List<Integer> values) {
            addCriterion("A.DECIMAL60FIELD not in", values, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldBetween(int value1, int value2) {
            addCriterion("A.DECIMAL60FIELD between", value1, value2, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal60fieldNotBetween(int value1, int value2) {
            addCriterion("A.DECIMAL60FIELD not between", value1, value2, "decimal60field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldIsNull() {
            addCriterion("A.DECIMAL100FIELD is null");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldIsNotNull() {
            addCriterion("A.DECIMAL100FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldEqualTo(Long value) {
            addCriterion("A.DECIMAL100FIELD =", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldNotEqualTo(Long value) {
            addCriterion("A.DECIMAL100FIELD <>", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldGreaterThan(Long value) {
            addCriterion("A.DECIMAL100FIELD >", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldGreaterThanOrEqualTo(Long value) {
            addCriterion("A.DECIMAL100FIELD >=", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldLessThan(Long value) {
            addCriterion("A.DECIMAL100FIELD <", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldLessThanOrEqualTo(Long value) {
            addCriterion("A.DECIMAL100FIELD <=", value, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldIn(List<Long> values) {
            addCriterion("A.DECIMAL100FIELD in", values, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldNotIn(List<Long> values) {
            addCriterion("A.DECIMAL100FIELD not in", values, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldBetween(Long value1, Long value2) {
            addCriterion("A.DECIMAL100FIELD between", value1, value2, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal100fieldNotBetween(Long value1, Long value2) {
            addCriterion("A.DECIMAL100FIELD not between", value1, value2, "decimal100field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldIsNull() {
            addCriterion("A.DECIMAL155FIELD is null");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldIsNotNull() {
            addCriterion("A.DECIMAL155FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldEqualTo(Double value) {
            addCriterion("A.DECIMAL155FIELD =", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldNotEqualTo(Double value) {
            addCriterion("A.DECIMAL155FIELD <>", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldGreaterThan(Double value) {
            addCriterion("A.DECIMAL155FIELD >", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldGreaterThanOrEqualTo(Double value) {
            addCriterion("A.DECIMAL155FIELD >=", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldLessThan(Double value) {
            addCriterion("A.DECIMAL155FIELD <", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldLessThanOrEqualTo(Double value) {
            addCriterion("A.DECIMAL155FIELD <=", value, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldIn(List<Double> values) {
            addCriterion("A.DECIMAL155FIELD in", values, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldNotIn(List<Double> values) {
            addCriterion("A.DECIMAL155FIELD not in", values, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldBetween(Double value1, Double value2) {
            addCriterion("A.DECIMAL155FIELD between", value1, value2, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andDecimal155fieldNotBetween(Double value1, Double value2) {
            addCriterion("A.DECIMAL155FIELD not between", value1, value2, "decimal155field");
            return (Criteria) this;
        }

        public Criteria andWierdFieldIsNull() {
            addCriterion("A.\"wierd$Field\" is null");
            return (Criteria) this;
        }

        public Criteria andWierdFieldIsNotNull() {
            addCriterion("A.\"wierd$Field\" is not null");
            return (Criteria) this;
        }

        public Criteria andWierdFieldEqualTo(Integer value) {
            addCriterion("A.\"wierd$Field\" =", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldNotEqualTo(Integer value) {
            addCriterion("A.\"wierd$Field\" <>", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldGreaterThan(Integer value) {
            addCriterion("A.\"wierd$Field\" >", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("A.\"wierd$Field\" >=", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldLessThan(Integer value) {
            addCriterion("A.\"wierd$Field\" <", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldLessThanOrEqualTo(Integer value) {
            addCriterion("A.\"wierd$Field\" <=", value, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldIn(List<Integer> values) {
            addCriterion("A.\"wierd$Field\" in", values, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldNotIn(List<Integer> values) {
            addCriterion("A.\"wierd$Field\" not in", values, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldBetween(Integer value1, Integer value2) {
            addCriterion("A.\"wierd$Field\" between", value1, value2, "wierdField");
            return (Criteria) this;
        }

        public Criteria andWierdFieldNotBetween(Integer value1, Integer value2) {
            addCriterion("A.\"wierd$Field\" not between", value1, value2, "wierdField");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("A.\"birth date\" is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("A.\"birth date\" is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("A.\"birth date\" <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("A.\"birth date\" in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("A.\"birth date\" not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("A.\"birth date\" between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("A.\"birth date\" not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andStringbooleanIsNull() {
            addCriterion("A.STRINGBOOLEAN is null");
            return (Criteria) this;
        }

        public Criteria andStringbooleanIsNotNull() {
            addCriterion("A.STRINGBOOLEAN is not null");
            return (Criteria) this;
        }

        public Criteria andStringbooleanEqualTo(String value) {
            addCriterion("A.STRINGBOOLEAN =", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanNotEqualTo(String value) {
            addCriterion("A.STRINGBOOLEAN <>", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanGreaterThan(String value) {
            addCriterion("A.STRINGBOOLEAN >", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanGreaterThanOrEqualTo(String value) {
            addCriterion("A.STRINGBOOLEAN >=", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanLessThan(String value) {
            addCriterion("A.STRINGBOOLEAN <", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanLessThanOrEqualTo(String value) {
            addCriterion("A.STRINGBOOLEAN <=", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanLike(String value) {
            addCriterion("A.STRINGBOOLEAN like", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanNotLike(String value) {
            addCriterion("A.STRINGBOOLEAN not like", value, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanIn(List<String> values) {
            addCriterion("A.STRINGBOOLEAN in", values, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanNotIn(List<String> values) {
            addCriterion("A.STRINGBOOLEAN not in", values, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanBetween(String value1, String value2) {
            addCriterion("A.STRINGBOOLEAN between", value1, value2, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andStringbooleanNotBetween(String value1, String value2) {
            addCriterion("A.STRINGBOOLEAN not between", value1, value2, "stringboolean");
            return (Criteria) this;
        }

        public Criteria andLastnameLikeInsensitive(String value) {
            addCriterion("upper(A.LASTNAME) like", value.toUpperCase(), "lastname");
            return (Criteria) this;
        }

        public Criteria andStringbooleanLikeInsensitive(String value) {
            addCriterion("upper(A.STRINGBOOLEAN) like", value.toUpperCase(), "stringboolean");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}