package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.compose.foundation.C0936h;
import com.google.common.base.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 extends AbstractC1866n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.base.j<Optional<InterfaceC1789c2>> f25586b;

    public S1(Context context, com.google.common.base.j<Optional<InterfaceC1789c2>> jVar) {
        this.f25585a = context;
        this.f25586b = jVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1866n2
    public final Context a() {
        return this.f25585a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1866n2
    public final com.google.common.base.j<Optional<InterfaceC1789c2>> b() {
        return this.f25586b;
    }

    public final boolean equals(Object obj) {
        com.google.common.base.j<Optional<InterfaceC1789c2>> jVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1866n2) {
            AbstractC1866n2 abstractC1866n2 = (AbstractC1866n2) obj;
            if (this.f25585a.equals(abstractC1866n2.a()) && ((jVar = this.f25586b) != null ? jVar.equals(abstractC1866n2.b()) : abstractC1866n2.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f25585a.hashCode() ^ 1000003) * 1000003;
        com.google.common.base.j<Optional<InterfaceC1789c2>> jVar = this.f25586b;
        return iHashCode ^ (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return C0936h.d("FlagsContext{context=", String.valueOf(this.f25585a), ", hermeticFileOverrides=", String.valueOf(this.f25586b), "}");
    }
}
