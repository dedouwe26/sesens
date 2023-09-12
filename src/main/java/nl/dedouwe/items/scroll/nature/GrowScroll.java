package nl.dedouwe.items.scroll.nature;

import org.bukkit.event.player.PlayerInteractEvent;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import nl.dedouwe.items.Scroll;
import nl.dedouwe.items.Sources;

public class GrowScroll extends Scroll {

    public GrowScroll() {
        super(Sources.Nature, "Grow", Component.text("The nature is angry!").color(NamedTextColor.GRAY));
    }

    @Override
    public TextComponent GetHelp() {
        return Component.text("Use shift right-click to make a spiral shaped grow cast, use right-click to make something surrounded.").color(NamedTextColor.GRAY);
    }
    public void onDeactivate(PlayerInteractEvent e) {}
    public void onUse(PlayerInteractEvent e) {}
}