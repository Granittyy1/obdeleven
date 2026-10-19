package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegacyTextFieldState f11634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextFieldSelectionManager f11635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextFieldValue f11636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.text.selection.x f11639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.ui.text.input.r f11640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G f11641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0994c f11642i;
    public final InterfaceC0997f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Ia.l<TextFieldValue, p293xa.r> f11643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11644l;

    public x() {
        throw null;
    }

    public x(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, androidx.compose.foundation.text.selection.x xVar, androidx.compose.ui.text.input.r rVar, G g10, C0994c c0994c, Ia.l lVar, int i10) {
        C0998g.a aVar = C0998g.f11251a;
        this.f11634a = legacyTextFieldState;
        this.f11635b = textFieldSelectionManager;
        this.f11636c = textFieldValue;
        this.f11637d = z10;
        this.f11638e = z11;
        this.f11639f = xVar;
        this.f11640g = rVar;
        this.f11641h = g10;
        this.f11642i = c0994c;
        this.j = aVar;
        this.f11643k = lVar;
        this.f11644l = i10;
    }

    public final void a(List<? extends androidx.compose.ui.text.input.g> list) {
        androidx.compose.ui.text.input.h hVar = this.f11634a.f11180d;
        ArrayList arrayListP0 = kotlin.collections.q.p0(list);
        arrayListP0.add(0, new androidx.compose.ui.text.input.j());
        this.f11643k.invoke(hVar.a(arrayListP0));
    }
}
