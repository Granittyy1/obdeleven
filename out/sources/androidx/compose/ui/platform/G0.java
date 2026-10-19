package androidx.compose.ui.platform;

import java.util.Comparator;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G0 implements Comparator<androidx.compose.ui.semantics.q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G0 f14892b = new G0();

    @Override // java.util.Comparator
    public final int compare(androidx.compose.ui.semantics.q qVar, androidx.compose.ui.semantics.q qVar2) {
        I.f fVarF = qVar.f();
        I.f fVarF2 = qVar2.f();
        int iCompare = Float.compare(fVarF2.f3759c, fVarF.f3759c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(fVarF.f3758b, fVarF2.f3758b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(fVarF.f3760d, fVarF2.f3760d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(fVarF2.f3757a, fVarF.f3757a);
    }
}
