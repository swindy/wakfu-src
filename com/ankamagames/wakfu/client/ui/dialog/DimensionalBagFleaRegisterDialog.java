package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.util.alignment.*;

public class DimensionalBagFleaRegisterDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public DimensionalBagFleaRegisterDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Window window = new Window();
        window.onCheckOut();
        window.setElementMap(elementMap);
        window.setPack(true);
        window.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        window.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setStyle("windowNew");
        window.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut2.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element3 = new Padding();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setInsets(new Insets(10, 5, 12, 5));
        appearance.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element4 = new StaticLayoutData();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setSize(new Dimension(100.0f, 100.0f));
        checkOut2.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final WindowMovePoint element5 = new WindowMovePoint();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setExpandable(false);
        checkOut2.addBasicElement(element5);
        element5.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element5.getAppearance();
        appearance2.setElementMap(elementMap);
        element5.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 10, 0, 10));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setStyle("titleBar");
        element5.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut5.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Padding element6 = new Padding();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setInsets(new Insets(3, 20, 3, 20));
        appearance3.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        appearance3.onChildrenAdded();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setHorizontal(false);
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setExpandable(false);
        checkOut5.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final RowLayoutData element7 = new RowLayoutData();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setAlign(Alignment9.CENTER);
        checkOut7.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final Label element8 = new Label();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setStyle("StyledBold16White");
        element8.setNonBlocking(true);
        element8.setText("%dimensionalBagFleaRegister.title%".replace("%dimensionalBagFleaRegister.title%", Xulor.getInstance().getTranslatedString("dimensionalBagFleaRegister.title")));
        checkOut7.addBasicElement(element8);
        element8.onAttributesInitialized();
        final DecoratorAppearance appearance4 = element8.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlign(Alignment9.CENTER);
        element8.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        appearance4.onChildrenAdded();
        element8.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut5.onChildrenAdded();
        element5.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut2.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final DecoratorAppearance appearance5 = checkOut8.getAppearance();
        appearance5.setElementMap(elementMap);
        checkOut8.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 12, 0, 12));
        appearance5.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance5.onChildrenAdded();
        final String id = "windowContentContainer";
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut10);
        }
        checkOut8.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final RowLayoutData element9 = new RowLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment9.NORTH);
        checkOut10.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final RowLayout checkOut11 = RowLayout.checkOut();
        checkOut11.setHorizontal(false);
        checkOut10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final DecoratorAppearance appearance6 = checkOut10.getAppearance();
        appearance6.setElementMap(elementMap);
        checkOut10.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final Margin checkOut12 = Margin.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setInsets(new Insets(0, 0, 0, 0));
        appearance6.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        appearance6.onChildrenAdded();
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setStyle("flat");
        checkOut10.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final Label element10 = new Label();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setStyle("bold");
        element10.setText("%market.location%".replace("%market.location%", Xulor.getInstance().getTranslatedString("market.location")));
        element10.setExpandable(false);
        element10.setPrefSize(new Dimension(150, 0));
        checkOut13.addBasicElement(element10);
        element10.onAttributesInitialized();
        final DecoratorAppearance appearance7 = element10.getAppearance();
        appearance7.setElementMap(elementMap);
        element10.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Margin checkOut14 = Margin.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setInsets(new Insets(0, 3, 0, 3));
        appearance7.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        appearance7.onChildrenAdded();
        element10.onChildrenAdded();
        final Container checkOut15 = Container.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setStyle("ShortcutRowBackgroundFull");
        checkOut15.setExpandable(true);
        checkOut15.setPrefSize(new Dimension(150, 0));
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        final DecoratorAppearance appearance8 = checkOut15.getAppearance();
        appearance8.setElementMap(elementMap);
        checkOut15.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final Padding element11 = new Padding();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setInsets(new Insets(2, 5, 2, 5));
        appearance8.addBasicElement(element11);
        element11.onAttributesInitialized();
        element11.onChildrenAdded();
        appearance8.onChildrenAdded();
        final Label element12 = new Label();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setStyle("bold");
        checkOut15.addBasicElement(element12);
        element12.onAttributesInitialized();
        final DecoratorAppearance appearance9 = element12.getAppearance();
        appearance9.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance9).setAlign(Alignment9.EAST);
        element12.addBasicElement(appearance9);
        appearance9.onAttributesInitialized();
        appearance9.onChildrenAdded();
        final PropertyElement checkOut16 = PropertyElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setName("market.flea.register");
        checkOut16.setAttribute("text");
        checkOut16.setField("marketName");
        element12.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        element12.onChildrenAdded();
        checkOut15.onChildrenAdded();
        checkOut13.onChildrenAdded();
        final Container checkOut17 = Container.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setStyle("flat");
        checkOut10.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        final Label element13 = new Label();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setStyle("bold");
        element13.setText("%market.taxPercentage%".replace("%market.taxPercentage%", Xulor.getInstance().getTranslatedString("market.taxPercentage")));
        element13.setExpandable(false);
        element13.setPrefSize(new Dimension(150, 0));
        checkOut17.addBasicElement(element13);
        element13.onAttributesInitialized();
        final DecoratorAppearance appearance10 = element13.getAppearance();
        appearance10.setElementMap(elementMap);
        element13.addBasicElement(appearance10);
        appearance10.onAttributesInitialized();
        final Margin checkOut18 = Margin.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setInsets(new Insets(0, 3, 0, 3));
        appearance10.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        appearance10.onChildrenAdded();
        element13.onChildrenAdded();
        final Container checkOut19 = Container.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setStyle("ShortcutRowBackgroundFull");
        checkOut19.setExpandable(true);
        checkOut19.setPrefSize(new Dimension(150, 0));
        checkOut17.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        final DecoratorAppearance appearance11 = checkOut19.getAppearance();
        appearance11.setElementMap(elementMap);
        checkOut19.addBasicElement(appearance11);
        appearance11.onAttributesInitialized();
        final Padding element14 = new Padding();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setInsets(new Insets(2, 5, 2, 5));
        appearance11.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        appearance11.onChildrenAdded();
        final Label element15 = new Label();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setStyle("bold");
        checkOut19.addBasicElement(element15);
        element15.onAttributesInitialized();
        final DecoratorAppearance appearance12 = element15.getAppearance();
        appearance12.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance12).setAlign(Alignment9.EAST);
        element15.addBasicElement(appearance12);
        appearance12.onAttributesInitialized();
        appearance12.onChildrenAdded();
        final PropertyElement checkOut20 = PropertyElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setName("market.flea.register");
        checkOut20.setAttribute("text");
        checkOut20.setField("taxPercentage");
        element15.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        element15.onChildrenAdded();
        checkOut19.onChildrenAdded();
        checkOut17.onChildrenAdded();
        final Container checkOut21 = Container.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setStyle("flat");
        checkOut10.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        final Label element16 = new Label();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setStyle("bold");
        element16.setText("%market.fleaValue%".replace("%market.fleaValue%", Xulor.getInstance().getTranslatedString("market.fleaValue")));
        element16.setExpandable(false);
        element16.setPrefSize(new Dimension(150, 0));
        checkOut21.addBasicElement(element16);
        element16.onAttributesInitialized();
        final DecoratorAppearance appearance13 = element16.getAppearance();
        appearance13.setElementMap(elementMap);
        element16.addBasicElement(appearance13);
        appearance13.onAttributesInitialized();
        final Margin checkOut22 = Margin.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setInsets(new Insets(0, 3, 0, 3));
        appearance13.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        appearance13.onChildrenAdded();
        element16.onChildrenAdded();
        final Container checkOut23 = Container.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setStyle("ShortcutRowBackgroundFull");
        checkOut23.setExpandable(true);
        checkOut23.setPrefSize(new Dimension(150, 0));
        checkOut21.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final DecoratorAppearance appearance14 = checkOut23.getAppearance();
        appearance14.setElementMap(elementMap);
        checkOut23.addBasicElement(appearance14);
        appearance14.onAttributesInitialized();
        final Padding element17 = new Padding();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setInsets(new Insets(2, 5, 2, 5));
        appearance14.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        appearance14.onChildrenAdded();
        final Label element18 = new Label();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setStyle("bold");
        checkOut23.addBasicElement(element18);
        element18.onAttributesInitialized();
        final DecoratorAppearance appearance15 = element18.getAppearance();
        appearance15.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance15).setAlign(Alignment9.EAST);
        element18.addBasicElement(appearance15);
        appearance15.onAttributesInitialized();
        final Margin checkOut24 = Margin.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setInsets(new Insets(0, 0, 0, 2));
        appearance15.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        appearance15.onChildrenAdded();
        final PropertyElement checkOut25 = PropertyElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setName("market.flea.register");
        checkOut25.setAttribute("text");
        checkOut25.setField("totalValue");
        element18.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        element18.onChildrenAdded();
        final Image element19 = new Image();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setStyle("kamas");
        element19.setExpandable(false);
        checkOut23.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        checkOut23.onChildrenAdded();
        checkOut21.onChildrenAdded();
        final Container checkOut26 = Container.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setStyle("flat");
        checkOut10.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        final Label element20 = new Label();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setStyle("bold");
        element20.setText("%duration.short%".replace("%duration.short%", Xulor.getInstance().getTranslatedString("duration.short")));
        element20.setExpandable(false);
        element20.setPrefSize(new Dimension(150, 0));
        checkOut26.addBasicElement(element20);
        element20.onAttributesInitialized();
        final DecoratorAppearance appearance16 = element20.getAppearance();
        appearance16.setElementMap(elementMap);
        element20.addBasicElement(appearance16);
        appearance16.onAttributesInitialized();
        final Margin checkOut27 = Margin.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setInsets(new Insets(0, 3, 0, 3));
        appearance16.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        appearance16.onChildrenAdded();
        element20.onChildrenAdded();
        final ComboBox element21 = new ComboBox();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setStyle("blue");
        element21.setExpandable(true);
        element21.setPrefSize(new Dimension(150, 15));
        final ListSelectionChangedListener onListSelectionChange = new ListSelectionChangedListener();
        onListSelectionChange.setCallBackFunc("wakfu.dimensionalBagFleaRegister:selectDuration");
        element21.setOnListSelectionChange(onListSelectionChange);
        checkOut26.addBasicElement(element21);
        element21.onAttributesInitialized();
        final PropertyElement checkOut28 = PropertyElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setName("market.flea.register");
        checkOut28.setAttribute("content");
        checkOut28.setField("availableDurations");
        element21.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PropertyElement checkOut29 = PropertyElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setName("market.flea.register");
        checkOut29.setAttribute("selectedValue");
        checkOut29.setField("selectedDuration");
        element21.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final RenderableContainer element22 = new RenderableContainer();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element21.addBasicElement(element22);
        element22.onAttributesInitialized();
        final ItemRenderer element23 = new ItemRenderer();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element22.addBasicElement(element23);
        element23.onAttributesInitialized();
        final Label element24 = new Label();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setNonBlocking(true);
        element24.setStyle("whiteBold");
        element23.addBasicElement(element24);
        element24.onAttributesInitialized();
        final DecoratorAppearance appearance17 = element24.getAppearance();
        appearance17.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance17).setAlign(Alignment9.EAST);
        element24.addBasicElement(appearance17);
        appearance17.onAttributesInitialized();
        final Margin checkOut30 = Margin.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setInsets(new Insets(0, 0, 0, 3));
        appearance17.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        appearance17.onChildrenAdded();
        final RowLayoutData element25 = new RowLayoutData();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setAlign(Alignment9.CENTER);
        element24.addBasicElement(element25);
        element25.onAttributesInitialized();
        element25.onChildrenAdded();
        this.method0(element24);
        element24.onChildrenAdded();
        element23.onChildrenAdded();
        element22.onChildrenAdded();
        this.method1(element21);
        element21.onChildrenAdded();
        checkOut26.onChildrenAdded();
        this.method2(checkOut10);
        this.method3(checkOut10);
        checkOut10.onChildrenAdded();
        checkOut8.onChildrenAdded();
        checkOut2.onChildrenAdded();
        this.method4(window);
        this.method5(window);
        this.method6(window);
        window.onChildrenAdded();
        return window;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final ItemElement element = new ItemElement();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAttribute("text");
        element.setField("description");
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final List element = new List();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setHorizontal(false);
        element.setCellSize(new Dimension(100.0f, 16));
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final ItemRenderer element2 = new ItemRenderer();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        final Label element3 = new Label();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setNonBlocking(true);
        element3.setStyle("whiteBold");
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        final ItemElement element4 = new ItemElement();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setAttribute("text");
        element4.setField("description");
        element3.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final DecoratorAppearance appearance = element3.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlign(Alignment9.CENTER);
        element3.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        appearance.onChildrenAdded();
        element3.onChildrenAdded();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("flat");
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final Label element = new Label();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("bold");
        element.setText("%market.registerCost%".replace("%market.registerCost%", Xulor.getInstance().getTranslatedString("market.registerCost")));
        element.setExpandable(false);
        element.setPrefSize(new Dimension(150, 0));
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        final DecoratorAppearance appearance = element.getAppearance();
        appearance.setElementMap(elementMap);
        element.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut2 = Margin.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setInsets(new Insets(0, 3, 0, 3));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        element.onChildrenAdded();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setStyle("ShortcutRowBackgroundFull");
        checkOut3.setExpandable(true);
        checkOut3.setPrefSize(new Dimension(150, 0));
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final DecoratorAppearance appearance2 = checkOut3.getAppearance();
        appearance2.setElementMap(elementMap);
        checkOut3.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Padding element2 = new Padding();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setInsets(new Insets(2, 5, 2, 5));
        appearance2.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        appearance2.onChildrenAdded();
        final TextView element3 = new TextView();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setStyle("bold");
        checkOut3.addBasicElement(element3);
        element3.onAttributesInitialized();
        final DecoratorAppearance appearance3 = element3.getAppearance();
        appearance3.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance3).setAlign(Alignment9.EAST);
        element3.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 0, 0, 2));
        appearance3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance3.onChildrenAdded();
        final PropertyElement checkOut5 = PropertyElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setName("market.flea.register");
        checkOut5.setAttribute("text");
        checkOut5.setField("dutyDescription");
        element3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        element3.onChildrenAdded();
        final Image element4 = new Image();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setStyle("kamas");
        element4.setExpandable(false);
        checkOut3.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        checkOut3.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setExpandable(false);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final Button element2 = new Button();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setStyle("yellow");
        element2.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.dimensionalBagFleaRegister:validate");
        element2.setOnClick(onClick);
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        final PropertyElement checkOut2 = PropertyElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setName("market.flea.register");
        checkOut2.setAttribute("enabled");
        checkOut2.setField("hasEnoughMoney");
        element2.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final StaticLayoutData element3 = new StaticLayoutData();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setAlign(Alignment17.CENTER);
        element3.setSize(new Dimension(100.0f, 100.0f));
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final DecoratorAppearance appearance = element2.getAppearance();
        appearance.setElementMap(elementMap);
        element2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element4 = new Padding();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setInsets(new Insets(3, 3, 3, 3));
        appearance.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        appearance.onChildrenAdded();
        element2.onChildrenAdded();
        final Image element5 = new Image();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("apply");
        element5.setDisplaySize(new Dimension(16, 16));
        element5.setNonBlocking(true);
        checkOut.addBasicElement(element5);
        element5.onAttributesInitialized();
        final StaticLayoutData element6 = new StaticLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment17.CENTER);
        element6.setSize(new Dimension(100.0f, 100.0f));
        element5.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        element5.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method4(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method5(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Button element = new Button();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("close");
        element.setExpandable(false);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.dimensionalBagFleaRegister:cancel");
        element.setOnClick(onClick);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(-2, -2));
        element2.setAlign(Alignment17.NORTH_EAST);
        element2.setXOffset(-18);
        element2.setYOffset(-12);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method6(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(-2, -2));
        element.setAlign(Alignment17.CENTER);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
}