package com.ruoyi.common.core.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * CxSelect树结构实体类
 *
 * @author ruoyi
 */
@Data
@Alias("CxSelect")
public class CxSelect implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 数据值字段名称
     */
    private String v;

    /**
     * 数据标题字段名称
     */
    private String n;

    /**
     * 子集数据字段名称
     */
    private List<CxSelect> s;

    public CxSelect() {
    }

    public CxSelect(String v, String n) {
        this.v = v;
        this.n = n;
    }
}
