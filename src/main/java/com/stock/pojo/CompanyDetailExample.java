package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameIsNull() {
            addCriterion("company_cname is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameIsNotNull() {
            addCriterion("company_cname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameEqualTo(String value) {
            addCriterion("company_cname =", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameNotEqualTo(String value) {
            addCriterion("company_cname <>", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameGreaterThan(String value) {
            addCriterion("company_cname >", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameGreaterThanOrEqualTo(String value) {
            addCriterion("company_cname >=", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameLessThan(String value) {
            addCriterion("company_cname <", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameLessThanOrEqualTo(String value) {
            addCriterion("company_cname <=", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameLike(String value) {
            addCriterion("company_cname like", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameNotLike(String value) {
            addCriterion("company_cname not like", value, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameIn(List<String> values) {
            addCriterion("company_cname in", values, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameNotIn(List<String> values) {
            addCriterion("company_cname not in", values, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameBetween(String value1, String value2) {
            addCriterion("company_cname between", value1, value2, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyCnameNotBetween(String value1, String value2) {
            addCriterion("company_cname not between", value1, value2, "companyCname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameIsNull() {
            addCriterion("company_ename is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameIsNotNull() {
            addCriterion("company_ename is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameEqualTo(String value) {
            addCriterion("company_ename =", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameNotEqualTo(String value) {
            addCriterion("company_ename <>", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameGreaterThan(String value) {
            addCriterion("company_ename >", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameGreaterThanOrEqualTo(String value) {
            addCriterion("company_ename >=", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameLessThan(String value) {
            addCriterion("company_ename <", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameLessThanOrEqualTo(String value) {
            addCriterion("company_ename <=", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameLike(String value) {
            addCriterion("company_ename like", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameNotLike(String value) {
            addCriterion("company_ename not like", value, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameIn(List<String> values) {
            addCriterion("company_ename in", values, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameNotIn(List<String> values) {
            addCriterion("company_ename not in", values, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameBetween(String value1, String value2) {
            addCriterion("company_ename between", value1, value2, "companyEname");
            return (Criteria) this;
        }

        public Criteria andCompanyEnameNotBetween(String value1, String value2) {
            addCriterion("company_ename not between", value1, value2, "companyEname");
            return (Criteria) this;
        }

        public Criteria andListMarketIsNull() {
            addCriterion("list_market is null");
            return (Criteria) this;
        }

        public Criteria andListMarketIsNotNull() {
            addCriterion("list_market is not null");
            return (Criteria) this;
        }

        public Criteria andListMarketEqualTo(String value) {
            addCriterion("list_market =", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketNotEqualTo(String value) {
            addCriterion("list_market <>", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketGreaterThan(String value) {
            addCriterion("list_market >", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketGreaterThanOrEqualTo(String value) {
            addCriterion("list_market >=", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketLessThan(String value) {
            addCriterion("list_market <", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketLessThanOrEqualTo(String value) {
            addCriterion("list_market <=", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketLike(String value) {
            addCriterion("list_market like", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketNotLike(String value) {
            addCriterion("list_market not like", value, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketIn(List<String> values) {
            addCriterion("list_market in", values, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketNotIn(List<String> values) {
            addCriterion("list_market not in", values, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketBetween(String value1, String value2) {
            addCriterion("list_market between", value1, value2, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListMarketNotBetween(String value1, String value2) {
            addCriterion("list_market not between", value1, value2, "listMarket");
            return (Criteria) this;
        }

        public Criteria andListDateIsNull() {
            addCriterion("list_date is null");
            return (Criteria) this;
        }

        public Criteria andListDateIsNotNull() {
            addCriterion("list_date is not null");
            return (Criteria) this;
        }

        public Criteria andListDateEqualTo(String value) {
            addCriterion("list_date =", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotEqualTo(String value) {
            addCriterion("list_date <>", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThan(String value) {
            addCriterion("list_date >", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThanOrEqualTo(String value) {
            addCriterion("list_date >=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThan(String value) {
            addCriterion("list_date <", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThanOrEqualTo(String value) {
            addCriterion("list_date <=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLike(String value) {
            addCriterion("list_date like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotLike(String value) {
            addCriterion("list_date not like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateIn(List<String> values) {
            addCriterion("list_date in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotIn(List<String> values) {
            addCriterion("list_date not in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateBetween(String value1, String value2) {
            addCriterion("list_date between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotBetween(String value1, String value2) {
            addCriterion("list_date not between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNull() {
            addCriterion("issue_price is null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNotNull() {
            addCriterion("issue_price is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceEqualTo(String value) {
            addCriterion("issue_price =", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotEqualTo(String value) {
            addCriterion("issue_price <>", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThan(String value) {
            addCriterion("issue_price >", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThanOrEqualTo(String value) {
            addCriterion("issue_price >=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThan(String value) {
            addCriterion("issue_price <", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThanOrEqualTo(String value) {
            addCriterion("issue_price <=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLike(String value) {
            addCriterion("issue_price like", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotLike(String value) {
            addCriterion("issue_price not like", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIn(List<String> values) {
            addCriterion("issue_price in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotIn(List<String> values) {
            addCriterion("issue_price not in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceBetween(String value1, String value2) {
            addCriterion("issue_price between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotBetween(String value1, String value2) {
            addCriterion("issue_price not between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterIsNull() {
            addCriterion("master_underwriter is null");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterIsNotNull() {
            addCriterion("master_underwriter is not null");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterEqualTo(String value) {
            addCriterion("master_underwriter =", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterNotEqualTo(String value) {
            addCriterion("master_underwriter <>", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterGreaterThan(String value) {
            addCriterion("master_underwriter >", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterGreaterThanOrEqualTo(String value) {
            addCriterion("master_underwriter >=", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterLessThan(String value) {
            addCriterion("master_underwriter <", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterLessThanOrEqualTo(String value) {
            addCriterion("master_underwriter <=", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterLike(String value) {
            addCriterion("master_underwriter like", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterNotLike(String value) {
            addCriterion("master_underwriter not like", value, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterIn(List<String> values) {
            addCriterion("master_underwriter in", values, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterNotIn(List<String> values) {
            addCriterion("master_underwriter not in", values, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterBetween(String value1, String value2) {
            addCriterion("master_underwriter between", value1, value2, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andMasterUnderwriterNotBetween(String value1, String value2) {
            addCriterion("master_underwriter not between", value1, value2, "masterUnderwriter");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(String value) {
            addCriterion("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(String value) {
            addCriterion("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(String value) {
            addCriterion("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(String value) {
            addCriterion("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(String value) {
            addCriterion("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(String value) {
            addCriterion("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLike(String value) {
            addCriterion("establish_date like", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotLike(String value) {
            addCriterion("establish_date not like", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<String> values) {
            addCriterion("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<String> values) {
            addCriterion("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(String value1, String value2) {
            addCriterion("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(String value1, String value2) {
            addCriterion("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNull() {
            addCriterion("register_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNotNull() {
            addCriterion("register_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalEqualTo(String value) {
            addCriterion("register_capital =", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotEqualTo(String value) {
            addCriterion("register_capital <>", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThan(String value) {
            addCriterion("register_capital >", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("register_capital >=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThan(String value) {
            addCriterion("register_capital <", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThanOrEqualTo(String value) {
            addCriterion("register_capital <=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLike(String value) {
            addCriterion("register_capital like", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotLike(String value) {
            addCriterion("register_capital not like", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIn(List<String> values) {
            addCriterion("register_capital in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotIn(List<String> values) {
            addCriterion("register_capital not in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalBetween(String value1, String value2) {
            addCriterion("register_capital between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotBetween(String value1, String value2) {
            addCriterion("register_capital not between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIsNull() {
            addCriterion("organization_type is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIsNotNull() {
            addCriterion("organization_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeEqualTo(String value) {
            addCriterion("organization_type =", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotEqualTo(String value) {
            addCriterion("organization_type <>", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeGreaterThan(String value) {
            addCriterion("organization_type >", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_type >=", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeLessThan(String value) {
            addCriterion("organization_type <", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeLessThanOrEqualTo(String value) {
            addCriterion("organization_type <=", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeLike(String value) {
            addCriterion("organization_type like", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotLike(String value) {
            addCriterion("organization_type not like", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIn(List<String> values) {
            addCriterion("organization_type in", values, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotIn(List<String> values) {
            addCriterion("organization_type not in", values, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeBetween(String value1, String value2) {
            addCriterion("organization_type between", value1, value2, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotBetween(String value1, String value2) {
            addCriterion("organization_type not between", value1, value2, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIsNull() {
            addCriterion("organization_form is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIsNotNull() {
            addCriterion("organization_form is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormEqualTo(String value) {
            addCriterion("organization_form =", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormNotEqualTo(String value) {
            addCriterion("organization_form <>", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormGreaterThan(String value) {
            addCriterion("organization_form >", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormGreaterThanOrEqualTo(String value) {
            addCriterion("organization_form >=", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormLessThan(String value) {
            addCriterion("organization_form <", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormLessThanOrEqualTo(String value) {
            addCriterion("organization_form <=", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormLike(String value) {
            addCriterion("organization_form like", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormNotLike(String value) {
            addCriterion("organization_form not like", value, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormIn(List<String> values) {
            addCriterion("organization_form in", values, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormNotIn(List<String> values) {
            addCriterion("organization_form not in", values, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormBetween(String value1, String value2) {
            addCriterion("organization_form between", value1, value2, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andOrganizationFormNotBetween(String value1, String value2) {
            addCriterion("organization_form not between", value1, value2, "organizationForm");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelIsNull() {
            addCriterion("secretaries_tel is null");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelIsNotNull() {
            addCriterion("secretaries_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelEqualTo(String value) {
            addCriterion("secretaries_tel =", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelNotEqualTo(String value) {
            addCriterion("secretaries_tel <>", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelGreaterThan(String value) {
            addCriterion("secretaries_tel >", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelGreaterThanOrEqualTo(String value) {
            addCriterion("secretaries_tel >=", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelLessThan(String value) {
            addCriterion("secretaries_tel <", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelLessThanOrEqualTo(String value) {
            addCriterion("secretaries_tel <=", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelLike(String value) {
            addCriterion("secretaries_tel like", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelNotLike(String value) {
            addCriterion("secretaries_tel not like", value, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelIn(List<String> values) {
            addCriterion("secretaries_tel in", values, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelNotIn(List<String> values) {
            addCriterion("secretaries_tel not in", values, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelBetween(String value1, String value2) {
            addCriterion("secretaries_tel between", value1, value2, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andSecretariesTelNotBetween(String value1, String value2) {
            addCriterion("secretaries_tel not between", value1, value2, "secretariesTel");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNull() {
            addCriterion("company_fax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNotNull() {
            addCriterion("company_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxEqualTo(String value) {
            addCriterion("company_fax =", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotEqualTo(String value) {
            addCriterion("company_fax <>", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThan(String value) {
            addCriterion("company_fax >", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThanOrEqualTo(String value) {
            addCriterion("company_fax >=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThan(String value) {
            addCriterion("company_fax <", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThanOrEqualTo(String value) {
            addCriterion("company_fax <=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLike(String value) {
            addCriterion("company_fax like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotLike(String value) {
            addCriterion("company_fax not like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIn(List<String> values) {
            addCriterion("company_fax in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotIn(List<String> values) {
            addCriterion("company_fax not in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxBetween(String value1, String value2) {
            addCriterion("company_fax between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotBetween(String value1, String value2) {
            addCriterion("company_fax not between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxIsNull() {
            addCriterion("secretaries_fax is null");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxIsNotNull() {
            addCriterion("secretaries_fax is not null");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxEqualTo(String value) {
            addCriterion("secretaries_fax =", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxNotEqualTo(String value) {
            addCriterion("secretaries_fax <>", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxGreaterThan(String value) {
            addCriterion("secretaries_fax >", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxGreaterThanOrEqualTo(String value) {
            addCriterion("secretaries_fax >=", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxLessThan(String value) {
            addCriterion("secretaries_fax <", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxLessThanOrEqualTo(String value) {
            addCriterion("secretaries_fax <=", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxLike(String value) {
            addCriterion("secretaries_fax like", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxNotLike(String value) {
            addCriterion("secretaries_fax not like", value, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxIn(List<String> values) {
            addCriterion("secretaries_fax in", values, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxNotIn(List<String> values) {
            addCriterion("secretaries_fax not in", values, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxBetween(String value1, String value2) {
            addCriterion("secretaries_fax between", value1, value2, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andSecretariesFaxNotBetween(String value1, String value2) {
            addCriterion("secretaries_fax not between", value1, value2, "secretariesFax");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNull() {
            addCriterion("company_mail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNotNull() {
            addCriterion("company_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailEqualTo(String value) {
            addCriterion("company_mail =", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotEqualTo(String value) {
            addCriterion("company_mail <>", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThan(String value) {
            addCriterion("company_mail >", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThanOrEqualTo(String value) {
            addCriterion("company_mail >=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThan(String value) {
            addCriterion("company_mail <", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThanOrEqualTo(String value) {
            addCriterion("company_mail <=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLike(String value) {
            addCriterion("company_mail like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotLike(String value) {
            addCriterion("company_mail not like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIn(List<String> values) {
            addCriterion("company_mail in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotIn(List<String> values) {
            addCriterion("company_mail not in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailBetween(String value1, String value2) {
            addCriterion("company_mail between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotBetween(String value1, String value2) {
            addCriterion("company_mail not between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailIsNull() {
            addCriterion("secretaries_mail is null");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailIsNotNull() {
            addCriterion("secretaries_mail is not null");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailEqualTo(String value) {
            addCriterion("secretaries_mail =", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailNotEqualTo(String value) {
            addCriterion("secretaries_mail <>", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailGreaterThan(String value) {
            addCriterion("secretaries_mail >", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailGreaterThanOrEqualTo(String value) {
            addCriterion("secretaries_mail >=", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailLessThan(String value) {
            addCriterion("secretaries_mail <", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailLessThanOrEqualTo(String value) {
            addCriterion("secretaries_mail <=", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailLike(String value) {
            addCriterion("secretaries_mail like", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailNotLike(String value) {
            addCriterion("secretaries_mail not like", value, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailIn(List<String> values) {
            addCriterion("secretaries_mail in", values, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailNotIn(List<String> values) {
            addCriterion("secretaries_mail not in", values, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailBetween(String value1, String value2) {
            addCriterion("secretaries_mail between", value1, value2, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesMailNotBetween(String value1, String value2) {
            addCriterion("secretaries_mail not between", value1, value2, "secretariesMail");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameIsNull() {
            addCriterion("secretaries_name is null");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameIsNotNull() {
            addCriterion("secretaries_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameEqualTo(String value) {
            addCriterion("secretaries_name =", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameNotEqualTo(String value) {
            addCriterion("secretaries_name <>", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameGreaterThan(String value) {
            addCriterion("secretaries_name >", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameGreaterThanOrEqualTo(String value) {
            addCriterion("secretaries_name >=", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameLessThan(String value) {
            addCriterion("secretaries_name <", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameLessThanOrEqualTo(String value) {
            addCriterion("secretaries_name <=", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameLike(String value) {
            addCriterion("secretaries_name like", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameNotLike(String value) {
            addCriterion("secretaries_name not like", value, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameIn(List<String> values) {
            addCriterion("secretaries_name in", values, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameNotIn(List<String> values) {
            addCriterion("secretaries_name not in", values, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameBetween(String value1, String value2) {
            addCriterion("secretaries_name between", value1, value2, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andSecretariesNameNotBetween(String value1, String value2) {
            addCriterion("secretaries_name not between", value1, value2, "secretariesName");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIsNull() {
            addCriterion("company_url is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIsNotNull() {
            addCriterion("company_url is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlEqualTo(String value) {
            addCriterion("company_url =", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotEqualTo(String value) {
            addCriterion("company_url <>", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlGreaterThan(String value) {
            addCriterion("company_url >", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("company_url >=", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLessThan(String value) {
            addCriterion("company_url <", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLessThanOrEqualTo(String value) {
            addCriterion("company_url <=", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLike(String value) {
            addCriterion("company_url like", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotLike(String value) {
            addCriterion("company_url not like", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIn(List<String> values) {
            addCriterion("company_url in", values, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotIn(List<String> values) {
            addCriterion("company_url not in", values, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlBetween(String value1, String value2) {
            addCriterion("company_url between", value1, value2, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotBetween(String value1, String value2) {
            addCriterion("company_url not between", value1, value2, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlIsNull() {
            addCriterion("infomation_url is null");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlIsNotNull() {
            addCriterion("infomation_url is not null");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlEqualTo(String value) {
            addCriterion("infomation_url =", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlNotEqualTo(String value) {
            addCriterion("infomation_url <>", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlGreaterThan(String value) {
            addCriterion("infomation_url >", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("infomation_url >=", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlLessThan(String value) {
            addCriterion("infomation_url <", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlLessThanOrEqualTo(String value) {
            addCriterion("infomation_url <=", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlLike(String value) {
            addCriterion("infomation_url like", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlNotLike(String value) {
            addCriterion("infomation_url not like", value, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlIn(List<String> values) {
            addCriterion("infomation_url in", values, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlNotIn(List<String> values) {
            addCriterion("infomation_url not in", values, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlBetween(String value1, String value2) {
            addCriterion("infomation_url between", value1, value2, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andInfomationUrlNotBetween(String value1, String value2) {
            addCriterion("infomation_url not between", value1, value2, "infomationUrl");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryIsNull() {
            addCriterion("sname_history is null");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryIsNotNull() {
            addCriterion("sname_history is not null");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryEqualTo(String value) {
            addCriterion("sname_history =", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryNotEqualTo(String value) {
            addCriterion("sname_history <>", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryGreaterThan(String value) {
            addCriterion("sname_history >", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("sname_history >=", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryLessThan(String value) {
            addCriterion("sname_history <", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryLessThanOrEqualTo(String value) {
            addCriterion("sname_history <=", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryLike(String value) {
            addCriterion("sname_history like", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryNotLike(String value) {
            addCriterion("sname_history not like", value, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryIn(List<String> values) {
            addCriterion("sname_history in", values, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryNotIn(List<String> values) {
            addCriterion("sname_history not in", values, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryBetween(String value1, String value2) {
            addCriterion("sname_history between", value1, value2, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andSnameHistoryNotBetween(String value1, String value2) {
            addCriterion("sname_history not between", value1, value2, "snameHistory");
            return (Criteria) this;
        }

        public Criteria andRegisterAddIsNull() {
            addCriterion("register_add is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddIsNotNull() {
            addCriterion("register_add is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddEqualTo(String value) {
            addCriterion("register_add =", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddNotEqualTo(String value) {
            addCriterion("register_add <>", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddGreaterThan(String value) {
            addCriterion("register_add >", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddGreaterThanOrEqualTo(String value) {
            addCriterion("register_add >=", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddLessThan(String value) {
            addCriterion("register_add <", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddLessThanOrEqualTo(String value) {
            addCriterion("register_add <=", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddLike(String value) {
            addCriterion("register_add like", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddNotLike(String value) {
            addCriterion("register_add not like", value, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddIn(List<String> values) {
            addCriterion("register_add in", values, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddNotIn(List<String> values) {
            addCriterion("register_add not in", values, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddBetween(String value1, String value2) {
            addCriterion("register_add between", value1, value2, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andRegisterAddNotBetween(String value1, String value2) {
            addCriterion("register_add not between", value1, value2, "registerAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddIsNull() {
            addCriterion("work_add is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddIsNotNull() {
            addCriterion("work_add is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddEqualTo(String value) {
            addCriterion("work_add =", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddNotEqualTo(String value) {
            addCriterion("work_add <>", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddGreaterThan(String value) {
            addCriterion("work_add >", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddGreaterThanOrEqualTo(String value) {
            addCriterion("work_add >=", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddLessThan(String value) {
            addCriterion("work_add <", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddLessThanOrEqualTo(String value) {
            addCriterion("work_add <=", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddLike(String value) {
            addCriterion("work_add like", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddNotLike(String value) {
            addCriterion("work_add not like", value, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddIn(List<String> values) {
            addCriterion("work_add in", values, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddNotIn(List<String> values) {
            addCriterion("work_add not in", values, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddBetween(String value1, String value2) {
            addCriterion("work_add between", value1, value2, "workAdd");
            return (Criteria) this;
        }

        public Criteria andWorkAddNotBetween(String value1, String value2) {
            addCriterion("work_add not between", value1, value2, "workAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNull() {
            addCriterion("company_profile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNotNull() {
            addCriterion("company_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileEqualTo(String value) {
            addCriterion("company_profile =", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotEqualTo(String value) {
            addCriterion("company_profile <>", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThan(String value) {
            addCriterion("company_profile >", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThanOrEqualTo(String value) {
            addCriterion("company_profile >=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThan(String value) {
            addCriterion("company_profile <", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThanOrEqualTo(String value) {
            addCriterion("company_profile <=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLike(String value) {
            addCriterion("company_profile like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotLike(String value) {
            addCriterion("company_profile not like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIn(List<String> values) {
            addCriterion("company_profile in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotIn(List<String> values) {
            addCriterion("company_profile not in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileBetween(String value1, String value2) {
            addCriterion("company_profile between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotBetween(String value1, String value2) {
            addCriterion("company_profile not between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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