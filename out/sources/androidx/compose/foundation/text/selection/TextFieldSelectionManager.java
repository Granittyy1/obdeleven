package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.G;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.I;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.P0;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.Z;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.C1274j;
import androidx.compose.ui.text.input.E;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f11552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.text.input.r f11553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lambda f11554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LegacyTextFieldState f11555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f11556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E f11557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Lambda f11558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z f11559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public A f11560i;
    public P0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M.a f11561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FocusRequester f11562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1085f0 f11563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1085f0 f11564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f11566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f11567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1085f0 f11568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f11569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextFieldValue f11571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s f11572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f11573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f11574x;

    public TextFieldSelectionManager() {
        this(null);
    }

    public static final void a(TextFieldSelectionManager textFieldSelectionManager, Handle handle) {
        textFieldSelectionManager.f11568r.setValue(handle);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public static final long b(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, long j, boolean z10, boolean z11, j jVar, boolean z12) {
        androidx.compose.foundation.text.A aD;
        i iVar;
        boolean z13;
        boolean z14;
        M.a aVar;
        int i10;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null) {
            return androidx.compose.ui.text.E.f15314b;
        }
        androidx.compose.ui.text.input.r rVar = textFieldSelectionManager.f11553b;
        long j10 = textFieldValue.f15492b;
        int i11 = androidx.compose.ui.text.E.f15315c;
        int iB = rVar.b((int) (j10 >> 32));
        androidx.compose.ui.text.input.r rVar2 = textFieldSelectionManager.f11553b;
        long j11 = textFieldValue.f15492b;
        long jB = O.h.b(iB, rVar2.b((int) (j11 & 4294967295L)));
        int iB2 = aD.b(j, false);
        int i12 = (z11 || z10) ? iB2 : (int) (jB >> 32);
        int i13 = (!z11 || z10) ? iB2 : (int) (jB & 4294967295L);
        s sVar = textFieldSelectionManager.f11572v;
        int i14 = -1;
        if (!z10 && sVar != null && (i10 = textFieldSelectionManager.f11570t) != -1) {
            i14 = i10;
        }
        B b10 = aD.f11055a;
        if (z10) {
            iVar = null;
        } else {
            int i15 = (int) (jB >> 32);
            int i16 = (int) (jB & 4294967295L);
            iVar = new i(new i.a(p.a(b10, i15), i15, 1L), new i.a(p.a(b10, i16), i16, 1L), androidx.compose.ui.text.E.f(jB));
        }
        s sVar2 = new s(z11, iVar, new h(i12, i13, i14, b10));
        if (iVar != null && sVar != null && z11 == sVar.f11621a) {
            h hVar = sVar.f11623c;
            if (i12 == hVar.f11598a && i13 == hVar.f11599b) {
                return j11;
            }
        }
        textFieldSelectionManager.f11572v = sVar2;
        textFieldSelectionManager.f11570t = iB2;
        i iVarG = jVar.g(sVar2);
        long jB2 = O.h.b(textFieldSelectionManager.f11553b.a(iVarG.f11602a.f11606b), textFieldSelectionManager.f11553b.a(iVarG.f11603b.f11606b));
        if (androidx.compose.ui.text.E.a(jB2, j11)) {
            return j11;
        }
        boolean z15 = androidx.compose.ui.text.E.f(jB2) != androidx.compose.ui.text.E.f(j11) && androidx.compose.ui.text.E.a(O.h.b((int) (4294967295L & jB2), (int) (jB2 >> 32)), j11);
        boolean z16 = androidx.compose.ui.text.E.b(jB2) && androidx.compose.ui.text.E.b(j11);
        C1260a c1260a = textFieldValue.f15491a;
        if (z12 && c1260a.f15408c.length() > 0 && !z15 && !z16 && (aVar = textFieldSelectionManager.f11561k) != null) {
            aVar.a(9);
        }
        textFieldSelectionManager.f11554c.invoke(d(c1260a, jB2));
        if (!z12) {
            textFieldSelectionManager.r(!androidx.compose.ui.text.E.b(jB2));
        }
        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.f11192q.setValue(Boolean.valueOf(z12));
        }
        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.f11188m.setValue(Boolean.valueOf(!androidx.compose.ui.text.E.b(jB2) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
        }
        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState4 == null) {
            z13 = false;
        } else {
            if (androidx.compose.ui.text.E.b(jB2)) {
                z13 = false;
            } else {
                z13 = false;
                if (TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)) {
                    z14 = true;
                }
                legacyTextFieldState4.f11189n.setValue(Boolean.valueOf(z14));
            }
            z14 = z13;
            legacyTextFieldState4.f11189n.setValue(Boolean.valueOf(z14));
        }
        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.f11555d;
        if (legacyTextFieldState5 != null) {
            legacyTextFieldState5.f11190o.setValue(Boolean.valueOf((androidx.compose.ui.text.E.b(jB2) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)) ? true : z13));
        }
        return jB2;
    }

    public static TextFieldValue d(C1260a c1260a, long j) {
        return new TextFieldValue(c1260a, j, (androidx.compose.ui.text.E) null);
    }

    public final z0 c(boolean z10) {
        A a10 = this.f11560i;
        if (a10 != null) {
            return C2680e.c(a10, null, CoroutineStart.f43169e, new TextFieldSelectionManager$copy$1(this, z10, null), 1);
        }
        return null;
    }

    public final void e() {
        A a10 = this.f11560i;
        if (a10 != null) {
            C2680e.c(a10, null, CoroutineStart.f43169e, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final void f(I.d dVar) {
        if (!androidx.compose.ui.text.E.b(l().f15492b)) {
            LegacyTextFieldState legacyTextFieldState = this.f11555d;
            androidx.compose.foundation.text.A aD = legacyTextFieldState != null ? legacyTextFieldState.d() : null;
            int iD = (dVar == null || aD == null) ? androidx.compose.ui.text.E.d(l().f15492b) : this.f11553b.a(aD.b(dVar.f3754a, true));
            this.f11554c.invoke(TextFieldValue.a(l(), null, O.h.b(iD, iD), 5));
        }
        p((dVar == null || l().f15491a.f15408c.length() <= 0) ? HandleState.f11117b : HandleState.f11119d);
        r(false);
    }

    public final void g(boolean z10) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.f11555d;
        if (legacyTextFieldState != null && !legacyTextFieldState.b() && (focusRequester = this.f11562l) != null) {
            FocusRequester focusRequester2 = FocusRequester.f13428b;
            focusRequester.b(7);
        }
        this.f11571u = l();
        r(z10);
        p(HandleState.f11118c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final I.d h() {
        return (I.d) this.f11569s.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f11563m.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        return ((Boolean) this.f11564n.getValue()).booleanValue();
    }

    public final long k(boolean z10) {
        androidx.compose.foundation.text.A aD;
        B b10;
        long j;
        LegacyTextFieldState legacyTextFieldState = this.f11555d;
        if (legacyTextFieldState == null || (aD = legacyTextFieldState.d()) == null || (b10 = aD.f11055a) == null) {
            return 9205357640488583168L;
        }
        LegacyTextFieldState legacyTextFieldState2 = this.f11555d;
        C1260a c1260a = legacyTextFieldState2 != null ? legacyTextFieldState2.f11177a.f11520a : null;
        if (c1260a == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.i.a(c1260a.f15408c, b10.f15300a.f15276a.f15408c)) {
            return 9205357640488583168L;
        }
        TextFieldValue textFieldValueL = l();
        if (z10) {
            long j10 = textFieldValueL.f15492b;
            int i10 = androidx.compose.ui.text.E.f15315c;
            j = j10 >> 32;
        } else {
            long j11 = textFieldValueL.f15492b;
            int i11 = androidx.compose.ui.text.E.f15315c;
            j = j11 & 4294967295L;
        }
        int iB = this.f11553b.b((int) j);
        boolean zF = androidx.compose.ui.text.E.f(l().f15492b);
        C1268i c1268i = b10.f15301b;
        int iD = c1268i.d(iB);
        if (iD >= c1268i.f15475f) {
            return 9205357640488583168L;
        }
        boolean z11 = b10.a(((!z10 || zF) && (z10 || !zF)) ? Math.max(iB + (-1), 0) : iB) == b10.h(iB);
        c1268i.l(iB);
        int length = c1268i.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(iB == length ? kotlin.collections.l.r(arrayList) : androidx.compose.ui.text.q.b(iB, arrayList));
        float fE = c1274j.f15582a.e(c1274j.d(iB), z11);
        long j12 = b10.f15302c;
        return (((long) Float.floatToRawIntBits(Na.l.C(c1268i.b(iD), 0.0f, (int) (j12 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Na.l.C(fE, 0.0f, (int) (j12 >> 32)))) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue l() {
        return (TextFieldValue) this.f11556e.getValue();
    }

    public final void m() {
        P0 p10;
        P0 p11 = this.j;
        if ((p11 != null ? p11.d() : null) != TextToolbarStatus.f14967b || (p10 = this.j) == null) {
            return;
        }
        p10.b();
    }

    public final void n() {
        A a10 = this.f11560i;
        if (a10 != null) {
            C2680e.c(a10, null, CoroutineStart.f43169e, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final void o() {
        TextFieldValue textFieldValueD = d(l().f15491a, O.h.b(0, l().f15491a.f15408c.length()));
        this.f11554c.invoke(textFieldValueD);
        this.f11571u = TextFieldValue.a(this.f11571u, null, textFieldValueD.f15492b, 5);
        g(true);
    }

    public final void p(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.f11555d;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.a() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.f11186k.setValue(handleState);
            }
        }
    }

    public final void q() {
        A a10 = this.f11560i;
        if (a10 != null) {
            C2680e.c(a10, null, CoroutineStart.f43169e, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1);
        }
    }

    public final void r(boolean z10) {
        LegacyTextFieldState legacyTextFieldState = this.f11555d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.f11187l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            q();
        } else {
            m();
        }
    }

    public TextFieldSelectionManager(G g10) {
        this.f11552a = g10;
        this.f11553b = I.f11125a;
        this.f11554c = new Ia.l<TextFieldValue, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(TextFieldValue textFieldValue) {
                return p293xa.r.f47939a;
            }
        };
        this.f11556e = J0.f(new TextFieldValue(7, 0L, (String) null));
        this.f11557f = E.a.f15486a;
        Boolean bool = Boolean.TRUE;
        this.f11563m = J0.f(bool);
        this.f11564n = J0.f(bool);
        this.f11565o = 0L;
        this.f11567q = 0L;
        this.f11568r = J0.f(null);
        this.f11569s = J0.f(null);
        this.f11570t = -1;
        this.f11571u = new TextFieldValue(7, 0L, (String) null);
        this.f11573w = new b();
        this.f11574x = new a();
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class a implements e {
        public a() {
        }

        @Override // androidx.compose.foundation.text.selection.e
        public final boolean a(long j, j jVar) {
            LegacyTextFieldState legacyTextFieldState;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f15491a.f15408c.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.f11555d) == null || legacyTextFieldState.d() == null) {
                return false;
            }
            FocusRequester focusRequester = textFieldSelectionManager.f11562l;
            if (focusRequester != null) {
                FocusRequester focusRequester2 = FocusRequester.f13428b;
                focusRequester.b(7);
            }
            textFieldSelectionManager.f11565o = j;
            textFieldSelectionManager.f11570t = -1;
            textFieldSelectionManager.g(true);
            d(textFieldSelectionManager.l(), textFieldSelectionManager.f11565o, true, jVar);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public final boolean c(long j, j jVar) {
            LegacyTextFieldState legacyTextFieldState;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f15491a.f15408c.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.f11555d) == null || legacyTextFieldState.d() == null) {
                return false;
            }
            d(textFieldSelectionManager.l(), j, false, jVar);
            return true;
        }

        public final void d(TextFieldValue textFieldValue, long j, boolean z10, j jVar) {
            TextFieldSelectionManager.this.p(androidx.compose.ui.text.E.b(TextFieldSelectionManager.b(TextFieldSelectionManager.this, textFieldValue, j, z10, false, jVar, false)) ? HandleState.f11119d : HandleState.f11118c);
        }

        @Override // androidx.compose.foundation.text.selection.e
        public final void b() {
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class b implements androidx.compose.foundation.text.t {
        public b() {
        }

        @Override // androidx.compose.foundation.text.t
        public final void a() {
            f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.text.t
        public final void b(long j) {
            androidx.compose.foundation.text.A aD;
            androidx.compose.foundation.text.A aD2;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            if (textFieldSelectionManager.j()) {
                C1085f0 c1085f0 = textFieldSelectionManager.f11568r;
                if (((Handle) c1085f0.getValue()) != null) {
                    return;
                }
                c1085f0.setValue(Handle.f11115d);
                textFieldSelectionManager.f11570t = -1;
                textFieldSelectionManager.m();
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState == null || (aD2 = legacyTextFieldState.d()) == null || !aD2.c(j)) {
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
                    if (legacyTextFieldState2 != null && (aD = legacyTextFieldState2.d()) != null) {
                        int iA = textFieldSelectionManager.f11553b.a(aD.b(j, true));
                        TextFieldValue textFieldValueD = TextFieldSelectionManager.d(textFieldSelectionManager.l().f15491a, O.h.b(iA, iA));
                        textFieldSelectionManager.g(false);
                        M.a aVar = textFieldSelectionManager.f11561k;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                        textFieldSelectionManager.f11554c.invoke(textFieldValueD);
                    }
                } else {
                    if (textFieldSelectionManager.l().f15491a.f15408c.length() == 0) {
                        return;
                    }
                    textFieldSelectionManager.g(false);
                    textFieldSelectionManager.f11566p = Integer.valueOf((int) (TextFieldSelectionManager.b(textFieldSelectionManager, TextFieldValue.a(textFieldSelectionManager.l(), null, androidx.compose.ui.text.E.f15314b, 5), j, true, false, j.a.f11609b, true) >> 32));
                }
                textFieldSelectionManager.p(HandleState.f11117b);
                textFieldSelectionManager.f11565o = j;
                textFieldSelectionManager.f11569s.setValue(new I.d(j));
                textFieldSelectionManager.f11567q = 0L;
            }
        }

        /* JADX WARN: Code duplicated, block: B:19:0x008c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0090  */
        /* JADX WARN: Code duplicated, block: B:22:0x0095  */
        @Override // androidx.compose.foundation.text.t
        public final void e(long j) {
            androidx.compose.foundation.text.A aD;
            Integer num;
            int iB;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f15491a.f15408c.length() == 0) {
                return;
            }
            textFieldSelectionManager.f11567q = I.d.g(textFieldSelectionManager.f11567q, j);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState != null && (aD = legacyTextFieldState.d()) != null) {
                textFieldSelectionManager.f11569s.setValue(new I.d(I.d.g(textFieldSelectionManager.f11565o, textFieldSelectionManager.f11567q)));
                Integer num2 = textFieldSelectionManager.f11566p;
                j jVar = j.a.f11609b;
                if (num2 == null) {
                    I.d dVarH = textFieldSelectionManager.h();
                    kotlin.jvm.internal.i.b(dVarH);
                    if (aD.c(dVarH.f3754a)) {
                        num = textFieldSelectionManager.f11566p;
                        if (num != null) {
                            iB = num.intValue();
                        } else {
                            iB = aD.b(textFieldSelectionManager.f11565o, false);
                        }
                        I.d dVarH2 = textFieldSelectionManager.h();
                        kotlin.jvm.internal.i.b(dVarH2);
                        int iB2 = aD.b(dVarH2.f3754a, false);
                        if (textFieldSelectionManager.f11566p != null && iB == iB2) {
                            return;
                        }
                        TextFieldValue textFieldValueL = textFieldSelectionManager.l();
                        I.d dVarH3 = textFieldSelectionManager.h();
                        kotlin.jvm.internal.i.b(dVarH3);
                        TextFieldSelectionManager.b(textFieldSelectionManager, textFieldValueL, dVarH3.f3754a, false, false, jVar, true);
                    } else {
                        int iA = textFieldSelectionManager.f11553b.a(aD.b(textFieldSelectionManager.f11565o, true));
                        androidx.compose.ui.text.input.r rVar = textFieldSelectionManager.f11553b;
                        I.d dVarH4 = textFieldSelectionManager.h();
                        kotlin.jvm.internal.i.b(dVarH4);
                        if (iA == rVar.a(aD.b(dVarH4.f3754a, true))) {
                            jVar = j.a.f11608a;
                        }
                        TextFieldValue textFieldValueL2 = textFieldSelectionManager.l();
                        I.d dVarH5 = textFieldSelectionManager.h();
                        kotlin.jvm.internal.i.b(dVarH5);
                        TextFieldSelectionManager.b(textFieldSelectionManager, textFieldValueL2, dVarH5.f3754a, false, false, jVar, true);
                    }
                } else {
                    num = textFieldSelectionManager.f11566p;
                    if (num != null) {
                        iB = num.intValue();
                    } else {
                        iB = aD.b(textFieldSelectionManager.f11565o, false);
                    }
                    I.d dVarH6 = textFieldSelectionManager.h();
                    kotlin.jvm.internal.i.b(dVarH6);
                    int iB3 = aD.b(dVarH6.f3754a, false);
                    if (textFieldSelectionManager.f11566p != null) {
                    }
                    TextFieldValue textFieldValueL3 = textFieldSelectionManager.l();
                    I.d dVarH7 = textFieldSelectionManager.h();
                    kotlin.jvm.internal.i.b(dVarH7);
                    TextFieldSelectionManager.b(textFieldSelectionManager, textFieldValueL3, dVarH7.f3754a, false, false, jVar, true);
                }
                int i10 = androidx.compose.ui.text.E.f15315c;
            }
            textFieldSelectionManager.r(false);
        }

        public final void f() {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            TextFieldSelectionManager.a(textFieldSelectionManager, null);
            textFieldSelectionManager.f11569s.setValue(null);
            textFieldSelectionManager.r(true);
            textFieldSelectionManager.f11566p = null;
            boolean zB = androidx.compose.ui.text.E.b(textFieldSelectionManager.l().f15492b);
            textFieldSelectionManager.p(zB ? HandleState.f11119d : HandleState.f11118c);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState != null) {
                legacyTextFieldState.f11188m.setValue(Boolean.valueOf(!zB && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
            }
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState2 != null) {
                legacyTextFieldState2.f11189n.setValue(Boolean.valueOf(!zB && TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)));
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState3 == null) {
                return;
            }
            legacyTextFieldState3.f11190o.setValue(Boolean.valueOf(zB && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
        }

        @Override // androidx.compose.foundation.text.t
        public final void onCancel() {
            f();
        }

        @Override // androidx.compose.foundation.text.t
        public final void c() {
        }

        @Override // androidx.compose.foundation.text.t
        public final void d() {
        }
    }
}
