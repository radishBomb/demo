package com.example.radish.common.rule.entity;

import lombok.Data;
import lombok.ToString;

/**
 *  规则信息
 * @author luojun
 * @date 2020-6-2315:31
 */
@Data
@ToString
public class RuleInfo {
    /**
     * 规则id，全局唯一
     */
    private Long id;

    /**
     * 场景id，一个场景对应多个规则，一个场景对应一个业务场景，一个场景对应一个kmodule
     */
    private Long sceneId;

    /**
     * 规则内容，既drl文件内容
     */
    private String content;

}
