package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H implements A0, kotlinx.coroutines.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f14913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.text.input.y f14914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.A f14915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f14916e = new AtomicReference(null);

    public H(View view, androidx.compose.ui.text.input.y yVar, kotlinx.coroutines.A a10) {
        this.f14913b = view;
        this.f14914c = yVar;
        this.f14915d = a10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1258z0
    public final View a() {
        return this.f14913b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.InterfaceC1258z0
    public final void b(final androidx.compose.foundation.text.input.internal.Y y10, ContinuationImpl continuationImpl) {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        if (continuationImpl instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) continuationImpl;
            int i10 = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i10 - Integer.MIN_VALUE;
            } else {
                androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
            }
        } else {
            androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
        }
        Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            AtomicReference atomicReference = this.f14916e;
            Ia.l<kotlinx.coroutines.A, C1233m0> lVar = new Ia.l<kotlinx.coroutines.A, C1233m0>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final C1233m0 invoke(kotlinx.coroutines.A a10) {
                    InterfaceC1254x0 interfaceC1254x0 = y10;
                    final H h8 = this;
                    return new C1233m0(interfaceC1254x0, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2.1
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            kotlinx.coroutines.B.c(h8.f14915d, null);
                            return p293xa.r.f47939a;
                        }
                    });
                }
            };
            AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
            androidPlatformTextInputSession$startInputMethod$1.label = 1;
            if (androidx.compose.ui.k.a(atomicReference, lVar, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutineSingletons) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f14915d.getCoroutineContext();
    }
}
