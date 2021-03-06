package com.ass.common.generated.model;

import java.util.ArrayList;
import java.util.List;

public class TLogDetailExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TLogDetailExample() {
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

		public Criteria andTLogIdIsNull() {
			addCriterion("t_log_id is null");
			return (Criteria) this;
		}

		public Criteria andTLogIdIsNotNull() {
			addCriterion("t_log_id is not null");
			return (Criteria) this;
		}

		public Criteria andTLogIdEqualTo(Long value) {
			addCriterion("t_log_id =", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdNotEqualTo(Long value) {
			addCriterion("t_log_id <>", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdGreaterThan(Long value) {
			addCriterion("t_log_id >", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdGreaterThanOrEqualTo(Long value) {
			addCriterion("t_log_id >=", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdLessThan(Long value) {
			addCriterion("t_log_id <", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdLessThanOrEqualTo(Long value) {
			addCriterion("t_log_id <=", value, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdIn(List<Long> values) {
			addCriterion("t_log_id in", values, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdNotIn(List<Long> values) {
			addCriterion("t_log_id not in", values, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdBetween(Long value1, Long value2) {
			addCriterion("t_log_id between", value1, value2, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTLogIdNotBetween(Long value1, Long value2) {
			addCriterion("t_log_id not between", value1, value2, "tLogId");
			return (Criteria) this;
		}

		public Criteria andTableNameIsNull() {
			addCriterion("table_name is null");
			return (Criteria) this;
		}

		public Criteria andTableNameIsNotNull() {
			addCriterion("table_name is not null");
			return (Criteria) this;
		}

		public Criteria andTableNameEqualTo(String value) {
			addCriterion("table_name =", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameNotEqualTo(String value) {
			addCriterion("table_name <>", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameGreaterThan(String value) {
			addCriterion("table_name >", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameGreaterThanOrEqualTo(String value) {
			addCriterion("table_name >=", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameLessThan(String value) {
			addCriterion("table_name <", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameLessThanOrEqualTo(String value) {
			addCriterion("table_name <=", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameLike(String value) {
			addCriterion("table_name like", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameNotLike(String value) {
			addCriterion("table_name not like", value, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameIn(List<String> values) {
			addCriterion("table_name in", values, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameNotIn(List<String> values) {
			addCriterion("table_name not in", values, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameBetween(String value1, String value2) {
			addCriterion("table_name between", value1, value2, "tableName");
			return (Criteria) this;
		}

		public Criteria andTableNameNotBetween(String value1, String value2) {
			addCriterion("table_name not between", value1, value2, "tableName");
			return (Criteria) this;
		}

		public Criteria andRecordIdIsNull() {
			addCriterion("record_id is null");
			return (Criteria) this;
		}

		public Criteria andRecordIdIsNotNull() {
			addCriterion("record_id is not null");
			return (Criteria) this;
		}

		public Criteria andRecordIdEqualTo(Long value) {
			addCriterion("record_id =", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotEqualTo(Long value) {
			addCriterion("record_id <>", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdGreaterThan(Long value) {
			addCriterion("record_id >", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
			addCriterion("record_id >=", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdLessThan(Long value) {
			addCriterion("record_id <", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdLessThanOrEqualTo(Long value) {
			addCriterion("record_id <=", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdIn(List<Long> values) {
			addCriterion("record_id in", values, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotIn(List<Long> values) {
			addCriterion("record_id not in", values, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdBetween(Long value1, Long value2) {
			addCriterion("record_id between", value1, value2, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotBetween(Long value1, Long value2) {
			addCriterion("record_id not between", value1, value2, "recordId");
			return (Criteria) this;
		}

		public Criteria andFieldNameIsNull() {
			addCriterion("field_name is null");
			return (Criteria) this;
		}

		public Criteria andFieldNameIsNotNull() {
			addCriterion("field_name is not null");
			return (Criteria) this;
		}

		public Criteria andFieldNameEqualTo(String value) {
			addCriterion("field_name =", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameNotEqualTo(String value) {
			addCriterion("field_name <>", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameGreaterThan(String value) {
			addCriterion("field_name >", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
			addCriterion("field_name >=", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameLessThan(String value) {
			addCriterion("field_name <", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameLessThanOrEqualTo(String value) {
			addCriterion("field_name <=", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameLike(String value) {
			addCriterion("field_name like", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameNotLike(String value) {
			addCriterion("field_name not like", value, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameIn(List<String> values) {
			addCriterion("field_name in", values, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameNotIn(List<String> values) {
			addCriterion("field_name not in", values, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameBetween(String value1, String value2) {
			addCriterion("field_name between", value1, value2, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldNameNotBetween(String value1, String value2) {
			addCriterion("field_name not between", value1, value2, "fieldName");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueIsNull() {
			addCriterion("field_old_value is null");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueIsNotNull() {
			addCriterion("field_old_value is not null");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueEqualTo(String value) {
			addCriterion("field_old_value =", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueNotEqualTo(String value) {
			addCriterion("field_old_value <>", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueGreaterThan(String value) {
			addCriterion("field_old_value >", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueGreaterThanOrEqualTo(String value) {
			addCriterion("field_old_value >=", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueLessThan(String value) {
			addCriterion("field_old_value <", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueLessThanOrEqualTo(String value) {
			addCriterion("field_old_value <=", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueLike(String value) {
			addCriterion("field_old_value like", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueNotLike(String value) {
			addCriterion("field_old_value not like", value, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueIn(List<String> values) {
			addCriterion("field_old_value in", values, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueNotIn(List<String> values) {
			addCriterion("field_old_value not in", values, "fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueBetween(String value1, String value2) {
			addCriterion("field_old_value between", value1, value2,
					"fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldOldValueNotBetween(String value1, String value2) {
			addCriterion("field_old_value not between", value1, value2,
					"fieldOldValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueIsNull() {
			addCriterion("field_new_value is null");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueIsNotNull() {
			addCriterion("field_new_value is not null");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueEqualTo(String value) {
			addCriterion("field_new_value =", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueNotEqualTo(String value) {
			addCriterion("field_new_value <>", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueGreaterThan(String value) {
			addCriterion("field_new_value >", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueGreaterThanOrEqualTo(String value) {
			addCriterion("field_new_value >=", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueLessThan(String value) {
			addCriterion("field_new_value <", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueLessThanOrEqualTo(String value) {
			addCriterion("field_new_value <=", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueLike(String value) {
			addCriterion("field_new_value like", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueNotLike(String value) {
			addCriterion("field_new_value not like", value, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueIn(List<String> values) {
			addCriterion("field_new_value in", values, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueNotIn(List<String> values) {
			addCriterion("field_new_value not in", values, "fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueBetween(String value1, String value2) {
			addCriterion("field_new_value between", value1, value2,
					"fieldNewValue");
			return (Criteria) this;
		}

		public Criteria andFieldNewValueNotBetween(String value1, String value2) {
			addCriterion("field_new_value not between", value1, value2,
					"fieldNewValue");
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