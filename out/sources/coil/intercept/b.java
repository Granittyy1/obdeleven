package coil.intercept;

import Z2.e;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.RealImageLoader;
import coil.decode.DataSource;
import coil.decode.x;
import coil.fetch.f;
import coil.fetch.l;
import coil.request.g;
import coil.request.k;
import coil.request.n;
import coil.size.Scale;
import coil.util.v;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealImageLoader f22993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f22994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f22995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X2.c f22996d;

    /* JADX INFO: compiled from: EngineInterceptor.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f22997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DataSource f22999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f23000d;

        public a(Drawable drawable, boolean z10, DataSource dataSource, String str) {
            this.f22997a = drawable;
            this.f22998b = z10;
            this.f22999c = dataSource;
            this.f23000d = str;
        }
    }

    public b(RealImageLoader realImageLoader, v vVar, n nVar) {
        this.f22993a = realImageLoader;
        this.f22994b = vVar;
        this.f22995c = nVar;
        this.f22996d = new X2.c(realImageLoader, nVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d A[LOOP:0: B:16:0x0085->B:20:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:27:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(coil.intercept.b r19, coil.fetch.l r20, coil.a r21, coil.request.g r22, java.lang.Object r23, coil.request.k r24, coil.b r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.b.b(coil.intercept.b, coil.fetch.l, coil.a, coil.request.g, java.lang.Object, coil.request.k, coil.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8 A[PHI: r1
      0x01a8: PHI (r1v25 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:58:0x01a5, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, coil.request.k] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r9v3, types: [coil.intercept.b$a] */
    public static final Object c(b bVar, g gVar, Object obj, k kVar, coil.b bVar2, ContinuationImpl continuationImpl) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        x xVar;
        g gVar2;
        Object obj2;
        coil.b bVar3;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        b bVar4;
        Ref$ObjectRef ref$ObjectRef4;
        T t8;
        coil.b bVar5;
        b bVar6;
        Ref$ObjectRef ref$ObjectRef5;
        coil.b bVar7;
        g gVar3;
        b bVar8;
        a aVar;
        T t10;
        l lVar;
        k kVar2;
        List<p016b3.d> list;
        x xVar2;
        Object obj3;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        bVar.getClass();
        if (continuationImpl instanceof EngineInterceptor$execute$1) {
            engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuationImpl;
            int i10 = engineInterceptor$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                engineInterceptor$execute$1 = new EngineInterceptor$execute$1(bVar, continuationImpl);
            }
        } else {
            engineInterceptor$execute$1 = new EngineInterceptor$execute$1(bVar, continuationImpl);
        }
        EngineInterceptor$execute$1 engineInterceptor$execute$2 = engineInterceptor$execute$1;
        Object objF = engineInterceptor$execute$2.result;
        Object obj4 = CoroutineSingletons.f43038b;
        Ref$ObjectRef ref$ObjectRef6 = engineInterceptor$execute$2.label;
        try {
            if (ref$ObjectRef6 == 0) {
                kotlin.b.b(objF);
                Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                ref$ObjectRef7.element = kVar;
                Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                ref$ObjectRef8.element = bVar.f22993a.f22696g;
                Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                try {
                    ref$ObjectRef7.element = bVar.f22995c.d((k) ref$ObjectRef7.element);
                    gVar.getClass();
                    coil.a aVar2 = (coil.a) ref$ObjectRef8.element;
                    k kVar3 = (k) ref$ObjectRef7.element;
                    engineInterceptor$execute$2.L$0 = bVar;
                    engineInterceptor$execute$2.L$1 = gVar;
                    engineInterceptor$execute$2.L$2 = obj;
                    engineInterceptor$execute$2.L$3 = bVar2;
                    engineInterceptor$execute$2.L$4 = ref$ObjectRef7;
                    engineInterceptor$execute$2.L$5 = ref$ObjectRef8;
                    engineInterceptor$execute$2.L$6 = ref$ObjectRef9;
                    engineInterceptor$execute$2.L$7 = ref$ObjectRef9;
                    engineInterceptor$execute$2.label = 1;
                    Object objD = bVar.d(aVar2, gVar, obj, kVar3, bVar2, engineInterceptor$execute$2);
                    if (objD != obj4) {
                        gVar2 = gVar;
                        obj2 = obj;
                        bVar3 = bVar2;
                        ref$ObjectRef = ref$ObjectRef7;
                        ref$ObjectRef2 = ref$ObjectRef8;
                        ref$ObjectRef3 = ref$ObjectRef9;
                        bVar4 = bVar;
                        ref$ObjectRef4 = ref$ObjectRef3;
                        t8 = objD;
                    }
                    return obj4;
                } catch (Throwable th) {
                    th = th;
                    ref$ObjectRef6 = ref$ObjectRef9;
                    T t11 = ref$ObjectRef6.element;
                    l lVar2 = t11 instanceof l ? (l) t11 : null;
                    if (lVar2 != null && (xVar = lVar2.f22989a) != null) {
                        coil.util.k.a(xVar);
                    }
                    throw th;
                }
            }
            if (ref$ObjectRef6 == 1) {
                ref$ObjectRef4 = (Ref$ObjectRef) engineInterceptor$execute$2.L$7;
                ref$ObjectRef3 = (Ref$ObjectRef) engineInterceptor$execute$2.L$6;
                Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) engineInterceptor$execute$2.L$5;
                ref$ObjectRef = (Ref$ObjectRef) engineInterceptor$execute$2.L$4;
                bVar3 = (coil.b) engineInterceptor$execute$2.L$3;
                Object obj5 = engineInterceptor$execute$2.L$2;
                gVar2 = (g) engineInterceptor$execute$2.L$1;
                bVar4 = (b) engineInterceptor$execute$2.L$0;
                kotlin.b.b(objF);
                ref$ObjectRef2 = ref$ObjectRef10;
                obj2 = obj5;
                t8 = objF;
            } else {
                if (ref$ObjectRef6 == 2) {
                    ref$ObjectRef3 = (Ref$ObjectRef) engineInterceptor$execute$2.L$4;
                    ref$ObjectRef5 = (Ref$ObjectRef) engineInterceptor$execute$2.L$3;
                    bVar7 = (coil.b) engineInterceptor$execute$2.L$2;
                    gVar3 = (g) engineInterceptor$execute$2.L$1;
                    bVar8 = (b) engineInterceptor$execute$2.L$0;
                    kotlin.b.b(objF);
                    obj3 = objF;
                    bVar5 = bVar7;
                    gVar2 = gVar3;
                    bVar6 = bVar8;
                    ref$ObjectRef = ref$ObjectRef5;
                    aVar = (a) obj3;
                    t10 = ref$ObjectRef3.element;
                    if (t10 instanceof l) {
                        lVar = (l) t10;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null && (xVar2 = lVar.f22989a) != null) {
                        coil.util.k.a(xVar2);
                    }
                    kVar2 = (k) ref$ObjectRef.element;
                    engineInterceptor$execute$2.L$0 = null;
                    engineInterceptor$execute$2.L$1 = null;
                    engineInterceptor$execute$2.L$2 = null;
                    engineInterceptor$execute$2.L$3 = null;
                    engineInterceptor$execute$2.L$4 = null;
                    engineInterceptor$execute$2.L$5 = null;
                    engineInterceptor$execute$2.L$6 = null;
                    engineInterceptor$execute$2.L$7 = null;
                    engineInterceptor$execute$2.label = 3;
                    bVar6.getClass();
                    list = gVar2.f23054i;
                    objF = aVar;
                    if (!list.isEmpty() && ((aVar.f22997a instanceof BitmapDrawable) || gVar2.f23057m)) {
                        objF = aVar;
                        objF = C2680e.f(gVar2.f23067w, new EngineInterceptor$transform$3(bVar6, aVar, kVar2, list, bVar5, gVar2, null), engineInterceptor$execute$2);
                    }
                    if (objF != obj4) {
                    }
                    return obj4;
                }
                if (ref$ObjectRef6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objF);
            }
            obj4 = (a) objF;
            Drawable drawable = obj4.f22997a;
            bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                bitmap.prepareToDraw();
            }
            return obj4;
            ref$ObjectRef4.element = t8;
            T t12 = ref$ObjectRef3.element;
            coil.fetch.g gVar4 = (coil.fetch.g) t12;
            if (gVar4 instanceof l) {
                AbstractC2712w abstractC2712w = gVar2.f23066v;
                EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(bVar4, ref$ObjectRef3, ref$ObjectRef2, gVar2, obj2, ref$ObjectRef, bVar3, null);
                engineInterceptor$execute$2.L$0 = bVar4;
                engineInterceptor$execute$2.L$1 = gVar2;
                engineInterceptor$execute$2.L$2 = bVar3;
                engineInterceptor$execute$2.L$3 = ref$ObjectRef;
                engineInterceptor$execute$2.L$4 = ref$ObjectRef3;
                engineInterceptor$execute$2.L$5 = null;
                engineInterceptor$execute$2.L$6 = null;
                engineInterceptor$execute$2.L$7 = null;
                engineInterceptor$execute$2.label = 2;
                Object objF2 = C2680e.f(abstractC2712w, engineInterceptor$execute$executeResult$1, engineInterceptor$execute$2);
                if (objF2 != obj4) {
                    ref$ObjectRef5 = ref$ObjectRef;
                    bVar7 = bVar3;
                    gVar3 = gVar2;
                    bVar8 = bVar4;
                    obj3 = objF2;
                    bVar5 = bVar7;
                    gVar2 = gVar3;
                    bVar6 = bVar8;
                    ref$ObjectRef = ref$ObjectRef5;
                    aVar = (a) obj3;
                    t10 = ref$ObjectRef3.element;
                    if (t10 instanceof l) {
                        lVar = (l) t10;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        coil.util.k.a(xVar2);
                    }
                    kVar2 = (k) ref$ObjectRef.element;
                    engineInterceptor$execute$2.L$0 = null;
                    engineInterceptor$execute$2.L$1 = null;
                    engineInterceptor$execute$2.L$2 = null;
                    engineInterceptor$execute$2.L$3 = null;
                    engineInterceptor$execute$2.L$4 = null;
                    engineInterceptor$execute$2.L$5 = null;
                    engineInterceptor$execute$2.L$6 = null;
                    engineInterceptor$execute$2.L$7 = null;
                    engineInterceptor$execute$2.label = 3;
                    bVar6.getClass();
                    list = gVar2.f23054i;
                    objF = aVar;
                    if (!list.isEmpty()) {
                        objF = aVar;
                        objF = C2680e.f(gVar2.f23067w, new EngineInterceptor$transform$3(bVar6, aVar, kVar2, list, bVar5, gVar2, null), engineInterceptor$execute$2);
                    }
                    if (objF != obj4) {
                        obj4 = (a) objF;
                        Drawable drawable2 = obj4.f22997a;
                        if (drawable2 instanceof BitmapDrawable) {
                        }
                        if (bitmapDrawable != null) {
                            bitmap.prepareToDraw();
                        }
                    }
                }
            } else {
                if (!(gVar4 instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar5 = bVar3;
                bVar6 = bVar4;
                aVar = new a(((f) t12).f22983a, ((f) t12).f22984b, ((f) t12).f22985c, null);
                t10 = ref$ObjectRef3.element;
                if (t10 instanceof l) {
                    lVar = (l) t10;
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    coil.util.k.a(xVar2);
                }
                kVar2 = (k) ref$ObjectRef.element;
                engineInterceptor$execute$2.L$0 = null;
                engineInterceptor$execute$2.L$1 = null;
                engineInterceptor$execute$2.L$2 = null;
                engineInterceptor$execute$2.L$3 = null;
                engineInterceptor$execute$2.L$4 = null;
                engineInterceptor$execute$2.L$5 = null;
                engineInterceptor$execute$2.L$6 = null;
                engineInterceptor$execute$2.L$7 = null;
                engineInterceptor$execute$2.label = 3;
                bVar6.getClass();
                list = gVar2.f23054i;
                objF = aVar;
                if (!list.isEmpty()) {
                    objF = aVar;
                    objF = C2680e.f(gVar2.f23067w, new EngineInterceptor$transform$3(bVar6, aVar, kVar2, list, bVar5, gVar2, null), engineInterceptor$execute$2);
                }
                if (objF != obj4) {
                    obj4 = (a) objF;
                    Drawable drawable3 = obj4.f22997a;
                    if (drawable3 instanceof BitmapDrawable) {
                    }
                    if (bitmapDrawable != null) {
                        bitmap.prepareToDraw();
                    }
                }
            }
            return obj4;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // coil.intercept.c
    public final Object a(d dVar, ContinuationImpl continuationImpl) throws Throwable {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        b bVar;
        c.a aVar;
        d dVar2 = dVar;
        X2.c cVar = this.f22996d;
        if (continuationImpl instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuationImpl;
            int i10 = engineInterceptor$intercept$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.label = i10 - Integer.MIN_VALUE;
            } else {
                engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuationImpl);
            }
        } else {
            engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuationImpl);
        }
        EngineInterceptor$intercept$1 engineInterceptor$intercept$2 = engineInterceptor$intercept$1;
        Object objF = engineInterceptor$intercept$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = engineInterceptor$intercept$2.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.a aVar2 = (c.a) engineInterceptor$intercept$2.L$1;
            bVar = (b) engineInterceptor$intercept$2.L$0;
            try {
                kotlin.b.b(objF);
            } catch (Throwable th) {
                th = th;
                aVar = aVar2;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                n nVar = bVar.f22995c;
                return n.a(aVar.c(), th);
            }
        }
        kotlin.b.b(objF);
        try {
            g gVar = dVar2.f23004d;
            Object obj = gVar.f23047b;
            e eVar = dVar2.f23005e;
            Bitmap.Config[] configArr = coil.util.k.f23160a;
            coil.b bVar2 = dVar2.f23006f;
            k kVarC = this.f22995c.c(gVar, eVar);
            Scale scale = kVarC.f23102e;
            bVar2.getClass();
            List<Pair<W2.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f22993a.f22696g.f22699b;
            int size = list.size();
            Object obj2 = obj;
            int i12 = 0;
            while (i12 < size) {
                Pair<W2.d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i12);
                W2.d<? extends Object, ? extends Object> dVarA = pair.a();
                List<Pair<W2.d<? extends Object, ? extends Object>, Class<? extends Object>>> list2 = list;
                if (pair.b().isAssignableFrom(obj2.getClass())) {
                    i.c(dVarA, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                    Object objA = dVarA.a(obj2, kVarC);
                    if (objA != null) {
                        obj2 = objA;
                    }
                }
                i12++;
                list = list2;
            }
            X2.b.a aVarB = cVar.b(gVar, obj2, kVarC, bVar2);
            X2.b.C0101b c0101bA = aVarB != null ? cVar.a(gVar, aVarB, eVar, scale) : null;
            if (c0101bA != null) {
                return X2.c.c(dVar2, gVar, aVarB, c0101bA);
            }
            AbstractC2712w abstractC2712w = gVar.f23065u;
            EngineInterceptor$intercept$2 engineInterceptor$intercept$3 = new EngineInterceptor$intercept$2(this, gVar, obj2, kVarC, bVar2, aVarB, dVar, null);
            engineInterceptor$intercept$2.L$0 = this;
            engineInterceptor$intercept$2.L$1 = dVar2;
            engineInterceptor$intercept$2.label = 1;
            objF = C2680e.f(abstractC2712w, engineInterceptor$intercept$3, engineInterceptor$intercept$2);
            return objF == coroutineSingletons ? coroutineSingletons : objF;
        } catch (Throwable th2) {
            th = th2;
            bVar = this;
            aVar = dVar2;
            if (!(th instanceof CancellationException)) {
                throw th;
            }
            n nVar2 = bVar.f22995c;
            return n.a(aVar.c(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e0 -> B:29:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(coil.a r20, coil.request.g r21, java.lang.Object r22, coil.request.k r23, coil.b r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.b.d(coil.a, coil.request.g, java.lang.Object, coil.request.k, coil.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
