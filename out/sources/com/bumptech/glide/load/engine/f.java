package com.bumptech.glide.load.engine;

import D3.r;
import H3.q;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b, b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D3.f<?> f24648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecodeJob f24649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f24651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f24652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile q.a<?> f24653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D3.d f24654h;

    public f(D3.f fVar, DecodeJob decodeJob) {
        this.f24648b = fVar;
        this.f24649c = decodeJob;
    }

    @Override // com.bumptech.glide.load.engine.b
    public final boolean a() {
        Object obj = this.f24652f;
        if (obj != null) {
            this.f24652f = null;
            int i10 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
            try {
                A3.a<X> aVarD = this.f24648b.d(obj);
                D3.e eVar = new D3.e(aVarD, obj, this.f24648b.f2732i);
                A3.b bVar = this.f24653g.f3667a;
                D3.f<?> fVar = this.f24648b;
                this.f24654h = new D3.d(bVar, fVar.f2736n);
                fVar.f2731h.a().a(this.f24654h, eVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Objects.toString(this.f24654h);
                    obj.toString();
                    aVarD.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                this.f24653g.f3669c.b();
                this.f24651e = new a(Collections.singletonList(this.f24653g.f3667a), this.f24648b, this);
            } catch (Throwable th) {
                this.f24653g.f3669c.b();
                throw th;
            }
        }
        a aVar = this.f24651e;
        if (aVar != null && aVar.a()) {
            return true;
        }
        this.f24651e = null;
        this.f24653g = null;
        boolean z10 = false;
        while (!z10 && this.f24650d < this.f24648b.b().size()) {
            ArrayList arrayListB = this.f24648b.b();
            int i11 = this.f24650d;
            this.f24650d = i11 + 1;
            this.f24653g = (q.a) arrayListB.get(i11);
            if (this.f24653g != null && (this.f24648b.f2738p.c(this.f24653g.f3669c.getDataSource()) || this.f24648b.c(this.f24653g.f3669c.a()) != null)) {
                this.f24653g.f3669c.e(this.f24648b.f2737o, new r(this, this.f24653g));
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.b.a
    public final void b(A3.b bVar, Object obj, B3.d<?> dVar, DataSource dataSource, A3.b bVar2) {
        this.f24649c.b(bVar, obj, dVar, this.f24653g.f3669c.getDataSource(), bVar);
    }

    @Override // com.bumptech.glide.load.engine.b.a
    public final void c(A3.b bVar, Exception exc, B3.d<?> dVar, DataSource dataSource) {
        this.f24649c.c(bVar, exc, dVar, this.f24653g.f3669c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.b
    public final void cancel() {
        q.a<?> aVar = this.f24653g;
        if (aVar != null) {
            aVar.f3669c.cancel();
        }
    }
}
