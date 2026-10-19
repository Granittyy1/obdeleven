package io.intercom.android.sdk.blocks;

import C7.g;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: VideoUrlUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoUrlUtilKt {
    private static final String ID_SEPARATOR = "|";

    /* JADX INFO: compiled from: VideoUrlUtil.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            try {
                iArr[VideoProvider.YOUTUBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProvider.VIMEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoProvider.VIDYARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoProvider.BRIGHTCOVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoProvider.JWPLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoProvider.MICROSOFTSTREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoProvider.SYNTHESIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoProvider.GUIDDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VideoProvider.DESCRIPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VideoProvider.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getEmbedUrl(VideoProvider provider, String joinedIds) {
        i.e(provider, "provider");
        i.e(joinedIds, "joinedIds");
        List listE0 = n.e0(joinedIds, new String[]{ID_SEPARATOR}, 0, 6);
        String str = (String) q.O(listE0);
        List listK = q.K(listE0, 1);
        switch (WhenMappings.$EnumSwitchMapping$0[provider.ordinal()]) {
            case 1:
                return androidx.compose.foundation.gestures.d.b("https://www.youtube.com/embed/", str, "?rel=0");
            case 2:
                if (listK.isEmpty()) {
                    return B7.b.c("https://player.vimeo.com/video/", str);
                }
                StringBuilder sbA = g.a("https://player.vimeo.com/video/", str, "?h=");
                sbA.append((String) listK.get(0));
                return sbA.toString();
            case 3:
                return B7.b.c("https://fast.wistia.net/embed/iframe/", str);
            case 4:
                return B7.b.c("https://www.loom.com/embed/", str);
            case 5:
                return B7.b.c("https://play.vidyard.com/", str);
            case 6:
                StringBuilder sbA2 = g.a("https://players.brightcove.net/", str, "/default_default/index.html?videoId=");
                sbA2.append((String) listK.get(0));
                return sbA2.toString();
            case 7:
                return androidx.compose.foundation.gestures.d.b("https://content.jwplatform.com/players/", str, ".html");
            case 8:
                if (listK.isEmpty()) {
                    return B7.b.c("https://web.microsoftstream.com/embed/video/", str);
                }
                StringBuilder sbA3 = g.a("https://", str, ".sharepoint.com/:v:/");
                sbA3.append((String) listK.get(0));
                return sbA3.toString();
            case 9:
                return B7.b.c("https://share.synthesia.io/embeds/videos/", str);
            case 10:
                return B7.b.c("https://embed.app.guidde.com/playbooks/", str);
            case 11:
                return B7.b.c("https://share.descript.com/embed/", str);
            case 12:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
