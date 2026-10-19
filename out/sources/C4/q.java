package C4;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;

/* JADX INFO: compiled from: ProtoEncoderDoNotUse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O6.e f2394a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        O6.d dVar = O6.e.a.f4866a;
        map.put(q.class, g.f2355a);
        map2.remove(q.class);
        map.put(F4.a.class, c.f2342a);
        map2.remove(F4.a.class);
        map.put(F4.e.class, i.f2360a);
        map2.remove(F4.e.class);
        map.put(F4.c.class, f.f2352a);
        map2.remove(F4.c.class);
        map.put(LogEventDropped.class, e.f2349a);
        map2.remove(LogEventDropped.class);
        map.put(F4.b.class, d.f2347a);
        map2.remove(F4.b.class);
        map.put(F4.d.class, h.f2357a);
        map2.remove(F4.d.class);
        f2394a = new O6.e(new HashMap(map), new HashMap(map2), dVar);
    }

    public abstract F4.a a();
}
