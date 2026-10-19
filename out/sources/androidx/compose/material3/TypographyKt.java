package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TypographyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f12404a = new O0(new Ia.a<q0>() { // from class: androidx.compose.material3.TypographyKt$LocalTypography$1
        @Override // Ia.a
        public final q0 invoke() {
            return new q0(0);
        }
    });

    public static final androidx.compose.ui.text.F a(TypographyKeyTokens typographyKeyTokens, InterfaceC1084f interfaceC1084f) {
        q0 q0Var = (q0) interfaceC1084f.x(f12404a);
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return q0Var.j;
            case 1:
                return q0Var.f12697k;
            case 2:
                return q0Var.f12698l;
            case 3:
                return q0Var.f12688a;
            case 4:
                return q0Var.f12689b;
            case 5:
                return q0Var.f12690c;
            case 6:
                return q0Var.f12691d;
            case 7:
                return q0Var.f12692e;
            case 8:
                return q0Var.f12693f;
            case 9:
                return q0Var.f12699m;
            case 10:
                return q0Var.f12700n;
            case 11:
                return q0Var.f12701o;
            case 12:
                return q0Var.f12694g;
            case 13:
                return q0Var.f12695h;
            case 14:
                return q0Var.f12696i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
