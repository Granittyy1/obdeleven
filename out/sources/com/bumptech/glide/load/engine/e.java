package com.bumptech.glide.load.engine;

import A3.g;
import D3.p;
import H3.q;
import H3.s;
import Q2.C0727d;
import X3.i;
import androidx.collection.C0873a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b, B3.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecodeJob f24639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.f<?> f24640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24642e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A3.b f24643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<q<File, ?>> f24644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile q.a<?> f24646i;
    public File j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f24647k;

    public e(D3.f fVar, DecodeJob decodeJob) {
        this.f24640c = fVar;
        this.f24639b = decodeJob;
    }

    @Override // com.bumptech.glide.load.engine.b
    public final boolean a() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f24640c.a();
        boolean z10 = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        D3.f<?> fVar = this.f24640c;
        Registry registry = fVar.f2726c.f24479b;
        Class<?> cls = fVar.f2727d.getClass();
        Class<?> cls2 = fVar.f2730g;
        Class<?> cls3 = fVar.f2733k;
        C0727d c0727d = registry.f24467h;
        i iVar = (i) ((AtomicReference) c0727d.f5014a).getAndSet(null);
        if (iVar == null) {
            iVar = new i(cls, cls2, cls3);
        } else {
            iVar.f7211a = cls;
            iVar.f7212b = cls2;
            iVar.f7213c = cls3;
        }
        synchronized (((C0873a) c0727d.f5015b)) {
            list = (List) ((C0873a) c0727d.f5015b).get(iVar);
        }
        ((AtomicReference) c0727d.f5014a).set(iVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            s sVar = registry.f24460a;
            synchronized (sVar) {
                arrayListC = sVar.f3670a.c(cls);
            }
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                for (Class cls4 : registry.f24462c.b((Class) it.next(), cls2)) {
                    if (!registry.f24465f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C0727d c0727d2 = registry.f24467h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C0873a) c0727d2.f5015b)) {
                ((C0873a) c0727d2.f5015b).put(new i(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f24640c.f2733k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f24640c.f2727d.getClass() + " to " + this.f24640c.f2733k);
        }
        while (true) {
            List<q<File, ?>> list3 = this.f24644g;
            if (list3 != null && this.f24645h < list3.size()) {
                this.f24646i = null;
                while (!z10 && this.f24645h < this.f24644g.size()) {
                    List<q<File, ?>> list4 = this.f24644g;
                    int i10 = this.f24645h;
                    this.f24645h = i10 + 1;
                    q<File, ?> qVar = list4.get(i10);
                    File file = this.j;
                    D3.f<?> fVar2 = this.f24640c;
                    this.f24646i = qVar.a(file, fVar2.f2728e, fVar2.f2729f, fVar2.f2732i);
                    if (this.f24646i != null && this.f24640c.c(this.f24646i.f3669c.a()) != null) {
                        this.f24646i.f3669c.e(this.f24640c.f2737o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f24642e + 1;
            this.f24642e = i11;
            if (i11 >= list2.size()) {
                int i12 = this.f24641d + 1;
                this.f24641d = i12;
                if (i12 >= arrayListA.size()) {
                    return false;
                }
                this.f24642e = 0;
            }
            A3.b bVar = (A3.b) arrayListA.get(this.f24641d);
            Class cls5 = (Class) list2.get(this.f24642e);
            g<Z> gVarE = this.f24640c.e(cls5);
            D3.f<?> fVar3 = this.f24640c;
            this.f24647k = new p(fVar3.f2726c.f24478a, bVar, fVar3.f2736n, fVar3.f2728e, fVar3.f2729f, gVarE, cls5, fVar3.f2732i);
            File fileB = fVar3.f2731h.a().b(this.f24647k);
            this.j = fileB;
            if (fileB != null) {
                this.f24643f = bVar;
                this.f24644g = this.f24640c.f2726c.f24479b.f(fileB);
                this.f24645h = 0;
            }
        }
    }

    @Override // B3.d.a
    public final void c(Exception exc) {
        this.f24639b.c(this.f24647k, exc, this.f24646i.f3669c, DataSource.f24514e);
    }

    @Override // com.bumptech.glide.load.engine.b
    public final void cancel() {
        q.a<?> aVar = this.f24646i;
        if (aVar != null) {
            aVar.f3669c.cancel();
        }
    }

    @Override // B3.d.a
    public final void d(Object obj) {
        this.f24639b.b(this.f24643f, obj, this.f24646i.f3669c, DataSource.f24514e, this.f24647k);
    }
}
