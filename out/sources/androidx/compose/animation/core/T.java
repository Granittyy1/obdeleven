package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(float f10, float f11, float f12, InterfaceC0906f interfaceC0906f, final Ia.p pVar, SuspendLambda suspendLambda) {
        e0 e0Var = VectorConvertersKt.f9477a;
        Object f13 = new Float(f10);
        Float f14 = new Float(f11);
        Object f15 = new Float(f12);
        Ia.l<T, V> lVar = e0Var.f9540a;
        AbstractC0913m abstractC0913mC = (AbstractC0913m) lVar.invoke((T) f15);
        if (abstractC0913mC == null) {
            abstractC0913mC = ((AbstractC0913m) lVar.invoke((T) f13)).c();
        }
        AbstractC0913m abstractC0913m = abstractC0913mC;
        Object objB = b(new C0908h(e0Var, f13, abstractC0913m, 56), new U(interfaceC0906f, e0Var, f13, f14, abstractC0913m), Long.MIN_VALUE, new Ia.l<C0905e<Object, Object>, p293xa.r>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            final /* synthetic */ d0<Object, Object> $typeConverter = VectorConvertersKt.f9477a;

            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C0905e<Object, Object> c0905e) {
                C0905e<Object, Object> c0905e2 = c0905e;
                pVar.invoke(c0905e2.f9535e.getValue(), this.$typeConverter.b().invoke(c0905e2.f9536f));
                return p293xa.r.f47939a;
            }
        }, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objB != coroutineSingletons) {
            objB = p293xa.r.f47939a;
        }
        return objB == coroutineSingletons ? objB : p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.e] */
    public static final Object b(final C0908h c0908h, final InterfaceC0903c interfaceC0903c, long j, final Ia.l lVar, ContinuationImpl continuationImpl) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        Ref$ObjectRef ref$ObjectRef;
        Ia.l lVar2;
        C0908h c0908h2;
        Object objP0;
        C0905e c0905e;
        C0905e c0905e2;
        Object objP1;
        final C0908h c0908h3 = c0908h;
        InterfaceC0903c interfaceC0903c2 = interfaceC0903c;
        if (continuationImpl instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuationImpl;
            int i10 = suspendAnimationKt$animate$4.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label = i10 - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuationImpl);
            }
        } else {
            suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuationImpl);
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$5 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$5.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = suspendAnimationKt$animate$5.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            final Object objF = interfaceC0903c2.f(0L);
            final AbstractC0913m abstractC0913mD = interfaceC0903c2.d(0L);
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                if (j == Long.MIN_VALUE) {
                    final float fH = h(suspendAnimationKt$animate$5.getContext());
                    final Ia.l<Long, p293xa.r> lVar3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.e] */
                        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.animation.core.m, java.lang.Object] */
                        @Override // Ia.l
                        public final p293xa.r invoke(Long l10) {
                            long jLongValue = l10.longValue();
                            Ref$ObjectRef<C0905e<Object, Object>> ref$ObjectRef3 = ref$ObjectRef2;
                            Object obj2 = objF;
                            d0<Object, V> d0VarC = interfaceC0903c.c();
                            ?? r10 = abstractC0913mD;
                            Object objG = interfaceC0903c.g();
                            final C0908h<Object, Object> c0908h4 = c0908h;
                            ?? c0905e3 = new C0905e(obj2, d0VarC, r10, jLongValue, objG, jLongValue, new Ia.a<p293xa.r>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    c0908h4.f9548g = false;
                                    return p293xa.r.f47939a;
                                }
                            });
                            T.g(c0905e3, jLongValue, fH, interfaceC0903c, c0908h, lVar);
                            ref$ObjectRef3.element = c0905e3;
                            return p293xa.r.f47939a;
                        }
                    };
                    suspendAnimationKt$animate$5.L$0 = c0908h3;
                    suspendAnimationKt$animate$5.L$1 = interfaceC0903c2;
                    lVar2 = lVar;
                    suspendAnimationKt$animate$5.L$2 = lVar2;
                    suspendAnimationKt$animate$5.L$3 = ref$ObjectRef2;
                    suspendAnimationKt$animate$5.label = 1;
                    if (interfaceC0903c.a()) {
                        objP0 = D.a(lVar3, suspendAnimationKt$animate$5);
                    } else {
                        objP0 = androidx.compose.runtime.P.a(suspendAnimationKt$animate$5.getContext()).P0(new Ia.l<Long, Object>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Object invoke(Long l10) {
                                return lVar3.invoke(Long.valueOf(l10.longValue()));
                            }
                        }, suspendAnimationKt$animate$5);
                    }
                    if (objP0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    lVar2 = lVar;
                    try {
                        ?? c0905e3 = new C0905e(objF, interfaceC0903c.c(), abstractC0913mD, j, interfaceC0903c.g(), j, new Ia.a<p293xa.r>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                c0908h3.f9548g = false;
                                return p293xa.r.f47939a;
                            }
                        });
                        ref$ObjectRef2 = ref$ObjectRef2;
                        g(c0905e3, j, h(suspendAnimationKt$animate$5.getContext()), interfaceC0903c, c0908h, lVar);
                        ref$ObjectRef2.element = c0905e3;
                    } catch (CancellationException e10) {
                        e = e10;
                        ref$ObjectRef2 = ref$ObjectRef2;
                        ref$ObjectRef = ref$ObjectRef2;
                        c0905e = (C0905e) ref$ObjectRef.element;
                        if (c0905e != null) {
                            c0905e.f9539i.setValue(Boolean.FALSE);
                        }
                        c0905e2 = (C0905e) ref$ObjectRef.element;
                        if (c0905e2 != null) {
                            c0908h3.f9548g = false;
                        }
                        throw e;
                    }
                }
                c0908h2 = c0908h3;
                ref$ObjectRef = ref$ObjectRef2;
            } catch (CancellationException e11) {
                e = e11;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) suspendAnimationKt$animate$5.L$3;
            Ia.l lVar4 = (Ia.l) suspendAnimationKt$animate$5.L$2;
            InterfaceC0903c interfaceC0903c3 = (InterfaceC0903c) suspendAnimationKt$animate$5.L$1;
            c0908h2 = (C0908h) suspendAnimationKt$animate$5.L$0;
            try {
                kotlin.b.b(obj);
                lVar2 = lVar4;
                interfaceC0903c2 = interfaceC0903c3;
            } catch (CancellationException e12) {
                e = e12;
                c0908h3 = c0908h2;
                c0905e = (C0905e) ref$ObjectRef.element;
                if (c0905e != null) {
                    c0905e.f9539i.setValue(Boolean.FALSE);
                }
                c0905e2 = (C0905e) ref$ObjectRef.element;
                if (c0905e2 != null && c0905e2.f9537g == c0908h3.f9546e) {
                    c0908h3.f9548g = false;
                }
                throw e;
            }
        }
        do {
            T t8 = ref$ObjectRef.element;
            kotlin.jvm.internal.i.b(t8);
            if (!((Boolean) ((C0905e) t8).f9539i.getValue()).booleanValue()) {
                return p293xa.r.f47939a;
            }
            final float fH2 = h(suspendAnimationKt$animate$5.getContext());
            final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            final InterfaceC0903c interfaceC0903c4 = interfaceC0903c2;
            final C0908h c0908h4 = c0908h2;
            final Ia.l lVar5 = lVar2;
            final Ia.l<Long, p293xa.r> lVar6 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Long l10) {
                    long jLongValue = l10.longValue();
                    C0905e<Object, Object> c0905e4 = ref$ObjectRef3.element;
                    kotlin.jvm.internal.i.b(c0905e4);
                    T.g(c0905e4, jLongValue, fH2, interfaceC0903c4, c0908h4, lVar5);
                    return p293xa.r.f47939a;
                }
            };
            suspendAnimationKt$animate$5.L$0 = c0908h2;
            suspendAnimationKt$animate$5.L$1 = interfaceC0903c2;
            suspendAnimationKt$animate$5.L$2 = lVar2;
            suspendAnimationKt$animate$5.L$3 = ref$ObjectRef;
            suspendAnimationKt$animate$5.label = 2;
            if (interfaceC0903c2.a()) {
                objP1 = D.a(lVar6, suspendAnimationKt$animate$5);
            } else {
                objP1 = androidx.compose.runtime.P.a(suspendAnimationKt$animate$5.getContext()).P0(new Ia.l<Long, Object>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Object invoke(Long l10) {
                        return lVar6.invoke(Long.valueOf(l10.longValue()));
                    }
                }, suspendAnimationKt$animate$5);
            }
        } while (objP1 != coroutineSingletons);
        return coroutineSingletons;
    }

    public static /* synthetic */ Object c(float f10, float f11, InterfaceC0906f interfaceC0906f, Ia.p pVar, SuspendLambda suspendLambda, int i10) {
        if ((i10 & 8) != 0) {
            interfaceC0906f = C0907g.c(0.0f, 0.0f, null, 7);
        }
        return a(f10, f11, 0.0f, interfaceC0906f, pVar, suspendLambda);
    }

    public static final Object d(C0908h c0908h, InterfaceC0918s interfaceC0918s, boolean z10, Ia.l lVar, ContinuationImpl continuationImpl) {
        Object objB = b(c0908h, new r(interfaceC0918s, c0908h.f9543b, c0908h.f9544c.getValue(), c0908h.f9545d), z10 ? c0908h.f9546e : Long.MIN_VALUE, lVar, continuationImpl);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public static final Object e(C0908h c0908h, Float f10, InterfaceC0906f interfaceC0906f, boolean z10, Ia.l lVar, ContinuationImpl continuationImpl) {
        Object objB = b(c0908h, new U(interfaceC0906f, c0908h.f9543b, c0908h.f9544c.getValue(), f10, c0908h.f9545d), z10 ? c0908h.f9546e : Long.MIN_VALUE, lVar, continuationImpl);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public static /* synthetic */ Object f(C0908h c0908h, Float f10, InterfaceC0906f interfaceC0906f, boolean z10, Ia.l lVar, ContinuationImpl continuationImpl, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC0906f = C0907g.c(0.0f, 0.0f, null, 7);
        }
        InterfaceC0906f interfaceC0906f2 = interfaceC0906f;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = new Ia.l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return p293xa.r.f47939a;
                }
            };
        }
        return e(c0908h, f10, interfaceC0906f2, z11, lVar, continuationImpl);
    }

    public static final <T, V extends AbstractC0913m> void g(C0905e<T, V> c0905e, long j, float f10, InterfaceC0903c<T, V> interfaceC0903c, C0908h<T, V> c0908h, Ia.l<? super C0905e<T, V>, p293xa.r> lVar) {
        long jB = f10 == 0.0f ? interfaceC0903c.b() : (long) ((j - c0905e.f9533c) / f10);
        c0905e.f9537g = j;
        c0905e.f9535e.setValue(interfaceC0903c.f(jB));
        c0905e.f9536f = (V) interfaceC0903c.d(jB);
        if (interfaceC0903c.e(jB)) {
            c0905e.f9538h = c0905e.f9537g;
            c0905e.f9539i.setValue(Boolean.FALSE);
        }
        i(c0905e, c0908h);
        lVar.invoke(c0905e);
    }

    public static final float h(kotlin.coroutines.e eVar) {
        androidx.compose.ui.j jVar = (androidx.compose.ui.j) eVar.get(androidx.compose.ui.j.a.f14152b);
        float fU = jVar != null ? jVar.U() : 1.0f;
        if (fU < 0.0f) {
            M.b("negative scale factor");
        }
        return fU;
    }

    public static final <T, V extends AbstractC0913m> void i(C0905e<T, V> c0905e, C0908h<T, V> c0908h) {
        c0908h.f9544c.setValue(c0905e.f9535e.getValue());
        V v10 = c0908h.f9545d;
        V v11 = c0905e.f9536f;
        int iB = v10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            v10.e(v11.a(i10), i10);
        }
        c0908h.f9547f = c0905e.f9538h;
        c0908h.f9546e = c0905e.f9537g;
        c0908h.f9548g = ((Boolean) c0905e.f9539i.getValue()).booleanValue();
    }
}
