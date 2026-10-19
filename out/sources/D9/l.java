package D9;

import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DecompressorRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2126g f2894c = new C2126g(String.valueOf(','));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f2895d = new l(e.b.f2879a, false, new l(new e.a(), true, new l()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f2896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2897b;

    /* JADX INFO: compiled from: DecompressorRegistry.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f2898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2899b;

        public a(e eVar, boolean z10) {
            A8.p.j(eVar, "decompressor");
            this.f2898a = eVar;
            this.f2899b = z10;
        }
    }

    public l(e eVar, boolean z10, l lVar) {
        String strA = eVar.a();
        A8.p.f("Comma is currently not allowed in message encoding", !strA.contains(","));
        int size = lVar.f2896a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lVar.f2896a.containsKey(eVar.a()) ? size : size + 1);
        for (a aVar : lVar.f2896a.values()) {
            String strA2 = aVar.f2898a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new a(aVar.f2898a, aVar.f2899b));
            }
        }
        linkedHashMap.put(strA, new a(eVar, z10));
        Map<String, a> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f2896a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry<String, a> entry : mapUnmodifiableMap.entrySet()) {
            if (entry.getValue().f2899b) {
                hashSet.add(entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C2126g c2126g = f2894c;
        c2126g.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        c2126g.a(sb2, it);
        this.f2897b = sb2.toString().getBytes(Charset.forName("US-ASCII"));
    }

    public l() {
        this.f2896a = new LinkedHashMap(0);
        this.f2897b = new byte[0];
    }
}
