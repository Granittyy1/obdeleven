package coil.intercept;

import Ia.p;
import coil.request.g;
import coil.request.k;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
final class EngineInterceptor$transform$3 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super b.a>, Object> {
    final /* synthetic */ coil.b $eventListener;
    final /* synthetic */ k $options;
    final /* synthetic */ g $request;
    final /* synthetic */ b.a $result;
    final /* synthetic */ List<p016b3.d> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EngineInterceptor$transform$3(b bVar, b.a aVar, k kVar, List<? extends p016b3.d> list, coil.b bVar2, g gVar, kotlin.coroutines.c<? super EngineInterceptor$transform$3> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$result = aVar;
        this.$options = kVar;
        this.$transformations = list;
        this.$eventListener = bVar2;
        this.$request = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, cVar);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super b.a> cVar) {
        return ((EngineInterceptor$transform$3) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:22:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            int r1 = r10.I$1
            int r3 = r10.I$0
            java.lang.Object r4 = r10.L$2
            coil.request.k r4 = (coil.request.k) r4
            java.lang.Object r5 = r10.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.A r6 = (kotlinx.coroutines.A) r6
            kotlin.b.b(r11)
            goto L94
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.A r11 = (kotlinx.coroutines.A) r11
            coil.intercept.b r1 = r10.this$0
            coil.intercept.b$a r3 = r10.$result
            android.graphics.drawable.Drawable r3 = r3.f22997a
            coil.request.k r4 = r10.$options
            r1.getClass()
            boolean r1 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L54
            r1 = r3
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            android.graphics.Bitmap$Config r5 = r1.getConfig()
            if (r5 != 0) goto L4b
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L4b:
            android.graphics.Bitmap$Config[] r6 = coil.util.k.f23160a
            boolean r5 = kotlin.collections.k.M(r5, r6)
            if (r5 == 0) goto L54
            goto L60
        L54:
            android.graphics.Bitmap$Config r1 = r4.f23099b
            Z2.e r5 = r4.f23101d
            coil.size.Scale r6 = r4.f23102e
            boolean r4 = r4.f23103f
            android.graphics.Bitmap r1 = coil.util.p.a(r3, r1, r5, r6, r4)
        L60:
            coil.b r3 = r10.$eventListener
            r3.getClass()
            java.util.List<b3.d> r3 = r10.$transformations
            coil.request.k r4 = r10.$options
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r5
            r5 = r3
            r3 = r9
        L77:
            if (r3 >= r1) goto L9f
            java.lang.Object r7 = r5.get(r3)
            b3.d r7 = (p016b3.d) r7
            Z2.e r8 = r4.f23101d
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r4
            r10.I$0 = r3
            r10.I$1 = r1
            r10.label = r2
            java.lang.Object r11 = r7.transform(r11, r8, r10)
            if (r11 != r0) goto L94
            return r0
        L94:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            kotlin.coroutines.e r7 = r6.getCoroutineContext()
            kotlinx.coroutines.C2702l0.e(r7)
            int r3 = r3 + r2
            goto L77
        L9f:
            coil.b r0 = r10.$eventListener
            r0.getClass()
            coil.intercept.b$a r0 = r10.$result
            coil.request.g r1 = r10.$request
            android.content.Context r1 = r1.f23046a
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r1, r11)
            boolean r11 = r0.f22998b
            coil.intercept.b$a r1 = new coil.intercept.b$a
            coil.decode.DataSource r3 = r0.f22999c
            java.lang.String r0 = r0.f23000d
            r1.<init>(r2, r11, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
