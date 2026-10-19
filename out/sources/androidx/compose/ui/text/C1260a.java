package androidx.compose.ui.text;

import androidx.collection.C0882j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: androidx.compose.ui.text.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1260a implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c<? extends InterfaceC0160a>> f15407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15410e;

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    public interface InterfaceC0160a {
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e(Integer.valueOf(((c) t8).f15419b), Integer.valueOf(((c) t10).f15419b));
        }
    }

    static {
        W.f fVar = SaversKt.f15329a;
    }

    public C1260a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1260a(List<? extends c<? extends InterfaceC0160a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f15407b = list;
        this.f15408c = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) list.get(i10);
                T t8 = cVar.f15418a;
                if (t8 instanceof v) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (t8 instanceof n) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f15409d = arrayList;
        this.f15410e = arrayList2;
        List listH0 = arrayList2 != null ? kotlin.collections.q.h0(arrayList2, new d()) : null;
        List list2 = listH0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i11 = ((c) kotlin.collections.q.O(listH0)).f15420c;
        androidx.collection.A a10 = C0882j.f9185a;
        androidx.collection.A a11 = new androidx.collection.A(1);
        a11.c(i11);
        int size2 = listH0.size();
        for (int i12 = 1; i12 < size2; i12++) {
            c cVar2 = (c) listH0.get(i12);
            while (a11.f9184b != 0) {
                int iB = a11.b();
                if (cVar2.f15419b < iB) {
                    int i13 = cVar2.f15420c;
                    if (i13 > iB) {
                        Y.a.a("Paragraph overlap not allowed, end " + i13 + " should be less than or equal to " + iB);
                        break;
                    }
                    break;
                }
                a11.e(a11.f9184b - 1);
            }
            a11.c(cVar2.f15420c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i10) {
        ?? arrayList;
        List<c<? extends InterfaceC0160a>> list = this.f15407b;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c<? extends InterfaceC0160a> cVar = list.get(i11);
                c<? extends InterfaceC0160a> cVar2 = cVar;
                if ((cVar2.f15418a instanceof AbstractC1266g) && C1262c.b(0, i10, cVar2.f15419b, cVar2.f15420c)) {
                    arrayList.add(cVar);
                }
            }
        } else {
            arrayList = EmptyList.f42983b;
        }
        kotlin.jvm.internal.i.c(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return arrayList;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1260a subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            Y.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        String str = this.f15408c;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        C1260a c1260a = C1262c.f15422a;
        if (i10 > i11) {
            Y.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        List<c<? extends InterfaceC0160a>> list = this.f15407b;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c<? extends InterfaceC0160a> cVar = list.get(i12);
                int i13 = cVar.f15419b;
                int i14 = cVar.f15420c;
                if (C1262c.b(i10, i11, i13, i14)) {
                    arrayList2.add(new c(Math.max(i10, cVar.f15419b) - i10, Math.min(i11, i14) - i10, cVar.f15418a, cVar.f15421d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C1260a(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f15408c.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260a)) {
            return false;
        }
        C1260a c1260a = (C1260a) obj;
        return kotlin.jvm.internal.i.a(this.f15408c, c1260a.f15408c) && kotlin.jvm.internal.i.a(this.f15407b, c1260a.f15407b);
    }

    public final int hashCode() {
        int iHashCode = this.f15408c.hashCode() * 31;
        List<c<? extends InterfaceC0160a>> list = this.f15407b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15408c.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f15408c;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$b */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StringBuilder f15411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f15412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f15413d;

        public b() {
            this.f15411b = new StringBuilder(16);
            this.f15412c = new ArrayList();
            this.f15413d = new ArrayList();
            new ArrayList();
        }

        public final void a(v vVar, int i10, int i11) {
            this.f15413d.add(new C0161a(vVar, i10, i11, null, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof C1260a) {
                b((C1260a) charSequence);
            } else {
                this.f15411b.append(charSequence);
            }
            return this;
        }

        public final void b(C1260a c1260a) {
            StringBuilder sb2 = this.f15411b;
            int length = sb2.length();
            sb2.append(c1260a.f15408c);
            List<c<? extends InterfaceC0160a>> list = c1260a.f15407b;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c<? extends InterfaceC0160a> cVar = list.get(i10);
                    this.f15413d.add(new C0161a(cVar.f15419b + length, cVar.f15420c + length, cVar.f15418a, cVar.f15421d));
                }
            }
        }

        public final void c(String str) {
            this.f15411b.append(str);
        }

        public final void d() {
            ArrayList arrayList = this.f15412c;
            if (arrayList.isEmpty()) {
                Y.a.c("Nothing to pop.");
            }
            ((C0161a) arrayList.remove(arrayList.size() - 1)).f15416c = this.f15411b.length();
        }

        public final void e(int i10) {
            ArrayList arrayList = this.f15412c;
            if (i10 >= arrayList.size()) {
                Y.a.c(i10 + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i10) {
                d();
            }
        }

        public final int f(AbstractC1266g.a aVar) {
            C0161a c0161a = new C0161a(aVar, this.f15411b.length(), 0, null, 12);
            ArrayList arrayList = this.f15412c;
            arrayList.add(c0161a);
            this.f15413d.add(c0161a);
            return arrayList.size() - 1;
        }

        public final int g(n nVar) {
            C0161a c0161a = new C0161a(nVar, this.f15411b.length(), 0, null, 12);
            ArrayList arrayList = this.f15412c;
            arrayList.add(c0161a);
            this.f15413d.add(c0161a);
            return arrayList.size() - 1;
        }

        public final int h(v vVar) {
            C0161a c0161a = new C0161a(vVar, this.f15411b.length(), 0, null, 12);
            ArrayList arrayList = this.f15412c;
            arrayList.add(c0161a);
            this.f15413d.add(c0161a);
            return arrayList.size() - 1;
        }

        public final C1260a i() {
            StringBuilder sb2 = this.f15411b;
            String string = sb2.toString();
            ArrayList arrayList = this.f15413d;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(((C0161a) arrayList.get(i10)).a(sb2.length()));
            }
            return new C1260a(string, arrayList2);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            boolean z10 = charSequence instanceof C1260a;
            StringBuilder sb2 = this.f15411b;
            if (z10) {
                C1260a c1260a = (C1260a) charSequence;
                int length = sb2.length();
                sb2.append((CharSequence) c1260a.f15408c, i10, i11);
                List<c<? extends InterfaceC0160a>> listA = C1262c.a(c1260a, i10, i11, null);
                if (listA != null) {
                    int size = listA.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        c<? extends InterfaceC0160a> cVar = listA.get(i12);
                        this.f15413d.add(new C0161a(cVar.f15419b + length, cVar.f15420c + length, cVar.f15418a, cVar.f15421d));
                    }
                }
            } else {
                sb2.append(charSequence, i10, i11);
            }
            return this;
        }

        /* JADX INFO: renamed from: androidx.compose.ui.text.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnnotatedString.kt */
        public static final class C0161a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f15414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f15415b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f15416c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f15417d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0161a(int i10, int i11, Object obj, String str) {
                this.f15414a = obj;
                this.f15415b = i10;
                this.f15416c = i11;
                this.f15417d = str;
            }

            public final c<T> a(int i10) {
                int i11 = this.f15416c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    Y.a.c("Item.end should be set first");
                }
                return new c<>(this.f15415b, i10, this.f15414a, this.f15417d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0161a)) {
                    return false;
                }
                C0161a c0161a = (C0161a) obj;
                return kotlin.jvm.internal.i.a(this.f15414a, c0161a.f15414a) && this.f15415b == c0161a.f15415b && this.f15416c == c0161a.f15416c && kotlin.jvm.internal.i.a(this.f15417d, c0161a.f15417d);
            }

            public final int hashCode() {
                T t8 = this.f15414a;
                return this.f15417d.hashCode() + p005a4.q.b(this.f15416c, p005a4.q.b(this.f15415b, (t8 == null ? 0 : t8.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f15414a);
                sb2.append(", start=");
                sb2.append(this.f15415b);
                sb2.append(", end=");
                sb2.append(this.f15416c);
                sb2.append(", tag=");
                return B7.b.g(sb2, this.f15417d, ')');
            }

            public /* synthetic */ C0161a(InterfaceC0160a interfaceC0160a, int i10, int i11, String str, int i12) {
                this(i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, interfaceC0160a, (i12 & 8) != 0 ? "" : str);
            }
        }

        public b(C1260a c1260a) {
            this();
            b(c1260a);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) {
            this.f15411b.append(c10);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$c */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f15418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15421d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, int i11, Object obj, String str) {
            this.f15418a = obj;
            this.f15419b = i10;
            this.f15420c = i11;
            this.f15421d = str;
            if (i10 <= i11) {
                return;
            }
            Y.a.a("Reversed range is not supported");
        }

        public static c a(c cVar, n nVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                nVar = cVar.f15418a;
            }
            int i12 = cVar.f15419b;
            if ((i11 & 4) != 0) {
                i10 = cVar.f15420c;
            }
            String str = cVar.f15421d;
            cVar.getClass();
            return new c(i12, i10, nVar, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.i.a(this.f15418a, cVar.f15418a) && this.f15419b == cVar.f15419b && this.f15420c == cVar.f15420c && kotlin.jvm.internal.i.a(this.f15421d, cVar.f15421d);
        }

        public final int hashCode() {
            T t8 = this.f15418a;
            return this.f15421d.hashCode() + p005a4.q.b(this.f15420c, p005a4.q.b(this.f15419b, (t8 == null ? 0 : t8.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f15418a);
            sb2.append(", start=");
            sb2.append(this.f15419b);
            sb2.append(", end=");
            sb2.append(this.f15420c);
            sb2.append(", tag=");
            return B7.b.g(sb2, this.f15421d, ')');
        }

        public c(int i10, int i11, Object obj) {
            this(i10, i11, obj, "");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1260a(int i10, String str, ArrayList arrayList) {
        List list;
        List list2 = (i10 & 2) != 0 ? EmptyList.f42983b : arrayList;
        EmptyList emptyList = EmptyList.f42983b;
        C1260a c1260a = C1262c.f15422a;
        if (list2.isEmpty()) {
            emptyList.getClass();
            list = null;
        } else {
            emptyList.getClass();
            list = list2;
        }
        this((List<? extends c<? extends InterfaceC0160a>>) list, str);
    }

    public C1260a(String str) {
        this(str, EmptyList.f42983b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1260a(String str, List<? extends c<? extends InterfaceC0160a>> list) {
        List<? extends c<? extends InterfaceC0160a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
