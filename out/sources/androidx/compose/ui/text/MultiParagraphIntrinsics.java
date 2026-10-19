package androidx.compose.ui.text;

import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C1260a.c<p>> f15324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15327e;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiParagraphIntrinsics(C1260a c1260a, F f10, List<C1260a.c<p>> list, p013b0.c cVar, androidx.compose.ui.text.font.d.a aVar) {
        String str;
        int i10;
        String strSubstring;
        int i11;
        int i12;
        C1260a c1260a2 = c1260a;
        this.f15323a = c1260a2;
        this.f15324b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        this.f15325c = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                Object obj;
                ArrayList arrayList = this.this$0.f15327e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fB = ((k) obj2).f15589a.b();
                    int iR = kotlin.collections.l.r(arrayList);
                    int i13 = 1;
                    if (1 <= iR) {
                        while (true) {
                            Object obj3 = arrayList.get(i13);
                            float fB2 = ((k) obj3).f15589a.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj2 = obj3;
                                fB = fB2;
                            }
                            if (i13 == iR) {
                                break;
                            }
                            i13++;
                        }
                    }
                    obj = obj2;
                }
                k kVar = (k) obj;
                return Float.valueOf(kVar != null ? kVar.f15589a.b() : 0.0f);
            }
        });
        this.f15326d = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                Object obj;
                ArrayList arrayList = this.this$0.f15327e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fC = ((k) obj2).f15589a.f15613i.c();
                    int iR = kotlin.collections.l.r(arrayList);
                    int i13 = 1;
                    if (1 <= iR) {
                        while (true) {
                            Object obj3 = arrayList.get(i13);
                            float fC2 = ((k) obj3).f15589a.f15613i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj2 = obj3;
                                fC = fC2;
                            }
                            if (i13 == iR) {
                                break;
                            }
                            i13++;
                        }
                    }
                    obj = obj2;
                }
                k kVar = (k) obj;
                return Float.valueOf(kVar != null ? kVar.f15589a.f15613i.c() : 0.0f);
            }
        });
        C1260a c1260a3 = C1262c.f15422a;
        ArrayList arrayList = c1260a2.f15410e;
        List listH0 = (arrayList == null || (listH0 = kotlin.collections.q.h0(arrayList, new C1261b())) == null) ? EmptyList.f42983b : listH0;
        ArrayList arrayList2 = new ArrayList();
        kotlin.collections.i iVar = new kotlin.collections.i();
        int size = listH0.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            n nVar = f10.f15319b;
            if (i14 >= size) {
                while (true) {
                    str = c1260a2.f15408c;
                    if (i15 > str.length() || iVar.isEmpty()) {
                        break;
                    }
                    C1260a.c cVar2 = (C1260a.c) iVar.last();
                    T t8 = cVar2.f15418a;
                    int i16 = cVar2.f15420c;
                    arrayList2.add(new C1260a.c(i15, i16, t8));
                    while (!iVar.isEmpty() && i16 == ((C1260a.c) iVar.last()).f15420c) {
                        iVar.removeLast();
                    }
                    i15 = i16;
                }
                if (i15 < str.length()) {
                    arrayList2.add(new C1260a.c(i15, str.length(), nVar));
                }
                if (arrayList2.isEmpty()) {
                    i10 = 0;
                    arrayList2.add(new C1260a.c(0, 0, nVar));
                } else {
                    i10 = 0;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                int i17 = i10;
                while (i17 < size2) {
                    C1260a.c cVar3 = (C1260a.c) arrayList2.get(i17);
                    int i18 = cVar3.f15419b;
                    int i19 = cVar3.f15420c;
                    if (i18 != i19) {
                        strSubstring = str.substring(i18, i19);
                        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                    } else {
                        strSubstring = "";
                    }
                    List listA = C1262c.a(c1260a2, i18, i19, new Ia.l<C1260a.InterfaceC0160a, Boolean>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$substringWithoutParagraphStyles$1
                        @Override // Ia.l
                        public final Boolean invoke(C1260a.InterfaceC0160a interfaceC0160a) {
                            return Boolean.valueOf(!(interfaceC0160a instanceof n));
                        }
                    });
                    C1260a c1260a4 = new C1260a(strSubstring, (List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>>) (listA == null ? EmptyList.f42983b : listA));
                    n nVar2 = (n) cVar3.f15418a;
                    if (androidx.compose.ui.text.style.i.a(nVar2.f15593b, Integer.MIN_VALUE)) {
                        nVar2 = new n(nVar2.f15592a, nVar.f15593b, nVar2.f15594c, nVar2.f15595d, nVar2.f15596e, nVar2.f15597f, nVar2.f15598g, nVar2.f15599h, nVar2.f15600i);
                    }
                    F f11 = new F(f10.f15318a, nVar.a(nVar2));
                    List list2 = c1260a4.f15407b;
                    List list3 = list2 == null ? EmptyList.f42983b : list2;
                    List<C1260a.c<p>> list4 = this.f15324b;
                    ArrayList arrayList4 = new ArrayList(list4.size());
                    int size3 = list4.size();
                    int i20 = 0;
                    while (true) {
                        i11 = cVar3.f15419b;
                        if (i20 < size3) {
                            C1260a.c<p> cVar4 = list4.get(i20);
                            int i21 = cVar4.f15419b;
                            int i22 = cVar4.f15420c;
                            if (C1262c.b(i11, i19, i21, i22)) {
                                int i23 = cVar4.f15419b;
                                if (i11 > i23 || i22 > i19) {
                                    Y.a.a("placeholder can not overlap with paragraph.");
                                }
                                arrayList4.add(new C1260a.c(i23 - i11, i22 - i11, cVar4.f15418a));
                            }
                            i20++;
                        }
                    }
                    k kVar = new k(new AndroidParagraphIntrinsics(strSubstring, f11, list3, arrayList4, aVar, cVar), i11, i19);
                    ArrayList arrayList5 = arrayList3;
                    arrayList5.add(kVar);
                    i17++;
                    c1260a2 = c1260a;
                    arrayList3 = arrayList5;
                    str = str;
                    size2 = size2;
                    arrayList2 = arrayList2;
                }
                this.f15327e = arrayList3;
                return;
            }
            C1260a.c cVar5 = (C1260a.c) listH0.get(i14);
            C1260a.c cVarA = C1260a.c.a(cVar5, nVar.a((n) cVar5.f15418a), i13, 14);
            while (true) {
                i12 = cVarA.f15419b;
                if (i15 >= i12 || iVar.isEmpty()) {
                    break;
                }
                C1260a.c cVar6 = (C1260a.c) iVar.last();
                int i24 = cVar6.f15420c;
                T t10 = cVar6.f15418a;
                if (i12 < i24) {
                    arrayList2.add(new C1260a.c(i15, i12, t10));
                } else {
                    arrayList2.add(new C1260a.c(i15, i24, t10));
                    while (true) {
                        boolean zIsEmpty = iVar.isEmpty();
                        i12 = cVar6.f15420c;
                        if (zIsEmpty || i12 != ((C1260a.c) iVar.last()).f15420c) {
                            break;
                        } else {
                            iVar.removeLast();
                        }
                    }
                }
                i15 = i12;
            }
            if (i15 < i12) {
                arrayList2.add(new C1260a.c(i15, i12, nVar));
                i15 = i12;
            }
            C1260a.c cVar7 = (C1260a.c) iVar.C();
            T t11 = cVarA.f15418a;
            int i25 = cVarA.f15420c;
            if (cVar7 != null) {
                int i26 = cVar7.f15420c;
                T t12 = cVar7.f15418a;
                int i27 = cVar7.f15419b;
                if (i27 == i12 && i26 == i25) {
                    iVar.removeLast();
                    iVar.addLast(new C1260a.c(i12, i25, ((n) t12).a((n) t11)));
                } else if (i27 == i26) {
                    arrayList2.add(new C1260a.c(i27, i26, t12));
                    iVar.removeLast();
                    iVar.addLast(new C1260a.c(i12, i25, t11));
                } else {
                    if (i26 < i25) {
                        throw new IllegalArgumentException();
                    }
                    iVar.addLast(new C1260a.c(i12, i25, ((n) t12).a((n) t11)));
                }
            } else {
                iVar.addLast(new C1260a.c(i12, i25, t11));
            }
            i14++;
            i13 = 0;
        }
    }

    @Override // androidx.compose.ui.text.l
    public final boolean a() {
        ArrayList arrayList = this.f15327e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((k) arrayList.get(i10)).f15589a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // androidx.compose.ui.text.l
    public final float b() {
        return ((Number) this.f15325c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // androidx.compose.ui.text.l
    public final float c() {
        return ((Number) this.f15326d.getValue()).floatValue();
    }
}
