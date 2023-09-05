package nl.dedouwe.items.scroll.ground;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import nl.dedouwe.items.Scroll;
import nl.dedouwe.items.Sources;

public class ThrowScroll extends Scroll {

    public ThrowScroll() {
        super(Sources.Ground, "Throw", Component.text("Throwing stones, but better!").color(NamedTextColor.GRAY));
    }

    @Override
    public TextComponent GetHelp() {
        return Component.text("").color(NamedTextColor.GRAY);
    }
    
}
