package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0983s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.saveable.c f10732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<InterfaceC0985u> f10733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.collection.K<Object, a> f10734c = androidx.collection.U.b();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.s$a */
    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ComposableLambdaImpl f10738d;

        public a(int i10, Object obj, Object obj2) {
            this.f10735a = obj;
            this.f10736b = obj2;
            this.f10737c = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0983s(androidx.compose.runtime.saveable.c cVar, Ia.a<? extends InterfaceC0985u> aVar) {
        this.f10732a = cVar;
        this.f10733b = aVar;
    }

    public final Ia.p a(Object obj, int i10, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        androidx.collection.K<Object, a> k10 = this.f10734c;
        final a aVarD = k10.d(obj);
        if (aVarD != null && aVarD.f10737c == i10 && kotlin.jvm.internal.i.a(aVarD.f10736b, obj2)) {
            ComposableLambdaImpl composableLambdaImpl2 = aVarD.f10738d;
            if (composableLambdaImpl2 != null) {
                return composableLambdaImpl2;
            }
            final C0983s c0983s = C0983s.this;
            composableLambdaImpl = new ComposableLambdaImpl(true, 1403994769, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC0985u interfaceC0985u = (InterfaceC0985u) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) this.this$0.f10733b).invoke();
                        int iE = aVarD.f10737c;
                        if ((iE >= interfaceC0985u.b() || !interfaceC0985u.c(iE).equals(aVarD.f10735a)) && (iE = interfaceC0985u.e(aVarD.f10735a)) != -1) {
                            aVarD.f10737c = iE;
                        }
                        if (iE != -1) {
                            interfaceC1084f2.L(-660404355);
                            C0984t.a(interfaceC0985u, this.this$0.f10732a, iE, aVarD.f10735a, interfaceC1084f2, 0);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-660169871);
                            interfaceC1084f2.D();
                        }
                        C0983s.a aVar = aVarD;
                        Object obj3 = aVar.f10735a;
                        boolean zK = interfaceC1084f2.k(aVar);
                        final C0983s.a aVar2 = aVarD;
                        Object objF = interfaceC1084f2.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                                    return new r(aVar2);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        androidx.compose.runtime.E.a(obj3, (Ia.l) objF, interfaceC1084f2);
                    } else {
                        interfaceC1084f2.w();
                    }
                    return p293xa.r.f47939a;
                }
            });
            aVarD.f10738d = composableLambdaImpl;
        } else {
            final a aVar = new a(i10, obj, obj2);
            k10.l(obj, aVar);
            ComposableLambdaImpl composableLambdaImpl3 = aVar.f10738d;
            if (composableLambdaImpl3 != null) {
                return composableLambdaImpl3;
            }
            composableLambdaImpl = new ComposableLambdaImpl(true, 1403994769, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC0985u interfaceC0985u = (InterfaceC0985u) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) this.this$0.f10733b).invoke();
                        int iE = aVar.f10737c;
                        if ((iE >= interfaceC0985u.b() || !interfaceC0985u.c(iE).equals(aVar.f10735a)) && (iE = interfaceC0985u.e(aVar.f10735a)) != -1) {
                            aVar.f10737c = iE;
                        }
                        if (iE != -1) {
                            interfaceC1084f2.L(-660404355);
                            C0984t.a(interfaceC0985u, this.this$0.f10732a, iE, aVar.f10735a, interfaceC1084f2, 0);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-660169871);
                            interfaceC1084f2.D();
                        }
                        C0983s.a aVar2 = aVar;
                        Object obj3 = aVar2.f10735a;
                        boolean zK = interfaceC1084f2.k(aVar2);
                        final C0983s.a aVar3 = aVar;
                        Object objF = interfaceC1084f2.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                                    return new r(aVar3);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        androidx.compose.runtime.E.a(obj3, (Ia.l) objF, interfaceC1084f2);
                    } else {
                        interfaceC1084f2.w();
                    }
                    return p293xa.r.f47939a;
                }
            });
            aVar.f10738d = composableLambdaImpl;
        }
        return composableLambdaImpl;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.f10734c.d(obj);
        if (aVarD != null) {
            return aVarD.f10736b;
        }
        InterfaceC0985u interfaceC0985u = (InterfaceC0985u) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) this.f10733b).invoke();
        int iE = interfaceC0985u.e(obj);
        if (iE != -1) {
            return interfaceC0985u.f(iE);
        }
        return null;
    }
}
