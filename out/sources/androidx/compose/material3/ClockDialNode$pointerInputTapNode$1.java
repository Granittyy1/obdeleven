package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.node.C1185f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", f = "TimePicker.kt", l = {1439}, m = "invokeSuspend")
public final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.q<androidx.compose.foundation.gestures.p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClockDialNode clockDialNode, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.this$0 = clockDialNode;
        }

        @Override // Ia.q
        public final Object invoke(androidx.compose.foundation.gestures.p pVar, I.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            long j = dVar.f3754a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            long j = this.J$0;
            this.this$0.f12082u = I.d.d(j);
            this.this$0.f12083v = I.d.e(j);
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, kotlin.coroutines.c<? super ClockDialNode$pointerInputTapNode$1> cVar) {
        super(2, cVar);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, cVar);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ClockDialNode$pointerInputTapNode$1) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.w wVar = (androidx.compose.ui.input.pointer.w) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            final ClockDialNode clockDialNode = this.this$0;
            Ia.l<I.d, p293xa.r> lVar = new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: TimePicker.kt */
                @Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1446}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    final /* synthetic */ long $it;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = clockDialNode;
                        this.$it = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, this.$it, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.b.b(obj);
                            C1047b c1047b = this.this$0.f12079r;
                            float fD = I.d.d(this.$it);
                            float fE = I.d.e(this.$it);
                            ClockDialNode clockDialNode = this.this$0;
                            clockDialNode.getClass();
                            float fT0 = C1185f.f(clockDialNode).f14423z.T0(TimePickerKt.f12391f);
                            ClockDialNode clockDialNode2 = this.this$0;
                            boolean z10 = clockDialNode2.f12080s;
                            long j = clockDialNode2.f12084w;
                            this.label = 1;
                            if (TimePickerKt.p(c1047b, fD, fE, fT0, z10, j, this) == coroutineSingletons) {
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

                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(I.d dVar) {
                    C2680e.c(clockDialNode.E1(), null, null, new AnonymousClass1(clockDialNode, dVar.f3754a, null), 3);
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.f(wVar, null, anonymousClass1, lVar, this, 3) == coroutineSingletons) {
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
