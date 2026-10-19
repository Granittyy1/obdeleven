package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;

/* JADX INFO: compiled from: Savers.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Savers_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W.f f15397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W.f f15398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W.f f15399c;

    static {
        W.f fVar = SaverKt.f13134a;
        f15397a = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, r, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, r rVar) {
                Boolean boolValueOf = Boolean.valueOf(rVar.f15648a);
                W.f fVar2 = SaversKt.f15329a;
                return kotlin.collections.l.n(boolValueOf, new C1265f());
            }
        }, new Ia.l<Object, r>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
            @Override // Ia.l
            public final r invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                kotlin.jvm.internal.i.b(bool);
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.i.b(obj3 != null ? (C1265f) obj3 : null);
                return new r(zBooleanValue);
            }
        });
        f15398b = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.e, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.e eVar) {
                return Integer.valueOf(eVar.f15660a);
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.e>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.e invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new androidx.compose.ui.text.style.e(((Integer) obj).intValue());
            }
        });
        f15399c = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.l, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.l lVar) {
                androidx.compose.ui.text.style.l lVar2 = lVar;
                androidx.compose.ui.text.style.l.a aVar = new androidx.compose.ui.text.style.l.a(lVar2.f15683a);
                W.f fVar2 = SaversKt.f15329a;
                return kotlin.collections.l.n(aVar, Boolean.valueOf(lVar2.f15684b));
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.l>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.l invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                androidx.compose.ui.text.style.l.a aVar = obj2 != null ? (androidx.compose.ui.text.style.l.a) obj2 : null;
                kotlin.jvm.internal.i.b(aVar);
                Object obj3 = list.get(1);
                Boolean bool = obj3 != null ? (Boolean) obj3 : null;
                kotlin.jvm.internal.i.b(bool);
                return new androidx.compose.ui.text.style.l(aVar.f15685a, bool.booleanValue());
            }
        });
    }
}
