package D2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: TransitionValues.java */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2554b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2553a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<F> f2555c = new ArrayList<>();

    @Deprecated
    public O() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f2554b == o10.f2554b && this.f2553a.equals(o10.f2553a);
    }

    public final int hashCode() {
        return this.f2553a.hashCode() + (this.f2554b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbF = C4.b.f("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbF.append(this.f2554b);
        sbF.append("\n");
        String strB = androidx.compose.ui.text.font.s.b(sbF.toString(), "    values:");
        HashMap map = this.f2553a;
        for (String str : map.keySet()) {
            strB = strB + "    " + str + ": " + map.get(str) + "\n";
        }
        return strB;
    }

    public O(View view) {
        this.f2554b = view;
    }
}
