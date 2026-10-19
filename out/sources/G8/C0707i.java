package G8;

import com.voltasit.obdeleven.domain.models.NavigationType;
import com.voltasit.obdeleven.domain.models.Screen;
import java.util.Map;

/* JADX INFO: renamed from: G8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Destination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0707i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f3504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f3505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NavigationType f3507d;

    public C0707i() {
        throw null;
    }

    public C0707i(Screen screen, Map params, boolean z10, NavigationType navigationType, int i10) {
        params = (i10 & 2) != 0 ? kotlin.collections.y.p() : params;
        z10 = (i10 & 4) != 0 ? false : z10;
        navigationType = (i10 & 8) != 0 ? NavigationType.f30487b : navigationType;
        kotlin.jvm.internal.i.e(screen, "screen");
        kotlin.jvm.internal.i.e(params, "params");
        kotlin.jvm.internal.i.e(navigationType, "navigationType");
        this.f3504a = screen;
        this.f3505b = params;
        this.f3506c = z10;
        this.f3507d = navigationType;
    }

    public final String a() {
        Map<String, String> map = this.f3505b;
        boolean zIsEmpty = map.isEmpty();
        Screen screen = this.f3504a;
        if (zIsEmpty) {
            return screen.a();
        }
        String strA = screen.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strA = kotlin.text.m.G(strA, "{" + ((Object) entry.getKey()) + "}", entry.getValue());
        }
        return strA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0707i)) {
            return false;
        }
        C0707i c0707i = (C0707i) obj;
        return this.f3504a == c0707i.f3504a && kotlin.jvm.internal.i.a(this.f3505b, c0707i.f3505b) && this.f3506c == c0707i.f3506c && this.f3507d == c0707i.f3507d;
    }

    public final int hashCode() {
        return this.f3507d.hashCode() + androidx.compose.animation.D.b((this.f3505b.hashCode() + (this.f3504a.hashCode() * 31)) * 31, 31, this.f3506c);
    }

    public final String toString() {
        return "Destination(screen=" + this.f3504a + ", params=" + this.f3505b + ", clearBackStack=" + this.f3506c + ", navigationType=" + this.f3507d + ")";
    }
}
