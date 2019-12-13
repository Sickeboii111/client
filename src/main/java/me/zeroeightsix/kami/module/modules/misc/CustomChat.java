package me.zeroeightsix.kami.module.modules.misc;

import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zeroeightsix.kami.command.Command;
import me.zeroeightsix.kami.event.events.PacketEvent;
import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;
import net.minecraft.network.play.client.CPacketChatMessage;

import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiilllll.lllllllliiiliiilllll;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliiiii.lllllllliiiliiliiiii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliiiil.lllllllliiiliiliiiil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliiili.lllllllliiiliiliiili;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliiill.lllllllliiiliiliiill;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliilii.lllllllliiiliiliilii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliilil.lllllllliiiliiliilil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliilli.lllllllliiiliiliilli;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliiliilll.lllllllliiiliiliilll;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliililiii.lllllllliiiliililiii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliililiil.lllllllliiiliililiil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliililili.lllllllliiiliililili;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliililill.lllllllliiiliililill;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilillii.lllllllliiiliilillii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilillil.lllllllliiiliilillil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilillli.lllllllliiiliilillli;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilillll.lllllllliiiliilillll;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilliiii.lllllllliiiliilliiii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilliiil.lllllllliiiliilliiil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilliili.lllllllliiiliilliili;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilliill.lllllllliiiliilliill;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillilii.lllllllliiiliillilii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillilil.lllllllliiiliillilil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillilli.lllllllliiiliillilli;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillilll.lllllllliiiliillilll;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillliii.lllllllliiiliillliii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillliil.lllllllliiiliillliil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilllili.lllllllliiiliilllili;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliilllill.lllllllliiiliilllill;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillllii.lllllllliiiliillllii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillllil.lllllllliiiliillllil;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillllli.lllllllliiiliillllli;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiiliillllll.lllllllliiiliillllll;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiililiiiiii.lllllllliiililiiiiii;
import static me.zeroeightsix.kami.module.modules.experimental.lllllllliiiliiilllli.lllllllliiililiiiiil.lllllllliiililiiiiil;

/**
 * Created by 086 on 8/04/2018.
 * Updated by S-B99 on 12/11/19
 */
@Module.Info(name = "CustomChat", category = Module.Category.MISC, description = "Chat ending. Now has modes!")
public class CustomChat extends Module {

    private Setting<TextMode> textMode = register(Settings.e("Text", TextMode.WEBSITE));
    private Setting<DecoMode> decoMode = register(Settings.e("Decoration", DecoMode.CLASSIC));
    private Setting<Boolean> commands = register(Settings.b("Commands", false));
    private Setting<Boolean> debug = register(Settings.b("Debug", true));


    private String kSep = " " + lllllllliiiliiilllll + " ";
    private String kClassic = " " + lllllllliiiliiliiiii + " ";
    private String kClassicO = " " + lllllllliiiliiliiili;
    private String kName = lllllllliiiliiliiiil + lllllllliiiliiliiill + lllllllliiiliiliilii + lllllllliiiliiliilli + " " + lllllllliiiliiliilil + lllllllliiiliiliilll + lllllllliiiliililiii + lllllllliiiliililiil;
    private String kOnTop = lllllllliiiliiliiiil + lllllllliiiliiliiill + lllllllliiiliiliilii + lllllllliiiliiliilli + " " + lllllllliiiliiliilil + lllllllliiiliiliilll + lllllllliiiliililiii + lllllllliiiliililiil + " " + lllllllliiiliililili + lllllllliiiliililill + " " + lllllllliiiliilillii + lllllllliiiliilillil + lllllllliiiliilillli;
    private String kWebsite = lllllllliiiliilillll + lllllllliiiliilliiii + lllllllliiiliilliiil + lllllllliiiliilliili + lllllllliiiliilliill + lllllllliiiliillilii + lllllllliiiliillilil + lllllllliiiliillilli + lllllllliiiliillilll + lllllllliiiliillliii + lllllllliiiliillliil + lllllllliiiliilllili + lllllllliiiliilllill + lllllllliiiliillllii + lllllllliiiliillllil + lllllllliiiliillllli + lllllllliiiliillllll + lllllllliiililiiiiii;
    private String kfinal = "";
    private String kAll = lllllllliiililiiiiil;

    @Override
    public void onEnable() {
        if (mc.player != null && debug.getValue()) {
            Command.sendChatMessage("[CustomChat] Note: ALL text mode only works with the separator decoration mode");
        }
    }

    @EventHandler
    public Listener<PacketEvent.Send> listener = new Listener<>(event -> {
        if (event.getPacket() instanceof CPacketChatMessage) {
            String s = ((CPacketChatMessage) event.getPacket()).getMessage();
            if (!commands.getValue()) {
                if (s.startsWith("/")) return;
                else if (s.startsWith(",")) return;
                else if (s.startsWith(".")) return;
                else if (s.startsWith("-")) return;
                else if (s.startsWith(";")) return;
                else if (s.startsWith("?")) return;
            }
            if (decoMode.getValue().equals(DecoMode.SEPARATOR)) {
                if (textMode.getValue().equals(TextMode.NAME)) {
                    kfinal = kSep + kName;
                } else if (textMode.getValue().equals(TextMode.ONTOP)) {
                    kfinal = kSep + kOnTop;
                } else if (textMode.getValue().equals(TextMode.WEBSITE)) {
                    kfinal = kSep + kWebsite;
                } else if (textMode.getValue().equals(TextMode.ALL)) {
                    kfinal = kAll;
                }
            } else if (decoMode.getValue().equals(DecoMode.NONE)) {
                if (textMode.getValue().equals(TextMode.NAME)) {
                    kfinal = " " + kName;
                } else if (textMode.getValue().equals(TextMode.ONTOP)) {
                    kfinal = " " + kOnTop;
                } else if (textMode.getValue().equals(TextMode.WEBSITE)) {
                    kfinal = " " + kWebsite;
                }
            } else if (decoMode.getValue().equals(DecoMode.CLASSIC)) {
                if (textMode.getValue().equals(TextMode.NAME)) {
                    kfinal = kClassic + kName + kClassicO;
                } else if (textMode.getValue().equals(TextMode.ONTOP)) {
                    kfinal = kClassic + kOnTop + kClassicO;
                } else if (textMode.getValue().equals(TextMode.WEBSITE)) {
                    kfinal = kClassic + kWebsite + kClassicO;
                }
            }
            s += kfinal;
            if (s.length() >= 256) s = s.substring(0, 256);
            ((CPacketChatMessage) event.getPacket()).message = s;
        }
    });

    private enum TextMode {
        NAME, ONTOP, WEBSITE, ALL
    }

    private enum DecoMode {
        SEPARATOR, CLASSIC, NONE

    }

}
