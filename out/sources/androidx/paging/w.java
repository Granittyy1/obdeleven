package androidx.paging;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: PagingConfig.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19434c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19435d = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19436e = Integer.MIN_VALUE;

    public w(int i10) {
        this.f19432a = i10;
        this.f19433b = i10;
        if (i10 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
