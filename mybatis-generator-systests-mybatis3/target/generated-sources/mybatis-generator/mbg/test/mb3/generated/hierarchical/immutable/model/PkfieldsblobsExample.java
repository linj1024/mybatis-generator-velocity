package mbg.test.mb3.generated.hierarchical.immutable.model;

import java.util.ArrayList;
import java.util.List;

public class PkfieldsblobsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public PkfieldsblobsExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andFirstnameIsNull() {
            addCriterion("A.FIRSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("A.FIRSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("A.FIRSTNAME =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("A.FIRSTNAME <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("A.FIRSTNAME >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("A.FIRSTNAME >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("A.FIRSTNAME <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("A.FIRSTNAME <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("A.FIRSTNAME like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("A.FIRSTNAME not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("A.FIRSTNAME in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("A.FIRSTNAME not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("A.FIRSTNAME between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("A.FIRSTNAME not between", value1, value2, "firstname");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated do_not_delete_during_merge Tue May 28 11:12:45 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
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