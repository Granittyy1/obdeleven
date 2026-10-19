package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handle f11614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectionHandleAnchor f11616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11617d;

    public m(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z10) {
        this.f11614a = handle;
        this.f11615b = j;
        this.f11616c = selectionHandleAnchor;
        this.f11617d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11614a == mVar.f11614a && I.d.b(this.f11615b, mVar.f11615b) && this.f11616c == mVar.f11616c && this.f11617d == mVar.f11617d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11617d) + ((this.f11616c.hashCode() + C4.b.c(this.f11615b, this.f11614a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f11614a);
        sb2.append(", position=");
        sb2.append((Object) I.d.i(this.f11615b));
        sb2.append(", anchor=");
        sb2.append(this.f11616c);
        sb2.append(", visible=");
        return Z3.o.d(sb2, this.f11617d, ')');
    }
}
