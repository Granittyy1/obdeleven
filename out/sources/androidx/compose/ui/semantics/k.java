package androidx.compose.ui.semantics;

import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import java.util.List;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15207A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final v<a<Ia.l<List<Float>, Boolean>>> f15208B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v<a<Ia.l<List<B>, Boolean>>> f15209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v<a<Ia.p<Float, Float, Boolean>>> f15212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v<Ia.p<I.d, kotlin.coroutines.c<? super I.d>, Object>> f15213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v<a<Ia.l<Integer, Boolean>>> f15214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v<a<Ia.l<C1260a, Boolean>>> f15215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v<a<Ia.l<Float, Boolean>>> f15216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v<a<Ia.q<Integer, Integer, Boolean, Boolean>>> f15217i;
    public static final v<a<Ia.l<C1260a, Boolean>>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v<a<Ia.l<C1260a, Boolean>>> f15218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v<a<Ia.l<Boolean, Boolean>>> f15219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v<a<Ia.l<C1260a, Boolean>>> f15221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15228u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15229v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v<List<e>> f15230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15232y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v<a<Ia.a<Boolean>>> f15233z;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Ia.p<a<p293xa.e<? extends Boolean>>, a<p293xa.e<? extends Boolean>>, a<p293xa.e<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // Ia.p
            public final a<p293xa.e<? extends Boolean>> invoke(a<p293xa.e<? extends Boolean>> aVar, a<p293xa.e<? extends Boolean>> aVar2) {
                String str;
                p293xa.e eVar;
                a<p293xa.e<? extends Boolean>> aVar3 = aVar;
                a<p293xa.e<? extends Boolean>> aVar4 = aVar2;
                if (aVar3 == null || (str = aVar3.f15190a) == null) {
                    str = aVar4.f15190a;
                }
                if (aVar3 == null || (eVar = aVar3.f15191b) == null) {
                    eVar = aVar4.f15191b;
                }
                return new a<>(str, eVar);
            }
        };
        f15209a = t.b("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        f15210b = t.b("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f15211c = t.b("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f15212d = t.b("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        f15213e = new v<>("ScrollByOffset");
        f15214f = t.b("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        f15215g = t.b("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$1);
        f15216h = t.b("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        f15217i = t.b("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        j = t.b("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        f15218k = t.b("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        f15219l = t.b("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        f15220m = t.b("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        f15221n = t.b("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        f15222o = t.b("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        f15223p = t.b("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        f15224q = t.b("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        f15225r = t.b("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        f15226s = t.b("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        f15227t = t.b("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        f15228u = t.b("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        f15229v = t.b("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        f15230w = t.a("CustomActions");
        f15231x = t.b("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        f15232y = t.b("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        f15233z = t.b("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        f15207A = t.b("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        f15208B = t.b("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$1);
    }
}
