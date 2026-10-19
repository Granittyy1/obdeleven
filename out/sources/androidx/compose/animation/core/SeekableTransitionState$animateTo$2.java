package androidx.compose.animation.core;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {599}, m = "invokeSuspend")
final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC0923x<Float> $animationSpec;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ Transition<Object> $transition;
    int label;
    final /* synthetic */ SeekableTransitionState<Object> this$0;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @Aa.c(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2147, 612, 614, 668, 670}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ InterfaceC0923x<Float> $animationSpec;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ Transition<Object> $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SeekableTransitionState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC0923x interfaceC0923x, SeekableTransitionState seekableTransitionState, Transition transition, Object obj, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.this$0 = seekableTransitionState;
            this.$targetState = obj;
            this.$transition = transition;
            this.$animationSpec = interfaceC0923x;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            SeekableTransitionState<Object> seekableTransitionState = this.this$0;
            Object obj2 = this.$targetState;
            return new AnonymousClass1(this.$animationSpec, seekableTransitionState, this.$transition, obj2, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:48:0x0101  */
        /* JADX WARN: Code duplicated, block: B:50:0x0104  */
        /* JADX WARN: Code duplicated, block: B:52:0x010c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:53:0x010e  */
        /* JADX WARN: Code duplicated, block: B:54:0x0112  */
        /* JADX WARN: Code duplicated, block: B:56:0x0115  */
        /* JADX WARN: Code duplicated, block: B:58:0x011d  */
        /* JADX WARN: Code duplicated, block: B:60:0x012d  */
        /* JADX WARN: Code duplicated, block: B:61:0x012f  */
        /* JADX WARN: Code duplicated, block: B:71:0x0154  */
        /* JADX WARN: Code duplicated, block: B:73:0x0158  */
        /* JADX WARN: Code duplicated, block: B:76:0x0185  */
        /* JADX WARN: Code duplicated, block: B:77:0x018c  */
        /* JADX WARN: Code duplicated, block: B:81:0x01b0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:84:0x01c2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SeekableTransitionState<Object> seekableTransitionState;
            kotlinx.coroutines.sync.a aVar;
            Object objK;
            SeekableTransitionState<Object> seekableTransitionState2;
            SeekableTransitionState<Object> seekableTransitionState3;
            SeekableTransitionState.a aVar2;
            InterfaceC0923x<Float> interfaceC0923x;
            j0 j0VarB;
            j0 j0Var;
            C0909i c0909i;
            C0909i c0909i2;
            SeekableTransitionState<Object> seekableTransitionState4;
            long j;
            long jC;
            C0909i c0909i3;
            SeekableTransitionState<Object> seekableTransitionState5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        seekableTransitionState = (SeekableTransitionState) this.L$1;
                        aVar = (kotlinx.coroutines.sync.a) this.L$0;
                        kotlin.b.b(obj);
                    } else {
                        if (i10 == 2) {
                            kotlin.b.b(obj);
                            seekableTransitionState2 = this.this$0;
                            this.label = 3;
                            if (SeekableTransitionState.j(seekableTransitionState2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (!kotlin.jvm.internal.i.a(this.this$0.f9406c.getValue(), this.$targetState)) {
                                if (this.this$0.f9411h.j() < 1.0f) {
                                    aVar2 = this.this$0.f9416n;
                                    interfaceC0923x = this.$animationSpec;
                                    if (interfaceC0923x != null) {
                                        e0 e0Var = VectorConvertersKt.f9477a;
                                        j0VarB = interfaceC0923x.b();
                                    } else {
                                        j0VarB = null;
                                    }
                                    if (aVar2 != null) {
                                        if (aVar2 != null) {
                                            j0Var = aVar2.f9421b;
                                        } else {
                                            j0Var = null;
                                        }
                                        if (j0Var != null) {
                                            long j10 = aVar2.f9420a;
                                            C0909i c0909i4 = SeekableTransitionState.f9404s;
                                            c0909i3 = aVar2.f9425f;
                                            if (c0909i3 == null) {
                                                c0909i3 = SeekableTransitionState.f9403r;
                                            }
                                            c0909i = (C0909i) j0Var.c(j10, aVar2.f9424e, c0909i4, c0909i3);
                                        } else if (aVar2 != null) {
                                            c0909i = SeekableTransitionState.f9403r;
                                        } else {
                                            c0909i = SeekableTransitionState.f9403r;
                                        }
                                        if (aVar2 == null) {
                                            aVar2 = new SeekableTransitionState.a();
                                        }
                                        aVar2.f9421b = j0VarB;
                                        aVar2.f9422c = false;
                                        aVar2.f9423d = this.this$0.f9411h.j();
                                        float fJ = this.this$0.f9411h.j();
                                        c0909i2 = aVar2.f9424e;
                                        c0909i2.e(fJ, 0);
                                        seekableTransitionState4 = this.this$0;
                                        j = seekableTransitionState4.f9409f;
                                        aVar2.f9426g = j;
                                        aVar2.f9420a = 0L;
                                        aVar2.f9425f = c0909i;
                                        if (j0VarB != null) {
                                            jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                                        } else {
                                            jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                                        }
                                        aVar2.f9427h = jC;
                                        this.this$0.f9416n = aVar2;
                                    } else {
                                        if (aVar2 != null) {
                                            j0Var = aVar2.f9421b;
                                        } else {
                                            j0Var = null;
                                        }
                                        if (j0Var != null) {
                                            long j11 = aVar2.f9420a;
                                            C0909i c0909i5 = SeekableTransitionState.f9404s;
                                            c0909i3 = aVar2.f9425f;
                                            if (c0909i3 == null) {
                                                c0909i3 = SeekableTransitionState.f9403r;
                                            }
                                            c0909i = (C0909i) j0Var.c(j11, aVar2.f9424e, c0909i5, c0909i3);
                                        } else if (aVar2 != null) {
                                            c0909i = SeekableTransitionState.f9403r;
                                        } else {
                                            c0909i = SeekableTransitionState.f9403r;
                                        }
                                        if (aVar2 == null) {
                                            aVar2 = new SeekableTransitionState.a();
                                        }
                                        aVar2.f9421b = j0VarB;
                                        aVar2.f9422c = false;
                                        aVar2.f9423d = this.this$0.f9411h.j();
                                        float fJ2 = this.this$0.f9411h.j();
                                        c0909i2 = aVar2.f9424e;
                                        c0909i2.e(fJ2, 0);
                                        seekableTransitionState4 = this.this$0;
                                        j = seekableTransitionState4.f9409f;
                                        aVar2.f9426g = j;
                                        aVar2.f9420a = 0L;
                                        aVar2.f9425f = c0909i;
                                        if (j0VarB != null) {
                                            jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                                        } else {
                                            jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                                        }
                                        aVar2.f9427h = jC;
                                        this.this$0.f9416n = aVar2;
                                    }
                                }
                                seekableTransitionState3 = this.this$0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 4;
                                if (SeekableTransitionState.h(seekableTransitionState3, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                this.this$0.c(this.$targetState);
                                seekableTransitionState5 = this.this$0;
                                this.label = 5;
                                if (SeekableTransitionState.i(seekableTransitionState5, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                        if (i10 == 3) {
                            kotlin.b.b(obj);
                            if (!kotlin.jvm.internal.i.a(this.this$0.f9406c.getValue(), this.$targetState)) {
                                if (this.this$0.f9411h.j() < 1.0f) {
                                    aVar2 = this.this$0.f9416n;
                                    interfaceC0923x = this.$animationSpec;
                                    if (interfaceC0923x != null) {
                                        e0 e0Var2 = VectorConvertersKt.f9477a;
                                        j0VarB = interfaceC0923x.b();
                                    } else {
                                        j0VarB = null;
                                    }
                                    if (aVar2 != null || !kotlin.jvm.internal.i.a(j0VarB, aVar2.f9421b)) {
                                        if (aVar2 != null) {
                                            j0Var = aVar2.f9421b;
                                        } else {
                                            j0Var = null;
                                        }
                                        if (j0Var != null) {
                                            long j12 = aVar2.f9420a;
                                            C0909i c0909i6 = SeekableTransitionState.f9404s;
                                            c0909i3 = aVar2.f9425f;
                                            if (c0909i3 == null) {
                                                c0909i3 = SeekableTransitionState.f9403r;
                                            }
                                            c0909i = (C0909i) j0Var.c(j12, aVar2.f9424e, c0909i6, c0909i3);
                                        } else if (aVar2 != null || aVar2.f9420a == 0) {
                                            c0909i = SeekableTransitionState.f9403r;
                                        } else {
                                            long j13 = aVar2.f9426g;
                                            if (j13 == Long.MIN_VALUE) {
                                                j13 = this.this$0.f9409f;
                                            }
                                            float f10 = j13 / 1.0E9f;
                                            c0909i = f10 <= 0.0f ? SeekableTransitionState.f9403r : new C0909i(1.0f / f10);
                                        }
                                        if (aVar2 == null) {
                                            aVar2 = new SeekableTransitionState.a();
                                        }
                                        aVar2.f9421b = j0VarB;
                                        aVar2.f9422c = false;
                                        aVar2.f9423d = this.this$0.f9411h.j();
                                        float fJ3 = this.this$0.f9411h.j();
                                        c0909i2 = aVar2.f9424e;
                                        c0909i2.e(fJ3, 0);
                                        seekableTransitionState4 = this.this$0;
                                        j = seekableTransitionState4.f9409f;
                                        aVar2.f9426g = j;
                                        aVar2.f9420a = 0L;
                                        aVar2.f9425f = c0909i;
                                        if (j0VarB != null) {
                                            jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                                        } else {
                                            jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                                        }
                                        aVar2.f9427h = jC;
                                        this.this$0.f9416n = aVar2;
                                    }
                                }
                                seekableTransitionState3 = this.this$0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 4;
                                if (SeekableTransitionState.h(seekableTransitionState3, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                this.this$0.c(this.$targetState);
                                seekableTransitionState5 = this.this$0;
                                this.label = 5;
                                if (SeekableTransitionState.i(seekableTransitionState5, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                        if (i10 == 4) {
                            kotlin.b.b(obj);
                            this.this$0.c(this.$targetState);
                            seekableTransitionState5 = this.this$0;
                            this.label = 5;
                            if (SeekableTransitionState.i(seekableTransitionState5, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                        }
                    }
                    SeekableTransitionState<Object> seekableTransitionState6 = this.this$0;
                    C0909i c0909i7 = SeekableTransitionState.f9403r;
                    seekableTransitionState6.p(0.0f);
                    return p293xa.r.f47939a;
                }
                kotlin.b.b(obj);
                Object value = this.this$0.f9405b.getValue();
                if (!kotlin.jvm.internal.i.a(this.$targetState, value)) {
                    SeekableTransitionState.f(this.this$0);
                    this.this$0.p(0.0f);
                    this.$transition.p(this.$targetState);
                    this.$transition.n(0L);
                    this.this$0.c(value);
                    this.this$0.f9405b.setValue(this.$targetState);
                }
                seekableTransitionState = this.this$0;
                MutexImpl mutexImpl = seekableTransitionState.j;
                this.L$0 = mutexImpl;
                this.L$1 = seekableTransitionState;
                this.label = 1;
                if (mutexImpl.f(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = mutexImpl;
                Object obj2 = seekableTransitionState.f9407d;
                aVar.g(null);
                if (!kotlin.jvm.internal.i.a(this.$targetState, obj2)) {
                    SeekableTransitionState<Object> seekableTransitionState7 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (seekableTransitionState7.f9414l == Long.MIN_VALUE) {
                        objK = androidx.compose.runtime.P.a(getContext()).P0(seekableTransitionState7.f9417o, this);
                        if (objK != coroutineSingletons) {
                            objK = p293xa.r.f47939a;
                        }
                    } else {
                        objK = seekableTransitionState7.k(this);
                        if (objK != coroutineSingletons) {
                            objK = p293xa.r.f47939a;
                        }
                    }
                    if (objK == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    seekableTransitionState2 = this.this$0;
                    this.label = 3;
                    if (SeekableTransitionState.j(seekableTransitionState2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (!kotlin.jvm.internal.i.a(this.this$0.f9406c.getValue(), this.$targetState)) {
                        if (this.this$0.f9411h.j() < 1.0f) {
                            aVar2 = this.this$0.f9416n;
                            interfaceC0923x = this.$animationSpec;
                            if (interfaceC0923x != null) {
                                e0 e0Var3 = VectorConvertersKt.f9477a;
                                j0VarB = interfaceC0923x.b();
                            } else {
                                j0VarB = null;
                            }
                            if (aVar2 != null) {
                                if (aVar2 != null) {
                                    j0Var = aVar2.f9421b;
                                } else {
                                    j0Var = null;
                                }
                                if (j0Var != null) {
                                    long j14 = aVar2.f9420a;
                                    C0909i c0909i8 = SeekableTransitionState.f9404s;
                                    c0909i3 = aVar2.f9425f;
                                    if (c0909i3 == null) {
                                        c0909i3 = SeekableTransitionState.f9403r;
                                    }
                                    c0909i = (C0909i) j0Var.c(j14, aVar2.f9424e, c0909i8, c0909i3);
                                } else if (aVar2 != null) {
                                    c0909i = SeekableTransitionState.f9403r;
                                } else {
                                    c0909i = SeekableTransitionState.f9403r;
                                }
                                if (aVar2 == null) {
                                    aVar2 = new SeekableTransitionState.a();
                                }
                                aVar2.f9421b = j0VarB;
                                aVar2.f9422c = false;
                                aVar2.f9423d = this.this$0.f9411h.j();
                                float fJ4 = this.this$0.f9411h.j();
                                c0909i2 = aVar2.f9424e;
                                c0909i2.e(fJ4, 0);
                                seekableTransitionState4 = this.this$0;
                                j = seekableTransitionState4.f9409f;
                                aVar2.f9426g = j;
                                aVar2.f9420a = 0L;
                                aVar2.f9425f = c0909i;
                                if (j0VarB != null) {
                                    jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                                } else {
                                    jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                                }
                                aVar2.f9427h = jC;
                                this.this$0.f9416n = aVar2;
                            } else {
                                if (aVar2 != null) {
                                    j0Var = aVar2.f9421b;
                                } else {
                                    j0Var = null;
                                }
                                if (j0Var != null) {
                                    long j15 = aVar2.f9420a;
                                    C0909i c0909i9 = SeekableTransitionState.f9404s;
                                    c0909i3 = aVar2.f9425f;
                                    if (c0909i3 == null) {
                                        c0909i3 = SeekableTransitionState.f9403r;
                                    }
                                    c0909i = (C0909i) j0Var.c(j15, aVar2.f9424e, c0909i9, c0909i3);
                                } else if (aVar2 != null) {
                                    c0909i = SeekableTransitionState.f9403r;
                                } else {
                                    c0909i = SeekableTransitionState.f9403r;
                                }
                                if (aVar2 == null) {
                                    aVar2 = new SeekableTransitionState.a();
                                }
                                aVar2.f9421b = j0VarB;
                                aVar2.f9422c = false;
                                aVar2.f9423d = this.this$0.f9411h.j();
                                float fJ5 = this.this$0.f9411h.j();
                                c0909i2 = aVar2.f9424e;
                                c0909i2.e(fJ5, 0);
                                seekableTransitionState4 = this.this$0;
                                j = seekableTransitionState4.f9409f;
                                aVar2.f9426g = j;
                                aVar2.f9420a = 0L;
                                aVar2.f9425f = c0909i;
                                if (j0VarB != null) {
                                    jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                                } else {
                                    jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                                }
                                aVar2.f9427h = jC;
                                this.this$0.f9416n = aVar2;
                            }
                        }
                        seekableTransitionState3 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (SeekableTransitionState.h(seekableTransitionState3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.this$0.c(this.$targetState);
                        seekableTransitionState5 = this.this$0;
                        this.label = 5;
                        if (SeekableTransitionState.i(seekableTransitionState5, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        SeekableTransitionState<Object> seekableTransitionState8 = this.this$0;
                        C0909i c0909i10 = SeekableTransitionState.f9403r;
                        seekableTransitionState8.p(0.0f);
                    }
                } else if (!kotlin.jvm.internal.i.a(this.this$0.f9406c.getValue(), this.$targetState)) {
                    if (this.this$0.f9411h.j() < 1.0f) {
                        aVar2 = this.this$0.f9416n;
                        interfaceC0923x = this.$animationSpec;
                        if (interfaceC0923x != null) {
                            e0 e0Var4 = VectorConvertersKt.f9477a;
                            j0VarB = interfaceC0923x.b();
                        } else {
                            j0VarB = null;
                        }
                        if (aVar2 != null) {
                            if (aVar2 != null) {
                                j0Var = aVar2.f9421b;
                            } else {
                                j0Var = null;
                            }
                            if (j0Var != null) {
                                long j16 = aVar2.f9420a;
                                C0909i c0909i11 = SeekableTransitionState.f9404s;
                                c0909i3 = aVar2.f9425f;
                                if (c0909i3 == null) {
                                    c0909i3 = SeekableTransitionState.f9403r;
                                }
                                c0909i = (C0909i) j0Var.c(j16, aVar2.f9424e, c0909i11, c0909i3);
                            } else if (aVar2 != null) {
                                c0909i = SeekableTransitionState.f9403r;
                            } else {
                                c0909i = SeekableTransitionState.f9403r;
                            }
                            if (aVar2 == null) {
                                aVar2 = new SeekableTransitionState.a();
                            }
                            aVar2.f9421b = j0VarB;
                            aVar2.f9422c = false;
                            aVar2.f9423d = this.this$0.f9411h.j();
                            float fJ6 = this.this$0.f9411h.j();
                            c0909i2 = aVar2.f9424e;
                            c0909i2.e(fJ6, 0);
                            seekableTransitionState4 = this.this$0;
                            j = seekableTransitionState4.f9409f;
                            aVar2.f9426g = j;
                            aVar2.f9420a = 0L;
                            aVar2.f9425f = c0909i;
                            if (j0VarB != null) {
                                jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                            } else {
                                jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                            }
                            aVar2.f9427h = jC;
                            this.this$0.f9416n = aVar2;
                        } else {
                            if (aVar2 != null) {
                                j0Var = aVar2.f9421b;
                            } else {
                                j0Var = null;
                            }
                            if (j0Var != null) {
                                long j17 = aVar2.f9420a;
                                C0909i c0909i12 = SeekableTransitionState.f9404s;
                                c0909i3 = aVar2.f9425f;
                                if (c0909i3 == null) {
                                    c0909i3 = SeekableTransitionState.f9403r;
                                }
                                c0909i = (C0909i) j0Var.c(j17, aVar2.f9424e, c0909i12, c0909i3);
                            } else if (aVar2 != null) {
                                c0909i = SeekableTransitionState.f9403r;
                            } else {
                                c0909i = SeekableTransitionState.f9403r;
                            }
                            if (aVar2 == null) {
                                aVar2 = new SeekableTransitionState.a();
                            }
                            aVar2.f9421b = j0VarB;
                            aVar2.f9422c = false;
                            aVar2.f9423d = this.this$0.f9411h.j();
                            float fJ7 = this.this$0.f9411h.j();
                            c0909i2 = aVar2.f9424e;
                            c0909i2.e(fJ7, 0);
                            seekableTransitionState4 = this.this$0;
                            j = seekableTransitionState4.f9409f;
                            aVar2.f9426g = j;
                            aVar2.f9420a = 0L;
                            aVar2.f9425f = c0909i;
                            if (j0VarB != null) {
                                jC = j0VarB.b(c0909i2, SeekableTransitionState.f9404s, c0909i);
                            } else {
                                jC = Ka.a.c((1.0d - ((double) seekableTransitionState4.f9411h.j())) * j);
                            }
                            aVar2.f9427h = jC;
                            this.this$0.f9416n = aVar2;
                        }
                    }
                    seekableTransitionState3 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (SeekableTransitionState.h(seekableTransitionState3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.this$0.c(this.$targetState);
                    seekableTransitionState5 = this.this$0;
                    this.label = 5;
                    if (SeekableTransitionState.i(seekableTransitionState5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    SeekableTransitionState<Object> seekableTransitionState9 = this.this$0;
                    C0909i c0909i13 = SeekableTransitionState.f9403r;
                    seekableTransitionState9.p(0.0f);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                aVar.g(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(InterfaceC0923x interfaceC0923x, SeekableTransitionState seekableTransitionState, Transition transition, Object obj, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.$transition = transition;
        this.this$0 = seekableTransitionState;
        this.$targetState = obj;
        this.$animationSpec = interfaceC0923x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        Transition<Object> transition = this.$transition;
        return new SeekableTransitionState$animateTo$2(this.$animationSpec, this.this$0, transition, this.$targetState, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SeekableTransitionState$animateTo$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SeekableTransitionState<Object> seekableTransitionState = this.this$0;
            Object obj2 = this.$targetState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationSpec, seekableTransitionState, this.$transition, obj2, null);
            this.label = 1;
            if (kotlinx.coroutines.B.d(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$transition.i();
        return p293xa.r.f47939a;
    }
}
