package androidx.paging;

import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BufferedChannel f19420i;
    public final BufferedChannel j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f19421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f19422l;

    /* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutexImpl f19423a = kotlinx.coroutines.sync.b.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t<Key, Value> f19424b;

        public a(w wVar) {
            this.f19424b = new t<>(wVar);
        }
    }

    /* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19425a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19425a = iArr;
        }
    }

    public t(w wVar) {
        this.f19412a = wVar;
        ArrayList arrayList = new ArrayList();
        this.f19413b = arrayList;
        this.f19414c = arrayList;
        this.f19420i = kotlinx.coroutines.channels.g.a(-1, 6, null);
        this.j = kotlinx.coroutines.channels.g.a(-1, 6, null);
        this.f19421k = new LinkedHashMap();
        p pVar = new p();
        pVar.c(LoadType.f19252b, m.b.f19372b);
        this.f19422l = pVar;
    }

    public final y<Key, Value> a(I.a aVar) {
        Integer numValueOf;
        int size;
        int i10;
        ArrayList arrayList = this.f19414c;
        List listO0 = kotlin.collections.q.o0(arrayList);
        w wVar = this.f19412a;
        if (aVar != null) {
            int iD = d();
            int i11 = -this.f19415d;
            int iR = kotlin.collections.l.r(arrayList) - this.f19415d;
            int i12 = i11;
            while (true) {
                size = wVar.f19432a;
                i10 = aVar.f19250e;
                if (i12 >= i10) {
                    break;
                }
                if (i12 <= iR) {
                    size = ((PagingSource.b.C0195b) arrayList.get(this.f19415d + i12)).f19316b.size();
                }
                iD += size;
                i12++;
            }
            int i13 = iD + aVar.f19251f;
            if (i10 < i11) {
                i13 -= size;
            }
            numValueOf = Integer.valueOf(i13);
        } else {
            numValueOf = null;
        }
        return new y<>(listO0, numValueOf, wVar, d());
    }

    public final void b(PageEvent.a<Value> aVar) {
        int iB = aVar.b();
        ArrayList arrayList = this.f19414c;
        if (iB > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + aVar.b()).toString());
        }
        LinkedHashMap linkedHashMap = this.f19421k;
        LoadType loadType = aVar.f19267a;
        linkedHashMap.remove(loadType);
        this.f19422l.c(loadType, m.c.f19374c);
        int iOrdinal = loadType.ordinal();
        ArrayList arrayList2 = this.f19413b;
        int i10 = aVar.f19270d;
        if (iOrdinal == 1) {
            int iB2 = aVar.b();
            for (int i11 = 0; i11 < iB2; i11++) {
                arrayList2.remove(0);
            }
            this.f19415d -= aVar.b();
            this.f19416e = i10 != Integer.MIN_VALUE ? i10 : 0;
            int i12 = this.f19418g + 1;
            this.f19418g = i12;
            this.f19420i.n(Integer.valueOf(i12));
            return;
        }
        if (iOrdinal != 2) {
            throw new IllegalArgumentException("cannot drop " + loadType);
        }
        int iB3 = aVar.b();
        for (int i13 = 0; i13 < iB3; i13++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        this.f19417f = i10 != Integer.MIN_VALUE ? i10 : 0;
        int i14 = this.f19419h + 1;
        this.f19419h = i14;
        this.j.n(Integer.valueOf(i14));
    }

    public final PageEvent.a<Value> c(LoadType loadType, I hint) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        kotlin.jvm.internal.i.e(hint, "hint");
        w wVar = this.f19412a;
        int i10 = wVar.f19435d;
        PageEvent.a<Value> aVar = null;
        if (i10 == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f19414c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int iD = 0;
        int size = 0;
        while (it.hasNext()) {
            size += ((PagingSource.b.C0195b) it.next()).f19316b.size();
        }
        if (size <= i10) {
            return null;
        }
        if (loadType == LoadType.f19252b) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < arrayList.size()) {
            Iterator it2 = arrayList.iterator();
            int size2 = 0;
            while (it2.hasNext()) {
                size2 += ((PagingSource.b.C0195b) it2.next()).f19316b.size();
            }
            if (size2 - i12 <= i10) {
                break;
            }
            int[] iArr = b.f19425a;
            int size3 = iArr[loadType.ordinal()] == 2 ? ((PagingSource.b.C0195b) arrayList.get(i11)).f19316b.size() : ((PagingSource.b.C0195b) arrayList.get(kotlin.collections.l.r(arrayList) - i11)).f19316b.size();
            if (((iArr[loadType.ordinal()] == 2 ? hint.f19246a : hint.f19247b) - i12) - size3 < wVar.f19433b) {
                break;
            }
            i12 += size3;
            i11++;
        }
        if (i11 != 0) {
            int[] iArr2 = b.f19425a;
            int iR = iArr2[loadType.ordinal()] == 2 ? -this.f19415d : (kotlin.collections.l.r(arrayList) - this.f19415d) - (i11 - 1);
            int iR2 = iArr2[loadType.ordinal()] == 2 ? (i11 - 1) - this.f19415d : kotlin.collections.l.r(arrayList) - this.f19415d;
            if (wVar.f19434c) {
                if (loadType == LoadType.f19253c) {
                    iD = d() + i12;
                } else {
                    iD = (wVar.f19434c ? this.f19417f : 0) + i12;
                }
            }
            aVar = new PageEvent.a<>(loadType, iR, iR2, iD);
        }
        return aVar;
    }

    public final int d() {
        if (this.f19412a.f19434c) {
            return this.f19416e;
        }
        return 0;
    }

    public final boolean e(int i10, LoadType loadType, PagingSource.b.C0195b<Key, Value> page) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        kotlin.jvm.internal.i.e(page, "page");
        int iOrdinal = loadType.ordinal();
        ArrayList arrayList = this.f19413b;
        ArrayList arrayList2 = this.f19414c;
        int i11 = page.f19319e;
        int i12 = page.f19320f;
        if (iOrdinal != 0) {
            LinkedHashMap linkedHashMap = this.f19421k;
            List<Value> list = page.f19316b;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (i10 != this.f19419h) {
                        return false;
                    }
                    arrayList.add(page);
                    if (i12 == Integer.MIN_VALUE) {
                        int size = (this.f19412a.f19434c ? this.f19417f : 0) - list.size();
                        i12 = size < 0 ? 0 : size;
                    }
                    this.f19417f = i12 != Integer.MIN_VALUE ? i12 : 0;
                    linkedHashMap.remove(LoadType.f19254d);
                }
            } else {
                if (arrayList2.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i10 != this.f19418g) {
                    return false;
                }
                arrayList.add(0, page);
                this.f19415d++;
                if (i11 == Integer.MIN_VALUE) {
                    int iD = d() - list.size();
                    i11 = iD < 0 ? 0 : iD;
                }
                this.f19416e = i11 != Integer.MIN_VALUE ? i11 : 0;
                linkedHashMap.remove(LoadType.f19253c);
            }
        } else {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i10 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(page);
            this.f19415d = 0;
            if (i12 == Integer.MIN_VALUE) {
                i12 = 0;
            }
            this.f19417f = i12;
            this.f19416e = i11 != Integer.MIN_VALUE ? i11 : 0;
        }
        return true;
    }

    public final PageEvent.Insert f(PagingSource.b.C0195b c0195b, LoadType loadType) {
        int size;
        kotlin.jvm.internal.i.e(c0195b, "<this>");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = 0 - this.f19415d;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            size = (this.f19414c.size() - this.f19415d) - 1;
        }
        List listK = M1.k(new F(size, c0195b.f19316b));
        int iOrdinal2 = loadType.ordinal();
        p pVar = this.f19422l;
        w wVar = this.f19412a;
        if (iOrdinal2 == 0) {
            PageEvent.Insert<Object> insert = PageEvent.Insert.f19259g;
            return PageEvent.Insert.a.a(listK, d(), wVar.f19434c ? this.f19417f : 0, pVar.d(), null);
        }
        if (iOrdinal2 == 1) {
            PageEvent.Insert<Object> insert2 = PageEvent.Insert.f19259g;
            return new PageEvent.Insert(LoadType.f19253c, listK, d(), -1, pVar.d(), null);
        }
        if (iOrdinal2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        PageEvent.Insert<Object> insert3 = PageEvent.Insert.f19259g;
        return new PageEvent.Insert(LoadType.f19254d, listK, -1, wVar.f19434c ? this.f19417f : 0, pVar.d(), null);
    }
}
