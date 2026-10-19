package G1;

import androidx.media3.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p114j1.r;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f3366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f3367d;

    public static Serializable a(int i10, r rVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(rVar.o()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(rVar.u() == 1);
        }
        if (i10 == 2) {
            return c(rVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return b(rVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(rVar.o()));
                rVar.H(2);
                return date;
            }
            int iY = rVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i11 = 0; i11 < iY; i11++) {
                Serializable serializableA = a(rVar.u(), rVar);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(rVar);
            int iU = rVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableA2 = a(iU, rVar);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(r rVar) {
        int iY = rVar.y();
        HashMap<String, Object> map = new HashMap<>(iY);
        for (int i10 = 0; i10 < iY; i10++) {
            String strC = c(rVar);
            Serializable serializableA = a(rVar.u(), rVar);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(r rVar) {
        int iA = rVar.A();
        int i10 = rVar.f41063b;
        rVar.H(iA);
        return new String(rVar.f41062a, i10, iA);
    }
}
