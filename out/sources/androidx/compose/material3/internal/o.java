package androidx.compose.material3.internal;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f12556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12557c;

    public o(String str, char c10) {
        this.f12555a = str;
        this.f12556b = c10;
        this.f12557c = kotlin.text.m.G(str, String.valueOf(c10), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.i.a(this.f12555a, oVar.f12555a) && this.f12556b == oVar.f12556b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f12556b) + (this.f12555a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f12555a + ", delimiter=" + this.f12556b + ')';
    }
}
