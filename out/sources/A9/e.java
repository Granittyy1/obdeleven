package A9;

import p304y9.I;

/* JADX INFO: compiled from: LoginResponseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f1001b;

    public e(int i10, I user) {
        kotlin.jvm.internal.i.e(user, "user");
        this.f1000a = i10;
        this.f1001b = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1000a == eVar.f1000a && kotlin.jvm.internal.i.a(this.f1001b, eVar.f1001b);
    }

    public final int hashCode() {
        return this.f1001b.hashCode() + (Integer.hashCode(this.f1000a) * 31);
    }

    public final String toString() {
        return "LoginResponseDTO(httpStatus=" + this.f1000a + ", user=" + this.f1001b + ")";
    }
}
