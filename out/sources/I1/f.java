package I1;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p114j1.B;

/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3803a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3804b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3805c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws XmlPullParserException, IOException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!B.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ImmutableList<c.a> immutableListK = ImmutableList.K();
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (B.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f3803a;
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    String strA = B.a(xmlPullParserNewPullParser, strArr[i11]);
                    if (strA != null) {
                        if (Integer.parseInt(strA) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f3804b;
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                String strA2 = B.a(xmlPullParserNewPullParser, strArr2[i12]);
                                if (strA2 != null) {
                                    j = Long.parseLong(strA2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i12++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f3805c;
                        while (true) {
                            if (i10 >= 2) {
                                immutableListK = ImmutableList.K();
                                break;
                            }
                            String strA3 = B.a(xmlPullParserNewPullParser, strArr3[i10]);
                            if (strA3 != null) {
                                immutableListK = ImmutableList.N(new c.a("image/jpeg", 0L, 0L), new c.a("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i10++;
                        }
                        j10 = j;
                    }
                }
                return null;
            }
            if (B.c(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListK = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (B.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListK = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!B.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListK.isEmpty()) {
            return null;
        }
        return new c(immutableListK, j10);
    }

    public static ImmutableList<c.a> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (B.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = B.a(xmlPullParser, strConcat3);
                String strA2 = B.a(xmlPullParser, strConcat4);
                String strA3 = B.a(xmlPullParser, strConcat5);
                String strA4 = B.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.K();
                }
                aVar.c(new c.a(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!B.b(xmlPullParser, strConcat2));
        return aVar.h();
    }
}
