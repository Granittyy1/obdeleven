package androidx.datastore.preferences;

import Ia.l;
import android.content.Context;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.B;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.f;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static b a(String name, O0.b bVar) {
        f fVarA = B.a(N.f43200c.plus(M1.a()));
        i.e(name, "name");
        PreferenceDataStoreDelegateKt$preferencesDataStore$1 produceMigrations = new l<Context, List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.c>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
            @Override // Ia.l
            public final List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.c>> invoke(Context context) {
                Context it = context;
                i.e(it, "it");
                return EmptyList.f42983b;
            }
        };
        i.e(produceMigrations, "produceMigrations");
        return new b(name, bVar, produceMigrations, fVarA);
    }
}
