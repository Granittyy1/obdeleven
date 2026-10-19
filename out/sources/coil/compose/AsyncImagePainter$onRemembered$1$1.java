package coil.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.InterfaceC1161g;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: AsyncImagePainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", l = {308}, m = "invokeSuspend")
public final class AsyncImagePainter$onRemembered$1$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    @Aa.c(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", l = {307}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<coil.request.g, kotlin.coroutines.c<? super AsyncImagePainter.a>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AsyncImagePainter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AsyncImagePainter asyncImagePainter, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = asyncImagePainter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(coil.request.g gVar, kotlin.coroutines.c<? super AsyncImagePainter.a> cVar) {
            return ((AnonymousClass2) create(gVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AsyncImagePainter asyncImagePainter;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                coil.request.g gVar = (coil.request.g) this.L$0;
                AsyncImagePainter asyncImagePainter2 = this.this$0;
                coil.f fVar = (coil.f) asyncImagePainter2.f22726u.getValue();
                AsyncImagePainter asyncImagePainter3 = this.this$0;
                asyncImagePainter3.getClass();
                coil.request.g.a aVarA = coil.request.g.a(gVar);
                aVarA.f23075d = new e(asyncImagePainter3);
                aVarA.d();
                coil.request.c cVar = gVar.f23044F;
                if (cVar.f23027a == null) {
                    aVarA.f23093w = new W4.b(asyncImagePainter3);
                    aVarA.d();
                }
                if (cVar.f23028b == null) {
                    InterfaceC1161g interfaceC1161g = asyncImagePainter3.f22721p;
                    Z2.c cVar2 = y.f22840b;
                    aVarA.f23094x = (kotlin.jvm.internal.i.a(interfaceC1161g, InterfaceC1161g.a.f14244b) || kotlin.jvm.internal.i.a(interfaceC1161g, InterfaceC1161g.a.f14247e)) ? Scale.f23144c : Scale.f23143b;
                }
                if (cVar.f23033g != Precision.f23139b) {
                    aVarA.f23079h = Precision.f23140c;
                }
                coil.request.g gVarA = aVarA.a();
                this.L$0 = asyncImagePainter2;
                this.label = 1;
                obj = fVar.c(gVarA, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                asyncImagePainter = asyncImagePainter2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncImagePainter = (AsyncImagePainter) this.L$0;
                kotlin.b.b(obj);
            }
            coil.request.h hVar = (coil.request.h) obj;
            asyncImagePainter.getClass();
            if (hVar instanceof coil.request.o) {
                coil.request.o oVar = (coil.request.o) hVar;
                return new AsyncImagePainter.a.d(asyncImagePainter.j(oVar.f23120a), oVar);
            }
            if (!(hVar instanceof coil.request.e)) {
                throw new NoWhenBranchMatchedException();
            }
            coil.request.e eVar = (coil.request.e) hVar;
            Drawable drawable = eVar.f23034a;
            return new AsyncImagePainter.a.b(drawable != null ? asyncImagePainter.j(drawable) : null, eVar);
        }
    }

    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    public /* synthetic */ class a implements InterfaceC2687d, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AsyncImagePainter f22733b;

        public a(AsyncImagePainter asyncImagePainter) {
            this.f22733b = asyncImagePainter;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return new AdaptedFunctionReference(2, this.f22733b, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.f22733b.k((AsyncImagePainter.a) obj);
            p293xa.r rVar = p293xa.r.f47939a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            return rVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2687d) && (obj instanceof kotlin.jvm.internal.f)) {
                return b().equals(((kotlin.jvm.internal.f) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1$1(AsyncImagePainter asyncImagePainter, kotlin.coroutines.c<? super AsyncImagePainter$onRemembered$1$1> cVar) {
        super(2, cVar);
        this.this$0 = asyncImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AsyncImagePainter$onRemembered$1$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AsyncImagePainter$onRemembered$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestM = C2688e.m(new AnonymousClass2(this.this$0, null), J0.j(new P9.b(1, this.this$0)));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (channelFlowTransformLatestM.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
