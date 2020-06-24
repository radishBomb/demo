package com.example.radish.common.rule.drools;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author luojun
 * @date 2020-6-2315:41
 */
@Component
public class KieSessionHelper {
    @Autowired
    private RuleLoader ruleLoader;

    /**
     * 获取KieSession
     *
     * @param sceneId 场景ID
     * @return KieSession
     */
    public KieSession getKieSessionBySceneId(long sceneId) {
        return ruleLoader.getKieContainerBySceneId(sceneId).getKieBase().newKieSession();
    }
}
