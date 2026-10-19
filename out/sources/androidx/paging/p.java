package androidx.paging;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: MutableLoadStateCollection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f19382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f19383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f19384c;

    public p() {
        m.c cVar = m.c.f19374c;
        this.f19382a = cVar;
        this.f19383b = cVar;
        this.f19384c = cVar;
    }

    public final m a(LoadType loadType) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return this.f19382a;
        }
        if (iOrdinal == 1) {
            return this.f19383b;
        }
        if (iOrdinal == 2) {
            return this.f19384c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(n states) {
        kotlin.jvm.internal.i.e(states, "states");
        this.f19382a = states.f19376a;
        this.f19384c = states.f19378c;
        this.f19383b = states.f19377b;
    }

    public final void c(LoadType type, m state) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(state, "state");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.f19382a = state;
        } else if (iOrdinal == 1) {
            this.f19383b = state;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f19384c = state;
        }
    }

    public final n d() {
        return new n(this.f19382a, this.f19383b, this.f19384c);
    }
}
