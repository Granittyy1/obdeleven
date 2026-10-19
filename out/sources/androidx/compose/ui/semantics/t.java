package androidx.compose.ui.semantics;

import androidx.compose.ui.text.B;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Oa.l<Object>[] f15251a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        kotlin.jvm.internal.l.f43062a.getClass();
        f15251a = new Oa.l[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(t.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(t.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(t.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(t.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(t.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(t.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<a<Ia.l<List<B>, Boolean>>> vVar2 = k.f15209a;
    }

    public static final <T> v<T> a(String str) {
        v<T> vVar = new v<>(str);
        vVar.f15255c = true;
        return vVar;
    }

    public static final <T> v<T> b(String str, Ia.p<? super T, ? super T, ? extends T> pVar) {
        return new v<>(str, true, pVar);
    }

    public static void c(w wVar, final Ia.a aVar) {
        wVar.e(k.f15208B, new a(null, new Ia.l<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(List<Float> list) {
                boolean z10;
                List<Float> list2 = list;
                Float fInvoke = aVar.invoke();
                if (fInvoke == null) {
                    z10 = false;
                } else {
                    list2.add(fInvoke);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }));
    }

    public static void d(w wVar, Ia.l lVar) {
        wVar.e(k.f15209a, new a(null, lVar));
    }

    public static void e(w wVar, Ia.a aVar) {
        wVar.e(k.f15210b, new a(null, aVar));
    }

    public static final void f(w wVar) {
        v<Boolean> vVar = SemanticsProperties.f15158l;
        Oa.l<Object> lVar = f15251a[5];
        Boolean bool = Boolean.TRUE;
        vVar.getClass();
        wVar.e(vVar, bool);
    }

    public static final void g(String str, w wVar) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        wVar.e(SemanticsProperties.f15148a, M1.k(str));
    }

    public static final void h(w wVar, j jVar) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<j> vVar2 = SemanticsProperties.f15165s;
        Oa.l<Object> lVar = f15251a[10];
        vVar2.getClass();
        wVar.e(vVar2, jVar);
    }

    public static final void i(w wVar) {
        v<g> vVar = SemanticsProperties.j;
        Oa.l<Object> lVar = f15251a[3];
        g gVar = new g();
        vVar.getClass();
        wVar.e(vVar, gVar);
    }

    public static final void j(String str, w wVar) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<String> vVar2 = SemanticsProperties.f15151d;
        Oa.l<Object> lVar = f15251a[2];
        vVar2.getClass();
        wVar.e(vVar2, str);
    }

    public static final void k(w wVar, int i10) {
        v<i> vVar = SemanticsProperties.f15169w;
        Oa.l<Object> lVar = f15251a[12];
        i iVar = new i(i10);
        vVar.getClass();
        wVar.e(vVar, iVar);
    }

    public static final void l(w wVar, boolean z10) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<Boolean> vVar2 = SemanticsProperties.f15141G;
        Oa.l<Object> lVar = f15251a[20];
        Boolean boolValueOf = Boolean.valueOf(z10);
        vVar2.getClass();
        wVar.e(vVar2, boolValueOf);
    }

    public static final void m(w wVar) {
        v<Boolean> vVar = SemanticsProperties.f15159m;
        Oa.l<Object> lVar = f15251a[6];
        Boolean bool = Boolean.TRUE;
        vVar.getClass();
        wVar.e(vVar, bool);
    }

    public static final void n(w wVar, float f10) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<Float> vVar2 = SemanticsProperties.f15164r;
        Oa.l<Object> lVar = f15251a[9];
        Float fValueOf = Float.valueOf(f10);
        vVar2.getClass();
        wVar.e(vVar2, fValueOf);
    }

    public static final void o(w wVar, j jVar) {
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<j> vVar2 = SemanticsProperties.f15166t;
        Oa.l<Object> lVar = f15251a[11];
        vVar2.getClass();
        wVar.e(vVar2, jVar);
    }
}
