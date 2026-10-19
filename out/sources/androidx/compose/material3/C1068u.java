package androidx.compose.material3;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.compose.material3.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1068u implements InterfaceC1067t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Na.i f12750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.material3.internal.l f12751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f12752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f12753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f12754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f12755f;

    public C1068u(Long l10, Long l11, Na.i iVar, int i10, Z z10, Locale locale) {
        androidx.compose.material3.internal.n nVarF;
        androidx.compose.material3.internal.j jVarK;
        this.f12750a = iVar;
        androidx.compose.material3.internal.l lVar = new androidx.compose.material3.internal.l(locale);
        this.f12751b = lVar;
        this.f12752c = J0.f(z10);
        if (l11 != null) {
            nVarF = lVar.e(l11.longValue());
            int i11 = nVarF.f12550a;
            if (!iVar.A(i11)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i11 + ") is out of the years range of " + iVar + '.').toString());
            }
        } else {
            nVarF = lVar.f(lVar.g());
        }
        this.f12753d = J0.f(nVarF);
        if (l10 != null) {
            jVarK = this.f12751b.k(l10.longValue());
            int i12 = jVarK.f12542b;
            if (!iVar.A(i12)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i12 + ") is out of the years range of " + iVar + '.').toString());
            }
        } else {
            jVarK = null;
        }
        this.f12754e = J0.f(jVarK);
        this.f12755f = J0.f(new C1072y(i10));
    }

    @Override // androidx.compose.material3.InterfaceC1067t
    public final void a(int i10) {
        Long lF = f();
        if (lF != null) {
            c(this.f12751b.e(lF.longValue()).f12554e);
        }
        this.f12755f.setValue(new C1072y(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.InterfaceC1067t
    public final int b() {
        return ((C1072y) this.f12755f.getValue()).f12768a;
    }

    @Override // androidx.compose.material3.InterfaceC1067t
    public final void c(long j) {
        androidx.compose.material3.internal.n nVarE = this.f12751b.e(j);
        Na.i iVar = this.f12750a;
        int i10 = nVarE.f12550a;
        if (iVar.A(i10)) {
            this.f12753d.setValue(nVarE);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + i10 + ") is out of the years range of " + iVar + '.').toString());
    }

    @Override // androidx.compose.material3.InterfaceC1067t
    public final Z d() {
        return (Z) this.f12752c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.InterfaceC1067t
    public final long e() {
        return ((androidx.compose.material3.internal.n) this.f12753d.getValue()).f12554e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.InterfaceC1067t
    public final Long f() {
        androidx.compose.material3.internal.j jVar = (androidx.compose.material3.internal.j) this.f12754e.getValue();
        if (jVar != null) {
            return Long.valueOf(jVar.f12545e);
        }
        return null;
    }

    @Override // androidx.compose.material3.InterfaceC1067t
    public final Na.i g() {
        return this.f12750a;
    }

    @Override // androidx.compose.material3.InterfaceC1067t
    public final void h(Long l10) {
        C1085f0 c1085f0 = this.f12754e;
        if (l10 == null) {
            c1085f0.setValue(null);
            return;
        }
        androidx.compose.material3.internal.j jVarK = this.f12751b.k(l10.longValue());
        Na.i iVar = this.f12750a;
        int i10 = jVarK.f12542b;
        if (iVar.A(i10)) {
            c1085f0.setValue(jVarK);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + i10 + ") is out of the years range of " + iVar + '.').toString());
    }
}
