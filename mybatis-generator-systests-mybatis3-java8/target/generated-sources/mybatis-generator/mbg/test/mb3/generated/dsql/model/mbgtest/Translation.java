package mbg.test.mb3.generated.dsql.model.mbgtest;

import javax.annotation.Generated;

public class Translation {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.TRANSLATION")
    private String translation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.TRANSLATION")
    public String getTranslation() {
        return translation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source field: MBGTEST.TRANSLATIONS.TRANSLATION")
    public void setTranslation(String translation) {
        this.translation = translation == null ? null : translation.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Translation other = (Translation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTranslation() == null ? other.getTranslation() == null : this.getTranslation().equals(other.getTranslation()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-05-28T11:12:56.92+08:00", comments="Source Table: MBGTEST.TRANSLATIONS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTranslation() == null) ? 0 : getTranslation().hashCode());
        return result;
    }
}