package p078g1;

import I.e;
import android.text.TextUtils;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.A;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f35447a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f35448b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class a {
    }

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35450b;

        public b(int i10, int i11) {
            this.f35449a = i10;
            this.f35450b = i11;
        }

        public final int a() {
            int i10 = this.f35450b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarF;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarF = f(str2)) == null) {
                    return false;
                }
                int iA = bVarF.a();
                return (iA == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrP = A.P(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrP) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                string = sb2.toString();
            }
        }
        return string != null;
    }

    public static int c(String str, String str2) {
        b bVarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarF = f(str2)) == null) {
                    return 0;
                }
                return bVarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        b bVarF;
        String strE = null;
        if (str == null) {
            return null;
        }
        String strL = e.l(str.trim());
        if (strL.startsWith("avc1") || strL.startsWith("avc3")) {
            return "video/avc";
        }
        if (strL.startsWith("hev1") || strL.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strL.startsWith("dvav") || strL.startsWith("dva1") || strL.startsWith("dvhe") || strL.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strL.startsWith("av01")) {
            return "video/av01";
        }
        if (strL.startsWith("vp9") || strL.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strL.startsWith("vp8") || strL.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strL.startsWith("mp4a")) {
            if (strL.startsWith("mp4a.") && (bVarF = f(strL)) != null) {
                strE = e(bVarF.f35449a);
            }
            return strE == null ? "audio/mp4a-latm" : strE;
        }
        if (strL.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strL.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strL.startsWith("ac-3") || strL.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strL.startsWith("ec-3") || strL.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strL.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strL.startsWith("ac-4") || strL.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strL.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strL.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strL.startsWith("dtsh") || strL.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strL.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strL.startsWith("opus")) {
            return "audio/opus";
        }
        if (strL.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strL.startsWith("flac")) {
            return "audio/flac";
        }
        if (strL.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strL.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strL.contains("cea708")) {
            return "application/cea-708";
        }
        if (strL.contains("eia608") || strL.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList<a> arrayList = f35447a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).getClass();
            if (strL.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String e(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return "video/mpeg2";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "audio/mp4a-latm";
            case 105:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "audio/mpeg";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "video/mpeg";
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static b f(String str) {
        Matcher matcher = f35448b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = f35447a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str) {
        return AppearanceType.IMAGE.equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return AttributeType.TEXT.equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String strL = e.l(str);
        strL.getClass();
        switch (strL) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strL;
        }
    }
}
