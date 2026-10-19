package Z3;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = q.f7860i;
        if (context != null) {
            return context.getCacheDir();
        }
        kotlin.jvm.internal.i.m("applicationContext");
        throw null;
    }
}
