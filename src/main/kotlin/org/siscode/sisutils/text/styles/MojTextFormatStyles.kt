package org.siscode.sisutils.text.styles

import net.minecraft.text.ClickEvent
import net.minecraft.text.HoverEvent
import net.minecraft.util.Identifier
import org.siscode.sisutils.text.FormatStyle

object MojTextFormatStyles {
    /*
     * Derived from `Style` and `BaseText`
     */
    class INSERTION(val insertion: String) : FormatStyle("MC:INSERTION")
    class HOVER(val hoverEvent: HoverEvent) : FormatStyle("MC:HOVER")
    class CLICK(val clickEvent: ClickEvent) : FormatStyle("MC:CLICK")
    class COLOR(val color: Int) : FormatStyle("MC:COLOR")
    class FONT(val identifier: Identifier) : FormatStyle("MC:FONT")
}
