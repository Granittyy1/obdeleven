package p114j1;

import U1.f;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p241t7.b;

/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f41015a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f41016b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f41017c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f41018d;

    static {
        HashMap map = new HashMap();
        f41018d = map;
        f.b(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        f.b(-983041, map, "azure", -657956, "beige");
        f.b(-6972, map, "bisque", -16777216, "black");
        f.b(-5171, map, "blanchedalmond", -16776961, "blue");
        f.b(-7722014, map, "blueviolet", -5952982, "brown");
        f.b(-2180985, map, "burlywood", -10510688, "cadetblue");
        f.b(-8388864, map, "chartreuse", -2987746, "chocolate");
        f.b(-32944, map, "coral", -10185235, "cornflowerblue");
        f.b(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        f.b(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        f.b(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        f.b(-29696, map, "darkorange", -6737204, "darkorchid");
        f.b(-7667712, map, "darkred", -1468806, "darksalmon");
        f.b(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        f.b(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        f.b(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        f.b(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        f.b(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        f.b(-38476, map, "hotpink", -3318692, "indianred");
        f.b(-11861886, map, "indigo", -16, "ivory");
        f.b(-989556, map, "khaki", -1644806, "lavender");
        f.b(-3851, map, "lavenderblush", -8586240, "lawngreen");
        f.b(-1331, map, "lemonchiffon", -5383962, "lightblue");
        f.b(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        f.b(-18751, map, "lightpink", -24454, "lightsalmon");
        f.b(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        f.b(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        f.b(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        f.b(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        f.b(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        f.b(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        f.b(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        f.b(-15132304, map, "midnightblue", -655366, "mintcream");
        f.b(-6943, map, "mistyrose", -6987, "moccasin");
        f.b(-8531, map, "navajowhite", -16777088, "navy");
        f.b(-133658, map, "oldlace", -8355840, "olive");
        f.b(-9728477, map, "olivedrab", -23296, "orange");
        f.b(-47872, map, "orangered", -2461482, "orchid");
        f.b(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        f.b(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        f.b(-4139, map, "papayawhip", -9543, "peachpuff");
        f.b(-3308225, map, "peru", -16181, "pink");
        f.b(-2252579, map, "plum", -5185306, "powderblue");
        f.b(-8388480, map, "purple", -10079335, "rebeccapurple");
        f.b(-65536, map, "red", -4419697, "rosybrown");
        f.b(-12490271, map, "royalblue", -7650029, "saddlebrown");
        f.b(-360334, map, "salmon", -744352, "sandybrown");
        f.b(-13726889, map, "seagreen", -2578, "seashell");
        f.b(-6270419, map, "sienna", -4144960, "silver");
        f.b(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        f.b(-12156236, map, "steelblue", -2968436, "tan");
        f.b(-16744320, map, "teal", -2572328, "thistle");
        f.b(-40121, map, "tomato", 0, "transparent");
        f.b(-12525360, map, "turquoise", -1146130, "violet");
        f.b(-663885, map, "wheat", -1, "white");
        f.b(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        b.e(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f41017c : f41016b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f41015a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f41018d.get(I.e.l(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
