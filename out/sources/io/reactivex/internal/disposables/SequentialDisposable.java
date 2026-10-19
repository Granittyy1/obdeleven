package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p148la.b;

/* JADX INFO: loaded from: classes3.dex */
public final class SequentialDisposable extends AtomicReference<b> implements b {
    private static final long serialVersionUID = -754898800686245608L;

    public final void a(b bVar) {
        while (true) {
            b bVar2 = get();
            if (bVar2 == DisposableHelper.f40662b) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            } else {
                do {
                    if (compareAndSet(bVar2, bVar)) {
                        if (bVar2 != null) {
                            bVar2.dispose();
                            return;
                        }
                        return;
                    }
                } while (get() == bVar2);
            }
        }
    }

    @Override // p148la.b
    public final boolean d() {
        return DisposableHelper.b(get());
    }

    @Override // p148la.b
    public final void dispose() {
        DisposableHelper.a(this);
    }
}
