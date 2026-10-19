package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: androidx.paging.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1431g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.collections.i<F<T>> f19349c = new kotlin.collections.i<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19350d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f19351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19352f;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(PageEvent<T> event) {
        kotlin.jvm.internal.i.e(event, "event");
        this.f19352f = true;
        boolean z10 = event instanceof PageEvent.Insert;
        int i10 = 0;
        kotlin.collections.i<F<T>> iVar = this.f19349c;
        p pVar = this.f19350d;
        if (z10) {
            PageEvent.Insert insert = (PageEvent.Insert) event;
            pVar.b(insert.f19264e);
            this.f19351e = insert.f19265f;
            int iOrdinal = insert.f19260a.ordinal();
            int i11 = insert.f19262c;
            int i12 = insert.f19263d;
            List<F<T>> list = insert.f19261b;
            if (iOrdinal == 0) {
                iVar.clear();
                this.f19348b = i12;
                this.f19347a = i11;
                iVar.addAll(list);
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                this.f19348b = i12;
                iVar.addAll(list);
                return;
            }
            this.f19347a = i11;
            int size = list.size() - 1;
            Na.h hVar = new Na.h(size, kotlinx.coroutines.C.n(size, 0, -1), -1);
            while (hVar.f4692d) {
                iVar.addFirst(list.get(hVar.a()));
            }
            return;
        }
        if (!(event instanceof PageEvent.a)) {
            if (event instanceof PageEvent.b) {
                PageEvent.b bVar = (PageEvent.b) event;
                pVar.b(bVar.f19271a);
                this.f19351e = bVar.f19272b;
                return;
            } else {
                if (event instanceof PageEvent.StaticList) {
                    iVar.clear();
                    this.f19348b = 0;
                    this.f19347a = 0;
                    iVar.addLast(new F<>(0, ((PageEvent.StaticList) event).f19266a));
                    return;
                }
                return;
            }
        }
        PageEvent.a aVar = (PageEvent.a) event;
        m.c cVar = m.c.f19374c;
        LoadType loadType = aVar.f19267a;
        pVar.c(loadType, cVar);
        int iOrdinal2 = loadType.ordinal();
        int i13 = aVar.f19270d;
        if (iOrdinal2 == 1) {
            this.f19347a = i13;
            int iB = aVar.b();
            while (i10 < iB) {
                iVar.removeFirst();
                i10++;
            }
            return;
        }
        if (iOrdinal2 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.f19348b = i13;
        int iB2 = aVar.b();
        while (i10 < iB2) {
            iVar.removeLast();
            i10++;
        }
    }

    public final List<PageEvent<T>> b() {
        if (!this.f19352f) {
            return EmptyList.f42983b;
        }
        ArrayList arrayList = new ArrayList();
        n nVarD = this.f19350d.d();
        kotlin.collections.i<F<T>> iVar = this.f19349c;
        if (iVar.isEmpty()) {
            arrayList.add(new PageEvent.b(nVarD, this.f19351e));
        } else {
            PageEvent.Insert<Object> insert = PageEvent.Insert.f19259g;
            arrayList.add(PageEvent.Insert.a.a(kotlin.collections.q.o0(iVar), this.f19347a, this.f19348b, nVarD, this.f19351e));
        }
        return arrayList;
    }
}
