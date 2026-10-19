package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: PageStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u<T> implements z<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u<Object> f19426e = new u<>(PageEvent.Insert.f19259g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19430d;

    public u(int i10, int i11, List pages) {
        kotlin.jvm.internal.i.e(pages, "pages");
        this.f19427a = kotlin.collections.q.p0(pages);
        Iterator<T> it = pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((F) it.next()).f19232b.size();
        }
        this.f19428b = size;
        this.f19429c = i10;
        this.f19430d = i11;
    }

    @Override // androidx.paging.z
    public final int a() {
        return this.f19428b;
    }

    @Override // androidx.paging.z
    public final int b() {
        return this.f19429c;
    }

    @Override // androidx.paging.z
    public final int c() {
        return this.f19430d;
    }

    public final I.a d(int i10) {
        ArrayList arrayList;
        int i11 = 0;
        int size = i10 - this.f19429c;
        while (true) {
            arrayList = this.f19427a;
            if (size < ((F) arrayList.get(i11)).f19232b.size() || i11 >= kotlin.collections.l.r(arrayList)) {
                break;
            }
            size -= ((F) arrayList.get(i11)).f19232b.size();
            i11++;
        }
        F f10 = (F) arrayList.get(i11);
        int i12 = i10 - this.f19429c;
        int size2 = ((getSize() - i10) - this.f19430d) - 1;
        Integer numX = kotlin.collections.k.X(((F) kotlin.collections.q.O(arrayList)).f19231a);
        kotlin.jvm.internal.i.b(numX);
        int iIntValue = numX.intValue();
        int iF = f();
        f10.getClass();
        return new I.a(f10.f19233c, size, i12, size2, iIntValue, iF);
    }

    public final T e(int i10) {
        ArrayList arrayList = this.f19427a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((F) arrayList.get(i11)).f19232b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((F) arrayList.get(i11)).f19232b.get(i10);
    }

    public final int f() {
        Integer numValueOf;
        int[] iArr = ((F) kotlin.collections.q.V(this.f19427a)).f19231a;
        kotlin.jvm.internal.i.e(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        kotlin.jvm.internal.i.b(numValueOf);
        return numValueOf.intValue();
    }

    public final x<T> g(PageEvent<T> pageEvent) {
        x<T> cVar;
        kotlin.jvm.internal.i.e(pageEvent, "pageEvent");
        boolean z10 = pageEvent instanceof PageEvent.Insert;
        ArrayList arrayList = this.f19427a;
        if (z10) {
            PageEvent.Insert insert = (PageEvent.Insert) pageEvent;
            List<F<T>> list = insert.f19261b;
            List<F<T>> list2 = list;
            Iterator<T> it = list2.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((F) it.next()).f19232b.size();
            }
            int iOrdinal = insert.f19260a.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = this.f19430d;
                int i11 = this.f19428b;
                arrayList.addAll(arrayList.size(), list);
                this.f19428b += size;
                this.f19430d = insert.f19263d;
                int i12 = this.f19429c + i11;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.p.z(arrayList2, ((F) it2.next()).f19232b);
                }
                return new x.a(i12, arrayList2, this.f19430d, i10);
            }
            int i13 = this.f19429c;
            arrayList.addAll(0, list);
            this.f19428b += size;
            this.f19429c = insert.f19262c;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                kotlin.collections.p.z(arrayList3, ((F) it3.next()).f19232b);
            }
            cVar = new x.d<>(arrayList3, this.f19429c, i13);
        } else {
            if (!(pageEvent instanceof PageEvent.a)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            PageEvent.a aVar = (PageEvent.a) pageEvent;
            Na.i iVar = new Na.i(aVar.f19268b, aVar.f19269c, 1);
            Iterator it4 = arrayList.iterator();
            int size2 = 0;
            while (it4.hasNext()) {
                F f10 = (F) it4.next();
                for (int i14 : f10.f19231a) {
                    if (iVar.A(i14)) {
                        size2 += f10.f19232b.size();
                        it4.remove();
                        break;
                    }
                }
            }
            int i15 = this.f19428b - size2;
            this.f19428b = i15;
            LoadType loadType = LoadType.f19253c;
            LoadType loadType2 = aVar.f19267a;
            int i16 = aVar.f19270d;
            if (loadType2 != loadType) {
                int i17 = this.f19430d;
                this.f19430d = i16;
                return new x.b(this.f19429c + i15, size2, i16, i17);
            }
            int i18 = this.f19429c;
            this.f19429c = i16;
            cVar = new x.c<>(size2, i16, i18);
        }
        return cVar;
    }

    @Override // androidx.paging.z
    public final int getSize() {
        return this.f19429c + this.f19428b + this.f19430d;
    }

    public final String toString() {
        int i10 = this.f19428b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(e(i11));
        }
        String strU = kotlin.collections.q.U(arrayList, null, null, null, null, 63);
        StringBuilder sb2 = new StringBuilder("[(");
        sb2.append(this.f19429c);
        sb2.append(" placeholders), ");
        sb2.append(strU);
        sb2.append(", (");
        return p005a4.q.c(sb2, this.f19430d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(PageEvent.Insert<T> insertEvent) {
        this(insertEvent.f19262c, insertEvent.f19263d, insertEvent.f19261b);
        kotlin.jvm.internal.i.e(insertEvent, "insertEvent");
    }
}
