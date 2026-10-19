package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
    final /* synthetic */ Ia.l<I.d, p293xa.r> $onTap;
    final /* synthetic */ q $pressScope;
    final /* synthetic */ androidx.compose.ui.input.pointer.w $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ A $$this$coroutineScope;
        final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
        final /* synthetic */ Ia.l<I.d, p293xa.r> $onTap;
        final /* synthetic */ q $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
        public static final class C01251 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ androidx.compose.ui.input.pointer.q $down;
            final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01251(Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, q qVar2, androidx.compose.ui.input.pointer.q qVar3, kotlin.coroutines.c<? super C01251> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = qVar2;
                this.$down = qVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C01251(this.$onPress, this.$pressScope, this.$down, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((C01251) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar = this.$onPress;
                    q qVar2 = this.$pressScope;
                    I.d dVar = new I.d(this.$down.f14102c);
                    this.label = 1;
                    if (qVar.invoke(qVar2, dVar, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass2(this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.$pressScope.c();
                return p293xa.r.f47939a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(q qVar, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass3(this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.$pressScope.o();
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(A a10, Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, Ia.l<? super I.d, p293xa.r> lVar, q qVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$coroutineScope = a10;
            this.$onPress = qVar;
            this.$onTap = lVar;
            this.$pressScope = qVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:24:0x008a  */
        /* JADX WARN: Code duplicated, block: B:26:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC2694i0 interfaceC2694i0C;
            InterfaceC1152c interfaceC1152c;
            InterfaceC2694i0 interfaceC2694i0;
            androidx.compose.ui.input.pointer.q qVar;
            Ia.l<I.d, p293xa.r> lVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC2694i0C = (InterfaceC2694i0) this.L$1;
                    interfaceC1152c = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                }
                qVar = (androidx.compose.ui.input.pointer.q) obj;
                if (qVar == null) {
                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
                } else {
                    qVar.a();
                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass3(this.$pressScope, null));
                    lVar = this.$onTap;
                    if (lVar != null) {
                        lVar.invoke(new I.d(qVar.f14102c));
                    }
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            InterfaceC1152c interfaceC1152c2 = (InterfaceC1152c) this.L$0;
            A a10 = this.$$this$coroutineScope;
            Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar2 = TapGestureDetectorKt.f9999a;
            interfaceC2694i0C = C2680e.c(a10, null, CoroutineStart.f43169e, new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.$pressScope, null), 1);
            this.L$0 = interfaceC1152c2;
            this.L$1 = interfaceC2694i0C;
            this.label = 1;
            Object objC = TapGestureDetectorKt.c(interfaceC1152c2, null, this, 3);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC1152c = interfaceC1152c2;
            obj = objC;
            androidx.compose.ui.input.pointer.q qVar3 = (androidx.compose.ui.input.pointer.q) obj;
            qVar3.a();
            Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar4 = this.$onPress;
            if (qVar4 != TapGestureDetectorKt.f9999a) {
                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new C01251(qVar4, this.$pressScope, qVar3, null));
            }
            this.L$0 = interfaceC2694i0C;
            this.L$1 = null;
            this.label = 2;
            obj = TapGestureDetectorKt.i(interfaceC1152c, PointerEventPass.f14030c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2694i0 = interfaceC2694i0C;
            qVar = (androidx.compose.ui.input.pointer.q) obj;
            if (qVar == null) {
                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
            } else {
                qVar.a();
                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass3(this.$pressScope, null));
                lVar = this.$onTap;
                if (lVar != null) {
                    lVar.invoke(new I.d(qVar.f14102c));
                }
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(androidx.compose.ui.input.pointer.w wVar, Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, Ia.l<? super I.d, p293xa.r> lVar, q qVar2, kotlin.coroutines.c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
        super(2, cVar);
        this.$this_detectTapAndPress = wVar;
        this.$onPress = qVar;
        this.$onTap = lVar;
        this.$pressScope = qVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, cVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A a10 = (A) this.L$0;
            androidx.compose.ui.input.pointer.w wVar = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(a10, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.b(wVar, anonymousClass1, this) == coroutineSingletons) {
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
