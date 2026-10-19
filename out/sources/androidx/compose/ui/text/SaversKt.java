package androidx.compose.ui.text;

import android.util.Log;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.graphics.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SaversKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W.f f15329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W.f f15330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W.f f15331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W.f f15332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W.f f15333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W.f f15334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W.f f15335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W.f f15336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W.f f15337i;
    public static final W.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W.f f15338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W.f f15339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W.f f15340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final W.f f15341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W.f f15342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W.f f15343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W.f f15344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f15345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f15346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f15347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final W.f f15348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final W.f f15349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W.f f15350w;

    static {
        W.f fVar = SaverKt.f13134a;
        f15329a = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, C1260a, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, C1260a c1260a) {
                C1260a c1260a2 = c1260a;
                String str = c1260a2.f15408c;
                W.f fVar2 = SaversKt.f15330b;
                return kotlin.collections.l.n(str, SaversKt.a(c1260a2.f15407b, fVar2, jVar));
            }
        }, new Ia.l<Object, C1260a>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
            @Override // Ia.l
            public final C1260a invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (kotlin.jvm.internal.i.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Ia.l) SaversKt.f15330b.f6997c).invoke(obj2);
                Object obj3 = list.get(0);
                String str = obj3 != null ? (String) obj3 : null;
                kotlin.jvm.internal.i.b(str);
                return new C1260a((List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>>) list2, str);
            }
        });
        f15330b = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, List<? extends C1260a.c<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, List<? extends C1260a.c<? extends Object>> list) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                List<? extends C1260a.c<? extends Object>> list2 = list;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(SaversKt.a(list2.get(i10), SaversKt.f15331c, jVar2));
                }
                return arrayList;
            }
        }, new Ia.l<Object, List<? extends C1260a.c<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
            @Override // Ia.l
            public final List<? extends C1260a.c<? extends Object>> invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    W.f fVar2 = SaversKt.f15331c;
                    C1260a.c cVar = null;
                    if (!kotlin.jvm.internal.i.a(obj2, Boolean.FALSE) && obj2 != null) {
                        cVar = (C1260a.c) ((Ia.l) fVar2.f6997c).invoke(obj2);
                    }
                    kotlin.jvm.internal.i.b(cVar);
                    arrayList.add(cVar);
                }
                return arrayList;
            }
        });
        f15331c = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, C1260a.c<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, C1260a.c<? extends Object> cVar) {
                AnnotationType annotationType;
                Object objA;
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                C1260a.c<? extends Object> cVar2 = cVar;
                T t8 = cVar2.f15418a;
                if (t8 instanceof n) {
                    annotationType = AnnotationType.f15292b;
                } else if (t8 instanceof v) {
                    annotationType = AnnotationType.f15293c;
                } else if (t8 instanceof J) {
                    annotationType = AnnotationType.f15294d;
                } else if (t8 instanceof I) {
                    annotationType = AnnotationType.f15295e;
                } else if (t8 instanceof AbstractC1266g.b) {
                    annotationType = AnnotationType.f15296f;
                } else if (t8 instanceof AbstractC1266g.a) {
                    annotationType = AnnotationType.f15297g;
                } else {
                    if (!(t8 instanceof x)) {
                        throw new UnsupportedOperationException();
                    }
                    annotationType = AnnotationType.f15298h;
                }
                int iOrdinal = annotationType.ordinal();
                T t10 = cVar2.f15418a;
                switch (iOrdinal) {
                    case 0:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = SaversKt.a((n) t10, SaversKt.f15336h, jVar2);
                        break;
                    case 1:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = SaversKt.a((v) t10, SaversKt.f15337i, jVar2);
                        break;
                    case 2:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = SaversKt.a((J) t10, SaversKt.f15332d, jVar2);
                        break;
                    case 3:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = SaversKt.a((I) t10, SaversKt.f15333e, jVar2);
                        break;
                    case 4:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = SaversKt.a((AbstractC1266g.b) t10, SaversKt.f15334f, jVar2);
                        break;
                    case 5:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = SaversKt.a((AbstractC1266g.a) t10, SaversKt.f15335g, jVar2);
                        break;
                    case 6:
                        kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        W.f fVar2 = SaversKt.f15329a;
                        objA = ((x) t10).f15709a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return kotlin.collections.l.n(annotationType, objA, Integer.valueOf(cVar2.f15419b), Integer.valueOf(cVar2.f15420c), cVar2.f15421d);
            }
        }, new Ia.l<Object, C1260a.c<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2
            @Override // Ia.l
            public final C1260a.c<? extends Object> invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                n nVar = null;
                aVar = null;
                AbstractC1266g.a aVar = null;
                bVar = null;
                AbstractC1266g.b bVar = null;
                i = null;
                I i10 = null;
                j = null;
                J j10 = null;
                vVar = null;
                v vVar = null;
                nVar = null;
                AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
                kotlin.jvm.internal.i.b(annotationType);
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                kotlin.jvm.internal.i.b(num);
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                kotlin.jvm.internal.i.b(num2);
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                kotlin.jvm.internal.i.b(str);
                switch (annotationType.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        W.f fVar2 = SaversKt.f15336h;
                        if (!kotlin.jvm.internal.i.a(obj6, Boolean.FALSE) && obj6 != null) {
                            nVar = (n) ((Ia.l) fVar2.f6997c).invoke(obj6);
                        }
                        kotlin.jvm.internal.i.b(nVar);
                        return new C1260a.c<>(iIntValue, iIntValue2, nVar, str);
                    case 1:
                        Object obj7 = list.get(1);
                        W.f fVar3 = SaversKt.f15337i;
                        if (!kotlin.jvm.internal.i.a(obj7, Boolean.FALSE) && obj7 != null) {
                            vVar = (v) ((Ia.l) fVar3.f6997c).invoke(obj7);
                        }
                        kotlin.jvm.internal.i.b(vVar);
                        return new C1260a.c<>(iIntValue, iIntValue2, vVar, str);
                    case 2:
                        Object obj8 = list.get(1);
                        W.f fVar4 = SaversKt.f15332d;
                        if (!kotlin.jvm.internal.i.a(obj8, Boolean.FALSE) && obj8 != null) {
                            j10 = (J) ((Ia.l) fVar4.f6997c).invoke(obj8);
                        }
                        kotlin.jvm.internal.i.b(j10);
                        return new C1260a.c<>(iIntValue, iIntValue2, j10, str);
                    case 3:
                        Object obj9 = list.get(1);
                        W.f fVar5 = SaversKt.f15333e;
                        if (!kotlin.jvm.internal.i.a(obj9, Boolean.FALSE) && obj9 != null) {
                            i10 = (I) ((Ia.l) fVar5.f6997c).invoke(obj9);
                        }
                        kotlin.jvm.internal.i.b(i10);
                        return new C1260a.c<>(iIntValue, iIntValue2, i10, str);
                    case 4:
                        Object obj10 = list.get(1);
                        W.f fVar6 = SaversKt.f15334f;
                        if (!kotlin.jvm.internal.i.a(obj10, Boolean.FALSE) && obj10 != null) {
                            bVar = (AbstractC1266g.b) ((Ia.l) fVar6.f6997c).invoke(obj10);
                        }
                        kotlin.jvm.internal.i.b(bVar);
                        return new C1260a.c<>(iIntValue, iIntValue2, bVar, str);
                    case 5:
                        Object obj11 = list.get(1);
                        W.f fVar7 = SaversKt.f15335g;
                        if (!kotlin.jvm.internal.i.a(obj11, Boolean.FALSE) && obj11 != null) {
                            aVar = (AbstractC1266g.a) ((Ia.l) fVar7.f6997c).invoke(obj11);
                        }
                        kotlin.jvm.internal.i.b(aVar);
                        return new C1260a.c<>(iIntValue, iIntValue2, aVar, str);
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        kotlin.jvm.internal.i.b(str2);
                        return new C1260a.c<>(iIntValue, iIntValue2, new x(str2), str);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        f15332d = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, J, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, J j10) {
                String str = j10.f15322a;
                W.f fVar2 = SaversKt.f15329a;
                return str;
            }
        }, new Ia.l<Object, J>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
            @Override // Ia.l
            public final J invoke(Object obj) {
                String str = obj != null ? (String) obj : null;
                kotlin.jvm.internal.i.b(str);
                return new J(str);
            }
        });
        f15333e = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, I, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, I i10) {
                String str = i10.f15321a;
                W.f fVar2 = SaversKt.f15329a;
                return str;
            }
        }, new Ia.l<Object, I>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
            @Override // Ia.l
            public final I invoke(Object obj) {
                String str = obj != null ? (String) obj : null;
                kotlin.jvm.internal.i.b(str);
                return new I(str);
            }
        });
        f15334f = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, AbstractC1266g.b, Object>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, AbstractC1266g.b bVar) {
                AbstractC1266g.b bVar2 = bVar;
                String str = bVar2.f15467a;
                W.f fVar2 = SaversKt.j;
                return kotlin.collections.l.n(str, SaversKt.a(bVar2.f15468b, fVar2, jVar));
            }
        }, new Ia.l<Object, AbstractC1266g.b>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
            @Override // Ia.l
            public final AbstractC1266g.b invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C c10 = null;
                String str = obj2 != null ? (String) obj2 : null;
                kotlin.jvm.internal.i.b(str);
                Object obj3 = list.get(1);
                W.f fVar2 = SaversKt.j;
                if (!kotlin.jvm.internal.i.a(obj3, Boolean.FALSE) && obj3 != null) {
                    c10 = (C) ((Ia.l) fVar2.f6997c).invoke(obj3);
                }
                return new AbstractC1266g.b(str, c10);
            }
        });
        f15335g = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, AbstractC1266g.a, Object>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, AbstractC1266g.a aVar) {
                AbstractC1266g.a aVar2 = aVar;
                String str = aVar2.f15464a;
                W.f fVar2 = SaversKt.j;
                return kotlin.collections.l.n(str, SaversKt.a(aVar2.f15465b, fVar2, jVar));
            }
        }, new Ia.l<Object, AbstractC1266g.a>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
            @Override // Ia.l
            public final AbstractC1266g.a invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                kotlin.jvm.internal.i.b(str);
                Object obj3 = list.get(1);
                return new AbstractC1266g.a(str, (kotlin.jvm.internal.i.a(obj3, Boolean.FALSE) || obj3 == null) ? null : (C) ((Ia.l) SaversKt.j.f6997c).invoke(obj3), null);
            }
        });
        f15336h = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, n, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, n nVar) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                n nVar2 = nVar;
                androidx.compose.ui.text.style.g gVar = new androidx.compose.ui.text.style.g(nVar2.f15592a);
                W.f fVar2 = SaversKt.f15329a;
                androidx.compose.ui.text.style.i iVar = new androidx.compose.ui.text.style.i(nVar2.f15593b);
                Object objA = SaversKt.a(new p013b0.n(nVar2.f15594c), SaversKt.f15346s, jVar2);
                androidx.compose.ui.text.style.k kVar = androidx.compose.ui.text.style.k.f15678c;
                Object objA2 = SaversKt.a(nVar2.f15595d, SaversKt.f15340m, jVar2);
                r rVar = r.f15647b;
                Object objA3 = SaversKt.a(nVar2.f15596e, Savers_androidKt.f15397a, jVar2);
                androidx.compose.ui.text.style.f fVar3 = androidx.compose.ui.text.style.f.f15661c;
                return kotlin.collections.l.n(gVar, iVar, objA, objA2, objA3, SaversKt.a(nVar2.f15597f, SaversKt.f15350w, jVar2), SaversKt.a(new androidx.compose.ui.text.style.e(nVar2.f15598g), Savers_androidKt.f15398b, jVar2), new androidx.compose.ui.text.style.d(nVar2.f15599h), SaversKt.a(nVar2.f15600i, Savers_androidKt.f15399c, jVar2));
            }
        }, new Ia.l<Object, n>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
            /* JADX WARN: Type inference failed for: r4v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final n invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                androidx.compose.ui.text.style.g gVar = obj2 != null ? (androidx.compose.ui.text.style.g) obj2 : null;
                kotlin.jvm.internal.i.b(gVar);
                Object obj3 = list.get(1);
                androidx.compose.ui.text.style.i iVar = obj3 != null ? (androidx.compose.ui.text.style.i) obj3 : null;
                kotlin.jvm.internal.i.b(iVar);
                Object obj4 = list.get(2);
                p013b0.o[] oVarArr = p013b0.n.f20492b;
                u uVar = SaversKt.f15346s;
                Boolean bool = Boolean.FALSE;
                p013b0.n nVar = ((kotlin.jvm.internal.i.a(obj4, bool) && uVar == null) || obj4 == null) ? null : (p013b0.n) uVar.f15689c.invoke(obj4);
                kotlin.jvm.internal.i.b(nVar);
                Object obj5 = list.get(3);
                androidx.compose.ui.text.style.k kVar = androidx.compose.ui.text.style.k.f15678c;
                androidx.compose.ui.text.style.k kVar2 = (kotlin.jvm.internal.i.a(obj5, bool) || obj5 == null) ? null : (androidx.compose.ui.text.style.k) ((Ia.l) SaversKt.f15340m.f6997c).invoke(obj5);
                Object obj6 = list.get(4);
                r rVar = r.f15647b;
                r rVar2 = (kotlin.jvm.internal.i.a(obj6, bool) || obj6 == null) ? null : (r) ((Ia.l) Savers_androidKt.f15397a.f6997c).invoke(obj6);
                Object obj7 = list.get(5);
                androidx.compose.ui.text.style.f fVar2 = androidx.compose.ui.text.style.f.f15661c;
                androidx.compose.ui.text.style.f fVar3 = (kotlin.jvm.internal.i.a(obj7, bool) || obj7 == null) ? null : (androidx.compose.ui.text.style.f) ((Ia.l) SaversKt.f15350w.f6997c).invoke(obj7);
                Object obj8 = list.get(6);
                androidx.compose.ui.text.style.e eVar = (kotlin.jvm.internal.i.a(obj8, bool) || obj8 == null) ? null : (androidx.compose.ui.text.style.e) ((Ia.l) Savers_androidKt.f15398b.f6997c).invoke(obj8);
                kotlin.jvm.internal.i.b(eVar);
                Object obj9 = list.get(7);
                androidx.compose.ui.text.style.d dVar = obj9 != null ? (androidx.compose.ui.text.style.d) obj9 : null;
                kotlin.jvm.internal.i.b(dVar);
                Object obj10 = list.get(8);
                return new n(gVar.f15669a, iVar.f15674a, nVar.f20494a, kVar2, rVar2, fVar3, eVar.f15660a, dVar.f15658a, (kotlin.jvm.internal.i.a(obj10, bool) || obj10 == null) ? null : (androidx.compose.ui.text.style.l) ((Ia.l) Savers_androidKt.f15399c.f6997c).invoke(obj10));
            }
        });
        f15337i = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, v, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, v vVar) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                v vVar2 = vVar;
                androidx.compose.ui.graphics.H h8 = new androidx.compose.ui.graphics.H(vVar2.f15690a.c());
                u uVar = SaversKt.f15345r;
                Object objA = SaversKt.a(h8, uVar, jVar2);
                p013b0.n nVar = new p013b0.n(vVar2.f15691b);
                u uVar2 = SaversKt.f15346s;
                Object objA2 = SaversKt.a(nVar, uVar2, jVar2);
                androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15438c;
                Object objA3 = SaversKt.a(vVar2.f15692c, SaversKt.f15341n, jVar2);
                Object objA4 = SaversKt.a(new p013b0.n(vVar2.f15697h), uVar2, jVar2);
                Object objA5 = SaversKt.a(vVar2.f15698i, SaversKt.f15342o, jVar2);
                Object objA6 = SaversKt.a(vVar2.j, SaversKt.f15339l, jVar2);
                Z.c cVar = Z.c.f7671d;
                Object objA7 = SaversKt.a(vVar2.f15699k, SaversKt.f15348u, jVar2);
                Object objA8 = SaversKt.a(new androidx.compose.ui.graphics.H(vVar2.f15700l), uVar, jVar2);
                Object objA9 = SaversKt.a(vVar2.f15701m, SaversKt.f15338k, jVar2);
                k0 k0Var = k0.f13652d;
                Object objA10 = SaversKt.a(vVar2.f15702n, SaversKt.f15344q, jVar2);
                return kotlin.collections.l.n(objA, objA2, objA3, vVar2.f15693d, vVar2.f15694e, -1, vVar2.f15696g, objA4, objA5, objA6, objA7, objA8, objA9, objA10);
            }
        }, new Ia.l<Object, v>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
            /* JADX WARN: Type inference failed for: r2v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r4v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r6v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r7v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final v invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i10 = androidx.compose.ui.graphics.H.f13505m;
                u uVar = SaversKt.f15345r;
                Boolean bool = Boolean.FALSE;
                androidx.compose.ui.graphics.H h8 = ((kotlin.jvm.internal.i.a(obj2, bool) && uVar == null) || obj2 == null) ? null : (androidx.compose.ui.graphics.H) uVar.f15689c.invoke(obj2);
                kotlin.jvm.internal.i.b(h8);
                Object obj3 = list.get(1);
                p013b0.o[] oVarArr = p013b0.n.f20492b;
                u uVar2 = SaversKt.f15346s;
                p013b0.n nVar = ((kotlin.jvm.internal.i.a(obj3, bool) && uVar2 == null) || obj3 == null) ? null : (p013b0.n) uVar2.f15689c.invoke(obj3);
                kotlin.jvm.internal.i.b(nVar);
                Object obj4 = list.get(2);
                androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15438c;
                androidx.compose.ui.text.font.l lVar2 = (kotlin.jvm.internal.i.a(obj4, bool) || obj4 == null) ? null : (androidx.compose.ui.text.font.l) ((Ia.l) SaversKt.f15341n.f6997c).invoke(obj4);
                Object obj5 = list.get(3);
                androidx.compose.ui.text.font.j jVar = obj5 != null ? (androidx.compose.ui.text.font.j) obj5 : null;
                Object obj6 = list.get(4);
                androidx.compose.ui.text.font.k kVar = obj6 != null ? (androidx.compose.ui.text.font.k) obj6 : null;
                Object obj7 = list.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list.get(7);
                p013b0.n nVar2 = ((kotlin.jvm.internal.i.a(obj8, bool) && uVar2 == null) || obj8 == null) ? null : (p013b0.n) uVar2.f15689c.invoke(obj8);
                kotlin.jvm.internal.i.b(nVar2);
                Object obj9 = list.get(8);
                androidx.compose.ui.text.style.a aVar = (kotlin.jvm.internal.i.a(obj9, bool) || obj9 == null) ? null : (androidx.compose.ui.text.style.a) ((Ia.l) SaversKt.f15342o.f6997c).invoke(obj9);
                Object obj10 = list.get(9);
                androidx.compose.ui.text.style.j jVar2 = (kotlin.jvm.internal.i.a(obj10, bool) || obj10 == null) ? null : (androidx.compose.ui.text.style.j) ((Ia.l) SaversKt.f15339l.f6997c).invoke(obj10);
                Object obj11 = list.get(10);
                Z.c cVar = Z.c.f7671d;
                Z.c cVar2 = (kotlin.jvm.internal.i.a(obj11, bool) || obj11 == null) ? null : (Z.c) ((Ia.l) SaversKt.f15348u.f6997c).invoke(obj11);
                Object obj12 = list.get(11);
                androidx.compose.ui.graphics.H h10 = ((kotlin.jvm.internal.i.a(obj12, bool) && uVar == null) || obj12 == null) ? null : (androidx.compose.ui.graphics.H) uVar.f15689c.invoke(obj12);
                kotlin.jvm.internal.i.b(h10);
                Object obj13 = list.get(12);
                androidx.compose.ui.text.style.h hVar = (kotlin.jvm.internal.i.a(obj13, bool) || obj13 == null) ? null : (androidx.compose.ui.text.style.h) ((Ia.l) SaversKt.f15338k.f6997c).invoke(obj13);
                Object obj14 = list.get(13);
                k0 k0Var = k0.f13652d;
                k0 k0Var2 = (kotlin.jvm.internal.i.a(obj14, bool) || obj14 == null) ? null : (k0) ((Ia.l) SaversKt.f15344q.f6997c).invoke(obj14);
                return new v(h8.f13506a, nVar.f20494a, lVar2, jVar, kVar, null, str, nVar2.f20494a, aVar, jVar2, cVar2, h10.f13506a, hVar, k0Var2, 49184);
            }
        });
        j = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, C, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, C c10) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                C c11 = c10;
                v vVar = c11.f15306a;
                W.f fVar2 = SaversKt.f15337i;
                return kotlin.collections.l.n(SaversKt.a(vVar, fVar2, jVar2), SaversKt.a(c11.f15307b, fVar2, jVar2), SaversKt.a(c11.f15308c, fVar2, jVar2), SaversKt.a(c11.f15309d, fVar2, jVar2));
            }
        }, new Ia.l<Object, C>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
            @Override // Ia.l
            public final C invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                W.f fVar2 = SaversKt.f15337i;
                Boolean bool = Boolean.FALSE;
                v vVar = null;
                v vVar2 = (kotlin.jvm.internal.i.a(obj2, bool) || obj2 == null) ? null : (v) ((Ia.l) fVar2.f6997c).invoke(obj2);
                Object obj3 = list.get(1);
                v vVar3 = (kotlin.jvm.internal.i.a(obj3, bool) || obj3 == null) ? null : (v) ((Ia.l) fVar2.f6997c).invoke(obj3);
                Object obj4 = list.get(2);
                v vVar4 = (kotlin.jvm.internal.i.a(obj4, bool) || obj4 == null) ? null : (v) ((Ia.l) fVar2.f6997c).invoke(obj4);
                Object obj5 = list.get(3);
                if (!kotlin.jvm.internal.i.a(obj5, bool) && obj5 != null) {
                    vVar = (v) ((Ia.l) fVar2.f6997c).invoke(obj5);
                }
                return new C(vVar2, vVar3, vVar4, vVar);
            }
        });
        f15338k = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.h, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.h hVar) {
                return Integer.valueOf(hVar.f15673a);
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.h>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.h invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new androidx.compose.ui.text.style.h(((Integer) obj).intValue());
            }
        });
        f15339l = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.j, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.j jVar2) {
                androidx.compose.ui.text.style.j jVar3 = jVar2;
                return kotlin.collections.l.n(Float.valueOf(jVar3.f15676a), Float.valueOf(jVar3.f15677b));
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.j>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.j invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list = (List) obj;
                return new androidx.compose.ui.text.style.j(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            }
        });
        f15340m = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.k, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.k kVar) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                androidx.compose.ui.text.style.k kVar2 = kVar;
                p013b0.n nVar = new p013b0.n(kVar2.f15679a);
                u uVar = SaversKt.f15346s;
                return kotlin.collections.l.n(SaversKt.a(nVar, uVar, jVar2), SaversKt.a(new p013b0.n(kVar2.f15680b), uVar, jVar2));
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.k>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
            /* JADX WARN: Type inference failed for: r2v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r4v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final androidx.compose.ui.text.style.k invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                p013b0.o[] oVarArr = p013b0.n.f20492b;
                u uVar = SaversKt.f15346s;
                Boolean bool = Boolean.FALSE;
                p013b0.n nVar = null;
                p013b0.n nVar2 = ((kotlin.jvm.internal.i.a(obj2, bool) && uVar == null) || obj2 == null) ? null : (p013b0.n) uVar.f15689c.invoke(obj2);
                kotlin.jvm.internal.i.b(nVar2);
                Object obj3 = list.get(1);
                if ((!kotlin.jvm.internal.i.a(obj3, bool) || uVar != null) && obj3 != null) {
                    nVar = (p013b0.n) uVar.f15689c.invoke(obj3);
                }
                kotlin.jvm.internal.i.b(nVar);
                return new androidx.compose.ui.text.style.k(nVar2.f20494a, nVar.f20494a);
            }
        });
        f15341n = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.font.l, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.font.l lVar) {
                return Integer.valueOf(lVar.f15447b);
            }
        }, new Ia.l<Object, androidx.compose.ui.text.font.l>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.font.l invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new androidx.compose.ui.text.font.l(((Integer) obj).intValue());
            }
        });
        f15342o = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.a, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.a aVar) {
                return Float.valueOf(aVar.f15654a);
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.a>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.a invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new androidx.compose.ui.text.style.a(((Float) obj).floatValue());
            }
        });
        f15343p = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, E, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, E e10) {
                long j10 = e10.f15316a;
                int i10 = E.f15315c;
                Integer numValueOf = Integer.valueOf((int) (j10 >> 32));
                W.f fVar2 = SaversKt.f15329a;
                return kotlin.collections.l.n(numValueOf, Integer.valueOf((int) (j10 & 4294967295L)));
            }
        }, new Ia.l<Object, E>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
            @Override // Ia.l
            public final E invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                kotlin.jvm.internal.i.b(num);
                int iIntValue = num.intValue();
                Object obj3 = list.get(1);
                Integer num2 = obj3 != null ? (Integer) obj3 : null;
                kotlin.jvm.internal.i.b(num2);
                return new E(O.h.b(iIntValue, num2.intValue()));
            }
        });
        f15344q = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, k0, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, k0 k0Var) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                k0 k0Var2 = k0Var;
                return kotlin.collections.l.n(SaversKt.a(new androidx.compose.ui.graphics.H(k0Var2.f13653a), SaversKt.f15345r, jVar2), SaversKt.a(new I.d(k0Var2.f13654b), SaversKt.f15347t, jVar2), Float.valueOf(k0Var2.f13655c));
            }
        }, new Ia.l<Object, k0>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
            /* JADX WARN: Type inference failed for: r1v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r2v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final k0 invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i10 = androidx.compose.ui.graphics.H.f13505m;
                u uVar = SaversKt.f15345r;
                Boolean bool = Boolean.FALSE;
                androidx.compose.ui.graphics.H h8 = ((kotlin.jvm.internal.i.a(obj2, bool) && uVar == null) || obj2 == null) ? null : (androidx.compose.ui.graphics.H) uVar.f15689c.invoke(obj2);
                kotlin.jvm.internal.i.b(h8);
                Object obj3 = list.get(1);
                u uVar2 = SaversKt.f15347t;
                I.d dVar = ((kotlin.jvm.internal.i.a(obj3, bool) && uVar2 == null) || obj3 == null) ? null : (I.d) uVar2.f15689c.invoke(obj3);
                kotlin.jvm.internal.i.b(dVar);
                Object obj4 = list.get(2);
                Float f10 = obj4 != null ? (Float) obj4 : null;
                kotlin.jvm.internal.i.b(f10);
                return new k0(f10.floatValue(), h8.f13506a, dVar.f3754a);
            }
        });
        f15345r = new u(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.graphics.H, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.graphics.H h8) {
                long j10 = h8.f13506a;
                return j10 == 16 ? Boolean.FALSE : Integer.valueOf(Q3.d.K(j10));
            }
        }, new Ia.l<Object, androidx.compose.ui.graphics.H>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.graphics.H invoke(Object obj) {
                if (kotlin.jvm.internal.i.a(obj, Boolean.FALSE)) {
                    return new androidx.compose.ui.graphics.H(androidx.compose.ui.graphics.H.f13504l);
                }
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new androidx.compose.ui.graphics.H(Q3.d.d(((Integer) obj).intValue()));
            }
        });
        f15346s = new u(new Ia.p<androidx.compose.runtime.saveable.j, p013b0.n, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, p013b0.n nVar) {
                long j10 = nVar.f20494a;
                if (p013b0.n.a(j10, p013b0.n.f20493c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(p013b0.n.c(j10));
                W.f fVar2 = SaversKt.f15329a;
                return kotlin.collections.l.n(fValueOf, new p013b0.o(p013b0.n.b(j10)));
            }
        }, new Ia.l<Object, p013b0.n>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
            @Override // Ia.l
            public final p013b0.n invoke(Object obj) {
                if (kotlin.jvm.internal.i.a(obj, Boolean.FALSE)) {
                    return new p013b0.n(p013b0.n.f20493c);
                }
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f10 = obj2 != null ? (Float) obj2 : null;
                kotlin.jvm.internal.i.b(f10);
                float fFloatValue = f10.floatValue();
                Object obj3 = list.get(1);
                p013b0.o oVar = obj3 != null ? (p013b0.o) obj3 : null;
                kotlin.jvm.internal.i.b(oVar);
                return new p013b0.n(G0.a.i(fFloatValue, oVar.f20495a));
            }
        });
        f15347t = new u(new Ia.p<androidx.compose.runtime.saveable.j, I.d, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, I.d dVar) {
                long j10 = dVar.f3754a;
                if (I.d.b(j10, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)));
                W.f fVar2 = SaversKt.f15329a;
                return kotlin.collections.l.n(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            }
        }, new Ia.l<Object, I.d>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
            @Override // Ia.l
            public final I.d invoke(Object obj) {
                if (kotlin.jvm.internal.i.a(obj, Boolean.FALSE)) {
                    return new I.d(9205357640488583168L);
                }
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f10 = obj2 != null ? (Float) obj2 : null;
                kotlin.jvm.internal.i.b(f10);
                float fFloatValue = f10.floatValue();
                Object obj3 = list.get(1);
                Float f11 = obj3 != null ? (Float) obj3 : null;
                kotlin.jvm.internal.i.b(f11);
                return new I.d((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f11.floatValue())) & 4294967295L));
            }
        });
        f15348u = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, Z.c, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, Z.c cVar) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                List<Z.b> list = cVar.f7672b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(SaversKt.a(list.get(i10), SaversKt.f15349v, jVar2));
                }
                return arrayList;
            }
        }, new Ia.l<Object, Z.c>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
            @Override // Ia.l
            public final Z.c invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    W.f fVar2 = SaversKt.f15349v;
                    Z.b bVar = null;
                    if (!kotlin.jvm.internal.i.a(obj2, Boolean.FALSE) && obj2 != null) {
                        bVar = (Z.b) ((Ia.l) fVar2.f6997c).invoke(obj2);
                    }
                    kotlin.jvm.internal.i.b(bVar);
                    arrayList.add(bVar);
                }
                return new Z.c(arrayList);
            }
        });
        f15349v = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, Z.b, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, Z.b bVar) {
                return bVar.f7670a.toLanguageTag();
            }
        }, new Ia.l<Object, Z.b>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
            @Override // Ia.l
            public final Z.b invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Z.d.f7674a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (kotlin.jvm.internal.i.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new Z.b(localeForLanguageTag);
            }
        });
        f15350w = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, androidx.compose.ui.text.style.f, Object>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, androidx.compose.ui.text.style.f fVar2) {
                androidx.compose.ui.text.style.f fVar3 = fVar2;
                androidx.compose.ui.text.style.f.a aVar = new androidx.compose.ui.text.style.f.a(fVar3.f15662a);
                W.f fVar4 = SaversKt.f15329a;
                return kotlin.collections.l.n(aVar, new androidx.compose.ui.text.style.f.c(fVar3.f15663b), new androidx.compose.ui.text.style.f.b());
            }
        }, new Ia.l<Object, androidx.compose.ui.text.style.f>() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$2
            @Override // Ia.l
            public final androidx.compose.ui.text.style.f invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                androidx.compose.ui.text.style.f.a aVar = obj2 != null ? (androidx.compose.ui.text.style.f.a) obj2 : null;
                kotlin.jvm.internal.i.b(aVar);
                Object obj3 = list.get(1);
                androidx.compose.ui.text.style.f.c cVar = obj3 != null ? (androidx.compose.ui.text.style.f.c) obj3 : null;
                kotlin.jvm.internal.i.b(cVar);
                Object obj4 = list.get(2);
                kotlin.jvm.internal.i.b(obj4 != null ? (androidx.compose.ui.text.style.f.b) obj4 : null);
                return new androidx.compose.ui.text.style.f(aVar.f15667a, cVar.f15668a);
            }
        });
    }

    public static final <T extends androidx.compose.runtime.saveable.i<Original, Saveable>, Original, Saveable> Object a(Original original, T t8, androidx.compose.runtime.saveable.j jVar) {
        Object objC;
        return (original == null || (objC = t8.c(jVar, original)) == null) ? Boolean.FALSE : objC;
    }
}
