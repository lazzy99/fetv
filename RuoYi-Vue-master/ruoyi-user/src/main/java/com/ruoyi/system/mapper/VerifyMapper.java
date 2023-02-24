package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Verify;

/**
 * verifyMapper接口
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
public interface VerifyMapper 
{
    /**
     * 查询verify
     * 
     * @param vId verify主键
     * @return verify
     */
    public Verify selectVerifyByVId(Long vId);

    /**
     * 查询verify列表
     * 
     * @param verify verify
     * @return verify集合
     */
    public List<Verify> selectVerifyList(Verify verify);

    /**
     * 新增verify
     * 
     * @param verify verify
     * @return 结果
     */
    public int insertVerify(Verify verify);

    /**
     * 修改verify
     * 
     * @param verify verify
     * @return 结果
     */
    public int updateVerify(Verify verify);

    /**
     * 删除verify
     * 
     * @param vId verify主键
     * @return 结果
     */
    public int deleteVerifyByVId(Long vId);

    /**
     * 批量删除verify
     * 
     * @param vIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVerifyByVIds(Long[] vIds);
}
