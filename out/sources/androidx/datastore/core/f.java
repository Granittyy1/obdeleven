package androidx.datastore.core;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: DataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static j a(O0.b bVar, List migrations, A a10, Ia.a aVar) {
        kotlin.jvm.internal.i.e(migrations, "migrations");
        a aVar2 = bVar;
        if (bVar == null) {
            aVar2 = new O0.a();
        }
        return new j(aVar, M1.k(new DataMigrationInitializer$Companion$getInitializer$1(migrations, null)), aVar2, a10);
    }
}
