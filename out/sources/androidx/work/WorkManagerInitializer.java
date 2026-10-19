package androidx.work;

import K2.K;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements p309z2.b<o> {
    static {
        k.d("WrkMgrInitializer");
    }

    @Override // p309z2.b
    public final List<Class<? extends p309z2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // p309z2.b
    public final o b(Context context) {
        k.c().getClass();
        K.c(context, new a(new a.C0201a()));
        return K.b(context);
    }
}
