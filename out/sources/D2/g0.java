package D2;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: WindowIdApi18.java */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f2641a;

    public g0(ViewGroup viewGroup) {
        this.f2641a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).f2641a.equals(this.f2641a);
    }

    public final int hashCode() {
        return this.f2641a.hashCode();
    }
}
