package O;

import Ia.q;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.font.s;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: Key.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h f4725a;

    public static final long a(int i10) {
        long j = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = b.f4720n;
        return j;
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            Y.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = E.f15315c;
        return j;
    }

    public static void c(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbE = A8.f.e(i10, "radix ", " was not in valid range ");
            sbE.append(new Na.i(2, 36, 1));
            throw new IllegalArgumentException(sbE.toString());
        }
    }

    public static String d(String str, boolean z10) {
        int i10 = Integer.parseInt(str, 16);
        String str2 = "P";
        if (z10) {
            int i11 = i10 >> 14;
            if (i11 != 0) {
                if (i11 == 1) {
                    str2 = "C";
                } else if (i11 != 2) {
                    str2 = i11 != 3 ? "" : "U";
                } else {
                    str2 = "B";
                }
            }
            return str2.concat(String.format(Locale.getDefault(), "%d%03X", Integer.valueOf((i10 >> 12) & 3), Integer.valueOf(i10 & 4095)));
        }
        if ((i10 >> 14) != 1) {
            return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i10));
        }
        int i12 = (i10 >> 12) & 3;
        if (i12 != 0) {
            if (i12 == 1) {
                str2 = "C";
            } else if (i12 != 2) {
                str2 = i12 != 3 ? "" : "U";
            } else {
                str2 = "B";
            }
        }
        return str2.concat(String.format(Locale.getDefault(), "%d%03d", Integer.valueOf((i10 >> 10) & 3), Integer.valueOf(i10 & 1023)));
    }

    public static String e(String str) {
        return Pattern.compile("^[BCPU]").matcher(str).find() ? s.b(str, "00") : B7.b.c("VAG", str);
    }

    public static final long f(int i10, long j) {
        int i11 = E.f15315c;
        int i12 = (int) (j >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j : b(i13, i10);
    }

    public static final boolean g(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static p221s.b h(p221s.a aVar) {
        return (p221s.b) ((CardView.a) aVar).f9069a;
    }

    public static String i(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        String strD = n.d(str);
        kotlin.jvm.internal.i.b(strD);
        return strD;
    }

    public static boolean j(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static void k(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof l0) {
                editorInfo.hintText = ((l0) parent).a();
                return;
            }
        }
    }

    public static final androidx.compose.ui.h m(androidx.compose.ui.h hVar) {
        return ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(359872873);
                WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                c0 c0VarC = c0.a.c(interfaceC1084f2);
                boolean zK = interfaceC1084f2.K(c0VarC);
                Object objF = interfaceC1084f2.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new InsetsPaddingModifier(c0VarC.f10261g);
                    interfaceC1084f2.E(objF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                interfaceC1084f2.D();
                return insetsPaddingModifier;
            }
        });
    }

    public static final long n(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final UUID o(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        UUID uuidFromString = UUID.fromString(str);
        kotlin.jvm.internal.i.d(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    public void l(p221s.a aVar, float f10) {
        p221s.b bVarH = h(aVar);
        CardView.a aVar2 = (CardView.a) aVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != bVarH.f46842e || bVarH.f46843f != useCompatPadding || bVarH.f46844g != preventCornerOverlap) {
            bVarH.f46842e = f10;
            bVarH.f46843f = useCompatPadding;
            bVarH.f46844g = preventCornerOverlap;
            bVarH.b(null);
            bVarH.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        float f11 = h(aVar).f46842e;
        float f12 = h(aVar).f46838a;
        int iCeil = (int) Math.ceil(p221s.c.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(p221s.c.b(f11, f12, cardView.getPreventCornerOverlap()));
        aVar2.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
