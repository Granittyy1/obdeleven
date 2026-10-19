package C4;

import android.content.Context;
import com.google.android.datatransport.Priority;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: TransportRuntime.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile m f2406e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L4.a f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L4.a f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4.e f2409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I4.o f2410d;

    public x(L4.a aVar, L4.a aVar2, H4.e eVar, I4.o oVar, I4.s sVar) {
        this.f2407a = aVar;
        this.f2408b = aVar2;
        this.f2409c = eVar;
        this.f2410d = oVar;
        sVar.getClass();
        sVar.f3890a.execute(new I4.q(0, sVar));
    }

    public static x a() {
        m mVar = f2406e;
        if (mVar != null) {
            return mVar.f2389h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f2406e == null) {
            synchronized (x.class) {
                try {
                    if (f2406e == null) {
                        m.a aVar = new m.a();
                        context.getClass();
                        aVar.f2390a = context;
                        f2406e = aVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final u c(A4.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(A4.a.f582d) : Collections.singleton(new p311z4.c("proto"));
        Priority priority = Priority.f25231b;
        aVar.getClass();
        String str = aVar.f585a;
        String str2 = aVar.f586b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            bytes = B6.c.d("1$", str, "\\", str2 != null ? str2 : "").getBytes(Charset.forName("UTF-8"));
        }
        return new u(setUnmodifiableSet, new l("cct", bytes, priority), this);
    }
}
