package S2;

import R2.t;
import androidx.compose.material.T;
import kotlinx.coroutines.Z;

/* JADX INFO: compiled from: TaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    default Z a() {
        return T.g(c());
    }

    c.a b();

    t c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
