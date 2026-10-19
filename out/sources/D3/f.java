package D3;

import androidx.collection.C0873a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class f<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2724a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2725b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.c f2726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class<?> f2730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.load.engine.c.C0258c f2731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public A3.d f2732i;
    public X3.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<Transcode> f2733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A3.b f2736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Priority f2737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f2738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2740r;

    public final ArrayList a() {
        boolean z10 = this.f2735m;
        ArrayList arrayList = this.f2725b;
        if (!z10) {
            this.f2735m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                H3.q.a aVar = (H3.q.a) arrayListB.get(i10);
                if (!arrayList.contains(aVar.f3667a)) {
                    arrayList.add(aVar.f3667a);
                }
                int i11 = 0;
                while (true) {
                    List<A3.b> list = aVar.f3668b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f2734l;
        ArrayList arrayList = this.f2724a;
        if (!z10) {
            this.f2734l = true;
            arrayList.clear();
            List listF = this.f2726c.f24479b.f(this.f2727d);
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                H3.q.a aVarA = ((H3.q) listF.get(i10)).a(this.f2727d, this.f2728e, this.f2729f, this.f2732i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <Data> m<Data, ?, Transcode> c(Class<Data> cls) {
        m<Data, ?, Transcode> mVar;
        ArrayList arrayList;
        P3.f.a aVar;
        P3.e eVar;
        Registry registry = this.f2726c.f24479b;
        Class<?> cls2 = this.f2730g;
        Class cls3 = (Class<Transcode>) this.f2733k;
        S3.c cVar = registry.f24468i;
        X3.i andSet = cVar.f5489b.getAndSet(null);
        if (andSet == null) {
            andSet = new X3.i();
        }
        andSet.f7211a = cls;
        andSet.f7212b = cls2;
        andSet.f7213c = cls3;
        synchronized (cVar.f5488a) {
            mVar = (m) cVar.f5488a.get(andSet);
        }
        cVar.f5489b.set(andSet);
        registry.f24468i.getClass();
        if (S3.c.f5487c.equals(mVar)) {
            return null;
        }
        if (mVar != null) {
            return mVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : registry.f24462c.b(cls, cls2)) {
            for (Class cls5 : registry.f24465f.a(cls4, cls3)) {
                S3.d dVar = registry.f24462c;
                synchronized (dVar) {
                    arrayList = new ArrayList();
                    Iterator it = dVar.f5490a.iterator();
                    while (it.hasNext()) {
                        List<S3.d.a> list = (List) dVar.f5491b.get((String) it.next());
                        if (list != null) {
                            for (S3.d.a aVar2 : list) {
                                if (aVar2.f5492a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar2.f5493b)) {
                                    arrayList.add(aVar2.f5494c);
                                }
                            }
                        }
                    }
                }
                P3.f fVar = registry.f24465f;
                synchronized (fVar) {
                    if (cls5.isAssignableFrom(cls4)) {
                        eVar = P3.g.f4928a;
                    } else {
                        Iterator it2 = fVar.f4924a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            aVar = (P3.f.a) it2.next();
                        } while (!(aVar.f4925a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar.f4926b)));
                        eVar = aVar.f4927c;
                    }
                }
                arrayList2.add(new g(cls, cls4, cls5, arrayList, eVar, registry.j));
            }
        }
        m<Data, ?, Transcode> mVar2 = arrayList2.isEmpty() ? null : new m<>(cls, cls2, cls3, arrayList2, registry.j);
        S3.c cVar2 = registry.f24468i;
        synchronized (cVar2.f5488a) {
            cVar2.f5488a.put(new X3.i(cls, cls2, cls3), mVar2 != null ? mVar2 : S3.c.f5487c);
        }
        return mVar2;
    }

    public final <X> A3.a<X> d(X x10) throws Registry.NoSourceEncoderAvailableException {
        A3.a<X> aVar;
        S3.a aVar2 = this.f2726c.f24479b.f24461b;
        Class<?> cls = x10.getClass();
        synchronized (aVar2) {
            Iterator it = aVar2.f5483a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                S3.a.C0078a c0078a = (S3.a.C0078a) it.next();
                if (c0078a.f5484a.isAssignableFrom(cls)) {
                    aVar = (A3.a<X>) c0078a.f5485b;
                    break;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new Registry.NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + x10.getClass());
    }

    public final <Z> A3.g<Z> e(Class<Z> cls) {
        A3.g<Z> gVar = (A3.g) this.j.get(cls);
        if (gVar == null) {
            for (Map.Entry entry : (C0873a.C0118a) this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    gVar = (A3.g) entry.getValue();
                    break;
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (!this.j.isEmpty() || !this.f2739q) {
            return J3.a.f3969b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
