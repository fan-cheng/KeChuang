package cn.company.model;

/**
 * 专利
 */
public class PatentModel {

    private Integer id;

    /**专利名称**/
    private String patent_name;

    /**专利件数**/
    private String patent_number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatent_name() {
        return patent_name;
    }

    public void setPatent_name(String patent_name) {
        this.patent_name = patent_name;
    }

    public String getPatent_number() {
        return patent_number;
    }

    public void setPatent_number(String patent_number) {
        this.patent_number = patent_number;
    }

}
