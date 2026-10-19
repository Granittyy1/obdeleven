package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.node.C1185f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", l = {1456}, m = "invokeSuspend")
public final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, kotlin.coroutines.c<? super ClockDialNode$pointerInputDragNode$1> cVar) {
        super(2, cVar);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, cVar);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ClockDialNode$pointerInputDragNode$1) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.w wVar = (androidx.compose.ui.input.pointer.w) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: TimePicker.kt */
                @Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1462}, m = "invokeSuspend")
                final class C01461 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01461(ClockDialNode clockDialNode, kotlin.coroutines.c<? super C01461> cVar) {
                        super(2, cVar);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new C01461(this.this$0, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((C01461) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.b.b(obj);
                            ClockDialNode clockDialNode = this.this$0;
                            if (clockDialNode.f12080s) {
                                clockDialNode.f12079r.f(1);
                            }
                            C1047b c1047b = this.this$0.f12079r;
                            this.label = 1;
                            Object objB = c1047b.f12423e.b(MutatePriority.f9812d, new AnalogTimePickerState$onGestureEnd$2(c1047b, c1047b.j(k0.a(c1047b.f12419a.g(), 0) ? c1047b.f12420b : c1047b.f12421c), null), this);
                            if (objB != coroutineSingletons) {
                                objB = p293xa.r.f47939a;
                            }
                            if (objB == coroutineSingletons) {
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
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    C2680e.c(clockDialNode.E1(), null, null, new C01461(clockDialNode, null), 3);
                    return p293xa.r.f47939a;
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r> pVar = new Ia.p<androidx.compose.ui.input.pointer.q, I.d, p293xa.r>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                /* JADX INFO: renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: TimePicker.kt */
                @Aa.c(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1469}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, cVar);
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
                            ClockDialNode clockDialNode = this.this$0;
                            clockDialNode.f12082u = I.d.d(this.$dragAmount) + clockDialNode.f12082u;
                            ClockDialNode clockDialNode2 = this.this$0;
                            clockDialNode2.f12083v = I.d.e(this.$dragAmount) + clockDialNode2.f12083v;
                            ClockDialNode clockDialNode3 = this.this$0;
                            C1047b c1047b = clockDialNode3.f12079r;
                            float f10 = clockDialNode3.f12083v;
                            long j = clockDialNode3.f12084w;
                            float f11 = f10 - ((int) (4294967295L & j));
                            float f12 = clockDialNode3.f12082u - ((int) (j >> 32));
                            float f13 = TimePickerKt.f12386a;
                            float fAtan2 = ((float) Math.atan2(f11, f12)) - 1.5707964f;
                            if (fAtan2 < 0.0f) {
                                fAtan2 += 6.2831855f;
                            }
                            this.label = 1;
                            c1047b.getClass();
                            Object objB = c1047b.f12423e.b(MutatePriority.f9811c, new AnalogTimePickerState$rotateTo$2(c1047b, fAtan2, false, null), this);
                            if (objB != coroutineSingletons) {
                                objB = p293xa.r.f47939a;
                            }
                            if (objB == coroutineSingletons) {
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
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(androidx.compose.ui.input.pointer.q qVar, I.d dVar) {
                    C2680e.c(clockDialNode2.E1(), null, null, new AnonymousClass1(clockDialNode2, dVar.f3754a, null), 3);
                    ClockDialNode clockDialNode3 = clockDialNode2;
                    TimePickerKt.r(clockDialNode3.f12079r, clockDialNode3.f12082u, clockDialNode3.f12083v, C1185f.f(clockDialNode3).f14423z.T0(TimePickerKt.f12391f), clockDialNode2.f12084w);
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (androidx.compose.foundation.gestures.g.c(wVar, new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                @Override // Ia.l
                public final /* synthetic */ p293xa.r invoke(I.d dVar) {
                    long j = dVar.f3754a;
                    return p293xa.r.f47939a;
                }
            }, aVar, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                @Override // Ia.a
                public final /* bridge */ /* synthetic */ p293xa.r invoke() {
                    return p293xa.r.f47939a;
                }
            }, pVar, this) == coroutineSingletons) {
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
