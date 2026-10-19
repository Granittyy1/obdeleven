package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0910j;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {85}, m = "invokeSuspend")
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Animatable<I.d, C0910j> $animatable;
    final /* synthetic */ N0<I.d> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<I.d, C0910j> f11547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f11548c;

        public a(Animatable<I.d, C0910j> animatable, A a10) {
            this.f11547b = animatable;
            this.f11548c = a10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            long j = ((I.d) obj).f3754a;
            Animatable<I.d, C0910j> animatable = this.f11547b;
            if ((animatable.d().f3754a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (animatable.d().f3754a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                Object objE = animatable.e(new I.d(j), cVar);
                return objE == CoroutineSingletons.f43038b ? objE : p293xa.r.f47939a;
            }
            C2680e.c(this.f11548c, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(animatable, j, null), 3);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(N0<I.d> n10, Animatable<I.d, C0910j> animatable, kotlin.coroutines.c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> cVar) {
        super(2, cVar);
        this.$targetValue$delegate = n10;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A a10 = (A) this.L$0;
            final N0<I.d> n10 = this.$targetValue$delegate;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a<I.d>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final I.d invoke() {
                    N0<I.d> n11 = n10;
                    C0910j c0910j = SelectionMagnifierKt.f11541a;
                    return new I.d(n11.getValue().f3754a);
                }
            });
            a aVar = new a(this.$animatable, a10);
            this.label = 1;
            if (tVarJ.collect(aVar, this) == coroutineSingletons) {
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
