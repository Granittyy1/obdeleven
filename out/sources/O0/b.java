package O0;

import Ia.l;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ReplaceFileCorruptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> implements androidx.datastore.core.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f4726a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super CorruptionException, ? extends T> produceNewData) {
        i.e(produceNewData, "produceNewData");
        this.f4726a = (Lambda) produceNewData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.datastore.core.a
    public final Object a(CorruptionException corruptionException) throws IOException {
        return this.f4726a.invoke(corruptionException);
    }
}
