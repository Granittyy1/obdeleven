package androidx.compose.ui.text.font;

import A1.C0575j;
import com.braze.Constants;

/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15424b;

    public a(int i10) {
        this.f15424b = i10;
    }

    @Override // androidx.compose.ui.text.font.q
    public final l a(l lVar) {
        int i10 = this.f15424b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? lVar : new l(Na.l.D(lVar.f15447b + i10, 1, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15424b == ((a) obj).f15424b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15424b);
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f15424b, ')');
    }
}
