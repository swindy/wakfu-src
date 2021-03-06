package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.game.effectArea.*;

public final class IsBomb extends IsArea
{
    public IsBomb(final ArrayList<ParserObject> args) {
        super(args);
    }
    
    @Override
    EffectAreaType getAreaType() {
        return EffectAreaType.BOMB;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.IS_BOMB;
    }
}
