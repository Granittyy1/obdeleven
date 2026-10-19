package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1152c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.l<I.d, p293xa.r> $onDoubleTap;
    final /* synthetic */ Ia.l<I.d, p293xa.r> $onLongPress;
    final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
    final /* synthetic */ Ia.l<I.d, p293xa.r> $onTap;
    final /* synthetic */ androidx.compose.ui.input.pointer.w $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedWidthMajor, 149, 167, 169, 180}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<InterfaceC1152c, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ A $$this$coroutineScope;
        final /* synthetic */ Ia.l<I.d, p293xa.r> $onDoubleTap;
        final /* synthetic */ Ia.l<I.d, p293xa.r> $onLongPress;
        final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
        final /* synthetic */ Ia.l<I.d, p293xa.r> $onTap;
        final /* synthetic */ q $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textColorAlertDialogListItem}, m = "invokeSuspend")
        public static final class C01261 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ androidx.compose.ui.input.pointer.q $down;
            final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01261(Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, q qVar2, androidx.compose.ui.input.pointer.q qVar3, kotlin.coroutines.c<? super C01261> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = qVar2;
                this.$down = qVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C01261(this.$onPress, this.$pressScope, this.$down, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((C01261) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
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
                this.$pressScope.o();
                return p293xa.r.f47939a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
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
                this.$pressScope.c();
                return p293xa.r.f47939a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass4 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(q qVar, kotlin.coroutines.c<? super AnonymousClass4> cVar) {
                super(2, cVar);
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass4(this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
        public static final class AnonymousClass5 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ InterfaceC2694i0 $cancelOrReleaseJob;
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(InterfaceC2694i0 interfaceC2694i0, q qVar, kotlin.coroutines.c<? super AnonymousClass5> cVar) {
                super(2, cVar);
                this.$cancelOrReleaseJob = interfaceC2694i0;
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass5) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.b.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return p293xa.r.f47939a;
                }
                kotlin.b.b(obj);
                InterfaceC2694i0 interfaceC2694i0 = this.$cancelOrReleaseJob;
                this.label = 1;
                if (interfaceC2694i0.C(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                q qVar = this.$pressScope;
                this.label = 2;
                if (qVar.q(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return p293xa.r.f47939a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
        public static final class AnonymousClass6 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> $onPress;
            final /* synthetic */ q $pressScope;
            final /* synthetic */ androidx.compose.ui.input.pointer.q $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass6(Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, q qVar2, androidx.compose.ui.input.pointer.q qVar3, kotlin.coroutines.c<? super AnonymousClass6> cVar) {
                super(2, cVar);
                this.$onPress = qVar;
                this.$pressScope = qVar2;
                this.$secondDown = qVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass6) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar = this.$onPress;
                    q qVar2 = this.$pressScope;
                    I.d dVar = new I.d(this.$secondDown.f14102c);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass7 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(q qVar, kotlin.coroutines.c<? super AnonymousClass7> cVar) {
                super(2, cVar);
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass7(this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass7) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass8 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ q $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(q qVar, kotlin.coroutines.c<? super AnonymousClass8> cVar) {
                super(2, cVar);
                this.$pressScope = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass8(this.$pressScope, cVar);
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass8) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(A a10, Ia.q<? super p, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, Ia.l<? super I.d, p293xa.r> lVar, Ia.l<? super I.d, p293xa.r> lVar2, Ia.l<? super I.d, p293xa.r> lVar3, q qVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$coroutineScope = a10;
            this.$onPress = qVar;
            this.$onLongPress = lVar;
            this.$onDoubleTap = lVar2;
            this.$onTap = lVar3;
            this.$pressScope = qVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(InterfaceC1152c interfaceC1152c, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(interfaceC1152c, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x027a  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:37:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x010f  */
        /* JADX WARN: Code duplicated, block: B:41:0x011f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0123  */
        /* JADX WARN: Code duplicated, block: B:44:0x0128  */
        /* JADX WARN: Code duplicated, block: B:46:0x012c  */
        /* JADX WARN: Code duplicated, block: B:49:0x0130  */
        /* JADX WARN: Code duplicated, block: B:50:0x013e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0150  */
        /* JADX WARN: Code duplicated, block: B:54:0x0154  */
        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        /* JADX WARN: Code duplicated, block: B:57:0x0164  */
        /* JADX WARN: Code duplicated, block: B:59:0x0180 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x0181  */
        /* JADX WARN: Code duplicated, block: B:63:0x0189  */
        /* JADX WARN: Code duplicated, block: B:65:0x018d  */
        /* JADX WARN: Code duplicated, block: B:66:0x0199  */
        /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:71:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:73:0x01d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:78:0x01e9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:79:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:84:0x0217 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:85:0x0218  */
        /* JADX WARN: Code duplicated, block: B:88:0x0228  */
        /* JADX WARN: Code duplicated, block: B:90:0x022c  */
        /* JADX WARN: Code duplicated, block: B:91:0x0232  */
        /* JADX WARN: Code duplicated, block: B:93:0x0236  */
        /* JADX WARN: Code duplicated, block: B:95:0x023a  */
        /* JADX WARN: Code duplicated, block: B:96:0x0256  */
        /* JADX WARN: Code duplicated, block: B:98:0x0266  */
        /* JADX WARN: Code duplicated, block: B:99:0x0271  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC1152c interfaceC1152c;
            androidx.compose.ui.input.pointer.q qVar;
            InterfaceC2694i0 interfaceC2694i0C;
            Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar2;
            Object objH;
            androidx.compose.ui.input.pointer.q qVar3;
            InterfaceC1152c interfaceC1152c2;
            androidx.compose.ui.input.pointer.q qVar4;
            InterfaceC2694i0 interfaceC2694i0G;
            Object objZ0;
            androidx.compose.ui.input.pointer.q qVar5;
            InterfaceC1152c interfaceC1152c3;
            Ia.l<I.d, p293xa.r> lVar;
            k kVar;
            InterfaceC2694i0 interfaceC2694i0;
            androidx.compose.ui.input.pointer.q qVar6;
            InterfaceC2694i0 interfaceC2694i0C2;
            Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar7;
            Object objH2;
            androidx.compose.ui.input.pointer.q qVar8;
            androidx.compose.ui.input.pointer.q qVar9;
            androidx.compose.ui.input.pointer.q qVar10;
            Ia.l<I.d, p293xa.r> lVar2;
            androidx.compose.ui.input.pointer.q qVar11;
            Ia.l<I.d, p293xa.r> lVar3;
            androidx.compose.ui.input.pointer.q qVar12;
            k kVar2;
            InterfaceC2694i0 interfaceC2694i1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            switch (this.label) {
                case 0:
                    kotlin.b.b(obj);
                    InterfaceC1152c interfaceC1152c4 = (InterfaceC1152c) this.L$0;
                    this.L$0 = interfaceC1152c4;
                    this.label = 1;
                    Object objC = TapGestureDetectorKt.c(interfaceC1152c4, null, this, 3);
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC1152c = interfaceC1152c4;
                    obj = objC;
                    qVar = (androidx.compose.ui.input.pointer.q) obj;
                    qVar.a();
                    A a10 = this.$$this$coroutineScope;
                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar13 = TapGestureDetectorKt.f9999a;
                    interfaceC2694i0C = C2680e.c(a10, null, CoroutineStart.f43169e, new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.$pressScope, null), 1);
                    qVar2 = this.$onPress;
                    if (qVar2 != TapGestureDetectorKt.f9999a) {
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new C01261(qVar2, this.$pressScope, qVar, null));
                    }
                    if (this.$onLongPress == null) {
                        this.L$0 = interfaceC1152c;
                        this.L$1 = interfaceC2694i0C;
                        this.label = 2;
                        obj = TapGestureDetectorKt.i(interfaceC1152c, PointerEventPass.f14030c, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC1152c2 = interfaceC1152c;
                        qVar4 = (androidx.compose.ui.input.pointer.q) obj;
                        if (qVar4 == null) {
                            interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                        } else {
                            qVar4.a();
                            interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                        }
                        if (qVar4 != null) {
                            if (this.$onDoubleTap == null) {
                                lVar = this.$onTap;
                                if (lVar != null) {
                                    lVar.invoke(new I.d(qVar4.f14102c));
                                }
                            } else {
                                this.L$0 = interfaceC1152c2;
                                this.L$1 = qVar4;
                                this.L$2 = interfaceC2694i0G;
                                this.label = 5;
                                objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                                if (objZ0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                InterfaceC1152c interfaceC1152c5 = interfaceC1152c2;
                                qVar5 = qVar4;
                                obj = objZ0;
                                interfaceC1152c3 = interfaceC1152c5;
                                qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                                if (qVar6 == null) {
                                    lVar2 = this.$onTap;
                                    if (lVar2 != null) {
                                        lVar2.invoke(new I.d(qVar5.f14102c));
                                    }
                                } else {
                                    A a11 = this.$$this$coroutineScope;
                                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar14 = TapGestureDetectorKt.f9999a;
                                    interfaceC2694i0C2 = C2680e.c(a11, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                    qVar7 = this.$onPress;
                                    if (qVar7 != TapGestureDetectorKt.f9999a) {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                    }
                                    if (this.$onLongPress == null) {
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = qVar5;
                                        this.L$2 = null;
                                        this.label = 6;
                                        obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        qVar10 = qVar5;
                                        qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                        if (qVar11 != null) {
                                            qVar11.a();
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                            this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                        } else {
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                            lVar3 = this.$onTap;
                                            if (lVar3 != null) {
                                                lVar3.invoke(new I.d(qVar10.f14102c));
                                            }
                                        }
                                    } else {
                                        this.L$0 = interfaceC1152c3;
                                        this.L$1 = interfaceC2694i0C2;
                                        this.L$2 = qVar5;
                                        this.L$3 = qVar6;
                                        this.label = 7;
                                        objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                        if (objH2 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        qVar8 = qVar5;
                                        qVar9 = qVar6;
                                        obj = objH2;
                                        qVar12 = qVar8;
                                        kVar2 = (k) obj;
                                        if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                            this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                            this.L$0 = interfaceC2694i0C2;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 8;
                                            if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            interfaceC2694i1 = interfaceC2694i0C2;
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                            return p293xa.r.f47939a;
                                        }
                                        if (kVar2 instanceof k.b) {
                                            qVar11 = ((k.b) kVar2).f10016a;
                                            qVar10 = qVar12;
                                        } else {
                                            if (kVar2 instanceof k.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            qVar10 = qVar12;
                                            qVar11 = null;
                                        }
                                        if (qVar11 != null) {
                                            qVar11.a();
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                            this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                        } else {
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                            lVar3 = this.$onTap;
                                            if (lVar3 != null) {
                                                lVar3.invoke(new I.d(qVar10.f14102c));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                    this.L$0 = interfaceC1152c;
                    this.L$1 = qVar;
                    this.L$2 = interfaceC2694i0C;
                    this.label = 3;
                    objH = TapGestureDetectorKt.h(interfaceC1152c, PointerEventPass.f14030c, this);
                    if (objH == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qVar3 = qVar;
                    obj = objH;
                    kVar = (k) obj;
                    if (kotlin.jvm.internal.i.a(kVar, k.c.f10017a)) {
                        this.$onLongPress.invoke(new I.d(qVar3.f14102c));
                        this.L$0 = interfaceC2694i0C;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (TapGestureDetectorKt.a(interfaceC1152c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC2694i0 = interfaceC2694i0C;
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
                        return p293xa.r.f47939a;
                    }
                    if (kVar instanceof k.b) {
                        qVar4 = ((k.b) kVar).f10016a;
                    } else {
                        if (!(kVar instanceof k.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar4 = null;
                    }
                    interfaceC1152c2 = interfaceC1152c;
                    if (qVar4 == null) {
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                    } else {
                        qVar4.a();
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                    }
                    if (qVar4 != null) {
                        if (this.$onDoubleTap == null) {
                            lVar = this.$onTap;
                            if (lVar != null) {
                                lVar.invoke(new I.d(qVar4.f14102c));
                            }
                        } else {
                            this.L$0 = interfaceC1152c2;
                            this.L$1 = qVar4;
                            this.L$2 = interfaceC2694i0G;
                            this.label = 5;
                            objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                            if (objZ0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            InterfaceC1152c interfaceC1152c6 = interfaceC1152c2;
                            qVar5 = qVar4;
                            obj = objZ0;
                            interfaceC1152c3 = interfaceC1152c6;
                            qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                            if (qVar6 == null) {
                                lVar2 = this.$onTap;
                                if (lVar2 != null) {
                                    lVar2.invoke(new I.d(qVar5.f14102c));
                                }
                            } else {
                                A a12 = this.$$this$coroutineScope;
                                Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar15 = TapGestureDetectorKt.f9999a;
                                interfaceC2694i0C2 = C2680e.c(a12, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                qVar7 = this.$onPress;
                                if (qVar7 != TapGestureDetectorKt.f9999a) {
                                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                }
                                if (this.$onLongPress == null) {
                                    this.L$0 = interfaceC2694i0C2;
                                    this.L$1 = qVar5;
                                    this.L$2 = null;
                                    this.label = 6;
                                    obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar10 = qVar5;
                                    qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                } else {
                                    this.L$0 = interfaceC1152c3;
                                    this.L$1 = interfaceC2694i0C2;
                                    this.L$2 = qVar5;
                                    this.L$3 = qVar6;
                                    this.label = 7;
                                    objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (objH2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar8 = qVar5;
                                    qVar9 = qVar6;
                                    obj = objH2;
                                    qVar12 = qVar8;
                                    kVar2 = (k) obj;
                                    if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                        this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 8;
                                        if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        interfaceC2694i1 = interfaceC2694i0C2;
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                        return p293xa.r.f47939a;
                                    }
                                    if (kVar2 instanceof k.b) {
                                        qVar11 = ((k.b) kVar2).f10016a;
                                        qVar10 = qVar12;
                                    } else {
                                        if (kVar2 instanceof k.a) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qVar10 = qVar12;
                                        qVar11 = null;
                                    }
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return p293xa.r.f47939a;
                case 1:
                    InterfaceC1152c interfaceC1152c7 = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                    interfaceC1152c = interfaceC1152c7;
                    qVar = (androidx.compose.ui.input.pointer.q) obj;
                    qVar.a();
                    A a13 = this.$$this$coroutineScope;
                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar16 = TapGestureDetectorKt.f9999a;
                    interfaceC2694i0C = C2680e.c(a13, null, CoroutineStart.f43169e, new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.$pressScope, null), 1);
                    qVar2 = this.$onPress;
                    if (qVar2 != TapGestureDetectorKt.f9999a) {
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new C01261(qVar2, this.$pressScope, qVar, null));
                    }
                    if (this.$onLongPress == null) {
                        this.L$0 = interfaceC1152c;
                        this.L$1 = interfaceC2694i0C;
                        this.label = 2;
                        obj = TapGestureDetectorKt.i(interfaceC1152c, PointerEventPass.f14030c, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC1152c2 = interfaceC1152c;
                        qVar4 = (androidx.compose.ui.input.pointer.q) obj;
                        if (qVar4 == null) {
                            interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                        } else {
                            qVar4.a();
                            interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                        }
                        if (qVar4 != null) {
                            if (this.$onDoubleTap == null) {
                                lVar = this.$onTap;
                                if (lVar != null) {
                                    lVar.invoke(new I.d(qVar4.f14102c));
                                }
                            } else {
                                this.L$0 = interfaceC1152c2;
                                this.L$1 = qVar4;
                                this.L$2 = interfaceC2694i0G;
                                this.label = 5;
                                objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                                if (objZ0 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                InterfaceC1152c interfaceC1152c8 = interfaceC1152c2;
                                qVar5 = qVar4;
                                obj = objZ0;
                                interfaceC1152c3 = interfaceC1152c8;
                                qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                                if (qVar6 == null) {
                                    lVar2 = this.$onTap;
                                    if (lVar2 != null) {
                                        lVar2.invoke(new I.d(qVar5.f14102c));
                                    }
                                } else {
                                    A a14 = this.$$this$coroutineScope;
                                    Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar17 = TapGestureDetectorKt.f9999a;
                                    interfaceC2694i0C2 = C2680e.c(a14, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                    qVar7 = this.$onPress;
                                    if (qVar7 != TapGestureDetectorKt.f9999a) {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                    }
                                    if (this.$onLongPress == null) {
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = qVar5;
                                        this.L$2 = null;
                                        this.label = 6;
                                        obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        qVar10 = qVar5;
                                        qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                        if (qVar11 != null) {
                                            qVar11.a();
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                            this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                        } else {
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                            lVar3 = this.$onTap;
                                            if (lVar3 != null) {
                                                lVar3.invoke(new I.d(qVar10.f14102c));
                                            }
                                        }
                                    } else {
                                        this.L$0 = interfaceC1152c3;
                                        this.L$1 = interfaceC2694i0C2;
                                        this.L$2 = qVar5;
                                        this.L$3 = qVar6;
                                        this.label = 7;
                                        objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                        if (objH2 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        qVar8 = qVar5;
                                        qVar9 = qVar6;
                                        obj = objH2;
                                        qVar12 = qVar8;
                                        kVar2 = (k) obj;
                                        if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                            this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                            this.L$0 = interfaceC2694i0C2;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.label = 8;
                                            if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            interfaceC2694i1 = interfaceC2694i0C2;
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                            return p293xa.r.f47939a;
                                        }
                                        if (kVar2 instanceof k.b) {
                                            qVar11 = ((k.b) kVar2).f10016a;
                                            qVar10 = qVar12;
                                        } else {
                                            if (kVar2 instanceof k.a) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            qVar10 = qVar12;
                                            qVar11 = null;
                                        }
                                        if (qVar11 != null) {
                                            qVar11.a();
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                            this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                        } else {
                                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                            lVar3 = this.$onTap;
                                            if (lVar3 != null) {
                                                lVar3.invoke(new I.d(qVar10.f14102c));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                    this.L$0 = interfaceC1152c;
                    this.L$1 = qVar;
                    this.L$2 = interfaceC2694i0C;
                    this.label = 3;
                    objH = TapGestureDetectorKt.h(interfaceC1152c, PointerEventPass.f14030c, this);
                    if (objH == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qVar3 = qVar;
                    obj = objH;
                    kVar = (k) obj;
                    if (kotlin.jvm.internal.i.a(kVar, k.c.f10017a)) {
                        this.$onLongPress.invoke(new I.d(qVar3.f14102c));
                        this.L$0 = interfaceC2694i0C;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (TapGestureDetectorKt.a(interfaceC1152c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC2694i0 = interfaceC2694i0C;
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
                        return p293xa.r.f47939a;
                    }
                    if (kVar instanceof k.b) {
                        qVar4 = ((k.b) kVar).f10016a;
                    } else {
                        if (!(kVar instanceof k.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar4 = null;
                    }
                    interfaceC1152c2 = interfaceC1152c;
                    if (qVar4 == null) {
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                    } else {
                        qVar4.a();
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                    }
                    if (qVar4 != null) {
                        if (this.$onDoubleTap == null) {
                            lVar = this.$onTap;
                            if (lVar != null) {
                                lVar.invoke(new I.d(qVar4.f14102c));
                            }
                        } else {
                            this.L$0 = interfaceC1152c2;
                            this.L$1 = qVar4;
                            this.L$2 = interfaceC2694i0G;
                            this.label = 5;
                            objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                            if (objZ0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            InterfaceC1152c interfaceC1152c9 = interfaceC1152c2;
                            qVar5 = qVar4;
                            obj = objZ0;
                            interfaceC1152c3 = interfaceC1152c9;
                            qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                            if (qVar6 == null) {
                                lVar2 = this.$onTap;
                                if (lVar2 != null) {
                                    lVar2.invoke(new I.d(qVar5.f14102c));
                                }
                            } else {
                                A a15 = this.$$this$coroutineScope;
                                Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar18 = TapGestureDetectorKt.f9999a;
                                interfaceC2694i0C2 = C2680e.c(a15, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                qVar7 = this.$onPress;
                                if (qVar7 != TapGestureDetectorKt.f9999a) {
                                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                }
                                if (this.$onLongPress == null) {
                                    this.L$0 = interfaceC2694i0C2;
                                    this.L$1 = qVar5;
                                    this.L$2 = null;
                                    this.label = 6;
                                    obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar10 = qVar5;
                                    qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                } else {
                                    this.L$0 = interfaceC1152c3;
                                    this.L$1 = interfaceC2694i0C2;
                                    this.L$2 = qVar5;
                                    this.L$3 = qVar6;
                                    this.label = 7;
                                    objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (objH2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar8 = qVar5;
                                    qVar9 = qVar6;
                                    obj = objH2;
                                    qVar12 = qVar8;
                                    kVar2 = (k) obj;
                                    if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                        this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 8;
                                        if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        interfaceC2694i1 = interfaceC2694i0C2;
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                        return p293xa.r.f47939a;
                                    }
                                    if (kVar2 instanceof k.b) {
                                        qVar11 = ((k.b) kVar2).f10016a;
                                        qVar10 = qVar12;
                                    } else {
                                        if (kVar2 instanceof k.a) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qVar10 = qVar12;
                                        qVar11 = null;
                                    }
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return p293xa.r.f47939a;
                case 2:
                    interfaceC2694i0C = (InterfaceC2694i0) this.L$1;
                    interfaceC1152c2 = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                    qVar4 = (androidx.compose.ui.input.pointer.q) obj;
                    if (qVar4 == null) {
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                    } else {
                        qVar4.a();
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                    }
                    if (qVar4 != null) {
                        if (this.$onDoubleTap == null) {
                            lVar = this.$onTap;
                            if (lVar != null) {
                                lVar.invoke(new I.d(qVar4.f14102c));
                            }
                        } else {
                            this.L$0 = interfaceC1152c2;
                            this.L$1 = qVar4;
                            this.L$2 = interfaceC2694i0G;
                            this.label = 5;
                            objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                            if (objZ0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            InterfaceC1152c interfaceC1152c10 = interfaceC1152c2;
                            qVar5 = qVar4;
                            obj = objZ0;
                            interfaceC1152c3 = interfaceC1152c10;
                            qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                            if (qVar6 == null) {
                                lVar2 = this.$onTap;
                                if (lVar2 != null) {
                                    lVar2.invoke(new I.d(qVar5.f14102c));
                                }
                            } else {
                                A a16 = this.$$this$coroutineScope;
                                Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar19 = TapGestureDetectorKt.f9999a;
                                interfaceC2694i0C2 = C2680e.c(a16, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                qVar7 = this.$onPress;
                                if (qVar7 != TapGestureDetectorKt.f9999a) {
                                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                }
                                if (this.$onLongPress == null) {
                                    this.L$0 = interfaceC2694i0C2;
                                    this.L$1 = qVar5;
                                    this.L$2 = null;
                                    this.label = 6;
                                    obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar10 = qVar5;
                                    qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                } else {
                                    this.L$0 = interfaceC1152c3;
                                    this.L$1 = interfaceC2694i0C2;
                                    this.L$2 = qVar5;
                                    this.L$3 = qVar6;
                                    this.label = 7;
                                    objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (objH2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar8 = qVar5;
                                    qVar9 = qVar6;
                                    obj = objH2;
                                    qVar12 = qVar8;
                                    kVar2 = (k) obj;
                                    if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                        this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 8;
                                        if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        interfaceC2694i1 = interfaceC2694i0C2;
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                        return p293xa.r.f47939a;
                                    }
                                    if (kVar2 instanceof k.b) {
                                        qVar11 = ((k.b) kVar2).f10016a;
                                        qVar10 = qVar12;
                                    } else {
                                        if (kVar2 instanceof k.a) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qVar10 = qVar12;
                                        qVar11 = null;
                                    }
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return p293xa.r.f47939a;
                case 3:
                    interfaceC2694i0C = (InterfaceC2694i0) this.L$2;
                    qVar3 = (androidx.compose.ui.input.pointer.q) this.L$1;
                    interfaceC1152c = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                    kVar = (k) obj;
                    if (kotlin.jvm.internal.i.a(kVar, k.c.f10017a)) {
                        this.$onLongPress.invoke(new I.d(qVar3.f14102c));
                        this.L$0 = interfaceC2694i0C;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (TapGestureDetectorKt.a(interfaceC1152c, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC2694i0 = interfaceC2694i0C;
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
                        return p293xa.r.f47939a;
                    }
                    if (kVar instanceof k.b) {
                        qVar4 = ((k.b) kVar).f10016a;
                    } else {
                        if (!(kVar instanceof k.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar4 = null;
                    }
                    interfaceC1152c2 = interfaceC1152c;
                    if (qVar4 == null) {
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass3(this.$pressScope, null));
                    } else {
                        qVar4.a();
                        interfaceC2694i0G = TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C, new AnonymousClass4(this.$pressScope, null));
                    }
                    if (qVar4 != null) {
                        if (this.$onDoubleTap == null) {
                            lVar = this.$onTap;
                            if (lVar != null) {
                                lVar.invoke(new I.d(qVar4.f14102c));
                            }
                        } else {
                            this.L$0 = interfaceC1152c2;
                            this.L$1 = qVar4;
                            this.L$2 = interfaceC2694i0G;
                            this.label = 5;
                            objZ0 = interfaceC1152c2.z0(interfaceC1152c2.getViewConfiguration().a(), new TapGestureDetectorKt$awaitSecondDown$2(qVar4, null), this);
                            if (objZ0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            InterfaceC1152c interfaceC1152c11 = interfaceC1152c2;
                            qVar5 = qVar4;
                            obj = objZ0;
                            interfaceC1152c3 = interfaceC1152c11;
                            qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                            if (qVar6 == null) {
                                lVar2 = this.$onTap;
                                if (lVar2 != null) {
                                    lVar2.invoke(new I.d(qVar5.f14102c));
                                }
                            } else {
                                A a17 = this.$$this$coroutineScope;
                                Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar110 = TapGestureDetectorKt.f9999a;
                                interfaceC2694i0C2 = C2680e.c(a17, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                                qVar7 = this.$onPress;
                                if (qVar7 != TapGestureDetectorKt.f9999a) {
                                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                                }
                                if (this.$onLongPress == null) {
                                    this.L$0 = interfaceC2694i0C2;
                                    this.L$1 = qVar5;
                                    this.L$2 = null;
                                    this.label = 6;
                                    obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar10 = qVar5;
                                    qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                } else {
                                    this.L$0 = interfaceC1152c3;
                                    this.L$1 = interfaceC2694i0C2;
                                    this.L$2 = qVar5;
                                    this.L$3 = qVar6;
                                    this.label = 7;
                                    objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                                    if (objH2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    qVar8 = qVar5;
                                    qVar9 = qVar6;
                                    obj = objH2;
                                    qVar12 = qVar8;
                                    kVar2 = (k) obj;
                                    if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                        this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                        this.L$0 = interfaceC2694i0C2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 8;
                                        if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        interfaceC2694i1 = interfaceC2694i0C2;
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                        return p293xa.r.f47939a;
                                    }
                                    if (kVar2 instanceof k.b) {
                                        qVar11 = ((k.b) kVar2).f10016a;
                                        qVar10 = qVar12;
                                    } else {
                                        if (kVar2 instanceof k.a) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qVar10 = qVar12;
                                        qVar11 = null;
                                    }
                                    if (qVar11 != null) {
                                        qVar11.a();
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                                    } else {
                                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                        lVar3 = this.$onTap;
                                        if (lVar3 != null) {
                                            lVar3.invoke(new I.d(qVar10.f14102c));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return p293xa.r.f47939a;
                case 4:
                    interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0, new AnonymousClass2(this.$pressScope, null));
                    return p293xa.r.f47939a;
                case 5:
                    interfaceC2694i0G = (InterfaceC2694i0) this.L$2;
                    qVar5 = (androidx.compose.ui.input.pointer.q) this.L$1;
                    interfaceC1152c3 = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                    qVar6 = (androidx.compose.ui.input.pointer.q) obj;
                    if (qVar6 == null) {
                        lVar2 = this.$onTap;
                        if (lVar2 != null) {
                            lVar2.invoke(new I.d(qVar5.f14102c));
                        }
                    } else {
                        A a18 = this.$$this$coroutineScope;
                        Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar111 = TapGestureDetectorKt.f9999a;
                        interfaceC2694i0C2 = C2680e.c(a18, null, CoroutineStart.f43169e, new AnonymousClass5(interfaceC2694i0G, this.$pressScope, null), 1);
                        qVar7 = this.$onPress;
                        if (qVar7 != TapGestureDetectorKt.f9999a) {
                            TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass6(qVar7, this.$pressScope, qVar6, null));
                        }
                        if (this.$onLongPress == null) {
                            this.L$0 = interfaceC2694i0C2;
                            this.L$1 = qVar5;
                            this.L$2 = null;
                            this.label = 6;
                            obj = TapGestureDetectorKt.i(interfaceC1152c3, PointerEventPass.f14030c, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            qVar10 = qVar5;
                            qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                            if (qVar11 != null) {
                                qVar11.a();
                                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                            } else {
                                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                lVar3 = this.$onTap;
                                if (lVar3 != null) {
                                    lVar3.invoke(new I.d(qVar10.f14102c));
                                }
                            }
                        } else {
                            this.L$0 = interfaceC1152c3;
                            this.L$1 = interfaceC2694i0C2;
                            this.L$2 = qVar5;
                            this.L$3 = qVar6;
                            this.label = 7;
                            objH2 = TapGestureDetectorKt.h(interfaceC1152c3, PointerEventPass.f14030c, this);
                            if (objH2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            qVar8 = qVar5;
                            qVar9 = qVar6;
                            obj = objH2;
                            qVar12 = qVar8;
                            kVar2 = (k) obj;
                            if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                                this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                                this.L$0 = interfaceC2694i0C2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 8;
                                if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                interfaceC2694i1 = interfaceC2694i0C2;
                                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                                return p293xa.r.f47939a;
                            }
                            if (kVar2 instanceof k.b) {
                                qVar11 = ((k.b) kVar2).f10016a;
                                qVar10 = qVar12;
                            } else {
                                if (kVar2 instanceof k.a) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qVar10 = qVar12;
                                qVar11 = null;
                            }
                            if (qVar11 != null) {
                                qVar11.a();
                                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                                this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                            } else {
                                TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                                lVar3 = this.$onTap;
                                if (lVar3 != null) {
                                    lVar3.invoke(new I.d(qVar10.f14102c));
                                }
                            }
                        }
                    }
                    return p293xa.r.f47939a;
                case 6:
                    qVar10 = (androidx.compose.ui.input.pointer.q) this.L$1;
                    interfaceC2694i0C2 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                    qVar11 = (androidx.compose.ui.input.pointer.q) obj;
                    if (qVar11 != null) {
                        qVar11.a();
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                    } else {
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                        lVar3 = this.$onTap;
                        if (lVar3 != null) {
                            lVar3.invoke(new I.d(qVar10.f14102c));
                        }
                    }
                    return p293xa.r.f47939a;
                case 7:
                    androidx.compose.ui.input.pointer.q qVar20 = (androidx.compose.ui.input.pointer.q) this.L$3;
                    androidx.compose.ui.input.pointer.q qVar21 = (androidx.compose.ui.input.pointer.q) this.L$2;
                    InterfaceC2694i0 interfaceC2694i2 = (InterfaceC2694i0) this.L$1;
                    interfaceC1152c3 = (InterfaceC1152c) this.L$0;
                    kotlin.b.b(obj);
                    qVar8 = qVar21;
                    qVar9 = qVar20;
                    interfaceC2694i0C2 = interfaceC2694i2;
                    qVar12 = qVar8;
                    kVar2 = (k) obj;
                    if (kotlin.jvm.internal.i.a(kVar2, k.c.f10017a)) {
                        this.$onLongPress.invoke(new I.d(qVar9.f14102c));
                        this.L$0 = interfaceC2694i0C2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (TapGestureDetectorKt.a(interfaceC1152c3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC2694i1 = interfaceC2694i0C2;
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                        return p293xa.r.f47939a;
                    }
                    if (kVar2 instanceof k.b) {
                        qVar11 = ((k.b) kVar2).f10016a;
                        qVar10 = qVar12;
                    } else {
                        if (kVar2 instanceof k.a) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar10 = qVar12;
                        qVar11 = null;
                    }
                    if (qVar11 != null) {
                        qVar11.a();
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass7(this.$pressScope, null));
                        this.$onDoubleTap.invoke(new I.d(qVar11.f14102c));
                    } else {
                        TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i0C2, new AnonymousClass8(this.$pressScope, null));
                        lVar3 = this.$onTap;
                        if (lVar3 != null) {
                            lVar3.invoke(new I.d(qVar10.f14102c));
                        }
                    }
                    return p293xa.r.f47939a;
                case 8:
                    interfaceC2694i1 = (InterfaceC2694i0) this.L$0;
                    kotlin.b.b(obj);
                    TapGestureDetectorKt.g(this.$$this$coroutineScope, interfaceC2694i1, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null));
                    return p293xa.r.f47939a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(Ia.l lVar, Ia.l lVar2, Ia.l lVar3, Ia.q qVar, androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_detectTapGestures = wVar;
        this.$onPress = qVar;
        this.$onLongPress = lVar;
        this.$onDoubleTap = lVar2;
        this.$onTap = lVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        androidx.compose.ui.input.pointer.w wVar = this.$this_detectTapGestures;
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$onPress, wVar, cVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A a10 = (A) this.L$0;
            q qVar = new q(this.$this_detectTapGestures);
            androidx.compose.ui.input.pointer.w wVar = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(a10, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, qVar, null);
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
