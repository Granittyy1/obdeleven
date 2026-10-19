package kotlinx.coroutines.internal;

import kotlinx.coroutines.C0;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43460a = new D3.l(4, "NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ia.p<Object, kotlin.coroutines.e.a, Object> f43461b = new Ia.p<Object, kotlin.coroutines.e.a, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // Ia.p
        public final Object invoke(Object obj, kotlin.coroutines.e.a aVar) {
            kotlin.coroutines.e.a aVar2 = aVar;
            if (!(aVar2 instanceof C0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? aVar2 : Integer.valueOf(iIntValue + 1);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ia.p<C0<?>, kotlin.coroutines.e.a, C0<?>> f43462c = new Ia.p<C0<?>, kotlin.coroutines.e.a, C0<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // Ia.p
        public final C0<?> invoke(C0<?> c10, kotlin.coroutines.e.a aVar) {
            C0<?> c11 = c10;
            kotlin.coroutines.e.a aVar2 = aVar;
            if (c11 != null) {
                return c11;
            }
            if (aVar2 instanceof C0) {
                return (C0) aVar2;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ia.p<B, kotlin.coroutines.e.a, B> f43463d = new Ia.p<B, kotlin.coroutines.e.a, B>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // Ia.p
        public final B invoke(B b10, kotlin.coroutines.e.a aVar) {
            B b11 = b10;
            kotlin.coroutines.e.a aVar2 = aVar;
            if (aVar2 instanceof C0) {
                C0<Object> c10 = (C0) aVar2;
                String strS0 = c10.S0(b11.f43450a);
                int i10 = b11.f43453d;
                b11.f43451b[i10] = strS0;
                b11.f43453d = i10 + 1;
                b11.f43452c[i10] = c10;
            }
            return b11;
        }
    };

    public static final void a(kotlin.coroutines.e eVar, Object obj) {
        if (obj == f43460a) {
            return;
        }
        if (!(obj instanceof B)) {
            Object objFold = eVar.fold(null, f43462c);
            kotlin.jvm.internal.i.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C0) objFold).y0(obj);
            return;
        }
        B b10 = (B) obj;
        C0<Object>[] c0Arr = b10.f43452c;
        int length = c0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            C0<Object> c10 = c0Arr[length];
            kotlin.jvm.internal.i.b(c10);
            c10.y0(b10.f43451b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    public static final Object b(kotlin.coroutines.e eVar) {
        Object objFold = eVar.fold(0, f43461b);
        kotlin.jvm.internal.i.b(objFold);
        return objFold;
    }

    public static final Object c(kotlin.coroutines.e eVar, Object obj) {
        if (obj == null) {
            obj = b(eVar);
        }
        if (obj == 0) {
            return f43460a;
        }
        return obj instanceof Integer ? eVar.fold(new B(((Number) obj).intValue(), eVar), f43463d) : ((C0) obj).S0(eVar);
    }
}
