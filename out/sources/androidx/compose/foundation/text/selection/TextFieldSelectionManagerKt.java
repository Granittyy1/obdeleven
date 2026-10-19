package androidx.compose.foundation.text.selection;

import V.G;
import androidx.compose.foundation.text.A;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.C1274j;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f11578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11579b;

        public a(TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
            this.f11578a = textFieldSelectionManager;
            this.f11579b = z10;
        }

        @Override // androidx.compose.foundation.text.selection.f
        public final long a() {
            return this.f11578a.k(this.f11579b);
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.text.t f11580b;

        public b(androidx.compose.foundation.text.t tVar) {
            this.f11580b = tVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            Object objA = LongPressTextDragObserverKt.a(wVar, this.f11580b, cVar);
            return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11581a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.f11113b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.f11113b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.f11113b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11581a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    public static final void a(final boolean z10, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        float f10;
        A aD;
        B b10;
        float fE;
        C1086g c1086gP = interfaceC1084f.p(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(resolvedTextDirection) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(textFieldSelectionManager) ? 256 : 128;
        }
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            int i12 = i11 & 14;
            boolean zK = (i12 == 4) | c1086gP.K(textFieldSelectionManager);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                textFieldSelectionManager.getClass();
                objF = new v(textFieldSelectionManager, z10);
                c1086gP.E(objF);
            }
            androidx.compose.foundation.text.t tVar = (androidx.compose.foundation.text.t) objF;
            boolean zK2 = (i12 == 4) | c1086gP.k(textFieldSelectionManager);
            Object objF2 = c1086gP.f();
            if (zK2 || objF2 == c0153a) {
                objF2 = new a(textFieldSelectionManager, z10);
                c1086gP.E(objF2);
            }
            f fVar = (f) objF2;
            boolean zF = E.f(textFieldSelectionManager.l().f15492b);
            TextFieldValue textFieldValueL = textFieldSelectionManager.l();
            int i13 = (int) (z10 ? textFieldValueL.f15492b >> 32 : textFieldValueL.f15492b & 4294967295L);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null || (b10 = aD.f11055a) == null) {
                f10 = 0.0f;
            } else {
                if (i13 < 0 || b10.f15300a.f15276a.f15408c.length() == 0) {
                    fE = 0.0f;
                } else {
                    C1268i c1268i = b10.f15301b;
                    int iMin = Math.min(c1268i.d(i13), Math.min(c1268i.f15471b - 1, c1268i.f15475f - 1));
                    if (i13 > c1268i.c(iMin, false)) {
                        fE = 0.0f;
                    } else {
                        c1268i.m(iMin);
                        ArrayList arrayList = c1268i.f15477h;
                        C1274j c1274j = (C1274j) arrayList.get(androidx.compose.ui.text.q.c(iMin, arrayList));
                        AndroidParagraph androidParagraph = c1274j.f15582a;
                        int i14 = iMin - c1274j.f15585d;
                        G g10 = androidParagraph.f15288d;
                        fE = g10.e(i14) - g10.g(i14);
                    }
                }
                f10 = fE;
            }
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            boolean zK3 = c1086gP.k(tVar);
            Object objF3 = c1086gP.f();
            if (zK3 || objF3 == c0153a) {
                objF3 = new b(tVar);
                c1086gP.E(objF3);
            }
            AndroidSelectionHandles_androidKt.b(fVar, z10, resolvedTextDirection, zF, 0L, f10, androidx.compose.ui.input.pointer.B.b(aVar, tVar, (PointerInputEventHandler) objF3), c1086gP, (i11 << 3) & 1008, 16);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldSelectionManagerKt.a(z10, resolvedTextDirection, textFieldSelectionManager, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final boolean b(TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        InterfaceC1170p interfaceC1170pC;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState == null || (interfaceC1170pC = legacyTextFieldState.c()) == null) {
            return false;
        }
        I.f fVarA = q.a(interfaceC1170pC);
        long jK = textFieldSelectionManager.k(z10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        if (fVarA.f3757a > fIntBitsToFloat || fIntBitsToFloat > fVarA.f3759c) {
            return false;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
        return fVarA.f3758b <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fVarA.f3760d;
    }
}
