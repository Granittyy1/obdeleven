package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.z0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CursorAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
public final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CursorAnimationState this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: CursorAnimationState.kt */
    @Aa.c(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listMenuViewStyle, R.styleable.AppCompatTheme_listPreferredItemHeight, R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ InterfaceC2694i0 $oldJob;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2694i0 interfaceC2694i0, CursorAnimationState cursorAnimationState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$oldJob = interfaceC2694i0;
            this.this$0 = cursorAnimationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$oldJob, this.this$0, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            return CoroutineSingletons.f43038b;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0071 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006f -> B:33:0x0072). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0061
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
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L36
                if (r1 == r9) goto L32
                if (r1 == r8) goto L29
                if (r1 == r7) goto L25
                if (r1 != r6) goto L1d
                kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L1b
                goto L72
            L1b:
                r11 = move-exception
                goto L7a
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L1b
                goto L62
            L29:
                kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L1b
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                r11.<init>()     // Catch: java.lang.Throwable -> L1b
                throw r11     // Catch: java.lang.Throwable -> L1b
            L32:
                kotlin.b.b(r11)
                goto L46
            L36:
                kotlin.b.b(r11)
                kotlinx.coroutines.i0 r11 = r10.$oldJob
                if (r11 == 0) goto L46
                r10.label = r9
                java.lang.Object r11 = kotlinx.coroutines.C2702l0.c(r11, r10)
                if (r11 != r0) goto L46
                return r0
            L46:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.c0 r11 = r11.f11286c     // Catch: java.lang.Throwable -> L1b
                r11.f(r5)     // Catch: java.lang.Throwable -> L1b
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                boolean r11 = r11.f11284a     // Catch: java.lang.Throwable -> L1b
                if (r11 != 0) goto L59
                r10.label = r8     // Catch: java.lang.Throwable -> L1b
                kotlinx.coroutines.I.a(r10)     // Catch: java.lang.Throwable -> L1b
                return r0
            L59:
                r10.label = r7     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.I.b(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L62
                return r0
            L62:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.c0 r11 = r11.f11286c     // Catch: java.lang.Throwable -> L1b
                r11.f(r2)     // Catch: java.lang.Throwable -> L1b
                r10.label = r6     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.I.b(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L72
                return r0
            L72:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.c0 r11 = r11.f11286c     // Catch: java.lang.Throwable -> L1b
                r11.f(r5)     // Catch: java.lang.Throwable -> L1b
                goto L59
            L7a:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                androidx.compose.runtime.c0 r0 = r0.f11286c
                r0.f(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, kotlin.coroutines.c<? super CursorAnimationState$snapToVisibleAndAnimate$2> cVar) {
        super(2, cVar);
        this.this$0 = cursorAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, cVar);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        InterfaceC2694i0 andSet = this.this$0.f11285b.getAndSet(null);
        CursorAnimationState cursorAnimationState = this.this$0;
        AtomicReference<InterfaceC2694i0> atomicReference = cursorAnimationState.f11285b;
        z0 z0VarC = C2680e.c(a10, null, null, new AnonymousClass1(andSet, cursorAnimationState, null), 3);
        while (!atomicReference.compareAndSet(null, z0VarC)) {
            if (atomicReference.get() != null) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
