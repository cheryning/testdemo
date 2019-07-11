package com.foreseers.tj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIsNull() {
            addCriterion("goodsDesc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIsNotNull() {
            addCriterion("goodsDesc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescEqualTo(String value) {
            addCriterion("goodsDesc =", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotEqualTo(String value) {
            addCriterion("goodsDesc <>", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescGreaterThan(String value) {
            addCriterion("goodsDesc >", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescGreaterThanOrEqualTo(String value) {
            addCriterion("goodsDesc >=", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLessThan(String value) {
            addCriterion("goodsDesc <", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLessThanOrEqualTo(String value) {
            addCriterion("goodsDesc <=", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLike(String value) {
            addCriterion("goodsDesc like", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotLike(String value) {
            addCriterion("goodsDesc not like", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIn(List<String> values) {
            addCriterion("goodsDesc in", values, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotIn(List<String> values) {
            addCriterion("goodsDesc not in", values, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescBetween(String value1, String value2) {
            addCriterion("goodsDesc between", value1, value2, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotBetween(String value1, String value2) {
            addCriterion("goodsDesc not between", value1, value2, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andNewpriceIsNull() {
            addCriterion("newPrice is null");
            return (Criteria) this;
        }

        public Criteria andNewpriceIsNotNull() {
            addCriterion("newPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNewpriceEqualTo(Double value) {
            addCriterion("newPrice =", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotEqualTo(Double value) {
            addCriterion("newPrice <>", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThan(Double value) {
            addCriterion("newPrice >", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("newPrice >=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThan(Double value) {
            addCriterion("newPrice <", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceLessThanOrEqualTo(Double value) {
            addCriterion("newPrice <=", value, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceIn(List<Double> values) {
            addCriterion("newPrice in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotIn(List<Double> values) {
            addCriterion("newPrice not in", values, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceBetween(Double value1, Double value2) {
            addCriterion("newPrice between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andNewpriceNotBetween(Double value1, Double value2) {
            addCriterion("newPrice not between", value1, value2, "newprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNull() {
            addCriterion("oldPrice is null");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNotNull() {
            addCriterion("oldPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOldpriceEqualTo(Double value) {
            addCriterion("oldPrice =", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotEqualTo(Double value) {
            addCriterion("oldPrice <>", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThan(Double value) {
            addCriterion("oldPrice >", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oldPrice >=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThan(Double value) {
            addCriterion("oldPrice <", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThanOrEqualTo(Double value) {
            addCriterion("oldPrice <=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIn(List<Double> values) {
            addCriterion("oldPrice in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotIn(List<Double> values) {
            addCriterion("oldPrice not in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceBetween(Double value1, Double value2) {
            addCriterion("oldPrice between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotBetween(Double value1, Double value2) {
            addCriterion("oldPrice not between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNull() {
            addCriterion("authorName is null");
            return (Criteria) this;
        }

        public Criteria andAuthornameIsNotNull() {
            addCriterion("authorName is not null");
            return (Criteria) this;
        }

        public Criteria andAuthornameEqualTo(String value) {
            addCriterion("authorName =", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotEqualTo(String value) {
            addCriterion("authorName <>", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThan(String value) {
            addCriterion("authorName >", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameGreaterThanOrEqualTo(String value) {
            addCriterion("authorName >=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThan(String value) {
            addCriterion("authorName <", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLessThanOrEqualTo(String value) {
            addCriterion("authorName <=", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameLike(String value) {
            addCriterion("authorName like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotLike(String value) {
            addCriterion("authorName not like", value, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameIn(List<String> values) {
            addCriterion("authorName in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotIn(List<String> values) {
            addCriterion("authorName not in", values, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameBetween(String value1, String value2) {
            addCriterion("authorName between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andAuthornameNotBetween(String value1, String value2) {
            addCriterion("authorName not between", value1, value2, "authorname");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLike(String value) {
            addCriterion("publishTime like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotLike(String value) {
            addCriterion("publishTime not like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }
    }

    /**
     */
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