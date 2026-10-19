package C4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: EventInternal.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: EventInternal.java */
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((j.a) this).f2374f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract n d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final j.a i() {
        j.a aVar = new j.a();
        String strG = g();
        if (strG == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.f2369a = strG;
        aVar.f2370b = c();
        n nVarD = d();
        if (nVarD == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        aVar.f2371c = nVarD;
        aVar.f2372d = Long.valueOf(e());
        aVar.f2373e = Long.valueOf(h());
        aVar.f2374f = new HashMap(b());
        return aVar;
    }
}
