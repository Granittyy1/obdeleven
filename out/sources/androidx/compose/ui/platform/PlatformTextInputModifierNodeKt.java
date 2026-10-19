package androidx.compose.ui.platform;

import androidx.compose.ui.node.C1185f;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14942a = new androidx.compose.runtime.O0(new Ia.a<X>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ X invoke() {
            return null;
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(InterfaceC1256y0 interfaceC1256y0, Ia.p pVar, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuationImpl;
            int i10 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
            }
        } else {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
        }
        Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        if (!interfaceC1256y0.getNode().f13997o) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        androidx.compose.ui.node.U uG = C1185f.g(interfaceC1256y0);
        X x10 = (X) C1185f.f(interfaceC1256y0).f14385C.a(f14942a);
        platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
        b(uG, x10, pVar, platformTextInputModifierNodeKt$establishTextInputSession$1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(androidx.compose.ui.node.U u10, X x10, Ia.p pVar, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuationImpl;
            int i10 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
            }
        } else {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
        }
        Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.b.b(obj);
                throw new KotlinNothingValueException();
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        if (x10 == null) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 1;
            u10.g(pVar, platformTextInputModifierNodeKt$interceptedTextInputSession$1);
        } else {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 2;
            x10.a(u10, pVar, platformTextInputModifierNodeKt$interceptedTextInputSession$1);
        }
    }
}
