package coil;

import Ia.p;
import android.graphics.Bitmap;
import coil.request.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {196}, m = "invokeSuspend")
final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super h>, Object> {
    final /* synthetic */ b $eventListener;
    final /* synthetic */ Bitmap $placeholderBitmap;
    final /* synthetic */ coil.request.g $request;
    final /* synthetic */ Z2.e $size;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(coil.request.g gVar, RealImageLoader realImageLoader, Z2.e eVar, b bVar, Bitmap bitmap, kotlin.coroutines.c<? super RealImageLoader$executeMain$result$1> cVar) {
        super(2, cVar);
        this.$request = gVar;
        this.this$0 = realImageLoader;
        this.$size = eVar;
        this.$eventListener = bVar;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super h> cVar) {
        return ((RealImageLoader$executeMain$result$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            coil.request.g gVar = this.$request;
            coil.intercept.d dVar = new coil.intercept.d(gVar, this.this$0.f22697h, 0, gVar, this.$size, this.$eventListener, this.$placeholderBitmap != null);
            this.label = 1;
            obj = dVar.b(gVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
