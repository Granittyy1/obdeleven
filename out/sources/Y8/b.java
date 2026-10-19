package Y8;

import C4.v;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TextChange.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7638b;

    public b(a aVar, boolean z10) {
        this.f7637a = aVar;
        this.f7638b = z10;
    }

    public final String a(Resources resources) {
        String string;
        a aVar = this.f7637a;
        if (aVar instanceof a.C0108a) {
            string = resources.getString(((a.C0108a) aVar).f7635a);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((a.b) aVar).f7636a;
        }
        i.b(string);
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7637a.equals(bVar.f7637a) && this.f7638b == bVar.f7638b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7638b) + (this.f7637a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextChange(text=");
        sb2.append(this.f7637a);
        sb2.append(", animate=");
        return v.f(sb2, this.f7638b, ")");
    }
}
