package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.C1269a;
import androidx.compose.ui.text.input.C1272d;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.view.C1293h;
import java.util.List;

/* JADX INFO: compiled from: CoreTextFieldSemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends AbstractC1187h implements b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.text.input.D f11275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextFieldValue f11276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LegacyTextFieldState f11277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11279v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.compose.ui.text.input.r f11280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextFieldSelectionManager f11281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.text.input.l f11282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FocusRequester f11283z;

    public static final void T1(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, LegacyTextFieldState legacyTextFieldState, String str, boolean z10, boolean z11) {
        coreTextFieldSemanticsModifierNode.getClass();
        if (z10 || !z11) {
            return;
        }
        androidx.compose.ui.text.input.C c10 = legacyTextFieldState.f11181e;
        Ia.l<TextFieldValue, p293xa.r> lVar = legacyTextFieldState.f11197v;
        p293xa.r rVar = null;
        if (c10 != null) {
            TextFieldValue textFieldValueA = legacyTextFieldState.f11180d.a(kotlin.collections.l.s(new C1272d(), new C1269a(str, 1)));
            c10.a(null, textFieldValueA);
            lVar.invoke(textFieldValueA);
            rVar = p293xa.r.f47939a;
        }
        if (rVar == null) {
            int length = str.length();
            lVar.invoke(new TextFieldValue(4, O.h.b(length, length), str));
        }
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(final androidx.compose.ui.semantics.w wVar) {
        C1260a c1260a = this.f11276s.f15491a;
        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
        androidx.compose.ui.semantics.v<C1260a> vVar = SemanticsProperties.f15137C;
        Oa.l<Object>[] lVarArr2 = androidx.compose.ui.semantics.t.f15251a;
        Oa.l<Object> lVar = lVarArr2[16];
        vVar.getClass();
        wVar.e(vVar, c1260a);
        C1260a c1260a2 = this.f11275r.f15484a;
        androidx.compose.ui.semantics.v<C1260a> vVar2 = SemanticsProperties.f15138D;
        Oa.l<Object> lVar2 = lVarArr2[17];
        vVar2.getClass();
        wVar.e(vVar2, c1260a2);
        long j = this.f11276s.f15492b;
        androidx.compose.ui.semantics.v<androidx.compose.ui.text.E> vVar3 = SemanticsProperties.f15139E;
        Oa.l<Object> lVar3 = lVarArr2[18];
        androidx.compose.ui.text.E e10 = new androidx.compose.ui.text.E(j);
        vVar3.getClass();
        wVar.e(vVar3, e10);
        androidx.compose.ui.autofill.c cVar = androidx.compose.ui.autofill.l.a.f13299a;
        androidx.compose.ui.semantics.v<androidx.compose.ui.autofill.l> vVar4 = SemanticsProperties.f15163q;
        Oa.l<Object> lVar4 = lVarArr2[8];
        vVar4.getClass();
        wVar.e(vVar4, cVar);
        wVar.e(androidx.compose.ui.semantics.k.f15215g, new androidx.compose.ui.semantics.a(null, new Ia.l<C1260a, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(C1260a c1260a3) {
                LegacyTextFieldState legacyTextFieldState = this.this$0.f11277t;
                Boolean bool = Boolean.TRUE;
                legacyTextFieldState.f11195t.setValue(bool);
                this.this$0.f11277t.f11194s.setValue(bool);
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                CoreTextFieldSemanticsModifierNode.T1(coreTextFieldSemanticsModifierNode, coreTextFieldSemanticsModifierNode.f11277t, c1260a3.f15408c, coreTextFieldSemanticsModifierNode.f11278u, coreTextFieldSemanticsModifierNode.f11279v);
                return bool;
            }
        }));
        if (!this.f11279v) {
            wVar.e(SemanticsProperties.f15156i, p293xa.r.f47939a);
        }
        boolean z10 = this.f11279v && !this.f11278u;
        androidx.compose.ui.semantics.v<Boolean> vVar5 = SemanticsProperties.f15146L;
        Oa.l<Object> lVar5 = lVarArr2[24];
        Boolean boolValueOf = Boolean.valueOf(z10);
        vVar5.getClass();
        wVar.e(vVar5, boolValueOf);
        androidx.compose.ui.semantics.t.d(wVar, new Ia.l<List<androidx.compose.ui.text.B>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(List<androidx.compose.ui.text.B> list) {
                boolean z11;
                List<androidx.compose.ui.text.B> list2 = list;
                if (this.this$0.f11277t.d() != null) {
                    androidx.compose.foundation.text.A aD = this.this$0.f11277t.d();
                    kotlin.jvm.internal.i.b(aD);
                    list2.add(aD.f11055a);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        if (z10) {
            wVar.e(androidx.compose.ui.semantics.k.j, new androidx.compose.ui.semantics.a(null, new Ia.l<C1260a, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$3
                {
                    super(1);
                }

                @Override // Ia.l
                public final Boolean invoke(C1260a c1260a3) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                    CoreTextFieldSemanticsModifierNode.T1(coreTextFieldSemanticsModifierNode, coreTextFieldSemanticsModifierNode.f11277t, c1260a3.f15408c, coreTextFieldSemanticsModifierNode.f11278u, coreTextFieldSemanticsModifierNode.f11279v);
                    return Boolean.TRUE;
                }
            }));
            wVar.e(androidx.compose.ui.semantics.k.f15221n, new androidx.compose.ui.semantics.a(null, new Ia.l<C1260a, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Boolean invoke(C1260a c1260a3) {
                    C1260a replacement = c1260a3;
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                    if (coreTextFieldSemanticsModifierNode.f11278u || !coreTextFieldSemanticsModifierNode.f11279v) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.ui.text.input.C c10 = coreTextFieldSemanticsModifierNode.f11277t.f11181e;
                    p293xa.r rVar = null;
                    if (c10 != null) {
                        List<? extends androidx.compose.ui.text.input.g> listS = kotlin.collections.l.s(new androidx.compose.ui.text.input.j(), new C1269a(replacement, 1));
                        LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.f11277t;
                        androidx.compose.ui.text.input.h hVar = legacyTextFieldState.f11180d;
                        Ia.l<TextFieldValue, p293xa.r> lVar6 = legacyTextFieldState.f11197v;
                        TextFieldValue textFieldValueA = hVar.a(listS);
                        c10.a(null, textFieldValueA);
                        lVar6.invoke(textFieldValueA);
                        rVar = p293xa.r.f47939a;
                    }
                    if (rVar == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = this.this$0;
                        TextFieldValue textFieldValue = coreTextFieldSemanticsModifierNode2.f11276s;
                        String str = textFieldValue.f15491a.f15408c;
                        int i10 = androidx.compose.ui.text.E.f15315c;
                        long j10 = textFieldValue.f15492b;
                        int i11 = (int) (j10 >> 32);
                        int i12 = (int) (j10 & 4294967295L);
                        kotlin.jvm.internal.i.e(str, "<this>");
                        kotlin.jvm.internal.i.e(replacement, "replacement");
                        if (i12 < i11) {
                            throw new IndexOutOfBoundsException(C1293h.h("End index (", ") is less than start index (", ").", i12, i11));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) str, 0, i11);
                        sb2.append((CharSequence) replacement);
                        sb2.append((CharSequence) str, i12, str.length());
                        String string = sb2.toString();
                        int length = replacement.f15408c.length() + ((int) (coreTextFieldSemanticsModifierNode2.f11276s.f15492b >> 32));
                        coreTextFieldSemanticsModifierNode2.f11277t.f11197v.invoke(new TextFieldValue(4, O.h.b(length, length), string));
                    }
                    return Boolean.TRUE;
                }
            }));
        }
        wVar.e(androidx.compose.ui.semantics.k.f15217i, new androidx.compose.ui.semantics.a(null, new Ia.q<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // Ia.q
            public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                boolean zBooleanValue = bool.booleanValue();
                if (!zBooleanValue) {
                    iIntValue = this.this$0.f11280w.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = this.this$0.f11280w.a(iIntValue2);
                }
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                boolean z11 = false;
                if (coreTextFieldSemanticsModifierNode.f11279v) {
                    long j10 = coreTextFieldSemanticsModifierNode.f11276s.f15492b;
                    int i10 = androidx.compose.ui.text.E.f15315c;
                    if (iIntValue != ((int) (j10 >> 32)) || iIntValue2 != ((int) (j10 & 4294967295L))) {
                        if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > this.this$0.f11276s.f15491a.f15408c.length()) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0.f11281x;
                            textFieldSelectionManager.r(false);
                            textFieldSelectionManager.p(HandleState.f11117b);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0.f11281x;
                                textFieldSelectionManager2.r(false);
                                textFieldSelectionManager2.p(HandleState.f11117b);
                            } else {
                                this.this$0.f11281x.g(true);
                            }
                            this.this$0.f11277t.f11197v.invoke(new TextFieldValue(this.this$0.f11276s.f15491a, O.h.b(iIntValue, iIntValue2), (androidx.compose.ui.text.E) null));
                            z11 = true;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            }
        }));
        int i10 = this.f11282y.f15554e;
        Ia.a<Boolean> aVar = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$6
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                coreTextFieldSemanticsModifierNode.f11277t.f11198w.invoke(new androidx.compose.ui.text.input.k(coreTextFieldSemanticsModifierNode.f11282y.f15554e));
                return Boolean.TRUE;
            }
        };
        wVar.e(SemanticsProperties.f15140F, new androidx.compose.ui.text.input.k(i10));
        wVar.e(androidx.compose.ui.semantics.k.f15222o, new androidx.compose.ui.semantics.a(null, aVar));
        androidx.compose.ui.semantics.t.e(wVar, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$7
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                M0 m7;
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.this$0;
                LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.f11277t;
                FocusRequester focusRequester = coreTextFieldSemanticsModifierNode.f11283z;
                boolean z11 = coreTextFieldSemanticsModifierNode.f11278u;
                if (!legacyTextFieldState.b()) {
                    focusRequester.b(7);
                } else if (!z11 && (m7 = legacyTextFieldState.f11179c) != null) {
                    m7.a();
                }
                return Boolean.TRUE;
            }
        });
        wVar.e(androidx.compose.ui.semantics.k.f15211c, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$8
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                this.this$0.f11281x.g(true);
                return Boolean.TRUE;
            }
        }));
        if (!androidx.compose.ui.text.E.b(this.f11276s.f15492b)) {
            wVar.e(androidx.compose.ui.semantics.k.f15223p, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$9
                {
                    super(0);
                }

                @Override // Ia.a
                public final Boolean invoke() {
                    this.this$0.f11281x.c(true);
                    return Boolean.TRUE;
                }
            }));
            if (this.f11279v && !this.f11278u) {
                wVar.e(androidx.compose.ui.semantics.k.f15224q, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$10
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        this.this$0.f11281x.e();
                        return Boolean.TRUE;
                    }
                }));
            }
        }
        if (!this.f11279v || this.f11278u) {
            return;
        }
        wVar.e(androidx.compose.ui.semantics.k.f15225r, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$11
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                this.this$0.f11281x.n();
                return Boolean.TRUE;
            }
        }));
    }

    @Override // androidx.compose.ui.node.b0
    public final boolean v1() {
        return true;
    }
}
