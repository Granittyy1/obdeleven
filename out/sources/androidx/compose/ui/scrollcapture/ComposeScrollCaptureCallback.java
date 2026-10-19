package androidx.compose.ui.scrollcapture;

import Ia.p;
import Na.l;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.runtime.P;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.q;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z0;
import me.zhanghai.android.materialprogressbar.R;
import p013b0.k;
import p293xa.r;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f15113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f15114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.internal.f f15115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f15116f;

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Aa.c(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onReady = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.$onReady, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                e eVar = ComposeScrollCaptureCallback.this.f15116f;
                this.label = 1;
                Object objA = eVar.a(0.0f - eVar.f15124c, this);
                if (objA != coroutineSingletons) {
                    objA = r.f47939a;
                }
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            g gVar = ComposeScrollCaptureCallback.this.f15113c;
            gVar.f15125a.setValue(Boolean.FALSE);
            this.$onReady.run();
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Aa.c(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "invokeSuspend")
    public static final class C12591 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12591(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, kotlin.coroutines.c<? super C12591> cVar) {
            super(2, cVar);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ComposeScrollCaptureCallback.this.new C12591(this.$session, this.$captureArea, this.$onComplete, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C12591) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                Rect rect = this.$captureArea;
                k kVar = new k(rect.left, rect.top, rect.right, rect.bottom);
                this.label = 1;
                obj = ComposeScrollCaptureCallback.a(composeScrollCaptureCallback, scrollCaptureSession, kVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.$onComplete.accept(g0.b((k) obj));
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @Aa.c(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
    final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.a(ComposeScrollCaptureCallback.this, null, null, this);
        }
    }

    public ComposeScrollCaptureCallback(q qVar, k kVar, kotlinx.coroutines.internal.f fVar, g gVar, AndroidComposeView androidComposeView) {
        this.f15111a = qVar;
        this.f15112b = kVar;
        this.f15113c = gVar;
        this.f15114d = androidComposeView;
        this.f15115e = new kotlinx.coroutines.internal.f(fVar.f43473b.plus(d.f15121b));
        this.f15116f = new e(kVar.b(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(ComposeScrollCaptureCallback composeScrollCaptureCallback, ScrollCaptureSession scrollCaptureSession, k kVar, ContinuationImpl continuationImpl) {
        AnonymousClass2 anonymousClass2;
        int i10;
        int i11;
        Object objA;
        ComposeScrollCaptureCallback composeScrollCaptureCallback2;
        ScrollCaptureSession scrollCaptureSessionC;
        int i12;
        int i13;
        int iD;
        int iD2;
        int i14;
        Canvas canvasLockHardwareCanvas;
        composeScrollCaptureCallback.getClass();
        if (continuationImpl instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuationImpl;
            int i15 = anonymousClass2.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i15 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = composeScrollCaptureCallback.new AnonymousClass2(continuationImpl);
            }
        } else {
            anonymousClass2 = composeScrollCaptureCallback.new AnonymousClass2(continuationImpl);
        }
        Object obj = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i16 = anonymousClass2.label;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = anonymousClass2.I$1;
                int i18 = anonymousClass2.I$0;
                kVar = (k) anonymousClass2.L$2;
                ScrollCaptureSession scrollCaptureSessionC2 = a.c(anonymousClass2.L$1);
                ComposeScrollCaptureCallback composeScrollCaptureCallback3 = (ComposeScrollCaptureCallback) anonymousClass2.L$0;
                kotlin.b.b(obj);
                i11 = i17;
                i10 = i18;
                scrollCaptureSession = scrollCaptureSessionC2;
                composeScrollCaptureCallback = composeScrollCaptureCallback3;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = anonymousClass2.I$1;
                i12 = anonymousClass2.I$0;
                kVar = (k) anonymousClass2.L$2;
                scrollCaptureSessionC = a.c(anonymousClass2.L$1);
                composeScrollCaptureCallback2 = (ComposeScrollCaptureCallback) anonymousClass2.L$0;
                kotlin.b.b(obj);
            }
            e eVar = composeScrollCaptureCallback2.f15116f;
            iD = l.D(i12 - Ka.a.b(eVar.f15124c), 0, eVar.f15122a);
            e eVar2 = composeScrollCaptureCallback2.f15116f;
            iD2 = l.D(i13 - Ka.a.b(eVar2.f15124c), 0, eVar2.f15122a);
            i14 = kVar.f20486a;
            if (iD == iD2) {
                return k.f20485e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionC.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i14, -iD);
                k kVar2 = composeScrollCaptureCallback2.f15112b;
                canvasLockHardwareCanvas.translate(-kVar2.f20486a, -kVar2.f20487b);
                composeScrollCaptureCallback2.f15114d.getRootView().draw(canvasLockHardwareCanvas);
                int iB = Ka.a.b(composeScrollCaptureCallback2.f15116f.f15124c);
                return new k(i14, iD + iB, kVar.f20488c, iD2 + iB);
            } finally {
                scrollCaptureSessionC.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        kotlin.b.b(obj);
        i10 = kVar.f20487b;
        e eVar3 = composeScrollCaptureCallback.f15116f;
        anonymousClass2.L$0 = composeScrollCaptureCallback;
        anonymousClass2.L$1 = scrollCaptureSession;
        anonymousClass2.L$2 = kVar;
        anonymousClass2.I$0 = i10;
        i11 = kVar.f20489d;
        anonymousClass2.I$1 = i11;
        anonymousClass2.label = 1;
        if (i10 > i11) {
            eVar3.getClass();
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i19 = i11 - i10;
        int i20 = eVar3.f15122a;
        if (i19 > i20) {
            throw new IllegalArgumentException(A8.f.d(i19, i20, "Expected range (", ") to be ≤ viewportSize=").toString());
        }
        float f10 = i10;
        float f11 = eVar3.f15124c;
        if (f10 < f11 || i11 > i20 + f11) {
            objA = eVar3.a((f10 < f11 ? i10 : i11 - i20) - f11, anonymousClass2);
            if (objA != coroutineSingletons) {
                objA = r.f47939a;
            }
            if (objA != coroutineSingletons) {
                objA = r.f47939a;
            }
        } else {
            objA = r.f47939a;
        }
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        anonymousClass2.L$0 = composeScrollCaptureCallback;
        anonymousClass2.L$1 = scrollCaptureSession;
        anonymousClass2.L$2 = kVar;
        anonymousClass2.I$0 = i10;
        anonymousClass2.I$1 = i11;
        anonymousClass2.label = 2;
        if (P.a(anonymousClass2.getContext()).P0(new Ia.l<Long, r>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest.3
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ r invoke(Long l10) {
                l10.longValue();
                return r.f47939a;
            }
        }, anonymousClass2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        composeScrollCaptureCallback2 = composeScrollCaptureCallback;
        scrollCaptureSessionC = scrollCaptureSession;
        i12 = i10;
        i13 = i11;
        e eVar4 = composeScrollCaptureCallback2.f15116f;
        iD = l.D(i12 - Ka.a.b(eVar4.f15124c), 0, eVar4.f15122a);
        e eVar5 = composeScrollCaptureCallback2.f15116f;
        iD2 = l.D(i13 - Ka.a.b(eVar5.f15124c), 0, eVar5.f15122a);
        i14 = kVar.f20486a;
        if (iD == iD2) {
            return k.f20485e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionC.getSurface().lockHardwareCanvas();
        canvasLockHardwareCanvas.save();
        canvasLockHardwareCanvas.translate(-i14, -iD);
        k kVar3 = composeScrollCaptureCallback2.f15112b;
        canvasLockHardwareCanvas.translate(-kVar3.f20486a, -kVar3.f20487b);
        composeScrollCaptureCallback2.f15114d.getRootView().draw(canvasLockHardwareCanvas);
        int iB2 = Ka.a.b(composeScrollCaptureCallback2.f15116f.f15124c);
        return new k(i14, iD + iB2, kVar.f20488c, iD2 + iB2);
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        C2680e.c(this.f15115e, s0.f43532b, null, new AnonymousClass1(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final z0 z0VarC = C2680e.c(this.f15115e, null, null, new C12591(scrollCaptureSession, rect, consumer, null), 3);
        z0VarC.B(new Ia.l<Throwable, r>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
                return r.f47939a;
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                z0VarC.i(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(g0.b(this.f15112b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f15116f.f15124c = 0.0f;
        g gVar = this.f15113c;
        gVar.f15125a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
