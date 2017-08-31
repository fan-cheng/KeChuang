package cn.company.model;
/**
 * 企业信息
 */

import java.util.List;

public class CompanyInfoModel {

    private Integer id;

    private String companyName;

    /**编号**/
    private String number;

    /**编号描述**/
    private String numberDes;

    /**项目情况**/
    private String projectState;

    /**省**/
    private String province;

    /**市**/
    private String city;

    /**区**/
    private String county;

    /**申报批次**/
    private String batch;

    /**申请类型**/
    private String applyCategory;

    /**填单日期**/
    private String createDate;

    /**最后更新时间**/
    private String updateLastDate;

    /**合同日期**/
    private String contractDate;

    /**款项期数**/
    private List<PaymentModel> paymentList;

    /**专利**/
    private List<PatentModel> patentList;

    /**公司联系人**/
    private List<CompanyContactModel> companyContactList;

    /**备注**/
    private String remark;

    /**填单员**/
    private String createName;

    /**营销员**/
    private String saleName;

    /**业务员**/
    private String businessName;

    /**技术咨询师**/
    private String technical;

    /**财务咨询师**/
    private String accountant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberDes() {
        return numberDes;
    }

    public void setNumberDes(String numberDes) {
        this.numberDes = numberDes;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateLastDate() {
        return updateLastDate;
    }

    public void setUpdateLastDate(String updateLastDate) {
        this.updateLastDate = updateLastDate;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public List<PaymentModel> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<PaymentModel> paymentList) {
        this.paymentList = paymentList;
    }

    public List<PatentModel> getPatentList() {
        return patentList;
    }

    public void setPatentList(List<PatentModel> patentList) {
        this.patentList = patentList;
    }

    public List<CompanyContactModel> getCompanyContactList() {
        return companyContactList;
    }

    public void setCompanyContactList(List<CompanyContactModel> companyContactList) {
        this.companyContactList = companyContactList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }
}
