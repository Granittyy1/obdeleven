package p235t1;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import p078g1.C2196b;
import p078g1.p;
import p078g1.r;
import p078g1.x;
import p241t7.b;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends x {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f47095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p.e f47096i;

    static {
        p.b.a aVar = new p.b.a();
        ImmutableMap.h();
        ImmutableList.K();
        List listEmptyList = Collections.emptyList();
        ImmutableList immutableListK = ImmutableList.K();
        p.e.a aVar2 = new p.e.a();
        p.g gVar = p.g.f35390a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new p.f(uri, null, null, listEmptyList, immutableListK, null, -9223372036854775807L);
        }
        aVar.a();
        aVar2.a();
        r rVar = r.f35393B;
    }

    public t(long j10, boolean z10, boolean z11, p pVar) {
        p.e eVar = z11 ? pVar.f35357c : null;
        this.f47089b = -9223372036854775807L;
        this.f47090c = -9223372036854775807L;
        this.f47091d = -9223372036854775807L;
        this.f47092e = j10;
        this.f47093f = j10;
        this.f47094g = z10;
        pVar.getClass();
        this.f47095h = pVar;
        this.f47096i = eVar;
    }

    @Override // p078g1.x
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // p078g1.x
    public final x.b f(int i10, x.b bVar, boolean z10) {
        b.f(i10, 1);
        Object obj = z10 ? j : null;
        bVar.getClass();
        bVar.h(null, obj, 0, this.f47092e, 0L, C2196b.f35233c, false);
        return bVar;
    }

    @Override // p078g1.x
    public final int h() {
        return 1;
    }

    @Override // p078g1.x
    public final Object l(int i10) {
        b.f(i10, 1);
        return j;
    }

    @Override // p078g1.x
    public final x.c m(int i10, x.c cVar, long j10) {
        b.f(i10, 1);
        Object obj = x.c.f35475p;
        cVar.b(this.f47095h, this.f47089b, this.f47090c, this.f47091d, this.f47094g, false, this.f47096i, 0L, this.f47093f);
        return cVar;
    }

    @Override // p078g1.x
    public final int o() {
        return 1;
    }
}
