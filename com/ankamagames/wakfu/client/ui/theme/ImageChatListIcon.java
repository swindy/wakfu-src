package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ImageChatListIcon implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ImageChatListIcon() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((ImageAppearance)appearance).setScaled(false);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final String id = "pmChatList";
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setHeight(16);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(17);
        checkOut.setX(632);
        checkOut.setY(199);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
