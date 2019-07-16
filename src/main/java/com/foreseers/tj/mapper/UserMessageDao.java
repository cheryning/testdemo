package com.foreseers.tj.mapper;

import com.foreseers.tj.model.UserMessage;
import com.foreseers.tj.model.UserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMessageDao {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);

	List<UserMessage> selectByGoodskey(int goodsid);
}