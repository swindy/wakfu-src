package com.ankamagames.wakfu.client.core.game.protector.event;

import com.ankamagames.wakfu.common.game.nation.*;
import com.ankamagames.wakfu.client.core.game.protector.snapshot.*;
import com.ankamagames.wakfu.client.core.*;

public class ProtectorDefeated extends ProtectorEvent
{
    private Nation m_attackingNation;
    
    public void setAttackingNation(final Nation attackingNation) {
        this.m_attackingNation = attackingNation;
    }
    
    public Nation getAttackingNation() {
        return this.m_attackingNation;
    }
    
    @Override
    public ProtectorMood getProtectorMood() {
        return ProtectorMood.NEUTRAL;
    }
    
    @Override
    public String[] getParams() {
        final String[] params = { WakfuTranslator.getInstance().getString(39, this.m_attackingNation.getNationId(), new Object[0]) };
        return params;
    }
}
