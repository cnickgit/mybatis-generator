package com.nick.dao;

import com.nick.entity.SbMsgPushLog;

public interface SbMsgPushLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    int deleteByPrimaryKey(String pushId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    int insert(SbMsgPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    int insertSelective(SbMsgPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    SbMsgPushLog selectByPrimaryKey(String pushId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    int updateByPrimaryKeySelective(SbMsgPushLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sb_msg_push_log
     *
     * @mbg.generated Tue Dec 17 16:23:13 CST 2019
     */
    int updateByPrimaryKey(SbMsgPushLog record);
}