package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Verify;
import com.ruoyi.system.service.IVerifyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * verifyController
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
@RestController
@RequestMapping("/system/verify")
public class VerifyController extends BaseController
{
    @Autowired
    private IVerifyService verifyService;

    /**
     * 查询verify列表
     */
    @PreAuthorize("@ss.hasPermi('system:verify:list')")
    @GetMapping("/list")
    public TableDataInfo list(Verify verify)
    {
        startPage();
        List<Verify> list = verifyService.selectVerifyList(verify);
        return getDataTable(list);
    }

    /**
     * 导出verify列表
     */
    @PreAuthorize("@ss.hasPermi('system:verify:export')")
    @Log(title = "verify", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Verify verify)
    {
        List<Verify> list = verifyService.selectVerifyList(verify);
        ExcelUtil<Verify> util = new ExcelUtil<Verify>(Verify.class);
        util.exportExcel(response, list, "verify数据");
    }

    /**
     * 获取verify详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:verify:query')")
    @GetMapping(value = "/{vId}")
    public AjaxResult getInfo(@PathVariable("vId") Long vId)
    {
        return success(verifyService.selectVerifyByVId(vId));
    }

    /**
     * 新增verify
     */
    @PreAuthorize("@ss.hasPermi('system:verify:add')")
    @Log(title = "verify", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Verify verify)
    {
        return toAjax(verifyService.insertVerify(verify));
    }

    /**
     * 修改verify
     */
    @PreAuthorize("@ss.hasPermi('system:verify:edit')")
    @Log(title = "verify", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Verify verify)
    {
        return toAjax(verifyService.updateVerify(verify));
    }

    /**
     * 删除verify
     */
    @PreAuthorize("@ss.hasPermi('system:verify:remove')")
    @Log(title = "verify", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vIds}")
    public AjaxResult remove(@PathVariable Long[] vIds)
    {
        return toAjax(verifyService.deleteVerifyByVIds(vIds));
    }
}
