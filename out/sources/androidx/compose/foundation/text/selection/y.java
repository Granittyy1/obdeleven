package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11631b;

    public y(long j, long j10) {
        this.f11630a = j;
        this.f11631b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return H.c(this.f11630a, yVar.f11630a) && H.c(this.f11631b, yVar.f11631b);
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Long.hashCode(this.f11631b) + (Long.hashCode(this.f11630a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        C4.v.h(this.f11630a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) H.i(this.f11631b));
        sb2.append(')');
        return sb2.toString();
    }
}
