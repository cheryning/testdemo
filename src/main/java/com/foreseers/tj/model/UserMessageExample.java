package com.foreseers.tj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserMessageExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameIsNull() {
            addCriterion("msgAuthorName is null");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameIsNotNull() {
            addCriterion("msgAuthorName is not null");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameEqualTo(String value) {
            addCriterion("msgAuthorName =", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameNotEqualTo(String value) {
            addCriterion("msgAuthorName <>", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameGreaterThan(String value) {
            addCriterion("msgAuthorName >", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameGreaterThanOrEqualTo(String value) {
            addCriterion("msgAuthorName >=", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameLessThan(String value) {
            addCriterion("msgAuthorName <", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameLessThanOrEqualTo(String value) {
            addCriterion("msgAuthorName <=", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameLike(String value) {
            addCriterion("msgAuthorName like", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameNotLike(String value) {
            addCriterion("msgAuthorName not like", value, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameIn(List<String> values) {
            addCriterion("msgAuthorName in", values, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameNotIn(List<String> values) {
            addCriterion("msgAuthorName not in", values, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameBetween(String value1, String value2) {
            addCriterion("msgAuthorName between", value1, value2, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthornameNotBetween(String value1, String value2) {
            addCriterion("msgAuthorName not between", value1, value2, "msgauthorname");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgIsNull() {
            addCriterion("msgAuthorImg is null");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgIsNotNull() {
            addCriterion("msgAuthorImg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgEqualTo(String value) {
            addCriterion("msgAuthorImg =", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgNotEqualTo(String value) {
            addCriterion("msgAuthorImg <>", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgGreaterThan(String value) {
            addCriterion("msgAuthorImg >", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgGreaterThanOrEqualTo(String value) {
            addCriterion("msgAuthorImg >=", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgLessThan(String value) {
            addCriterion("msgAuthorImg <", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgLessThanOrEqualTo(String value) {
            addCriterion("msgAuthorImg <=", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgLike(String value) {
            addCriterion("msgAuthorImg like", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgNotLike(String value) {
            addCriterion("msgAuthorImg not like", value, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgIn(List<String> values) {
            addCriterion("msgAuthorImg in", values, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgNotIn(List<String> values) {
            addCriterion("msgAuthorImg not in", values, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgBetween(String value1, String value2) {
            addCriterion("msgAuthorImg between", value1, value2, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthorimgNotBetween(String value1, String value2) {
            addCriterion("msgAuthorImg not between", value1, value2, "msgauthorimg");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidIsNull() {
            addCriterion("msgAuthorOpenid is null");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidIsNotNull() {
            addCriterion("msgAuthorOpenid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidEqualTo(String value) {
            addCriterion("msgAuthorOpenid =", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidNotEqualTo(String value) {
            addCriterion("msgAuthorOpenid <>", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidGreaterThan(String value) {
            addCriterion("msgAuthorOpenid >", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidGreaterThanOrEqualTo(String value) {
            addCriterion("msgAuthorOpenid >=", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidLessThan(String value) {
            addCriterion("msgAuthorOpenid <", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidLessThanOrEqualTo(String value) {
            addCriterion("msgAuthorOpenid <=", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidLike(String value) {
            addCriterion("msgAuthorOpenid like", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidNotLike(String value) {
            addCriterion("msgAuthorOpenid not like", value, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidIn(List<String> values) {
            addCriterion("msgAuthorOpenid in", values, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidNotIn(List<String> values) {
            addCriterion("msgAuthorOpenid not in", values, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidBetween(String value1, String value2) {
            addCriterion("msgAuthorOpenid between", value1, value2, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgauthoropenidNotBetween(String value1, String value2) {
            addCriterion("msgAuthorOpenid not between", value1, value2, "msgauthoropenid");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNull() {
            addCriterion("msgDate is null");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNotNull() {
            addCriterion("msgDate is not null");
            return (Criteria) this;
        }

        public Criteria andMsgdateEqualTo(Date value) {
            addCriterionForJDBCDate("msgDate =", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("msgDate <>", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThan(Date value) {
            addCriterionForJDBCDate("msgDate >", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msgDate >=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThan(Date value) {
            addCriterionForJDBCDate("msgDate <", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("msgDate <=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateIn(List<Date> values) {
            addCriterionForJDBCDate("msgDate in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("msgDate not in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msgDate between", value1, value2, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("msgDate not between", value1, value2, "msgdate");
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