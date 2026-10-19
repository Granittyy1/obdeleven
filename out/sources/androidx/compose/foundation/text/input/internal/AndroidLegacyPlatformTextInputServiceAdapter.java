package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2694i0 f11262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y f11263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.flow.v f11264d;

    @Override // androidx.compose.ui.text.input.t
    public final void a(final TextFieldValue textFieldValue, final androidx.compose.ui.text.input.l lVar, final Ia.l<? super List<? extends androidx.compose.ui.text.input.g>, p293xa.r> lVar2, final Ia.l<? super androidx.compose.ui.text.input.k, p293xa.r> lVar3) {
        Ia.l<Y, p293xa.r> lVar4 = new Ia.l<Y, p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y y10) {
                Y y11 = y10;
                TextFieldValue textFieldValue2 = textFieldValue;
                T t8 = this.f11328a;
                androidx.compose.ui.text.input.l lVar5 = lVar;
                Ia.l<List<? extends androidx.compose.ui.text.input.g>, p293xa.r> lVar6 = lVar2;
                Ia.l<androidx.compose.ui.text.input.k, p293xa.r> lVar7 = lVar3;
                y11.f11336h = textFieldValue2;
                y11.f11337i = lVar5;
                y11.f11331c = lVar6;
                y11.f11332d = lVar7;
                y11.f11333e = t8 != null ? t8.f11309q : null;
                y11.f11334f = t8 != null ? t8.f11310r : null;
                y11.f11335g = t8 != null ? (Y0) C1183d.a(t8, CompositionLocalsKt.f14857s) : null;
                return p293xa.r.f47939a;
            }
        };
        T t8 = this.f11328a;
        if (t8 == null) {
            return;
        }
        this.f11262b = t8.f13997o ? C2680e.c(t8.E1(), null, CoroutineStart.f43169e, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(t8, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(lVar4, this, t8, null), null), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.t
    public final void b() {
        T t8 = this.f11328a;
        if (t8 == null) {
            return;
        }
        this.f11262b = t8.f13997o ? C2680e.c(t8.E1(), null, CoroutineStart.f43169e, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(t8, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(null, this, t8, null), null), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.t
    public final void d() {
        InterfaceC2694i0 interfaceC2694i0 = this.f11262b;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        this.f11262b = null;
        kotlinx.coroutines.flow.p<p293xa.r> pVarK = k();
        if (pVarK != null) {
            ((kotlinx.coroutines.flow.v) pVarK).e();
        }
    }

    @Override // androidx.compose.ui.text.input.t
    public final void e(I.f fVar) {
        Rect rect;
        Y y10 = this.f11263c;
        if (y10 != null) {
            y10.f11339l = new Rect(Ka.a.b(fVar.f3757a), Ka.a.b(fVar.f3758b), Ka.a.b(fVar.f3759c), Ka.a.b(fVar.f3760d));
            if (!y10.j.isEmpty() || (rect = y10.f11339l) == null) {
                return;
            }
            y10.f11329a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // androidx.compose.ui.text.input.t
    public final void f(TextFieldValue textFieldValue, androidx.compose.ui.text.input.r rVar, androidx.compose.ui.text.B b10, Ia.l<? super a0, p293xa.r> lVar, I.f fVar, I.f fVar2) {
        Y y10 = this.f11263c;
        if (y10 != null) {
            W w3 = y10.f11340m;
            synchronized (w3.f11314c) {
                try {
                    w3.j = textFieldValue;
                    w3.f11322l = rVar;
                    w3.f11321k = b10;
                    w3.f11323m = fVar;
                    w3.f11324n = fVar2;
                    if (w3.f11316e || w3.f11315d) {
                        w3.a();
                    }
                    p293xa.r rVar2 = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.t
    public final void h(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        Y y10 = this.f11263c;
        if (y10 != null) {
            boolean z10 = (androidx.compose.ui.text.E.a(y10.f11336h.f15492b, textFieldValue2.f15492b) && kotlin.jvm.internal.i.a(y10.f11336h.f15493c, textFieldValue2.f15493c)) ? false : true;
            y10.f11336h = textFieldValue2;
            int size = y10.j.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) y10.j.get(i10)).get();
                if (recordingInputConnection != null) {
                    recordingInputConnection.f11304g = textFieldValue2;
                }
            }
            W w3 = y10.f11340m;
            synchronized (w3.f11314c) {
                w3.j = null;
                w3.f11322l = null;
                w3.f11321k = null;
                w3.f11323m = null;
                w3.f11324n = null;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            if (kotlin.jvm.internal.i.a(textFieldValue, textFieldValue2)) {
                if (z10) {
                    InputMethodManagerImpl inputMethodManagerImpl = y10.f11330b;
                    int iE = androidx.compose.ui.text.E.e(textFieldValue2.f15492b);
                    int iD = androidx.compose.ui.text.E.d(textFieldValue2.f15492b);
                    androidx.compose.ui.text.E e10 = y10.f11336h.f15493c;
                    int iE2 = e10 != null ? androidx.compose.ui.text.E.e(e10.f15316a) : -1;
                    androidx.compose.ui.text.E e11 = y10.f11336h.f15493c;
                    inputMethodManagerImpl.c(iE, iD, iE2, e11 != null ? androidx.compose.ui.text.E.d(e11.f15316a) : -1);
                    return;
                }
                return;
            }
            if (textFieldValue != null && (!kotlin.jvm.internal.i.a(textFieldValue.f15491a.f15408c, textFieldValue2.f15491a.f15408c) || (androidx.compose.ui.text.E.a(textFieldValue.f15492b, textFieldValue2.f15492b) && !kotlin.jvm.internal.i.a(textFieldValue.f15493c, textFieldValue2.f15493c)))) {
                InputMethodManagerImpl inputMethodManagerImpl2 = y10.f11330b;
                inputMethodManagerImpl2.b().restartInput(inputMethodManagerImpl2.f11287a);
                return;
            }
            int size2 = y10.j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) y10.j.get(i11)).get();
                if (recordingInputConnection2 != null) {
                    TextFieldValue textFieldValue3 = y10.f11336h;
                    InputMethodManagerImpl inputMethodManagerImpl3 = y10.f11330b;
                    if (recordingInputConnection2.f11307k) {
                        recordingInputConnection2.f11304g = textFieldValue3;
                        if (recordingInputConnection2.f11306i) {
                            inputMethodManagerImpl3.b().updateExtractedText(inputMethodManagerImpl3.f11287a, recordingInputConnection2.f11305h, H3.c.b(textFieldValue3));
                        }
                        androidx.compose.ui.text.E e12 = textFieldValue3.f15493c;
                        int iE3 = e12 != null ? androidx.compose.ui.text.E.e(e12.f15316a) : -1;
                        androidx.compose.ui.text.E e13 = textFieldValue3.f15493c;
                        int iD2 = e13 != null ? androidx.compose.ui.text.E.d(e13.f15316a) : -1;
                        long j = textFieldValue3.f15492b;
                        inputMethodManagerImpl3.c(androidx.compose.ui.text.E.e(j), androidx.compose.ui.text.E.d(j), iE3, iD2);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.X
    public final void i() {
        kotlinx.coroutines.flow.p<p293xa.r> pVarK = k();
        if (pVarK != null) {
            ((kotlinx.coroutines.flow.v) pVarK).f(p293xa.r.f47939a);
        }
    }

    public final kotlinx.coroutines.flow.p<p293xa.r> k() {
        kotlinx.coroutines.flow.v vVar = this.f11264d;
        if (vVar != null) {
            return vVar;
        }
        if (!androidx.compose.foundation.text.handwriting.b.f11261a) {
            return null;
        }
        kotlinx.coroutines.flow.v vVarB = kotlinx.coroutines.flow.w.b(1, 0, BufferOverflow.f43245d, 2);
        this.f11264d = vVarB;
        return vVarB;
    }
}
