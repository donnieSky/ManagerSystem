package com.ass.common.generated.model;

import java.util.ArrayList;
import java.util.List;

public class TLogExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TLogExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTUserIdIsNull() {
			addCriterion("t_user_id is null");
			return (Criteria) this;
		}

		public Criteria andTUserIdIsNotNull() {
			addCriterion("t_user_id is not null");
			return (Criteria) this;
		}

		public Criteria andTUserIdEqualTo(Long value) {
			addCriterion("t_user_id =", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdNotEqualTo(Long value) {
			addCriterion("t_user_id <>", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdGreaterThan(Long value) {
			addCriterion("t_user_id >", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("t_user_id >=", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdLessThan(Long value) {
			addCriterion("t_user_id <", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdLessThanOrEqualTo(Long value) {
			addCriterion("t_user_id <=", value, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdIn(List<Long> values) {
			addCriterion("t_user_id in", values, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdNotIn(List<Long> values) {
			addCriterion("t_user_id not in", values, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdBetween(Long value1, Long value2) {
			addCriterion("t_user_id between", value1, value2, "tUserId");
			return (Criteria) this;
		}

		public Criteria andTUserIdNotBetween(Long value1, Long value2) {
			addCriterion("t_user_id not between", value1, value2, "tUserId");
			return (Criteria) this;
		}

		public Criteria andOperateTypeIsNull() {
			addCriterion("operate_type is null");
			return (Criteria) this;
		}

		public Criteria andOperateTypeIsNotNull() {
			addCriterion("operate_type is not null");
			return (Criteria) this;
		}

		public Criteria andOperateTypeEqualTo(String value) {
			addCriterion("operate_type =", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeNotEqualTo(String value) {
			addCriterion("operate_type <>", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeGreaterThan(String value) {
			addCriterion("operate_type >", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeGreaterThanOrEqualTo(String value) {
			addCriterion("operate_type >=", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeLessThan(String value) {
			addCriterion("operate_type <", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeLessThanOrEqualTo(String value) {
			addCriterion("operate_type <=", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeLike(String value) {
			addCriterion("operate_type like", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeNotLike(String value) {
			addCriterion("operate_type not like", value, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeIn(List<String> values) {
			addCriterion("operate_type in", values, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeNotIn(List<String> values) {
			addCriterion("operate_type not in", values, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeBetween(String value1, String value2) {
			addCriterion("operate_type between", value1, value2, "operateType");
			return (Criteria) this;
		}

		public Criteria andOperateTypeNotBetween(String value1, String value2) {
			addCriterion("operate_type not between", value1, value2,
					"operateType");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Integer value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Integer value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Integer value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Integer value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Integer> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Integer> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andLogTypeIsNull() {
			addCriterion("log_type is null");
			return (Criteria) this;
		}

		public Criteria andLogTypeIsNotNull() {
			addCriterion("log_type is not null");
			return (Criteria) this;
		}

		public Criteria andLogTypeEqualTo(String value) {
			addCriterion("log_type =", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeNotEqualTo(String value) {
			addCriterion("log_type <>", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeGreaterThan(String value) {
			addCriterion("log_type >", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
			addCriterion("log_type >=", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeLessThan(String value) {
			addCriterion("log_type <", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeLessThanOrEqualTo(String value) {
			addCriterion("log_type <=", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeLike(String value) {
			addCriterion("log_type like", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeNotLike(String value) {
			addCriterion("log_type not like", value, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeIn(List<String> values) {
			addCriterion("log_type in", values, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeNotIn(List<String> values) {
			addCriterion("log_type not in", values, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeBetween(String value1, String value2) {
			addCriterion("log_type between", value1, value2, "logType");
			return (Criteria) this;
		}

		public Criteria andLogTypeNotBetween(String value1, String value2) {
			addCriterion("log_type not between", value1, value2, "logType");
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

		public Criteria andIsdeleteIsNull() {
			addCriterion("isdelete is null");
			return (Criteria) this;
		}

		public Criteria andIsdeleteIsNotNull() {
			addCriterion("isdelete is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeleteEqualTo(Integer value) {
			addCriterion("isdelete =", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotEqualTo(Integer value) {
			addCriterion("isdelete <>", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteGreaterThan(Integer value) {
			addCriterion("isdelete >", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
			addCriterion("isdelete >=", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteLessThan(Integer value) {
			addCriterion("isdelete <", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
			addCriterion("isdelete <=", value, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteIn(List<Integer> values) {
			addCriterion("isdelete in", values, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotIn(List<Integer> values) {
			addCriterion("isdelete not in", values, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
			addCriterion("isdelete between", value1, value2, "isdelete");
			return (Criteria) this;
		}

		public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
			addCriterion("isdelete not between", value1, value2, "isdelete");
			return (Criteria) this;
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}