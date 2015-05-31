package com.ass.common.generated.dao;

import com.ass.common.generated.model.TUser;
import com.ass.common.generated.model.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {

	int countByExample(TUserExample example);

	int deleteByExample(TUserExample example);

	int deleteByPrimaryKey(Long id);

	int insert(TUser record);

	int insertSelective(TUser record);

	List<TUser> selectByExample(TUserExample example);

	TUser selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") TUser record,
			@Param("example") TUserExample example);

	int updateByExample(@Param("record") TUser record,
			@Param("example") TUserExample example);

	int updateByPrimaryKeySelective(TUser record);

	int updateByPrimaryKey(TUser record);
}