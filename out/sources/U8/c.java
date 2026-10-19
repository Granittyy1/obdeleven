package U8;

import G8.u;
import androidx.compose.animation.D;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: ProgressWheelState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f6566f;

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        String str = null;
        this(0, 63, str, str);
    }

    public static c a(c cVar, String str, int i10, String str2, boolean z10, u uVar, int i11) {
        if ((i11 & 1) != 0) {
            str = cVar.f6561a;
        }
        String primaryText = str;
        if ((i11 & 2) != 0) {
            i10 = cVar.f6562b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = cVar.f6563c;
        }
        String secondaryText = str2;
        if ((i11 & 8) != 0) {
            z10 = cVar.f6564d;
        }
        boolean z11 = z10;
        if ((i11 & 32) != 0) {
            uVar = cVar.f6566f;
        }
        u animationRange = uVar;
        i.e(primaryText, "primaryText");
        i.e(secondaryText, "secondaryText");
        i.e(animationRange, "animationRange");
        return new c(primaryText, i12, secondaryText, z11, cVar.f6565e, animationRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f6561a, cVar.f6561a) && this.f6562b == cVar.f6562b && i.a(this.f6563c, cVar.f6563c) && this.f6564d == cVar.f6564d && this.f6565e == cVar.f6565e && i.a(this.f6566f, cVar.f6566f);
    }

    public final int hashCode() {
        return this.f6566f.hashCode() + q.b(this.f6565e, D.b(B1.a.b(this.f6563c, q.b(this.f6562b, this.f6561a.hashCode() * 31, 31), 31), 31, this.f6564d), 31);
    }

    public final String toString() {
        return "ProgressWheelState(primaryText=" + this.f6561a + ", primaryTextColor=" + this.f6562b + ", secondaryText=" + this.f6563c + ", isIndeterminate=" + this.f6564d + ", progress=" + this.f6565e + ", animationRange=" + this.f6566f + ")";
    }

    public /* synthetic */ c(int i10, int i11, String str, String str2) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? -1 : i10, (i11 & 4) != 0 ? "" : str2, false, 0, new u(0, 0));
    }

    public c(String primaryText, int i10, String secondaryText, boolean z10, int i11, u animationRange) {
        i.e(primaryText, "primaryText");
        i.e(secondaryText, "secondaryText");
        i.e(animationRange, "animationRange");
        this.f6561a = primaryText;
        this.f6562b = i10;
        this.f6563c = secondaryText;
        this.f6564d = z10;
        this.f6565e = i11;
        this.f6566f = animationRange;
    }
}
