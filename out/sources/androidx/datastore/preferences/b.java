package androidx.datastore.preferences;

import Ia.l;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O0.b<androidx.datastore.preferences.core.c> f17077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Context, List<androidx.datastore.core.c<androidx.datastore.preferences.core.c>>> f17078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f17079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile androidx.datastore.preferences.core.a f17081f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String name, O0.b<androidx.datastore.preferences.core.c> bVar, l<? super Context, ? extends List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.c>>> lVar, A a10) {
        i.e(name, "name");
        this.f17076a = name;
        this.f17077b = bVar;
        this.f17078c = lVar;
        this.f17079d = a10;
        this.f17080e = new Object();
    }

    public final Object a(Object obj, Oa.l property) {
        androidx.datastore.preferences.core.a aVar;
        Context thisRef = (Context) obj;
        i.e(thisRef, "thisRef");
        i.e(property, "property");
        androidx.datastore.preferences.core.a aVar2 = this.f17081f;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (this.f17080e) {
            try {
                if (this.f17081f == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    O0.b<androidx.datastore.preferences.core.c> bVar = this.f17077b;
                    l<Context, List<androidx.datastore.core.c<androidx.datastore.preferences.core.c>>> lVar = this.f17078c;
                    i.d(applicationContext, "applicationContext");
                    this.f17081f = androidx.datastore.preferences.core.b.a(bVar, lVar.invoke(applicationContext), this.f17079d, new Ia.a<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final File invoke() {
                            Context applicationContext2 = applicationContext;
                            i.d(applicationContext2, "applicationContext");
                            String name = this.f17076a;
                            i.e(name, "name");
                            String fileName = i.k(".preferences_pb", name);
                            i.e(fileName, "fileName");
                            return new File(applicationContext2.getApplicationContext().getFilesDir(), i.k(fileName, "datastore/"));
                        }
                    });
                }
                aVar = this.f17081f;
                i.b(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
