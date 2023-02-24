package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * verify对象 tbl_verify
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
public class Verify extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 审核编号 */
    @Excel(name = "审核编号")
    private Long vId;

    /** 标题 */
    @Excel(name = "标题")
    private String vTitile;

    /** 来源 */
    @Excel(name = "来源")
    private String vSource;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String vStatus;

    /** 开启状态 */
    @Excel(name = "开启状态")
    private Long vCode;

    /** 类型 */
    @Excel(name = "类型")
    private String vType;

    /** 栏目 */
    @Excel(name = "栏目")
    private String vColumn;

    /** 审核人 */
    @Excel(name = "审核人")
    private String vEditor;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date vGmtCreate;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date vGmtUpdate;

    public void setvId(Long vId) 
    {
        this.vId = vId;
    }

    public Long getvId() 
    {
        return vId;
    }
    public void setvTitile(String vTitile) 
    {
        this.vTitile = vTitile;
    }

    public String getvTitile() 
    {
        return vTitile;
    }
    public void setvSource(String vSource) 
    {
        this.vSource = vSource;
    }

    public String getvSource() 
    {
        return vSource;
    }
    public void setvStatus(String vStatus) 
    {
        this.vStatus = vStatus;
    }

    public String getvStatus() 
    {
        return vStatus;
    }
    public void setvCode(Long vCode) 
    {
        this.vCode = vCode;
    }

    public Long getvCode() 
    {
        return vCode;
    }
    public void setvType(String vType) 
    {
        this.vType = vType;
    }

    public String getvType() 
    {
        return vType;
    }
    public void setvColumn(String vColumn) 
    {
        this.vColumn = vColumn;
    }

    public String getvColumn() 
    {
        return vColumn;
    }
    public void setvEditor(String vEditor) 
    {
        this.vEditor = vEditor;
    }

    public String getvEditor() 
    {
        return vEditor;
    }
    public void setvGmtCreate(Date vGmtCreate) 
    {
        this.vGmtCreate = vGmtCreate;
    }

    public Date getvGmtCreate() 
    {
        return vGmtCreate;
    }
    public void setvGmtUpdate(Date vGmtUpdate) 
    {
        this.vGmtUpdate = vGmtUpdate;
    }

    public Date getvGmtUpdate() 
    {
        return vGmtUpdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("vId", getvId())
            .append("vTitile", getvTitile())
            .append("vSource", getvSource())
            .append("vStatus", getvStatus())
            .append("vCode", getvCode())
            .append("vType", getvType())
            .append("vColumn", getvColumn())
            .append("vEditor", getvEditor())
            .append("vGmtCreate", getvGmtCreate())
            .append("vGmtUpdate", getvGmtUpdate())
            .toString();
    }
}
