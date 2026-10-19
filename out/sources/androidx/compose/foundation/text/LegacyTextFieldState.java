package androidx.compose.foundation.text;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1103o0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1262c;
import androidx.compose.ui.text.input.TextFieldValue;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyTextFieldState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1085f0 f11176A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f11177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1103o0 f11178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0 f11179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.input.h f11180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.text.input.C f11181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f11182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f11183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1170p f11184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f11185i;
    public C1260a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f11186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1085f0 f11187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1085f0 f11188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1085f0 f11189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1085f0 f11190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1085f0 f11192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0999h f11193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f11194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f11195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Ia.l<? super TextFieldValue, p293xa.r> f11196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Ia.l<TextFieldValue, p293xa.r> f11197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Ia.l<androidx.compose.ui.text.input.k, p293xa.r> f11198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1142s f11199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11200y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1085f0 f11201z;

    public LegacyTextFieldState(r rVar, InterfaceC1103o0 interfaceC1103o0, M0 m7) {
        this.f11177a = rVar;
        this.f11178b = interfaceC1103o0;
        this.f11179c = m7;
        androidx.compose.ui.text.input.h hVar = new androidx.compose.ui.text.input.h();
        C1260a c1260a = C1262c.f15422a;
        long j = androidx.compose.ui.text.E.f15314b;
        TextFieldValue textFieldValue = new TextFieldValue(c1260a, j, (androidx.compose.ui.text.E) null);
        hVar.f15541a = textFieldValue;
        hVar.f15542b = new androidx.compose.ui.text.input.i(c1260a, textFieldValue.f15492b);
        this.f11180d = hVar;
        Boolean bool = Boolean.FALSE;
        this.f11182f = J0.f(bool);
        this.f11183g = J0.f(new p013b0.f(0));
        this.f11185i = J0.f(null);
        this.f11186k = J0.f(HandleState.f11117b);
        this.f11187l = J0.f(bool);
        this.f11188m = J0.f(bool);
        this.f11189n = J0.f(bool);
        this.f11190o = J0.f(bool);
        this.f11191p = true;
        this.f11192q = J0.f(Boolean.TRUE);
        this.f11193r = new C0999h(m7);
        this.f11194s = J0.f(bool);
        this.f11195t = J0.f(bool);
        this.f11196u = new Ia.l<TextFieldValue, p293xa.r>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(TextFieldValue textFieldValue2) {
                return p293xa.r.f47939a;
            }
        };
        this.f11197v = new LegacyTextFieldState$onValueChange$1(this);
        this.f11198w = new LegacyTextFieldState$onImeActionPerformed$1(this);
        this.f11199x = C1143t.a();
        this.f11200y = androidx.compose.ui.graphics.H.f13504l;
        this.f11201z = J0.f(new androidx.compose.ui.text.E(j));
        this.f11176A = J0.f(new androidx.compose.ui.text.E(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState a() {
        return (HandleState) this.f11186k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f11182f.getValue()).booleanValue();
    }

    public final InterfaceC1170p c() {
        InterfaceC1170p interfaceC1170p = this.f11184h;
        if (interfaceC1170p == null || !interfaceC1170p.c()) {
            return null;
        }
        return interfaceC1170p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final A d() {
        return (A) this.f11185i.getValue();
    }

    public final void e(long j) {
        this.f11176A.setValue(new androidx.compose.ui.text.E(j));
    }

    public final void f(long j) {
        this.f11201z.setValue(new androidx.compose.ui.text.E(j));
    }
}
