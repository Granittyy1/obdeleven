package androidx.compose.ui.autofill;

import C4.v;
import Ia.r;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.C;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.z;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.s;
import androidx.compose.ui.text.C1260a;

/* JADX INFO: compiled from: AndroidAutofillManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements androidx.compose.ui.semantics.n, androidx.compose.ui.focus.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f13286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f13287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f13288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.spatial.b f13289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f13291f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f13292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f13293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13294i;

    public b(n nVar, s sVar, AndroidComposeView androidComposeView, androidx.compose.ui.spatial.b bVar, String str) {
        this.f13286a = nVar;
        this.f13287b = sVar;
        this.f13288c = androidComposeView;
        this.f13289d = bVar;
        this.f13290e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw v.g("Required value was null.");
        }
        this.f13292g = autofillId;
        this.f13293h = new C((Object) null);
    }

    @Override // androidx.compose.ui.focus.m
    public final void a(z zVar, FocusTargetNode focusTargetNode) {
        LayoutNode layoutNodeF;
        androidx.compose.ui.semantics.l lVarF;
        LayoutNode layoutNodeF2;
        androidx.compose.ui.semantics.l lVarF2;
        if (zVar != null && (layoutNodeF2 = C1185f.f(zVar)) != null && (lVarF2 = layoutNodeF2.f()) != null) {
            if (lVarF2.f15234b.a(androidx.compose.ui.semantics.k.f15215g)) {
                this.f13286a.f13303a.notifyViewExited(this.f13288c, layoutNodeF2.f14401c);
            }
        }
        if (focusTargetNode == null || (layoutNodeF = C1185f.f(focusTargetNode)) == null || (lVarF = layoutNodeF.f()) == null) {
            return;
        }
        if (lVarF.f15234b.a(androidx.compose.ui.semantics.k.f15215g)) {
            final int i10 = layoutNodeF.f14401c;
            this.f13289d.f15259a.b(i10, new r<Integer, Integer, Integer, Integer, p293xa.r>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // Ia.r
                public final p293xa.r invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    int iIntValue3 = num3.intValue();
                    int iIntValue4 = num4.intValue();
                    b bVar = this.this$0;
                    n nVar = bVar.f13286a;
                    int i11 = i10;
                    Rect rect = new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    nVar.f13303a.notifyViewEntered(bVar.f13288c, i11, rect);
                    return p293xa.r.f47939a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // androidx.compose.ui.semantics.n
    public final void b(LayoutNode layoutNode, androidx.compose.ui.semantics.l lVar) {
        boolean z10;
        C1260a c1260a;
        C1260a c1260a2;
        androidx.compose.ui.semantics.l lVarF = layoutNode.f();
        int i10 = layoutNode.f14401c;
        String str = null;
        String str2 = (lVar == null || (c1260a2 = (C1260a) SemanticsConfigurationKt.a(lVar, SemanticsProperties.f15137C)) == null) ? null : c1260a2.f15408c;
        if (lVarF != null && (c1260a = (C1260a) SemanticsConfigurationKt.a(lVarF, SemanticsProperties.f15137C)) != null) {
            str = c1260a.f15408c;
        }
        boolean z11 = false;
        if (str2 != str) {
            n nVar = this.f13286a;
            AndroidComposeView androidComposeView = this.f13288c;
            if (str2 == null) {
                nVar.a(androidComposeView, i10, true);
            } else if (str == null) {
                nVar.a(androidComposeView, i10, false);
            } else if (kotlin.jvm.internal.i.a((l) SemanticsConfigurationKt.a(lVarF, SemanticsProperties.f15163q), l.a.f13299a)) {
                nVar.f13303a.notifyValueChanged(androidComposeView, i10, AutofillValue.forText(str.toString()));
            }
        }
        if (lVar == null) {
            z10 = false;
        } else if (lVar.f15234b.a(SemanticsProperties.f15162p)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (lVarF != null) {
            if (lVarF.f15234b.a(SemanticsProperties.f15162p)) {
                z11 = true;
            }
        }
        if (z10 != z11) {
            C c10 = this.f13293h;
            if (z11) {
                c10.b(i10);
            } else {
                c10.e(i10);
            }
        }
    }

    public final void c(final LayoutNode layoutNode) {
        this.f13289d.f15259a.b(layoutNode.f14401c, new r<Integer, Integer, Integer, Integer, p293xa.r>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public final p293xa.r invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                this.this$0.f13291f.set(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                b bVar = this.this$0;
                n nVar = bVar.f13286a;
                nVar.f13303a.requestAutofill(bVar.f13288c, layoutNode.s(), this.this$0.f13291f);
                return p293xa.r.f47939a;
            }
        });
    }
}
