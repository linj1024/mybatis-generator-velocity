package mbg.test.mb3.generated.conditional.immutable.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pkfields extends PkfieldsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.FIRSTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.LASTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.DATEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Date datefield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.TIMEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Date timefield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.TIMESTAMPFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Date timestampfield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.DECIMAL30FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Short decimal30field;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.DECIMAL60FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Integer decimal60field;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.DECIMAL100FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Long decimal100field;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.DECIMAL155FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private BigDecimal decimal155field;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.wierd$Field
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Integer wierdField;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.birth date
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private Date birthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDS.STRINGBOOLEAN
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    private String stringboolean;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Pkfields(Integer id2, Integer id1, String firstname, String lastname, Date datefield, Date timefield, Date timestampfield, Short decimal30field, Integer decimal60field, Long decimal100field, BigDecimal decimal155field, Integer wierdField, Date birthDate, String stringboolean) {
        super(id2, id1);
        this.firstname = firstname;
        this.lastname = lastname;
        this.datefield = datefield;
        this.timefield = timefield;
        this.timestampfield = timestampfield;
        this.decimal30field = decimal30field;
        this.decimal60field = decimal60field;
        this.decimal100field = decimal100field;
        this.decimal155field = decimal155field;
        this.wierdField = wierdField;
        this.birthDate = birthDate;
        this.stringboolean = stringboolean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Pkfields() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.FIRSTNAME
     *
     * @return the value of PKFIELDS.FIRSTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.FIRSTNAME
     *
     * @param firstname the value for PKFIELDS.FIRSTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.LASTNAME
     *
     * @return the value of PKFIELDS.LASTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.LASTNAME
     *
     * @param lastname the value for PKFIELDS.LASTNAME
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.DATEFIELD
     *
     * @return the value of PKFIELDS.DATEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Date getDatefield() {
        return datefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.DATEFIELD
     *
     * @param datefield the value for PKFIELDS.DATEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDatefield(Date datefield) {
        this.datefield = datefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.TIMEFIELD
     *
     * @return the value of PKFIELDS.TIMEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Date getTimefield() {
        return timefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.TIMEFIELD
     *
     * @param timefield the value for PKFIELDS.TIMEFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setTimefield(Date timefield) {
        this.timefield = timefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.TIMESTAMPFIELD
     *
     * @return the value of PKFIELDS.TIMESTAMPFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Date getTimestampfield() {
        return timestampfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.TIMESTAMPFIELD
     *
     * @param timestampfield the value for PKFIELDS.TIMESTAMPFIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setTimestampfield(Date timestampfield) {
        this.timestampfield = timestampfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.DECIMAL30FIELD
     *
     * @return the value of PKFIELDS.DECIMAL30FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Short getDecimal30field() {
        return decimal30field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.DECIMAL30FIELD
     *
     * @param decimal30field the value for PKFIELDS.DECIMAL30FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDecimal30field(Short decimal30field) {
        this.decimal30field = decimal30field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.DECIMAL60FIELD
     *
     * @return the value of PKFIELDS.DECIMAL60FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Integer getDecimal60field() {
        return decimal60field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.DECIMAL60FIELD
     *
     * @param decimal60field the value for PKFIELDS.DECIMAL60FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDecimal60field(Integer decimal60field) {
        this.decimal60field = decimal60field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.DECIMAL100FIELD
     *
     * @return the value of PKFIELDS.DECIMAL100FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Long getDecimal100field() {
        return decimal100field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.DECIMAL100FIELD
     *
     * @param decimal100field the value for PKFIELDS.DECIMAL100FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDecimal100field(Long decimal100field) {
        this.decimal100field = decimal100field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.DECIMAL155FIELD
     *
     * @return the value of PKFIELDS.DECIMAL155FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public BigDecimal getDecimal155field() {
        return decimal155field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.DECIMAL155FIELD
     *
     * @param decimal155field the value for PKFIELDS.DECIMAL155FIELD
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setDecimal155field(BigDecimal decimal155field) {
        this.decimal155field = decimal155field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.wierd$Field
     *
     * @return the value of PKFIELDS.wierd$Field
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Integer getWierdField() {
        return wierdField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.wierd$Field
     *
     * @param wierdField the value for PKFIELDS.wierd$Field
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setWierdField(Integer wierdField) {
        this.wierdField = wierdField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.birth date
     *
     * @return the value of PKFIELDS.birth date
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.birth date
     *
     * @param birthDate the value for PKFIELDS.birth date
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDS.STRINGBOOLEAN
     *
     * @return the value of PKFIELDS.STRINGBOOLEAN
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public String getStringboolean() {
        return stringboolean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDS.STRINGBOOLEAN
     *
     * @param stringboolean the value for PKFIELDS.STRINGBOOLEAN
     *
     * @mbg.generated Tue May 28 11:12:45 CST 2019
     */
    public void setStringboolean(String stringboolean) {
        this.stringboolean = stringboolean == null ? null : stringboolean.trim();
    }
}