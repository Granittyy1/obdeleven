package p046d7;

import java.util.concurrent.TimeUnit;
import p083g7.b;
import p083g7.m;
import p268va.a;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f34583a;

    public c(o oVar) {
        this.f34583a = oVar;
    }

    @Override // p268va.a
    public final m get() {
        this.f34583a.f34601b.getClass();
        return new b(1L, TimeUnit.DAYS.toMillis(1L));
    }
}
