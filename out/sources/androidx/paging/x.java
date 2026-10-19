package androidx.paging;

import java.util.ArrayList;

/* JADX INFO: compiled from: PagingDataEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class x<T> {

    /* JADX INFO: compiled from: PagingDataEvent.kt */
    public static final class a<T> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f19438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19440d;

        public a(int i10, ArrayList arrayList, int i11, int i12) {
            this.f19437a = i10;
            this.f19438b = arrayList;
            this.f19439c = i11;
            this.f19440d = i12;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19437a == aVar.f19437a && kotlin.jvm.internal.i.a(this.f19438b, aVar.f19438b) && this.f19439c == aVar.f19439c && this.f19440d == aVar.f19440d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19440d) + Integer.hashCode(this.f19439c) + this.f19438b.hashCode() + Integer.hashCode(this.f19437a);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.f19438b;
            sb2.append(arrayList.size());
            sb2.append(" items (\n                    |   startIndex: ");
            sb2.append(this.f19437a);
            sb2.append("\n                    |   first item: ");
            sb2.append(kotlin.collections.q.P(arrayList));
            sb2.append("\n                    |   last item: ");
            sb2.append(kotlin.collections.q.W(arrayList));
            sb2.append("\n                    |   newPlaceholdersBefore: ");
            sb2.append(this.f19439c);
            sb2.append("\n                    |   oldPlaceholdersBefore: ");
            sb2.append(this.f19440d);
            sb2.append("\n                    |)\n                    |");
            return kotlin.text.i.w(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: PagingDataEvent.kt */
    public static final class b<T> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19444d;

        public b(int i10, int i11, int i12, int i13) {
            this.f19441a = i10;
            this.f19442b = i11;
            this.f19443c = i12;
            this.f19444d = i13;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f19441a == bVar.f19441a && this.f19442b == bVar.f19442b && this.f19443c == bVar.f19443c && this.f19444d == bVar.f19444d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19444d) + Integer.hashCode(this.f19443c) + Integer.hashCode(this.f19442b) + Integer.hashCode(this.f19441a);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i10 = this.f19442b;
            sb2.append(i10);
            sb2.append(" items (\n                    |   startIndex: ");
            sb2.append(this.f19441a);
            sb2.append("\n                    |   dropCount: ");
            sb2.append(i10);
            sb2.append("\n                    |   newPlaceholdersBefore: ");
            sb2.append(this.f19443c);
            sb2.append("\n                    |   oldPlaceholdersBefore: ");
            sb2.append(this.f19444d);
            sb2.append("\n                    |)\n                    |");
            return kotlin.text.i.w(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: PagingDataEvent.kt */
    public static final class c<T> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19447c;

        public c(int i10, int i11, int i12) {
            this.f19445a = i10;
            this.f19446b = i11;
            this.f19447c = i12;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f19445a == cVar.f19445a && this.f19446b == cVar.f19446b && this.f19447c == cVar.f19447c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19447c) + Integer.hashCode(this.f19446b) + Integer.hashCode(this.f19445a);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i10 = this.f19445a;
            sb2.append(i10);
            sb2.append(" items (\n                    |   dropCount: ");
            sb2.append(i10);
            sb2.append("\n                    |   newPlaceholdersBefore: ");
            sb2.append(this.f19446b);
            sb2.append("\n                    |   oldPlaceholdersBefore: ");
            sb2.append(this.f19447c);
            sb2.append("\n                    |)\n                    |");
            return kotlin.text.i.w(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: PagingDataEvent.kt */
    public static final class d<T> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19450c;

        public d(ArrayList arrayList, int i10, int i11) {
            this.f19448a = arrayList;
            this.f19449b = i10;
            this.f19450c = i11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (kotlin.jvm.internal.i.a(this.f19448a, dVar.f19448a) && this.f19449b == dVar.f19449b && this.f19450c == dVar.f19450c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f19450c) + Integer.hashCode(this.f19449b) + this.f19448a.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.f19448a;
            sb2.append(arrayList.size());
            sb2.append(" items (\n                    |   first item: ");
            sb2.append(kotlin.collections.q.P(arrayList));
            sb2.append("\n                    |   last item: ");
            sb2.append(kotlin.collections.q.W(arrayList));
            sb2.append("\n                    |   newPlaceholdersBefore: ");
            sb2.append(this.f19449b);
            sb2.append("\n                    |   oldPlaceholdersBefore: ");
            sb2.append(this.f19450c);
            sb2.append("\n                    |)\n                    |");
            return kotlin.text.i.w(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: PagingDataEvent.kt */
    public static final class e<T> extends x<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f19451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z<T> f19452b;

        public e(u uVar, z previousList) {
            kotlin.jvm.internal.i.e(previousList, "previousList");
            this.f19451a = uVar;
            this.f19452b = previousList;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                u uVar = this.f19451a;
                int i10 = uVar.f19429c;
                e eVar = (e) obj;
                u uVar2 = eVar.f19451a;
                if (i10 == uVar2.f19429c && uVar.f19430d == uVar2.f19430d) {
                    int size = uVar.getSize();
                    u uVar3 = eVar.f19451a;
                    if (size == uVar3.getSize() && uVar.f19428b == uVar3.f19428b) {
                        z<T> zVar = this.f19452b;
                        int iB = zVar.b();
                        z<T> zVar2 = eVar.f19452b;
                        if (iB == zVar2.b() && zVar.c() == zVar2.c() && zVar.getSize() == zVar2.getSize() && zVar.a() == zVar2.a()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f19452b.hashCode() + this.f19451a.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            u uVar = this.f19451a;
            sb2.append(uVar.f19429c);
            sb2.append("\n                    |       placeholdersAfter: ");
            sb2.append(uVar.f19430d);
            sb2.append("\n                    |       size: ");
            sb2.append(uVar.getSize());
            sb2.append("\n                    |       dataCount: ");
            sb2.append(uVar.f19428b);
            sb2.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            z<T> zVar = this.f19452b;
            sb2.append(zVar.b());
            sb2.append("\n                    |       placeholdersAfter: ");
            sb2.append(zVar.c());
            sb2.append("\n                    |       size: ");
            sb2.append(zVar.getSize());
            sb2.append("\n                    |       dataCount: ");
            sb2.append(zVar.a());
            sb2.append("\n                    |   )\n                    |");
            return kotlin.text.i.w(sb2.toString());
        }
    }
}
