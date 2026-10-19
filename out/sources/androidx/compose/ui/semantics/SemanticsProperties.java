package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.E;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SemanticsProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v<List<String>> f15148a = t.b("ContentDescription", new Ia.p<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // Ia.p
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayListP0 = kotlin.collections.q.p0(list3);
            arrayListP0.addAll(list4);
            return arrayListP0;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v<String> f15149b = t.a("StateDescription");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v<h> f15150c = t.a("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v<String> f15151d = t.b("PaneTitle", new Ia.p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // Ia.p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v<p293xa.r> f15152e = t.a("SelectableGroup");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v<b> f15153f = t.a("CollectionInfo");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v<c> f15154g = t.a("CollectionItemInfo");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v<p293xa.r> f15155h = t.a("Heading");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v<p293xa.r> f15156i = t.a("Disabled");
    public static final v<g> j = t.a("LiveRegion");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v<Boolean> f15157k = t.a("Focused");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v<Boolean> f15158l = t.a("IsContainer");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v<Boolean> f15159m = new v<>("IsTraversalGroup");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v<p293xa.r> f15160n = new v<>("InvisibleToUser", new Ia.p<p293xa.r, p293xa.r, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // Ia.p
        public final p293xa.r invoke(p293xa.r rVar, p293xa.r rVar2) {
            return rVar;
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v<p293xa.r> f15161o = new v<>("HideFromAccessibility", new Ia.p<p293xa.r, p293xa.r, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // Ia.p
        public final p293xa.r invoke(p293xa.r rVar, p293xa.r rVar2) {
            return rVar;
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v<androidx.compose.ui.autofill.m> f15162p = new v<>("ContentType", new Ia.p<androidx.compose.ui.autofill.m, androidx.compose.ui.autofill.m, androidx.compose.ui.autofill.m>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // Ia.p
        public final androidx.compose.ui.autofill.m invoke(androidx.compose.ui.autofill.m mVar, androidx.compose.ui.autofill.m mVar2) {
            return mVar;
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v<androidx.compose.ui.autofill.l> f15163q = new v<>("ContentDataType", new Ia.p<androidx.compose.ui.autofill.l, androidx.compose.ui.autofill.l, androidx.compose.ui.autofill.l>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // Ia.p
        public final androidx.compose.ui.autofill.l invoke(androidx.compose.ui.autofill.l lVar, androidx.compose.ui.autofill.l lVar2) {
            return lVar;
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v<Float> f15164r = new v<>("TraversalIndex", new Ia.p<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        @Override // Ia.p
        public final Float invoke(Float f10, Float f11) {
            Float f12 = f10;
            f11.floatValue();
            return f12;
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v<j> f15165s = t.a("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v<j> f15166t = t.a("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v<p293xa.r> f15167u = t.b("IsPopup", new Ia.p<p293xa.r, p293xa.r, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // Ia.p
        public final p293xa.r invoke(p293xa.r rVar, p293xa.r rVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v<p293xa.r> f15168v = t.b("IsDialog", new Ia.p<p293xa.r, p293xa.r, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // Ia.p
        public final p293xa.r invoke(p293xa.r rVar, p293xa.r rVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v<i> f15169w = t.b("Role", new Ia.p<i, i, i>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // Ia.p
        public final i invoke(i iVar, i iVar2) {
            i iVar3 = iVar;
            int i10 = iVar2.f15203a;
            return iVar3;
        }
    });

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v<String> f15170x = new v<>("TestTag", false, new Ia.p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // Ia.p
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v<p293xa.r> f15171y = new v<>("LinkTestMarker", false, new Ia.p<p293xa.r, p293xa.r, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // Ia.p
        public final p293xa.r invoke(p293xa.r rVar, p293xa.r rVar2) {
            return rVar;
        }
    });

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v<List<C1260a>> f15172z = t.b("Text", new Ia.p<List<? extends C1260a>, List<? extends C1260a>, List<? extends C1260a>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // Ia.p
        public final List<? extends C1260a> invoke(List<? extends C1260a> list, List<? extends C1260a> list2) {
            List<? extends C1260a> list3 = list;
            List<? extends C1260a> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayListP0 = kotlin.collections.q.p0(list3);
            arrayListP0.addAll(list4);
            return arrayListP0;
        }
    });

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final v<C1260a> f15135A = new v<>("TextSubstitution");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final v<Boolean> f15136B = new v<>("IsShowingTextSubstitution");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final v<C1260a> f15137C = t.a("InputText");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final v<C1260a> f15138D = t.a("EditableText");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final v<E> f15139E = t.a("TextSelectionRange");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final v<androidx.compose.ui.text.input.k> f15140F = t.a("ImeAction");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final v<Boolean> f15141G = t.a("Selected");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final v<ToggleableState> f15142H = t.a("ToggleableState");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final v<p293xa.r> f15143I = t.a("Password");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final v<String> f15144J = t.a("Error");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final v<Ia.l<Object, Integer>> f15145K = new v<>("IndexForKey");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final v<Boolean> f15146L = new v<>("IsEditable");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final v<Integer> f15147M = new v<>("MaxTextLength");
}
