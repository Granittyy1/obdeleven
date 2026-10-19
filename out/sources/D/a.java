package D;

import A8.p;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import java.util.List;
import kotlin.collections.AbstractC2670b;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<E> extends AbstractC2670b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractPersistentList f2469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2471d;

    public a(AbstractPersistentList abstractPersistentList, int i10, int i11) {
        this.f2469b = abstractPersistentList;
        this.f2470c = i10;
        p.n(i10, i11, abstractPersistentList.e());
        this.f2471d = i11 - i10;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f2471d;
    }

    @Override // java.util.List
    public final E get(int i10) {
        p.i(i10, this.f2471d);
        return this.f2469b.get(this.f2470c + i10);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final List subList(int i10, int i11) {
        p.n(i10, i11, this.f2471d);
        int i12 = this.f2470c;
        return new a(this.f2469b, i10 + i12, i12 + i11);
    }
}
