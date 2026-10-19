package androidx.compose.ui;

import Ia.l;
import Ia.p;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CombinedModifier implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f13272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13273c;

    public CombinedModifier(h hVar, h hVar2) {
        this.f13272b = hVar;
        this.f13273c = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.h
    public final <R> R b(R r10, p<? super R, ? super h.b, ? extends R> pVar) {
        return (R) this.f13273c.b(this.f13272b.b(r10, pVar), pVar);
    }

    @Override // androidx.compose.ui.h
    public final boolean d(l<? super h.b, Boolean> lVar) {
        return this.f13272b.d(lVar) && this.f13273c.d(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (kotlin.jvm.internal.i.a(this.f13272b, combinedModifier.f13272b) && kotlin.jvm.internal.i.a(this.f13273c, combinedModifier.f13273c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13273c.hashCode() * 31) + this.f13272b.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("["), (String) b("", new p<String, h.b, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // Ia.p
            public final String invoke(String str, h.b bVar) {
                String str2 = str;
                h.b bVar2 = bVar;
                if (str2.length() == 0) {
                    return bVar2.toString();
                }
                return str2 + ", " + bVar2;
            }
        }), ']');
    }
}
