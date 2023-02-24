package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VerifyMapper;
import com.ruoyi.system.domain.Verify;
import com.ruoyi.system.service.IVerifyService;

/**
 * verifyService业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
@Service
public class VerifyServiceImpl implements IVerifyService 
{
    @Autowired
    private VerifyMapper verifyMapper;

    /**
     * 查询verify
     * 
     * @param vId verify主键
     * @return verify
     */
    @Override
    public Verify selectVerifyByVId(Long vId)
    {
        return verifyMapper.selectVerifyByVId(vId);
    }

    /**
     * 查询verify列表
     * 
     * @param verify verify
     * @return verify
     */
    @Override
    public List<Verify> selectVerifyList(Verify verify)
    {
        return verifyMapper.selectVerifyList(verify);
    }

    /**
     * 新增verify
     * 
     * @param verify verify
     * @return 结果
     */
    @Override
    public int insertVerify(Verify verify)
    {
        return verifyMapper.insertVerify(verify);
    }

    /**
     * 修改verify
     * 
     * @param verify verify
     * @return 结果
     */
    @Override
    public int updateVerify(Verify verify)
    {
        return verifyMapper.updateVerify(verify);
    }

    /**
     * 批量删除verify
     * 
     * @param vIds 需要删除的verify主键
     * @return 结果
     */
    @Override
    public int deleteVerifyByVIds(Long[] vIds)
    {
        return verifyMapper.deleteVerifyByVIds(vIds);
    }

    /**
     * 删除verify信息
     * 
     * @param vId verify主键
     * @return 结果
     */
    @Override
    public int deleteVerifyByVId(Long vId)
    {
        return verifyMapper.deleteVerifyByVId(vId);
    }
}
