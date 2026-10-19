package Na;

import java.util.NoSuchElementException;
import kotlin.collections.v;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4693e;

    public h(int i10, int i11, int i12) {
        this.f4690b = i12;
        this.f4691c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f4692d = z10;
        this.f4693e = z10 ? i10 : i11;
    }

    @Override // kotlin.collections.v
    public final int a() {
        int i10 = this.f4693e;
        if (i10 != this.f4691c) {
            this.f4693e = this.f4690b + i10;
        } else {
            if (!this.f4692d) {
                throw new NoSuchElementException();
            }
            this.f4692d = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4692d;
    }
}
