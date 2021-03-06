package com.ankamagames.wakfu.client.core.game.interactiveElement;

import org.apache.log4j.*;
import com.ankamagames.baseImpl.client.proxyclient.base.game.interactiveElement.*;
import com.ankamagames.baseImpl.common.clientAndServer.game.interactiveElement.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.wakfu.client.core.dungeon.arcade.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.wakfu.client.ui.*;
import com.ankamagames.baseImpl.graphics.ui.event.*;
import com.ankamagames.wakfu.client.sound.*;
import com.ankamagames.wakfu.client.ui.actions.*;
import com.ankamagames.wakfu.common.game.interactiveElements.param.*;
import com.ankamagames.wakfu.common.game.interactiveElements.param.type.*;
import com.ankamagames.wakfu.client.ui.mru.MRUActions.*;
import com.ankamagames.wakfu.common.game.skill.*;
import com.ankamagames.wakfu.common.game.chaos.*;
import com.ankamagames.framework.kernel.core.common.*;
import org.apache.commons.pool.*;

public class RewardDisplayer extends WakfuClientMapInteractiveElement implements ChaosInteractiveElement
{
    private static final Logger m_logger;
    public static final short STATE_NORMAL = 1;
    protected IERewardDisplayerParameter m_displayerParameter;
    
    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.setState((short)1);
        this.setVisible(true);
        this.setBlockingMovements(true);
        this.setBlockingLineOfSight(true);
        assert this.m_displayerParameter == null;
    }
    
    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.m_displayerParameter = null;
    }
    
    @Override
    public void onViewUpdated(final ClientInteractiveElementView view) {
    }
    
    @Override
    public boolean onAction(final InteractiveElementAction action, final InteractiveElementUser user) {
        if (action == InteractiveElementAction.ACTIVATE) {
            final String name = WakfuTranslator.getInstance().getString(119, this.m_displayerParameter.getId(), new Object[0]);
            final String desc = WakfuTranslator.getInstance().getString(120, this.m_displayerParameter.getId(), new Object[0]);
            PropertiesProvider.getInstance().setPropertyValue("arcadeDungeon", new RewardDistractionView(name, desc, this.m_displayerParameter.getItemIds()));
            Xulor.getInstance().load("arcadeDungeonTeaserDialog", Dialogs.getDialogPath("arcadeDungeonTeaserDialog"), 257L, (short)10000);
            final DialogUnloadListener dialogUnloadListener = new DialogUnloadListener() {
                @Override
                public void dialogUnloaded(final String id) {
                    if (id.equals("arcadeDungeonTeaserDialog")) {
                        WakfuSoundManager.getInstance().playGUISound(600121L);
                        PropertiesProvider.getInstance().setPropertyValue("arcadeDungeon", null);
                        Xulor.getInstance().removeActionClass("wakfu.arcadeDungeon");
                        Xulor.getInstance().removeDialogUnloadListener(this);
                    }
                }
            };
            Xulor.getInstance().addDialogUnloadListener(dialogUnloadListener);
            Xulor.getInstance().putActionClass("wakfu.arcadeDungeon", ArcadeDungeonDialogActions.class);
            WakfuSoundManager.getInstance().playGUISound(600120L);
            return true;
        }
        return false;
    }
    
    @Override
    public void initializeWithParameter() {
        final String[] params = this.m_parameter.split(";");
        if (params.length != 1) {
            RewardDisplayer.m_logger.error((Object)("[LD] L'IE de RewardDisplayer " + this.m_id + " doit avoir " + 1 + " param\u00e8tre"));
            return;
        }
        final IERewardDisplayerParameter param = (IERewardDisplayerParameter)IEParametersManager.INSTANCE.getParam(IETypes.REWARD_DISPLAYER, Integer.valueOf(params[0]));
        if (param == null) {
            RewardDisplayer.m_logger.error((Object)("[LD] L'IE de RewardDisplayer " + this.m_id + " \u00e0 un parametre [" + Integer.valueOf(params[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.m_displayerParameter = param;
    }
    
    public InteractiveElementAction getInteractiveDefaultAction() {
        return InteractiveElementAction.ACTIVATE;
    }
    
    @Override
    public InteractiveElementAction[] getInteractiveUsableActions() {
        return new InteractiveElementAction[] { InteractiveElementAction.ACTIVATE };
    }
    
    @Override
    public AbstractMRUAction[] getInteractiveMRUActions() {
        final ActionVisual visual = ActionVisualManager.getInstance().get(this.m_displayerParameter.getVisualId());
        if (visual == null) {
            RewardDisplayer.m_logger.error((Object)("[LD] Impossible de trouver le visuel " + this.m_displayerParameter.getVisualId() + " pour l'IE " + this.m_id), (Throwable)new IllegalArgumentException());
            return AbstractMRUAction.EMPTY_ARRAY;
        }
        final MRUBackgroundDisplayAction action = MRUActions.BACKGROUND_DISPLAY_ACTION.getMRUAction();
        action.setGfxId(visual.getMruGfx());
        action.setName("desc.mru." + visual.getMruLabelKey());
        action.setActionToExecute(this.getDefaultAction());
        return new AbstractMRUAction[] { action };
    }
    
    @Override
    public String getName() {
        return "";
    }
    
    @Override
    public ChaosIEParameter getChaosIEParameter() {
        return this.m_displayerParameter;
    }
    
    static {
        m_logger = Logger.getLogger((Class)RewardDisplayer.class);
    }
    
    public static class Factory extends ObjectFactory<WakfuClientMapInteractiveElement>
    {
        private static MonitoredPool m_pool;
        
        @Override
        public WakfuClientMapInteractiveElement makeObject() {
            RewardDisplayer element;
            try {
                element = (RewardDisplayer)Factory.m_pool.borrowObject();
                element.setPool(Factory.m_pool);
            }
            catch (Exception e) {
                RewardDisplayer.m_logger.error((Object)("Erreur lors de l'extraction d'un " + RewardDisplayer.class.getName() + " du pool"), (Throwable)e);
                element = new RewardDisplayer();
            }
            return element;
        }
        
        static {
            Factory.m_pool = new MonitoredPool(new ObjectFactory<RewardDisplayer>() {
                @Override
                public RewardDisplayer makeObject() {
                    return new RewardDisplayer();
                }
            });
        }
    }
}
