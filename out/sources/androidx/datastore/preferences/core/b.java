package androidx.datastore.preferences.core;

import androidx.datastore.core.f;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static a a(O0.b bVar, List migrations, A a10, final Ia.a aVar) {
        i.e(migrations, "migrations");
        return new a(f.a(bVar, migrations, a10, new Ia.a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final File invoke() {
                File fileInvoke = aVar.invoke();
                i.e(fileInvoke, "<this>");
                String name = fileInvoke.getName();
                i.d(name, "getName(...)");
                if (n.l0('.', name, "").equals("preferences_pb")) {
                    return fileInvoke;
                }
                throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }));
    }
}
