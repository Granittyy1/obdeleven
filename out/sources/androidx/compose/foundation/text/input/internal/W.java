package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: compiled from: LegacyCursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<a0, p293xa.r> f11312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManagerImpl f11313b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11320i;
    public TextFieldValue j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.compose.ui.text.B f11321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.compose.ui.text.input.r f11322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public I.f f11323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I.f f11324n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11314c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f11325o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f11326p = a0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f11327q = new Matrix();

    public W(Ia.l lVar, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f11312a = lVar;
        this.f11313b = inputMethodManagerImpl;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        CursorAnchorInfo.Builder builder2;
        boolean z10;
        CursorAnchorInfo.Builder builder3;
        int iE;
        int iE2;
        InputMethodManagerImpl inputMethodManagerImpl = this.f11313b;
        InputMethodManager inputMethodManagerB = inputMethodManagerImpl.b();
        View view = inputMethodManagerImpl.f11287a;
        if (!inputMethodManagerB.isActive(view) || this.j == null || this.f11322l == null || this.f11321k == null || this.f11323m == null || this.f11324n == null) {
            return;
        }
        float[] fArr = this.f11326p;
        a0.d(fArr);
        InterfaceC1170p interfaceC1170pY = ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1) this.f11312a).$node.Y();
        if (interfaceC1170pY != null) {
            if (!interfaceC1170pY.c()) {
                interfaceC1170pY = null;
            }
            if (interfaceC1170pY != null) {
                interfaceC1170pY.G(fArr);
            }
        }
        p293xa.r rVar = p293xa.r.f47939a;
        I.f fVar = this.f11324n;
        kotlin.jvm.internal.i.b(fVar);
        float f10 = -fVar.f3757a;
        I.f fVar2 = this.f11324n;
        kotlin.jvm.internal.i.b(fVar2);
        a0.f(fArr, f10, -fVar2.f3758b, 0.0f);
        Matrix matrix = this.f11327q;
        L4.b.h(fArr, matrix);
        TextFieldValue textFieldValue = this.j;
        kotlin.jvm.internal.i.b(textFieldValue);
        androidx.compose.ui.text.input.r rVar2 = this.f11322l;
        kotlin.jvm.internal.i.b(rVar2);
        androidx.compose.ui.text.B b10 = this.f11321k;
        kotlin.jvm.internal.i.b(b10);
        I.f fVar3 = this.f11323m;
        kotlin.jvm.internal.i.b(fVar3);
        I.f fVar4 = this.f11324n;
        kotlin.jvm.internal.i.b(fVar4);
        boolean z11 = this.f11317f;
        boolean z12 = this.f11318g;
        boolean z13 = this.f11319h;
        boolean z14 = this.f11320i;
        CursorAnchorInfo.Builder builder4 = this.f11325o;
        builder4.reset();
        builder4.setMatrix(matrix);
        long j = textFieldValue.f15492b;
        int iE3 = androidx.compose.ui.text.E.e(j);
        builder4.setSelectionRange(iE3, androidx.compose.ui.text.E.d(j));
        if (!z11 || iE3 < 0) {
            builder = builder4;
        } else {
            int iB = rVar2.b(iE3);
            I.f fVarC = b10.c(iB);
            float fC = Na.l.C(fVarC.f3757a, 0.0f, (int) (b10.f15302c >> 32));
            boolean zA = V.a(fVar3, fC, fVarC.f3758b);
            boolean zA2 = V.a(fVar3, fC, fVarC.f3760d);
            boolean z15 = b10.a(iB) == ResolvedTextDirection.f15651c;
            int i10 = (zA || zA2) ? 1 : 0;
            if (!zA || !zA2) {
                i10 |= 2;
            }
            int i11 = z15 ? i10 | 4 : i10;
            float f11 = fVarC.f3758b;
            float f12 = fVarC.f3760d;
            builder = builder4;
            builder.setInsertionMarkerLocation(fC, f11, f12, f12, i11);
        }
        C1268i c1268i = b10.f15301b;
        float f13 = fVar3.f3760d;
        float f14 = fVar3.f3758b;
        if (z12) {
            androidx.compose.ui.text.E e10 = textFieldValue.f15493c;
            int iE4 = e10 != null ? androidx.compose.ui.text.E.e(e10.f15316a) : -1;
            int iD = e10 != null ? androidx.compose.ui.text.E.d(e10.f15316a) : -1;
            if (iE4 < 0 || iE4 >= iD) {
                z10 = z14;
                builder2 = builder;
            } else {
                builder.setComposingText(iE4, textFieldValue.f15491a.f15408c.subSequence(iE4, iD));
                androidx.compose.ui.text.input.r rVar3 = rVar2;
                int iB2 = rVar3.b(iE4);
                int iB3 = rVar3.b(iD);
                int i12 = iE4;
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                z10 = z14;
                builder2 = builder;
                c1268i.a(O.h.b(iB2, iB3), fArr2);
                int i13 = i12;
                while (i13 < iD) {
                    int iB4 = rVar3.b(i13);
                    int i14 = (iB4 - iB2) * 4;
                    androidx.compose.ui.text.input.r rVar4 = rVar3;
                    float f15 = fArr2[i14];
                    float[] fArr3 = fArr2;
                    float f16 = fArr3[i14 + 1];
                    int i15 = iD;
                    float f17 = fArr3[i14 + 2];
                    float f18 = fArr3[i14 + 3];
                    int i16 = iB2;
                    int i17 = (f15 < fVar3.f3759c ? 1 : 0) & (fVar3.f3757a < f17 ? 1 : 0) & (f14 < f18 ? 1 : 0) & (f16 < f13 ? 1 : 0);
                    if (!V.a(fVar3, f15, f16) || !V.a(fVar3, f17, f18)) {
                        i17 |= 2;
                    }
                    if (b10.a(iB4) == ResolvedTextDirection.f15651c) {
                        i17 |= 4;
                    }
                    builder2.addCharacterBounds(i13, f15, f16, f17, f18, i17);
                    i13++;
                    rVar3 = rVar4;
                    fArr2 = fArr3;
                    iD = i15;
                    iB2 = i16;
                }
            }
        } else {
            builder2 = builder;
            z10 = z14;
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 < 33 || !z13) {
            builder3 = builder2;
        } else {
            builder3 = builder2;
            builder3.setEditorBoundsInfo(C1007g.a().setEditorBounds(g0.c(fVar4)).setHandwritingBounds(g0.c(fVar4)).build());
        }
        if (i18 >= 34 && z10 && !fVar3.e() && (iE = c1268i.e(f14)) <= (iE2 = c1268i.e(f13))) {
            while (true) {
                builder3.addVisibleLineBounds(b10.e(iE), c1268i.f(iE), b10.f(iE), c1268i.b(iE));
                if (iE == iE2) {
                    break;
                } else {
                    iE++;
                }
            }
        }
        inputMethodManagerImpl.b().updateCursorAnchorInfo(view, builder3.build());
        this.f11316e = false;
    }
}
