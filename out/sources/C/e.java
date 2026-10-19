package C;

import C.e;
import Ia.l;
import Ia.p;
import L4.b;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.material.ripple.h;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC1078c;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.focus.C1123e;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;
import p318zb.C2839f;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final void a(final boolean z10, final p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1818896922);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            PredictiveBackHandlerKt.a(z10, pVar, c1086gP, i11 & R.styleable.AppCompatTheme_windowNoTitle, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: m2.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = b.l(i10 | 1);
                    e.a(z10, pVar, (InterfaceC1084f) obj, iL);
                    return r.f47939a;
                }
            };
        }
    }

    public static final int b(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return i10 | (i11 << 1);
    }

    public static final h c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof h) {
                return (h) childAt;
            }
        }
        h hVar = new h(viewGroup.getContext());
        viewGroup.addView(hVar);
        return hVar;
    }

    public static final ViewGroup d(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j10 = jArr[i11];
            if (j > j10) {
                i10 = i11 + 1;
            } else {
                if (j >= j10) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final I.f g(View view, AndroidComposeView androidComposeView) {
        int[] iArr = k.f13451a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        return new I.f(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final byte h(char c10) {
        if (c10 < '~') {
            return kotlinx.serialization.json.internal.e.f43982b[c10];
        }
        return (byte) 0;
    }

    public static float i(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static final ArrayList j(Map map, l lVar) {
        i.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            p141l2.r rVar = (p141l2.r) entry.getValue();
            Boolean boolValueOf = rVar != null ? Boolean.valueOf(rVar.f44289b) : null;
            i.b(boolValueOf);
            if (!boolValueOf.booleanValue() && !rVar.f44290c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void k(D0 d10, InterfaceC1078c interfaceC1078c, int i10) {
        while (true) {
            int i11 = d10.f12819v;
            if (i10 > i11 && i10 < d10.f12818u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            d10.L();
            if (d10.w(d10.f12819v)) {
                interfaceC1078c.f();
            }
            d10.i();
        }
    }

    public static byte[] l(p061ea.d dVar) throws Throwable {
        long j = ((long) (dVar.f34869f - dVar.f34868e)) + dVar.f34870g;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i10 = (int) j;
        i.e(dVar, "<this>");
        if (i10 == 0) {
            return p074fa.b.f35067a;
        }
        byte[] bArr = new byte[i10];
        boolean z10 = true;
        p074fa.a aVarB = p074fa.b.b(dVar, 1);
        if (aVarB != null) {
            int i11 = 0;
            do {
                try {
                    int iMin = Math.min(i10, aVarB.f34857c - aVarB.f34856b);
                    P3.d.r(aVarB, bArr, i11, iMin);
                    i10 -= iMin;
                    i11 += iMin;
                    if (i10 <= 0) {
                        p074fa.b.a(dVar, aVarB);
                        break;
                    }
                    try {
                        aVarB = p074fa.b.c(dVar, aVarB);
                    } catch (Throwable th) {
                        th = th;
                        z10 = false;
                        if (z10) {
                            p074fa.b.a(dVar, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (aVarB != null);
        }
        if (i10 <= 0) {
            return bArr;
        }
        throw new EOFException(J4.i.c(i10, "Premature end of stream: expected ", " bytes"));
    }

    public static final boolean m(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer n(int i10) {
        if (C1123e.a(i10, 5)) {
            return 33;
        }
        if (C1123e.a(i10, 6)) {
            return 130;
        }
        if (C1123e.a(i10, 3)) {
            return 17;
        }
        if (C1123e.a(i10, 4)) {
            return 66;
        }
        if (C1123e.a(i10, 1)) {
            return 2;
        }
        return C1123e.a(i10, 2) ? 1 : null;
    }

    public static final C1123e o(int i10) {
        if (i10 == 1) {
            return new C1123e(2);
        }
        if (i10 == 2) {
            return new C1123e(1);
        }
        if (i10 == 17) {
            return new C1123e(3);
        }
        if (i10 == 33) {
            return new C1123e(5);
        }
        if (i10 == 66) {
            return new C1123e(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new C1123e(6);
    }

    public static final String p(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }

    public E9.h e(int i10) {
        return new E9.h(new C2839f(), Math.min(1048576, Math.max(4096, i10)));
    }
}
