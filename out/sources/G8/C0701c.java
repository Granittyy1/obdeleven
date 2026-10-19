package G8;

import org.json.JSONObject;

/* JADX INFO: renamed from: G8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackupResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0701c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f3446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3447b = "";

    public C0701c(JSONObject jSONObject) {
        this.f3446a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0701c)) {
            return false;
        }
        C0701c c0701c = (C0701c) obj;
        return kotlin.jvm.internal.i.a(this.f3446a, c0701c.f3446a) && kotlin.jvm.internal.i.a(this.f3447b, c0701c.f3447b);
    }

    public final int hashCode() {
        return this.f3447b.hashCode() + (this.f3446a.hashCode() * 31);
    }

    public final String toString() {
        return "BackupResult(backupData=" + this.f3446a + ", odxFileName=" + this.f3447b + ")";
    }
}
