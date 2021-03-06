package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.nongraphical.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.renderer.condition.*;

public class KrosmozCollectionDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public KrosmozCollectionDialog() {
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
        window.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(-2, -2));
        element.setAlign(Alignment17.WEST);
        element.setXOffset(20);
        element.setInitValue(true);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final WindowMovePoint element2 = new WindowMovePoint();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        window.addBasicElement(element2);
        element2.onAttributesInitialized();
        final StaticLayout element3 = new StaticLayout();
        element3.onCheckOut();
        element3.setAdaptToContentSize(true);
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("tiledScroll");
        element2.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final RowLayout checkOut2 = RowLayout.checkOut();
        checkOut2.setHorizontal(false);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut3 = Margin.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setInsets(new Insets(65, 10, 65, 10));
        appearance.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final Padding element4 = new Padding();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setInsets(new Insets(30, 15, 30, 15));
        appearance.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element5 = new StaticLayoutData();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final Container checkOut4 = Container.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        final DecoratorAppearance appearance2 = checkOut4.getAppearance();
        appearance2.setElementMap(elementMap);
        checkOut4.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut5 = Margin.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setInsets(new Insets(0, 0, 5, 0));
        appearance2.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        appearance2.onChildrenAdded();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setAlign(Alignment9.CENTER);
        checkOut4.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Button element6 = new Button();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setStyle("yellowLeftArrow");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.krosmozCollection:previousSeason");
        element6.setOnClick(onClick);
        element6.setExpandable(false);
        checkOut4.addBasicElement(element6);
        element6.onAttributesInitialized();
        final DecoratorAppearance appearance3 = element6.getAppearance();
        appearance3.setElementMap(elementMap);
        element6.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut7 = Margin.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setInsets(new Insets(1, 0, 0, 5));
        appearance3.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        appearance3.onChildrenAdded();
        element6.onChildrenAdded();
        final TextView element7 = new TextView();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setStyle("styledBoldDark12");
        element7.setExpandable(false);
        checkOut4.addBasicElement(element7);
        element7.onAttributesInitialized();
        final PropertyElement checkOut8 = PropertyElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setName("krosmozCollection");
        checkOut8.setAttribute("text");
        checkOut8.setField("currentSeason/name");
        element7.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        element7.onChildrenAdded();
        final Button element8 = new Button();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setStyle("yellowRightArrow");
        final MouseClickedListener onClick2 = new MouseClickedListener();
        onClick2.setCallBackFunc("wakfu.krosmozCollection:nextSeason");
        element8.setOnClick(onClick2);
        element8.setExpandable(false);
        checkOut4.addBasicElement(element8);
        element8.onAttributesInitialized();
        final DecoratorAppearance appearance4 = element8.getAppearance();
        appearance4.setElementMap(elementMap);
        element8.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(1, 5, 0, 0));
        appearance4.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance4.onChildrenAdded();
        element8.onChildrenAdded();
        checkOut4.onChildrenAdded();
        final String id = "itemList";
        final List list = new List();
        list.onCheckOut();
        list.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, list);
        }
        list.setCellSize(new Dimension(40, 40));
        list.setScrollBar(false);
        list.setHorizontal(false);
        list.setAutoIdealSize(true);
        list.setPrefSize(new Dimension(200, 0));
        list.setIdealSizeMaxColumns(8);
        list.setIdealSizeMinColumns(8);
        list.setSelectionTogglable(false);
        list.setExpandable(false);
        checkOut.addBasicElement(list);
        list.onAttributesInitialized();
        final RowLayoutData element9 = new RowLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment9.CENTER);
        list.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final PropertyElement checkOut10 = PropertyElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setName("krosmozCollection");
        checkOut10.setAttribute("content");
        checkOut10.setField("currentSeason/figures");
        list.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        final ItemRenderer element10 = new ItemRenderer();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        final ItemDoubleClickListener onItemDoubleClick = new ItemDoubleClickListener();
        onItemDoubleClick.setCallBackFunc("wakfu.krosmozCollection:deleteFigure");
        element10.setOnItemDoubleClick(onItemDoubleClick);
        list.addBasicElement(element10);
        element10.onAttributesInitialized();
        final ConditionResult element11 = new ConditionResult();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element10.addBasicElement(element11);
        element11.onAttributesInitialized();
        final ItemCondition element12 = new ItemCondition();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element11.addBasicElement(element12);
        element12.onAttributesInitialized();
        final NotNullCondition element13 = new NotNullCondition();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element12.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        element12.onChildrenAdded();
        element11.onChildrenAdded();
        final Container checkOut11 = Container.checkOut();
        checkOut11.setElementMap(elementMap);
        element10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final StaticLayout element14 = new StaticLayout();
        element14.onCheckOut();
        checkOut11.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        final Image element15 = new Image();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setStyle("IconEmptyEmote");
        element15.setDisplaySize(new Dimension(36, 36));
        checkOut11.addBasicElement(element15);
        element15.onAttributesInitialized();
        final StaticLayoutData element16 = new StaticLayoutData();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setSize(new Dimension(-2, -2));
        element16.setAlign(Alignment17.CENTER);
        element15.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        final ItemElement element17 = new ItemElement();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setAttribute("visible");
        element17.setField("size");
        element15.addBasicElement(element17);
        element17.onAttributesInitialized();
        final ConditionResult element18 = new ConditionResult();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element17.addBasicElement(element18);
        element18.onAttributesInitialized();
        final NotEqualCondition element19 = new NotEqualCondition();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setValue("0");
        element18.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        element18.onChildrenAdded();
        element17.onChildrenAdded();
        element15.onChildrenAdded();
        final Image element20 = new Image();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setStyle("iconUnknownEmote");
        element20.setDisplaySize(new Dimension(36, 36));
        checkOut11.addBasicElement(element20);
        element20.onAttributesInitialized();
        final DecoratorAppearance appearance5 = element20.getAppearance();
        appearance5.setElementMap(elementMap);
        appearance5.setModulationColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        element20.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        appearance5.onChildrenAdded();
        final StaticLayoutData element21 = new StaticLayoutData();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setSize(new Dimension(-2, -2));
        element21.setAlign(Alignment17.CENTER);
        element20.addBasicElement(element21);
        element21.onAttributesInitialized();
        element21.onChildrenAdded();
        final ItemElement element22 = new ItemElement();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setAttribute("visible");
        element22.setField("size");
        element20.addBasicElement(element22);
        element22.onAttributesInitialized();
        final ConditionResult element23 = new ConditionResult();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element22.addBasicElement(element23);
        element23.onAttributesInitialized();
        final EqualCondition element24 = new EqualCondition();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setValue("0");
        element23.addBasicElement(element24);
        element24.onAttributesInitialized();
        element24.onChildrenAdded();
        element23.onChildrenAdded();
        element22.onChildrenAdded();
        element20.onChildrenAdded();
        final String id2 = "itemContainer";
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut12);
        }
        checkOut12.setNonBlocking(false);
        final PopupDisplayListener onPopupDisplay = new PopupDisplayListener();
        onPopupDisplay.setCallBackFunc("popup(figurePopup)");
        checkOut12.setOnPopupDisplay(onPopupDisplay);
        final PopupHideListener onPopupHide = new PopupHideListener();
        onPopupHide.setCallBackFunc("closePopup");
        checkOut12.setOnPopupHide(onPopupHide);
        checkOut11.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final ItemElement element25 = new ItemElement();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setAttribute("visible");
        element25.setField("size");
        checkOut12.addBasicElement(element25);
        element25.onAttributesInitialized();
        final ConditionResult element26 = new ConditionResult();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element25.addBasicElement(element26);
        element26.onAttributesInitialized();
        final NotEqualCondition element27 = new NotEqualCondition();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element27.setValue("0");
        element26.addBasicElement(element27);
        element27.onAttributesInitialized();
        element27.onChildrenAdded();
        element26.onChildrenAdded();
        element25.onChildrenAdded();
        final String id3 = "figurePopup";
        final PopupElement popupElement = new PopupElement();
        popupElement.onCheckOut();
        popupElement.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, popupElement);
        }
        popupElement.setAlign(Alignment9.NORTH);
        popupElement.setHotSpotPosition(Alignment9.SOUTH);
        checkOut12.addBasicElement(popupElement);
        popupElement.onAttributesInitialized();
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setStyle("popup");
        popupElement.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final Image element28 = new Image();
        element28.onCheckOut();
        element28.setElementMap(elementMap);
        checkOut13.addBasicElement(element28);
        element28.onAttributesInitialized();
        final RowLayoutData element29 = new RowLayoutData();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setAlign(Alignment9.NORTH);
        element28.addBasicElement(element29);
        element29.onAttributesInitialized();
        element29.onChildrenAdded();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        element28.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        final ItemElement element30 = new ItemElement();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setAttribute("texture");
        element30.setField("iconUrl");
        checkOut14.addBasicElement(element30);
        element30.onAttributesInitialized();
        element30.onChildrenAdded();
        checkOut14.onChildrenAdded();
        element28.onChildrenAdded();
        final Container checkOut15 = Container.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut13.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        final RowLayoutData element31 = new RowLayoutData();
        element31.onCheckOut();
        element31.setElementMap(elementMap);
        element31.setAlign(Alignment9.NORTH);
        checkOut15.addBasicElement(element31);
        element31.onAttributesInitialized();
        element31.onChildrenAdded();
        final RowLayout checkOut16 = RowLayout.checkOut();
        checkOut16.setHorizontal(false);
        checkOut15.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final TextView element32 = new TextView();
        element32.onCheckOut();
        element32.setElementMap(elementMap);
        element32.setStyle("styledBoldWhite12");
        element32.setMinWidth(1);
        element32.setMaxWidth(250);
        element32.setExpandable(false);
        checkOut15.addBasicElement(element32);
        element32.onAttributesInitialized();
        final ItemElement element33 = new ItemElement();
        element33.onCheckOut();
        element33.setElementMap(elementMap);
        element33.setAttribute("text");
        element33.setField("name");
        element32.addBasicElement(element33);
        element33.onAttributesInitialized();
        element33.onChildrenAdded();
        final DecoratorAppearance appearance6 = element32.getAppearance();
        appearance6.setElementMap(elementMap);
        element32.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final ColorElement checkOut17 = ColorElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setColor(new Color(1.0f, 0.78f, 0.15f, 1.0f));
        appearance6.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        appearance6.onChildrenAdded();
        element32.onChildrenAdded();
        final TextView element34 = new TextView();
        element34.onCheckOut();
        element34.setElementMap(elementMap);
        element34.setStyle("bold");
        element34.setMinWidth(1);
        element34.setMaxWidth(250);
        element34.setExpandable(false);
        checkOut15.addBasicElement(element34);
        element34.onAttributesInitialized();
        final ItemElement element35 = new ItemElement();
        element35.onCheckOut();
        element35.setElementMap(elementMap);
        element35.setAttribute("text");
        element35.setField("description");
        element34.addBasicElement(element35);
        element35.onAttributesInitialized();
        element35.onChildrenAdded();
        final DecoratorAppearance appearance7 = element34.getAppearance();
        appearance7.setElementMap(elementMap);
        element34.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final ColorElement checkOut18 = ColorElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setColor(new Color(0.94f, 0.86f, 0.66f, 1.0f));
        appearance7.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        appearance7.onChildrenAdded();
        element34.onChildrenAdded();
        checkOut15.onChildrenAdded();
        checkOut13.onChildrenAdded();
        popupElement.onChildrenAdded();
        final StaticLayoutData element36 = new StaticLayoutData();
        element36.onCheckOut();
        element36.setElementMap(elementMap);
        element36.setAlign(Alignment17.CENTER);
        element36.setSize(new Dimension(43, 43));
        checkOut12.addBasicElement(element36);
        element36.onAttributesInitialized();
        element36.onChildrenAdded();
        final StaticLayout element37 = new StaticLayout();
        element37.onCheckOut();
        checkOut12.addBasicElement(element37);
        element37.onAttributesInitialized();
        element37.onChildrenAdded();
        final Image element38 = new Image();
        element38.onCheckOut();
        element38.setElementMap(elementMap);
        element38.setNonBlocking(true);
        element38.setDisplaySize(new Dimension(32, 32));
        checkOut12.addBasicElement(element38);
        element38.onAttributesInitialized();
        final StaticLayoutData element39 = new StaticLayoutData();
        element39.onCheckOut();
        element39.setElementMap(elementMap);
        element39.setAlign(Alignment17.CENTER);
        element38.addBasicElement(element39);
        element39.onAttributesInitialized();
        element39.onChildrenAdded();
        final PixmapElement checkOut19 = PixmapElement.checkOut();
        checkOut19.setElementMap(elementMap);
        element38.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        final ItemElement element40 = new ItemElement();
        element40.onCheckOut();
        element40.setElementMap(elementMap);
        element40.setAttribute("texture");
        element40.setField("iconUrl");
        checkOut19.addBasicElement(element40);
        element40.onAttributesInitialized();
        element40.onChildrenAdded();
        checkOut19.onChildrenAdded();
        element38.onChildrenAdded();
        final Label element41 = new Label();
        element41.onCheckOut();
        element41.setElementMap(elementMap);
        element41.setNonBlocking(true);
        element41.setStyle("White10Bordered");
        checkOut12.addBasicElement(element41);
        element41.onAttributesInitialized();
        final StaticLayoutData element42 = new StaticLayoutData();
        element42.onCheckOut();
        element42.setElementMap(elementMap);
        element42.setAlign(Alignment17.SOUTH_WEST);
        element41.addBasicElement(element42);
        element42.onAttributesInitialized();
        element42.onChildrenAdded();
        this.method0(element41);
        this.method1(element41);
        element41.onChildrenAdded();
        checkOut12.onChildrenAdded();
        checkOut11.onChildrenAdded();
        element10.onChildrenAdded();
        this.method2(list);
        list.onChildrenAdded();
        checkOut.onChildrenAdded();
        this.method3(element2);
        this.method4(element2);
        this.method5(element2);
        element2.onChildrenAdded();
        window.onChildrenAdded();
        return window;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = ((Widget)basicElement).getAppearance();
        appearance.setElementMap(elementMap);
        basicElement.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut = Margin.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setInsets(new Insets(0, 6, 6, 0));
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
        return appearance;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final ItemElement element = new ItemElement();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAttribute("text");
        element.setField("size");
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final ItemRenderer element = new ItemRenderer();
        element.onCheckOut();
        element.setElementMap(elementMap);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final ConditionResult element2 = new ConditionResult();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        final ItemCondition element3 = new ItemCondition();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        final NullCondition element4 = new NullCondition();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element3.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        element3.onChildrenAdded();
        element2.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayout element5 = new StaticLayout();
        element5.onCheckOut();
        checkOut.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final Image element6 = new Image();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setStyle("IconEmptyEmote");
        element6.setDisplaySize(new Dimension(36, 36));
        checkOut.addBasicElement(element6);
        element6.onAttributesInitialized();
        final StaticLayoutData element7 = new StaticLayoutData();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setSize(new Dimension(-2, -2));
        element7.setAlign(Alignment17.CENTER);
        element6.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final DecoratorAppearance appearance = element6.getAppearance();
        appearance.setElementMap(elementMap);
        appearance.setModulationColor(new Color(1.0f, 1.0f, 1.0f, 0.3f));
        element6.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        appearance.onChildrenAdded();
        element6.onChildrenAdded();
        checkOut.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Image element = new Image();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("ScrollBorderTop3");
        element.setDisplaySize(new Dimension(405, 100));
        element.setKeepAspectRatio(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setAlign(Alignment17.NORTH);
        element2.setSize(new Dimension(100.0f, -2));
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method4(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Image element = new Image();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("ScrollBorderBottom3");
        element.setDisplaySize(new Dimension(405, 75));
        element.setKeepAspectRatio(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setAlign(Alignment17.SOUTH);
        element2.setSize(new Dimension(100.0f, -2));
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method5(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Button element = new Button();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("close");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("unloadDialog");
        element.setOnClick(onClick);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setAlign(Alignment17.NORTH_EAST);
        element2.setSize(new Dimension(-2, -2));
        element2.setXOffset(-31);
        element2.setYOffset(-6);
        element.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
}
