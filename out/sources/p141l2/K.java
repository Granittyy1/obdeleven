package p141l2;

import Ia.l;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: NavOptionsBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.a f44257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44263g;

    public K() {
        J.a aVar = new J.a();
        aVar.f44251c = -1;
        aVar.f44255g = -1;
        aVar.f44256h = -1;
        this.f44257a = aVar;
        this.f44260d = -1;
    }

    public final void a(l popUpToBuilder, String route) {
        i.e(route, "route");
        i.e(popUpToBuilder, "popUpToBuilder");
        if (n.S(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f44261e = route;
        this.f44260d = -1;
        this.f44262f = false;
        T t8 = new T();
        popUpToBuilder.invoke(t8);
        this.f44262f = t8.f44280a;
        this.f44263g = t8.f44281b;
    }
}
