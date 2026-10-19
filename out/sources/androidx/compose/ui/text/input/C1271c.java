package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.input.internal.C1007g;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class C1271c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManagerImpl f15521b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15528i;
    public TextFieldValue j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.compose.ui.text.B f15529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f15530l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I.f f15532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I.f f15533o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15522c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Lambda f15531m = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // Ia.l
        public final /* synthetic */ p293xa.r invoke(a0 a0Var) {
            float[] fArr = a0Var.f13538a;
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f15534p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f15535q = a0.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f15536r = new Matrix();

    public C1271c(AndroidComposeView androidComposeView, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f15520a = androidComposeView;
        this.f15521b = inputMethodManagerImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [xa.g] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final void a() {
        CursorAnchorInfo.Builder builder;
        View view;
        ?? r26;
        int iE;
        int iE2;
        int i10;
        InputMethodManagerImpl inputMethodManagerImpl = this.f15521b;
        ?? r10 = inputMethodManagerImpl.f15488b;
        InputMethodManager inputMethodManager = (InputMethodManager) r10.getValue();
        View view2 = inputMethodManagerImpl.f15487a;
        if (inputMethodManager.isActive(view2)) {
            ?? r11 = this.f15531m;
            float[] fArr = this.f15535q;
            r11.invoke(new a0(fArr));
            this.f15520a.d(fArr);
            Matrix matrix = this.f15536r;
            L4.b.h(fArr, matrix);
            TextFieldValue textFieldValue = this.j;
            kotlin.jvm.internal.i.b(textFieldValue);
            r rVar = this.f15530l;
            kotlin.jvm.internal.i.b(rVar);
            androidx.compose.ui.text.B b10 = this.f15529k;
            kotlin.jvm.internal.i.b(b10);
            I.f fVar = this.f15532n;
            kotlin.jvm.internal.i.b(fVar);
            I.f fVar2 = this.f15533o;
            kotlin.jvm.internal.i.b(fVar2);
            boolean z10 = this.f15525f;
            boolean z11 = this.f15526g;
            boolean z12 = this.f15527h;
            boolean z13 = this.f15528i;
            CursorAnchorInfo.Builder builder2 = this.f15534p;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j = textFieldValue.f15492b;
            int iE3 = androidx.compose.ui.text.E.e(j);
            builder2.setSelectionRange(iE3, androidx.compose.ui.text.E.d(j));
            if (!z10 || iE3 < 0) {
                builder = builder2;
            } else {
                int iB = rVar.b(iE3);
                I.f fVarC = b10.c(iB);
                float fC = Na.l.C(fVarC.f3757a, 0.0f, (int) (b10.f15302c >> 32));
                boolean zA = C1270b.a(fVar, fC, fVarC.f3758b);
                boolean zA2 = C1270b.a(fVar, fC, fVarC.f3760d);
                boolean z14 = b10.a(iB) == ResolvedTextDirection.f15651c;
                int i11 = (zA || zA2) ? 1 : 0;
                if (!zA || !zA2) {
                    i11 |= 2;
                }
                int i12 = z14 ? i11 | 4 : i11;
                float f10 = fVarC.f3758b;
                float f11 = fVarC.f3760d;
                builder = builder2;
                builder2.setInsertionMarkerLocation(fC, f10, f11, f11, i12);
            }
            C1268i c1268i = b10.f15301b;
            float f12 = fVar.f3760d;
            float f13 = fVar.f3758b;
            if (z11) {
                androidx.compose.ui.text.E e10 = textFieldValue.f15493c;
                int iE4 = e10 != null ? androidx.compose.ui.text.E.e(e10.f15316a) : -1;
                int iD = e10 != null ? androidx.compose.ui.text.E.d(e10.f15316a) : -1;
                if (iE4 >= 0 && iE4 < iD) {
                    builder.setComposingText(iE4, textFieldValue.f15491a.f15408c.subSequence(iE4, iD));
                    int iB2 = rVar.b(iE4);
                    int iB3 = rVar.b(iD);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    c1268i.a(O.h.b(iB2, iB3), fArr2);
                    int i13 = iE4;
                    while (i13 < iD) {
                        int iB4 = rVar.b(i13);
                        int i14 = (iB4 - iB2) * 4;
                        int i15 = iD;
                        float f14 = fArr2[i14];
                        int i16 = iB2;
                        float f15 = fArr2[i14 + 1];
                        r rVar2 = rVar;
                        float f16 = fArr2[i14 + 2];
                        View view3 = view2;
                        float f17 = fArr2[i14 + 3];
                        float[] fArr3 = fArr2;
                        ?? r27 = r10;
                        if (fVar.f3757a < f16) {
                            r10 = r10;
                            i10 = 1;
                        } else {
                            r10 = r10;
                            i10 = 0;
                        }
                        int i17 = (f14 < fVar.f3759c ? 1 : 0) & i10 & (f13 < f17 ? 1 : 0) & (f15 < f12 ? 1 : 0);
                        if (!C1270b.a(fVar, f14, f15) || !C1270b.a(fVar, f16, f17)) {
                            i17 |= 2;
                        }
                        if (b10.a(iB4) == ResolvedTextDirection.f15651c) {
                            i17 |= 4;
                        }
                        builder.addCharacterBounds(i13, f14, f15, f16, f17, i17);
                        i13++;
                        f12 = f12;
                        f13 = f13;
                        iD = i15;
                        iB2 = i16;
                        rVar = rVar2;
                        view2 = view3;
                        r10 = r27;
                        fArr2 = fArr3;
                    }
                    r10 = r10;
                }
                view = view2;
                r26 = r10;
            } else {
                view = view2;
                r26 = r10;
            }
            float f18 = f13;
            float f19 = f12;
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 33 && z12) {
                builder.setEditorBoundsInfo(C1007g.a().setEditorBounds(g0.c(fVar2)).setHandwritingBounds(g0.c(fVar2)).build());
            }
            if (i18 >= 34 && z13 && !fVar.e() && (iE = c1268i.e(f18)) <= (iE2 = c1268i.e(f19))) {
                while (true) {
                    builder.addVisibleLineBounds(b10.e(iE), c1268i.f(iE), b10.f(iE), c1268i.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) r26.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f15524e = false;
        }
    }
}
