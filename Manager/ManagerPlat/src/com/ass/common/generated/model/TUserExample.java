package com.ass.common.generated.model;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TUserExample() {
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

		public Criteria andLoginNameIsNull() {
			addCriterion("login_name is null");
			return (Criteria) this;
		}

		public Criteria andLoginNameIsNotNull() {
			addCriterion("login_name is not null");
			return (Criteria) this;
		}

		public Criteria andLoginNameEqualTo(String value) {
			addCriterion("login_name =", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotEqualTo(String value) {
			addCriterion("login_name <>", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThan(String value) {
			addCriterion("login_name >", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
			addCriterion("login_name >=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThan(String value) {
			addCriterion("login_name <", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThanOrEqualTo(String value) {
			addCriterion("login_name <=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLike(String value) {
			addCriterion("login_name like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotLike(String value) {
			addCriterion("login_name not like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameIn(List<String> values) {
			addCriterion("login_name in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotIn(List<String> values) {
			addCriterion("login_name not in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameBetween(String value1, String value2) {
			addCriterion("login_name between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotBetween(String value1, String value2) {
			addCriterion("login_name not between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdIsNull() {
			addCriterion("t_organization_id is null");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdIsNotNull() {
			addCriterion("t_organization_id is not null");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdEqualTo(Long value) {
			addCriterion("t_organization_id =", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdNotEqualTo(Long value) {
			addCriterion("t_organization_id <>", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdGreaterThan(Long value) {
			addCriterion("t_organization_id >", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdGreaterThanOrEqualTo(Long value) {
			addCriterion("t_organization_id >=", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdLessThan(Long value) {
			addCriterion("t_organization_id <", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdLessThanOrEqualTo(Long value) {
			addCriterion("t_organization_id <=", value, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdIn(List<Long> values) {
			addCriterion("t_organization_id in", values, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdNotIn(List<Long> values) {
			addCriterion("t_organization_id not in", values, "tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdBetween(Long value1, Long value2) {
			addCriterion("t_organization_id between", value1, value2,
					"tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationIdNotBetween(Long value1, Long value2) {
			addCriterion("t_organization_id not between", value1, value2,
					"tOrganizationId");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeIsNull() {
			addCriterion("t_organization_code is null");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeIsNotNull() {
			addCriterion("t_organization_code is not null");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeEqualTo(String value) {
			addCriterion("t_organization_code =", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeNotEqualTo(String value) {
			addCriterion("t_organization_code <>", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeGreaterThan(String value) {
			addCriterion("t_organization_code >", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeGreaterThanOrEqualTo(String value) {
			addCriterion("t_organization_code >=", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeLessThan(String value) {
			addCriterion("t_organization_code <", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeLessThanOrEqualTo(String value) {
			addCriterion("t_organization_code <=", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeLike(String value) {
			addCriterion("t_organization_code like", value, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeNotLike(String value) {
			addCriterion("t_organization_code not like", value,
					"tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeIn(List<String> values) {
			addCriterion("t_organization_code in", values, "tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeNotIn(List<String> values) {
			addCriterion("t_organization_code not in", values,
					"tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeBetween(String value1, String value2) {
			addCriterion("t_organization_code between", value1, value2,
					"tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andTOrganizationCodeNotBetween(String value1,
				String value2) {
			addCriterion("t_organization_code not between", value1, value2,
					"tOrganizationCode");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
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

		public Criteria andSaltIsNull() {
			addCriterion("salt is null");
			return (Criteria) this;
		}

		public Criteria andSaltIsNotNull() {
			addCriterion("salt is not null");
			return (Criteria) this;
		}

		public Criteria andSaltEqualTo(String value) {
			addCriterion("salt =", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotEqualTo(String value) {
			addCriterion("salt <>", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThan(String value) {
			addCriterion("salt >", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThanOrEqualTo(String value) {
			addCriterion("salt >=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThan(String value) {
			addCriterion("salt <", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThanOrEqualTo(String value) {
			addCriterion("salt <=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLike(String value) {
			addCriterion("salt like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotLike(String value) {
			addCriterion("salt not like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltIn(List<String> values) {
			addCriterion("salt in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotIn(List<String> values) {
			addCriterion("salt not in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltBetween(String value1, String value2) {
			addCriterion("salt between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotBetween(String value1, String value2) {
			addCriterion("salt not between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andMakeTimeIsNull() {
			addCriterion("make_time is null");
			return (Criteria) this;
		}

		public Criteria andMakeTimeIsNotNull() {
			addCriterion("make_time is not null");
			return (Criteria) this;
		}

		public Criteria andMakeTimeEqualTo(Integer value) {
			addCriterion("make_time =", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeNotEqualTo(Integer value) {
			addCriterion("make_time <>", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeGreaterThan(Integer value) {
			addCriterion("make_time >", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("make_time >=", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeLessThan(Integer value) {
			addCriterion("make_time <", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeLessThanOrEqualTo(Integer value) {
			addCriterion("make_time <=", value, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeIn(List<Integer> values) {
			addCriterion("make_time in", values, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeNotIn(List<Integer> values) {
			addCriterion("make_time not in", values, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeBetween(Integer value1, Integer value2) {
			addCriterion("make_time between", value1, value2, "makeTime");
			return (Criteria) this;
		}

		public Criteria andMakeTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("make_time not between", value1, value2, "makeTime");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNull() {
			addCriterion("operator is null");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNotNull() {
			addCriterion("operator is not null");
			return (Criteria) this;
		}

		public Criteria andOperatorEqualTo(String value) {
			addCriterion("operator =", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotEqualTo(String value) {
			addCriterion("operator <>", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThan(String value) {
			addCriterion("operator >", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThanOrEqualTo(String value) {
			addCriterion("operator >=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThan(String value) {
			addCriterion("operator <", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThanOrEqualTo(String value) {
			addCriterion("operator <=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLike(String value) {
			addCriterion("operator like", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotLike(String value) {
			addCriterion("operator not like", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorIn(List<String> values) {
			addCriterion("operator in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotIn(List<String> values) {
			addCriterion("operator not in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorBetween(String value1, String value2) {
			addCriterion("operator between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotBetween(String value1, String value2) {
			addCriterion("operator not between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andModifyTimeIsNull() {
			addCriterion("modify_time is null");
			return (Criteria) this;
		}

		public Criteria andModifyTimeIsNotNull() {
			addCriterion("modify_time is not null");
			return (Criteria) this;
		}

		public Criteria andModifyTimeEqualTo(Integer value) {
			addCriterion("modify_time =", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeNotEqualTo(Integer value) {
			addCriterion("modify_time <>", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeGreaterThan(Integer value) {
			addCriterion("modify_time >", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("modify_time >=", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeLessThan(Integer value) {
			addCriterion("modify_time <", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeLessThanOrEqualTo(Integer value) {
			addCriterion("modify_time <=", value, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeIn(List<Integer> values) {
			addCriterion("modify_time in", values, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeNotIn(List<Integer> values) {
			addCriterion("modify_time not in", values, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeBetween(Integer value1, Integer value2) {
			addCriterion("modify_time between", value1, value2, "modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("modify_time not between", value1, value2,
					"modifyTime");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorIsNull() {
			addCriterion("modify_operator is null");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorIsNotNull() {
			addCriterion("modify_operator is not null");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorEqualTo(String value) {
			addCriterion("modify_operator =", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorNotEqualTo(String value) {
			addCriterion("modify_operator <>", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorGreaterThan(String value) {
			addCriterion("modify_operator >", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorGreaterThanOrEqualTo(String value) {
			addCriterion("modify_operator >=", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorLessThan(String value) {
			addCriterion("modify_operator <", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorLessThanOrEqualTo(String value) {
			addCriterion("modify_operator <=", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorLike(String value) {
			addCriterion("modify_operator like", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorNotLike(String value) {
			addCriterion("modify_operator not like", value, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorIn(List<String> values) {
			addCriterion("modify_operator in", values, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorNotIn(List<String> values) {
			addCriterion("modify_operator not in", values, "modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorBetween(String value1, String value2) {
			addCriterion("modify_operator between", value1, value2,
					"modifyOperator");
			return (Criteria) this;
		}

		public Criteria andModifyOperatorNotBetween(String value1, String value2) {
			addCriterion("modify_operator not between", value1, value2,
					"modifyOperator");
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