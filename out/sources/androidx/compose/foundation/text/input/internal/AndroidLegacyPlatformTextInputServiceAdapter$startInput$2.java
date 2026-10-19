package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import androidx.compose.ui.platform.InterfaceC1258z0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "invokeSuspend")
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements Ia.p<InterfaceC1258z0, kotlin.coroutines.c<?>, Object> {
    final /* synthetic */ Ia.l<Y, p293xa.r> $initializeRequest;
    final /* synthetic */ X.a $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @Aa.c(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<?>, Object> {
        final /* synthetic */ InterfaceC1258z0 $$this$launchTextInputSession;
        final /* synthetic */ Ia.l<Y, p293xa.r> $initializeRequest;
        final /* synthetic */ X.a $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @Aa.c(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
        public static final class C01381 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ S $inputMethodManager;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$a */
            /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
            public static final class a<T> implements InterfaceC2687d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ S f11266b;

                public a(S s10) {
                    this.f11266b = s10;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    this.f11266b.a();
                    return p293xa.r.f47939a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01381(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, S s10, kotlin.coroutines.c<? super C01381> cVar) {
                super(2, cVar);
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$inputMethodManager = s10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C01381(this.this$0, this.$inputMethodManager, cVar);
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((C01381) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    this.label = 1;
                    if (androidx.compose.runtime.P.a(getContext()).P0(new MonotonicFrameClockKt$withFrameMillis$2(new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1
                        @Override // Ia.l
                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Long l10) {
                            l10.longValue();
                            return p293xa.r.f47939a;
                        }
                    }), this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    kotlin.b.b(obj);
                }
                kotlinx.coroutines.flow.p<p293xa.r> pVarK = this.this$0.k();
                if (pVarK == null) {
                    return p293xa.r.f47939a;
                }
                a aVar = new a(this.$inputMethodManager);
                this.label = 2;
                kotlinx.coroutines.flow.v.m((kotlinx.coroutines.flow.v) pVarK, aVar, this);
                return coroutineSingletons;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC1258z0 interfaceC1258z0, Ia.l<? super Y, p293xa.r> lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, X.a aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$$this$launchTextInputSession = interfaceC1258z0;
            this.$initializeRequest = lVar;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<?> cVar) {
            ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            return CoroutineSingletons.f43038b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    throw new KotlinNothingValueException();
                }
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                Ia.l<? super View, ? extends S> lVar = LegacyPlatformTextInputServiceAdapter_androidKt.f11292a;
                View viewA = this.$$this$launchTextInputSession.a();
                ((LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1) lVar).getClass();
                InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(viewA);
                Y y10 = new Y(this.$$this$launchTextInputSession.a(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), inputMethodManagerImpl);
                if (androidx.compose.foundation.text.handwriting.b.f11261a) {
                    C2680e.c(a10, null, null, new C01381(this.this$0, inputMethodManagerImpl, null), 3);
                }
                Ia.l<Y, p293xa.r> lVar2 = this.$initializeRequest;
                if (lVar2 != null) {
                    lVar2.invoke(y10);
                }
                this.this$0.f11263c = y10;
                InterfaceC1258z0 interfaceC1258z0 = this.$$this$launchTextInputSession;
                this.label = 1;
                interfaceC1258z0.b(y10, this);
                return coroutineSingletons;
            } catch (Throwable th) {
                this.this$0.f11263c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(Ia.l<? super Y, p293xa.r> lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, X.a aVar, kotlin.coroutines.c<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> cVar) {
        super(2, cVar);
        this.$initializeRequest = lVar;
        this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
        this.$node = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, cVar);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC1258z0 interfaceC1258z0, kotlin.coroutines.c<?> cVar) {
        ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(interfaceC1258z0, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC1258z0) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
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
        throw new KotlinNothingValueException();
    }
}
