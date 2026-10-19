package com.bumptech.glide.load.engine;

import H3.q;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, B3.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<A3.b> f24578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.f<?> f24579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.a f24580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24581e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A3.b f24582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<q<File, ?>> f24583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile q.a<?> f24585i;
    public File j;

    public a(List<A3.b> list, D3.f<?> fVar, b.a aVar) {
        this.f24578b = list;
        this.f24579c = fVar;
        this.f24580d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.b
    public final boolean a() {
        while (true) {
            List<q<File, ?>> list = this.f24583g;
            boolean z10 = false;
            if (list != null && this.f24584h < list.size()) {
                this.f24585i = null;
                while (!z10 && this.f24584h < this.f24583g.size()) {
                    List<q<File, ?>> list2 = this.f24583g;
                    int i10 = this.f24584h;
                    this.f24584h = i10 + 1;
                    q<File, ?> qVar = list2.get(i10);
                    File file = this.j;
                    D3.f<?> fVar = this.f24579c;
                    this.f24585i = qVar.a(file, fVar.f2728e, fVar.f2729f, fVar.f2732i);
                    if (this.f24585i != null && this.f24579c.c(this.f24585i.f3669c.a()) != null) {
                        this.f24585i.f3669c.e(this.f24579c.f2737o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f24581e + 1;
            this.f24581e = i11;
            if (i11 >= this.f24578b.size()) {
                return false;
            }
            A3.b bVar = this.f24578b.get(this.f24581e);
            D3.f<?> fVar2 = this.f24579c;
            File fileB = fVar2.f2731h.a().b(new D3.d(bVar, fVar2.f2736n));
            this.j = fileB;
            if (fileB != null) {
                this.f24582f = bVar;
                this.f24583g = this.f24579c.f2726c.f24479b.f(fileB);
                this.f24584h = 0;
            }
        }
    }

    @Override // B3.d.a
    public final void c(Exception exc) {
        this.f24580d.c(this.f24582f, exc, this.f24585i.f3669c, DataSource.f24513d);
    }

    @Override // com.bumptech.glide.load.engine.b
    public final void cancel() {
        q.a<?> aVar = this.f24585i;
        if (aVar != null) {
            aVar.f3669c.cancel();
        }
    }

    @Override // B3.d.a
    public final void d(Object obj) {
        this.f24580d.b(this.f24582f, obj, this.f24585i.f3669c, DataSource.f24513d, this.f24582f);
    }
}
