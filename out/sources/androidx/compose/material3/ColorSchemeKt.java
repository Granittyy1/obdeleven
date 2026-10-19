package androidx.compose.material3;

import B.C0608c;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorSchemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f12087a = new O0(new Ia.a<C1061m>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // Ia.a
        public final C1061m invoke() {
            return ColorSchemeKt.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0 f12088b = new O0(new Ia.a<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    public static final long a(C1061m c1061m, long j) {
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12620a)) {
            return c1061m.f12621b;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12625f)) {
            return c1061m.f12626g;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.j)) {
            return c1061m.f12629k;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12632n)) {
            return c1061m.f12633o;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12641w)) {
            return c1061m.f12642x;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12622c)) {
            return c1061m.f12623d;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12627h)) {
            return c1061m.f12628i;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12630l)) {
            return c1061m.f12631m;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12643y)) {
            return c1061m.f12644z;
        }
        if (androidx.compose.ui.graphics.H.c(j, c1061m.f12639u)) {
            return c1061m.f12640v;
        }
        boolean zC = androidx.compose.ui.graphics.H.c(j, c1061m.f12634p);
        long j10 = c1061m.f12635q;
        if (!zC) {
            if (androidx.compose.ui.graphics.H.c(j, c1061m.f12636r)) {
                return c1061m.f12637s;
            }
            if (!androidx.compose.ui.graphics.H.c(j, c1061m.f12601D) && !androidx.compose.ui.graphics.H.c(j, c1061m.f12603F) && !androidx.compose.ui.graphics.H.c(j, c1061m.f12604G) && !androidx.compose.ui.graphics.H.c(j, c1061m.f12605H) && !androidx.compose.ui.graphics.H.c(j, c1061m.f12606I) && !androidx.compose.ui.graphics.H.c(j, c1061m.f12607J)) {
                int i10 = androidx.compose.ui.graphics.H.f13505m;
                return androidx.compose.ui.graphics.H.f13504l;
            }
        }
        return j10;
    }

    public static final long b(long j, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-1680936624);
        long jA = a((C1061m) interfaceC1084f.x(f12087a), j);
        if (jA == 16) {
            jA = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f12125a)).f13506a;
        }
        interfaceC1084f.D();
        return jA;
    }

    public static final long c(C1061m c1061m, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return c1061m.f12632n;
            case 1:
                return c1061m.f12641w;
            case 2:
                return c1061m.f12643y;
            case 3:
                return c1061m.f12640v;
            case 4:
                return c1061m.f12624e;
            case 5:
                return c1061m.f12639u;
            case 6:
                return c1061m.f12633o;
            case 7:
                return c1061m.f12642x;
            case 8:
                return c1061m.f12644z;
            case 9:
                return c1061m.f12621b;
            case 10:
                return c1061m.f12623d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            default:
                int i10 = androidx.compose.ui.graphics.H.f13505m;
                return androidx.compose.ui.graphics.H.f13504l;
            case 13:
                return c1061m.f12626g;
            case 14:
                return c1061m.f12628i;
            case 17:
                return c1061m.f12635q;
            case 18:
                return c1061m.f12637s;
            case 19:
                return c1061m.f12629k;
            case 20:
                return c1061m.f12631m;
            case 23:
                return c1061m.f12598A;
            case 24:
                return c1061m.f12599B;
            case 25:
                return c1061m.f12620a;
            case 26:
                return c1061m.f12622c;
            case 29:
                return c1061m.f12600C;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return c1061m.f12625f;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return c1061m.f12627h;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return c1061m.f12634p;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return c1061m.f12601D;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return c1061m.f12603F;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return c1061m.f12604G;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return c1061m.f12605H;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return c1061m.f12606I;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return c1061m.f12607J;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return c1061m.f12602E;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return c1061m.f12638t;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return c1061m.f12636r;
            case 44:
                return c1061m.j;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return c1061m.f12630l;
        }
    }

    public static final long d(ColorSchemeKeyTokens colorSchemeKeyTokens, InterfaceC1084f interfaceC1084f) {
        return c((C1061m) interfaceC1084f.x(f12087a), colorSchemeKeyTokens);
    }

    public static C1061m e(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i10) {
        long j19 = (i10 & 1) != 0 ? C0608c.f1222t : j;
        return new C1061m(j19, (i10 & 2) != 0 ? C0608c.j : j10, C0608c.f1223u, C0608c.f1213k, C0608c.f1208e, C0608c.f1225w, C0608c.f1214l, C0608c.f1226x, C0608c.f1215m, C0608c.f1202H, C0608c.f1218p, C0608c.f1203I, C0608c.f1219q, (i10 & 8192) != 0 ? C0608c.f1204a : j11, (i10 & 16384) != 0 ? C0608c.f1210g : j12, (32768 & i10) != 0 ? C0608c.f1227y : j13, (65536 & i10) != 0 ? C0608c.f1216n : j14, (131072 & i10) != 0 ? C0608c.f1201G : j15, (262144 & i10) != 0 ? C0608c.f1217o : j16, (524288 & i10) != 0 ? j19 : j17, C0608c.f1209f, C0608c.f1207d, (i10 & 4194304) != 0 ? C0608c.f1205b : j18, C0608c.f1211h, C0608c.f1206c, C0608c.f1212i, C0608c.f1220r, C0608c.f1221s, C0608c.f1224v, C0608c.f1228z, C0608c.f1200F, C0608c.f1195A, C0608c.f1196B, C0608c.f1197C, C0608c.f1198D, C0608c.f1199E);
    }
}
