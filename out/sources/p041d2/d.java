package p041d2;

import I.e;
import X1.c;
import X1.h;
import X1.l;
import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.braze.Constants;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.x;
import com.google.common.collect.y;
import com.google.common.collect.z;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p005a4.q;
import p114j1.A;
import p114j1.B;
import p114j1.f;
import p114j1.k;

/* JADX INFO: compiled from: TtmlParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f34504b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f34505c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f34506d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f34507e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f34508f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f34509g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f34510h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f34511i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f34512a;

    /* JADX INFO: compiled from: TtmlParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f34513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34515c;

        public a(float f10, int i10, int i11) {
            this.f34513a = f10;
            this.f34514b = i10;
            this.f34515c = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34517b;

        public b(int i10, int i11) {
            this.f34516a = i10;
            this.f34517b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f34512a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f c(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(Constants.BRAZE_PUSH_PRIORITY_KEY) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals(AppearanceType.IMAGE) || str.equals("data") || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f34510h.matcher(attributeValue);
        if (!matcher.matches()) {
            k.f("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z10 = false;
            }
            p241t7.b.d("Invalid cell resolution " + i10 + " " + i11, z10);
            return i11;
        } catch (NumberFormatException unused) {
            k.f("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, f fVar) throws SubtitleDecoderException {
        Matcher matcher;
        int i10 = A.f40996a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f34506d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(q.c(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            k.f("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(androidx.compose.foundation.gestures.d.b("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.j = 3;
                break;
            case "em":
                fVar.j = 2;
                break;
            case "px":
                fVar.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(androidx.compose.foundation.gestures.d.b("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.f34536k = Float.parseFloat(strGroup2);
    }

    public static a g(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = A.f40996a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            p241t7.b.d("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f34511i;
        int i12 = aVar.f34514b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new a(i10 * f10, i12, attributeValue4 != null ? Integer.parseInt(attributeValue4) : aVar.f34515c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x020d  */
    /* JADX WARN: Code duplicated, block: B:120:0x025e A[LOOP:0: B:3:0x000a->B:120:0x025e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    public static void h(XmlPullParser xmlPullParser, HashMap map, int i10, b bVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        int i12;
        e eVar;
        float f15;
        float f16;
        String strA2;
        f fVar;
        String strA3;
        f fVar2;
        String[] strArrSplit;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            xmlPullParser.next();
            if (B.c(xmlPullParser, "style")) {
                String strA4 = B.a(xmlPullParser, "style");
                f fVarJ = j(xmlPullParser, new f());
                if (strA4 != null) {
                    String strTrim = strA4.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i14];
                    } else {
                        int i15 = A.f40996a;
                        strArrSplit = strTrim.split("\\s+", i13);
                    }
                    int length = strArrSplit.length;
                    for (int i16 = i14; i16 < length; i16++) {
                        fVarJ.a((f) map.get(strArrSplit[i16]));
                    }
                }
                String str = fVarJ.f34537l;
                if (str != null) {
                    map.put(str, fVarJ);
                }
            } else {
                if (B.c(xmlPullParser, "region")) {
                    String strA5 = B.a(xmlPullParser, "id");
                    if (strA5 != null) {
                        String strA6 = B.a(xmlPullParser, "origin");
                        if (strA6 == null && (strA3 = B.a(xmlPullParser, "style")) != null && (fVar2 = (f) map.get(strA3)) != null) {
                            strA6 = fVar2.f34545t;
                        }
                        Pattern pattern = f34509g;
                        Pattern pattern2 = f34508f;
                        if (strA6 != null) {
                            Matcher matcher = pattern2.matcher(strA6);
                            Matcher matcher2 = pattern.matcher(strA6);
                            if (matcher.matches()) {
                                try {
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    f11 = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher.group(2);
                                    strGroup2.getClass();
                                    f10 = Float.parseFloat(strGroup2) / 100.0f;
                                } catch (NumberFormatException unused) {
                                    k.f("Ignoring region with malformed origin: ".concat(strA6));
                                }
                            } else if (!matcher2.matches()) {
                                k.f("Ignoring region with unsupported origin: ".concat(strA6));
                            } else if (bVar == null) {
                                k.f("Ignoring region with missing tts:extent: ".concat(strA6));
                            } else {
                                try {
                                    String strGroup3 = matcher2.group(1);
                                    strGroup3.getClass();
                                    int i17 = Integer.parseInt(strGroup3);
                                    String strGroup4 = matcher2.group(2);
                                    strGroup4.getClass();
                                    int i18 = Integer.parseInt(strGroup4);
                                    float f17 = i17 / bVar.f34516a;
                                    f10 = i18 / bVar.f34517b;
                                    f11 = f17;
                                } catch (NumberFormatException unused2) {
                                    k.f("Ignoring region with malformed origin: ".concat(strA6));
                                }
                            }
                            eVar = null;
                        } else {
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                        String strA7 = B.a(xmlPullParser, "extent");
                        if (strA7 == null && (strA2 = B.a(xmlPullParser, "style")) != null && (fVar = (f) map.get(strA2)) != null) {
                            strA7 = fVar.f34546u;
                        }
                        if (strA7 != null) {
                            Matcher matcher3 = pattern2.matcher(strA7);
                            Matcher matcher4 = pattern.matcher(strA7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup5 = matcher3.group(1);
                                    strGroup5.getClass();
                                    f15 = Float.parseFloat(strGroup5) / 100.0f;
                                    String strGroup6 = matcher3.group(2);
                                    strGroup6.getClass();
                                    f16 = Float.parseFloat(strGroup6) / 100.0f;
                                } catch (NumberFormatException unused3) {
                                    Q8.d.e("Ignoring region with malformed extent: ", strA6);
                                    eVar = null;
                                }
                            } else {
                                if (!matcher4.matches()) {
                                    Q8.d.e("Ignoring region with unsupported extent: ", strA6);
                                } else if (bVar == null) {
                                    Q8.d.e("Ignoring region with missing tts:extent: ", strA6);
                                } else {
                                    String strGroup7 = matcher4.group(1);
                                    strGroup7.getClass();
                                    int i19 = Integer.parseInt(strGroup7);
                                    String strGroup8 = matcher4.group(2);
                                    strGroup8.getClass();
                                    int i20 = Integer.parseInt(strGroup8);
                                    float f18 = i19 / bVar.f34516a;
                                    f16 = i20 / bVar.f34517b;
                                    f15 = f18;
                                }
                                eVar = null;
                            }
                            f12 = f15;
                            f13 = f16;
                        } else {
                            f12 = 1.0f;
                            f13 = 1.0f;
                        }
                        String strA8 = B.a(xmlPullParser, "displayAlign");
                        if (strA8 != null) {
                            String strL = e.l(strA8);
                            strL.getClass();
                            if (strL.equals("center")) {
                                i11 = 1;
                                f14 = (f13 / 2.0f) + f10;
                            } else if (strL.equals("after")) {
                                i11 = 2;
                                f14 = f10 + f13;
                            } else {
                                f14 = f10;
                                i11 = 0;
                            }
                        } else {
                            f14 = f10;
                            i11 = 0;
                        }
                        float f19 = 1.0f / i10;
                        String strA9 = B.a(xmlPullParser, "writingMode");
                        if (strA9 != null) {
                            String strL2 = e.l(strA9);
                            strL2.getClass();
                            switch (strL2) {
                                case "tb":
                                case "tblr":
                                    i12 = 2;
                                    break;
                                case "tbrl":
                                    i12 = 1;
                                    break;
                                default:
                                    i12 = Integer.MIN_VALUE;
                                    break;
                            }
                        } else {
                            i12 = Integer.MIN_VALUE;
                        }
                        eVar = new e(strA5, f11, f14, 0, i11, f12, f13, 1, f19, i12);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        map2.put(eVar.f34518a, eVar);
                    }
                } else {
                    if (B.c(xmlPullParser, "metadata")) {
                        do {
                            xmlPullParser.next();
                            if (B.c(xmlPullParser, AppearanceType.IMAGE) && (strA = B.a(xmlPullParser, "id")) != null) {
                                map3.put(strA, xmlPullParser.nextText());
                            }
                        } while (!B.b(xmlPullParser, "metadata"));
                    }
                    if (B.b(xmlPullParser, "head")) {
                        return;
                    }
                    i13 = -1;
                    i14 = 0;
                }
                if (B.b(xmlPullParser, "head")) {
                    return;
                }
                i13 = -1;
                i14 = 0;
            }
            if (B.b(xmlPullParser, "head")) {
                return;
            }
            i13 = -1;
            i14 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    public static c i(XmlPullParser xmlPullParser, c cVar, HashMap map, a aVar) throws SubtitleDecoderException {
        long j;
        long j10;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVarJ = j(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jK3 = k(attributeValue, aVar);
                    break;
                case "end":
                    jK2 = k(attributeValue, aVar);
                    break;
                case "begin":
                    jK = k(attributeValue, aVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i11 = A.f40996a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j11 = cVar.f34495d;
            j = -9223372036854775807L;
            if (j11 != -9223372036854775807L) {
                if (jK != -9223372036854775807L) {
                    jK += j11;
                }
                if (jK2 != -9223372036854775807L) {
                    jK2 += j11;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (jK2 != j) {
            j10 = jK2;
        } else if (jK3 != j) {
            j10 = jK + jK3;
        } else if (cVar != null) {
            long j12 = cVar.f34496e;
            if (j12 != j) {
                j10 = j12;
            } else {
                j10 = jK2;
            }
        } else {
            j10 = jK2;
        }
        return new c(xmlPullParser.getName(), null, jK, j10, fVarJ, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x0206  */
    /* JADX WARN: Code duplicated, block: B:179:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02da  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:269:0x0459  */
    /* JADX WARN: Code duplicated, block: B:296:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:6:0x0030  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0107. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v10, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v3, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v9, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r1v54, types: [d2.b] */
    public static f j(XmlPullParser xmlPullParser, f fVar) {
        ?? r13;
        boolean z10;
        ?? r11;
        int i10;
        byte b10;
        String str;
        int iHashCode;
        byte b11;
        int i11;
        p041d2.b bVar;
        ?? r12;
        String str2 = "after";
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z11 = false;
        f fVarC = fVar;
        int i12 = 0;
        while (i12 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            String attributeName = xmlPullParser.getAttributeName(i12);
            attributeName.getClass();
            ?? bVar2 = null;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (!attributeName.equals("fontStyle")) {
                        r13 = -1;
                    } else {
                        r13 = z11;
                    }
                    break;
                case -1289044182:
                    if (!attributeName.equals("extent")) {
                        r13 = -1;
                    } else {
                        r13 = 1;
                    }
                    break;
                case -1224696685:
                    if (!attributeName.equals("fontFamily")) {
                        r13 = -1;
                    } else {
                        r13 = 2;
                    }
                    break;
                case -1065511464:
                    if (!attributeName.equals("textAlign")) {
                        r13 = -1;
                    } else {
                        r13 = 3;
                    }
                    break;
                case -1008619738:
                    if (!attributeName.equals("origin")) {
                        r13 = -1;
                    } else {
                        r13 = 4;
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        r13 = -1;
                    } else {
                        r13 = 5;
                    }
                    break;
                case -734428249:
                    if (!attributeName.equals("fontWeight")) {
                        r13 = -1;
                    } else {
                        r13 = 6;
                    }
                    break;
                case 3355:
                    if (!attributeName.equals("id")) {
                        r13 = -1;
                    } else {
                        r13 = 7;
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        r13 = -1;
                    } else {
                        r13 = 8;
                    }
                    break;
                case 94842723:
                    if (!attributeName.equals("color")) {
                        r13 = -1;
                    } else {
                        r13 = 9;
                    }
                    break;
                case 109403361:
                    if (!attributeName.equals("shear")) {
                        r13 = -1;
                    } else {
                        r13 = 10;
                    }
                    break;
                case 110138194:
                    if (!attributeName.equals("textCombine")) {
                        r13 = -1;
                    } else {
                        r13 = 11;
                    }
                    break;
                case 365601008:
                    if (!attributeName.equals("fontSize")) {
                        r13 = -1;
                    } else {
                        r13 = 12;
                    }
                    break;
                case 921125321:
                    if (!attributeName.equals("textEmphasis")) {
                        r13 = -1;
                    } else {
                        r13 = 13;
                    }
                    break;
                case 1115953443:
                    if (!attributeName.equals("rubyPosition")) {
                        r13 = -1;
                    } else {
                        r13 = 14;
                    }
                    break;
                case 1287124693:
                    if (!attributeName.equals("backgroundColor")) {
                        r13 = -1;
                    } else {
                        r13 = 15;
                    }
                    break;
                case 1754920356:
                    if (!attributeName.equals("multiRowAlign")) {
                        r13 = -1;
                    } else {
                        r13 = 16;
                    }
                    break;
                default:
                    r13 = -1;
                    break;
            }
            switch (r13) {
                case 0:
                    str2 = str2;
                    z10 = z11;
                    fVarC = c(fVarC);
                    fVarC.f34535i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i10 = 1;
                    break;
                case 1:
                    str2 = str2;
                    z10 = z11;
                    fVarC = c(fVarC);
                    fVarC.f34546u = attributeValue;
                    i10 = 1;
                    break;
                case 2:
                    str2 = str2;
                    z10 = z11;
                    fVarC = c(fVarC);
                    fVarC.f34527a = attributeValue;
                    i10 = 1;
                    break;
                case 3:
                    str2 = str2;
                    z10 = z11;
                    fVarC = c(fVarC);
                    String strL = e.l(attributeValue);
                    strL.getClass();
                    switch (strL.hashCode()) {
                        case -1364013995:
                            if (!strL.equals("center")) {
                                r11 = -1;
                            } else {
                                r11 = z10;
                            }
                            break;
                        case 100571:
                            if (!strL.equals("end")) {
                                r11 = -1;
                            } else {
                                r11 = 1;
                            }
                            break;
                        case 3317767:
                            if (!strL.equals(BlockAlignment.LEFT)) {
                                r11 = -1;
                            } else {
                                r11 = 2;
                            }
                            break;
                        case 108511772:
                            if (!strL.equals(BlockAlignment.RIGHT)) {
                                r11 = -1;
                            } else {
                                r11 = 3;
                            }
                            break;
                        case 109757538:
                            if (!strL.equals(OpsMetricTracker.START)) {
                                r11 = -1;
                            } else {
                                r11 = 4;
                            }
                            break;
                        default:
                            r11 = -1;
                            break;
                    }
                    switch (r11) {
                        case 0:
                            bVar2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            bVar2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            bVar2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    fVarC.f34540o = bVar2;
                    i10 = 1;
                    break;
                case 4:
                    str2 = str2;
                    z10 = z11;
                    fVarC = c(fVarC);
                    fVarC.f34545t = attributeValue;
                    i10 = 1;
                    break;
                case 5:
                    str2 = str2;
                    String strL2 = e.l(attributeValue);
                    strL2.getClass();
                    switch (strL2) {
                        case "nounderline":
                            z10 = false;
                            fVarC = c(fVarC);
                            fVarC.f34533g = 0;
                            break;
                        case "underline":
                            z10 = false;
                            fVarC = c(fVarC);
                            fVarC.f34533g = 1;
                            break;
                        case "nolinethrough":
                            fVarC = c(fVarC);
                            z10 = false;
                            fVarC.f34532f = 0;
                            break;
                        case "linethrough":
                            fVarC = c(fVarC);
                            fVarC.f34532f = 1;
                        default:
                            z10 = false;
                            break;
                    }
                    i10 = 1;
                    break;
                case 6:
                    str2 = str2;
                    fVarC = c(fVarC);
                    fVarC.f34534h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i10 = 1;
                    z10 = false;
                    break;
                case 7:
                    str2 = str2;
                    if ("style".equals(xmlPullParser.getName())) {
                        fVarC = c(fVarC);
                        fVarC.f34537l = attributeValue;
                    }
                    i10 = 1;
                    z10 = false;
                    break;
                case 8:
                    str2 = str2;
                    String strL3 = e.l(attributeValue);
                    strL3.getClass();
                    switch (strL3) {
                        case "baseContainer":
                        case "base":
                            fVarC = c(fVarC);
                            fVarC.f34538m = 2;
                            break;
                        case "container":
                            fVarC = c(fVarC);
                            fVarC.f34538m = 1;
                            break;
                        case "delimiter":
                            fVarC = c(fVarC);
                            fVarC.f34538m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            fVarC = c(fVarC);
                            fVarC.f34538m = 3;
                            break;
                        default:
                            break;
                    }
                    i10 = 1;
                    z10 = false;
                    break;
                case 9:
                    str2 = str2;
                    fVarC = c(fVarC);
                    try {
                        fVarC.f34528b = p114j1.e.a(attributeValue, false);
                        fVarC.f34529c = true;
                    } catch (IllegalArgumentException unused) {
                        Q8.d.e("Failed parsing color value: ", attributeValue);
                    }
                    i10 = 1;
                    z10 = false;
                    break;
                case 10:
                    str2 = str2;
                    f fVarC2 = c(fVarC);
                    Matcher matcher = f34507e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e10) {
                            k.g("Failed to parse shear: " + attributeValue, e10);
                        }
                    } else {
                        Q8.d.e("Invalid value for shear: ", attributeValue);
                    }
                    fVarC2.f34544s = fMin;
                    fVarC = fVarC2;
                    i10 = 1;
                    z10 = false;
                    break;
                case 11:
                    str2 = str2;
                    String strL4 = e.l(attributeValue);
                    strL4.getClass();
                    if (strL4.equals("all")) {
                        fVarC = c(fVarC);
                        fVarC.f34542q = 1;
                    } else if (strL4.equals("none")) {
                        fVarC = c(fVarC);
                        fVarC.f34542q = 0;
                    }
                    i10 = 1;
                    z10 = false;
                    break;
                case 12:
                    str2 = str2;
                    try {
                        fVarC = c(fVarC);
                        f(attributeValue, fVarC);
                    } catch (SubtitleDecoderException unused2) {
                        Q8.d.e("Failed parsing fontSize value: ", attributeValue);
                    }
                    i10 = 1;
                    z10 = false;
                    break;
                case 13:
                    fVarC = c(fVarC);
                    Pattern pattern = p041d2.b.f34484d;
                    if (attributeValue == null) {
                        str2 = str2;
                    } else {
                        String strL5 = e.l(attributeValue.trim());
                        if (strL5.isEmpty()) {
                            str2 = str2;
                        } else {
                            ImmutableSet immutableSetG = ImmutableSet.G(TextUtils.split(strL5, p041d2.b.f34484d));
                            String str3 = (String) Iterators.a(new x(z.d(p041d2.b.f34488h, immutableSetG)), "outside");
                            int iHashCode2 = str3.hashCode();
                            if (iHashCode2 != -1392885889) {
                                if (iHashCode2 != -1106037339) {
                                    if (iHashCode2 == 92734940 && str3.equals(str2)) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str3.equals("outside")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str3.equals("before")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            int i13 = b10 != 0 ? b10 != 1 ? 1 : -2 : 2;
                            y yVarD = z.d(p041d2.b.f34485e, immutableSetG);
                            if (yVarD.isEmpty()) {
                                y yVarD2 = z.d(p041d2.b.f34487g, immutableSetG);
                                y yVarD3 = z.d(p041d2.b.f34486f, immutableSetG);
                                if (yVarD2.isEmpty() && yVarD3.isEmpty()) {
                                    str2 = str2;
                                    bVar2 = new p041d2.b(-1, 0, i13);
                                } else {
                                    String str4 = (String) Iterators.a(new x(yVarD2), "filled");
                                    int iHashCode3 = str4.hashCode();
                                    if (iHashCode3 != -1274499742) {
                                        int i14 = (iHashCode3 == 3417674 && str4.equals("open")) ? 2 : 1;
                                        str = (String) Iterators.a(new x(yVarD3), "circle");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1360216880) {
                                            if (iHashCode != -905816648) {
                                                if (iHashCode != 99657 && str.equals("dot")) {
                                                    b11 = 0;
                                                } else {
                                                    b11 = -1;
                                                }
                                            } else if (str.equals("sesame")) {
                                                b11 = 1;
                                            } else {
                                                b11 = -1;
                                            }
                                        } else if (str.equals("circle")) {
                                            b11 = 2;
                                        } else {
                                            b11 = -1;
                                        }
                                        if (b11 != 0) {
                                            i11 = 2;
                                        } else if (b11 != 1) {
                                            i11 = 1;
                                        } else {
                                            i11 = 3;
                                        }
                                        bVar = new p041d2.b(i11, i14, i13);
                                    } else {
                                        str4.equals("filled");
                                    }
                                    str = (String) Iterators.a(new x(yVarD3), "circle");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1360216880) {
                                        if (iHashCode != -905816648) {
                                            if (iHashCode != 99657) {
                                                b11 = -1;
                                            } else {
                                                b11 = 0;
                                            }
                                        } else if (str.equals("sesame")) {
                                            b11 = 1;
                                        } else {
                                            b11 = -1;
                                        }
                                    } else if (str.equals("circle")) {
                                        b11 = 2;
                                    } else {
                                        b11 = -1;
                                    }
                                    if (b11 != 0) {
                                        i11 = 2;
                                    } else if (b11 != 1) {
                                        i11 = 1;
                                    } else {
                                        i11 = 3;
                                    }
                                    bVar = new p041d2.b(i11, i14, i13);
                                }
                            } else {
                                String str5 = (String) new x(yVarD).next();
                                int iHashCode4 = str5.hashCode();
                                if (iHashCode4 != 3005871) {
                                    int i15 = (iHashCode4 == 3387192 && str5.equals("none")) ? 0 : -1;
                                    bVar = new p041d2.b(i15, 0, i13);
                                } else {
                                    str5.equals("auto");
                                }
                                bVar = new p041d2.b(i15, 0, i13);
                            }
                            bVar2 = bVar;
                        }
                    }
                    fVarC.f34543r = bVar2;
                    i10 = 1;
                    z10 = false;
                    break;
                case 14:
                    String strL6 = e.l(attributeValue);
                    strL6.getClass();
                    if (strL6.equals("before")) {
                        fVarC = c(fVarC);
                        fVarC.f34539n = 1;
                    } else if (strL6.equals(str2)) {
                        fVarC = c(fVarC);
                        fVarC.f34539n = 2;
                    }
                    str2 = str2;
                    z10 = z11;
                    i10 = 1;
                    break;
                case 15:
                    fVarC = c(fVarC);
                    try {
                        fVarC.f34530d = p114j1.e.a(attributeValue, z11);
                        fVarC.f34531e = true;
                    } catch (IllegalArgumentException unused3) {
                        Q8.d.e("Failed parsing background value: ", attributeValue);
                    }
                    str2 = str2;
                    z10 = z11;
                    i10 = 1;
                    break;
                case 16:
                    fVarC = c(fVarC);
                    String strL7 = e.l(attributeValue);
                    strL7.getClass();
                    switch (strL7.hashCode()) {
                        case -1364013995:
                            if (!strL7.equals("center")) {
                                r12 = -1;
                            } else {
                                r12 = z11;
                            }
                            break;
                        case 100571:
                            if (!strL7.equals("end")) {
                                r12 = -1;
                            } else {
                                r12 = 1;
                            }
                            break;
                        case 3317767:
                            if (!strL7.equals(BlockAlignment.LEFT)) {
                                r12 = -1;
                            } else {
                                r12 = 2;
                            }
                            break;
                        case 108511772:
                            if (!strL7.equals(BlockAlignment.RIGHT)) {
                                r12 = -1;
                            } else {
                                r12 = 3;
                            }
                            break;
                        case 109757538:
                            if (!strL7.equals(OpsMetricTracker.START)) {
                                r12 = -1;
                            } else {
                                r12 = 4;
                            }
                            break;
                        default:
                            r12 = -1;
                            break;
                    }
                    switch (r12) {
                        case 0:
                            bVar2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            bVar2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            bVar2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    fVarC.f34541p = bVar2;
                    str2 = str2;
                    z10 = z11;
                    i10 = 1;
                    break;
                default:
                    str2 = str2;
                    i10 = 1;
                    z10 = false;
                    break;
            }
            i12 += i10;
            z11 = z10;
            str2 = str2;
        }
        return fVarC;
    }

    public static long k(String str, a aVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        byte b10 = 4;
        Matcher matcher = f34504b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d12 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d14 = d13 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / aVar.f34513a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) aVar.f34514b)) / ((double) aVar.f34513a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f34505c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(B7.b.c("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d17 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8.hashCode()) {
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                b10 = !strGroup8.equals("f") ? (byte) -1 : (byte) 0;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                b10 = !strGroup8.equals("h") ? (byte) -1 : (byte) 1;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                b10 = !strGroup8.equals("m") ? (byte) -1 : (byte) 2;
                break;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                b10 = !strGroup8.equals(Constants.BRAZE_PUSH_TITLE_KEY) ? (byte) -1 : (byte) 3;
                break;
            case 3494:
                if (!strGroup8.equals("ms")) {
                    b10 = -1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                d10 = aVar.f34513a;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = aVar.f34515c;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case 4:
                d10 = 1000.0d;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            default:
                return (long) (d17 * 1000000.0d);
        }
        d17 *= d11;
        return (long) (d17 * 1000000.0d);
    }

    public static b l(XmlPullParser xmlPullParser) {
        String strA = B.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f34509g.matcher(strA);
        if (!matcher.matches()) {
            k.f("Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new b(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            k.f("Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        X1.f.b(b(bArr, i10, i11), bVar, fVar);
    }

    @Override // X1.l
    public final h b(byte[] bArr, int i10, int i11) {
        a aVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f34512a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            b bVarL = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVarG = f34511i;
            int iE = 15;
            g gVar = null;
            int i12 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarG = g(xmlPullParserNewPullParser);
                            iE = e(xmlPullParserNewPullParser);
                            bVarL = l(xmlPullParserNewPullParser);
                        }
                        b bVar = bVarL;
                        a aVar2 = aVarG;
                        int i13 = iE;
                        if (d(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar2;
                                h(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                aVar = aVar2;
                                try {
                                    c cVarI = i(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarI);
                                    if (cVar != null) {
                                        if (cVar.f34503m == null) {
                                            cVar.f34503m = new ArrayList();
                                        }
                                        cVar.f34503m.add(cVarI);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    k.g("Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            aVarG = aVar;
                        } else {
                            k.e("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i12++;
                            aVarG = aVar2;
                        }
                        bVarL = bVar;
                        iE = i13;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.f34503m == null) {
                            cVar.f34503m = new ArrayList();
                        }
                        cVar.f34503m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            gVar = new g(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            gVar.getClass();
            return gVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }
}
