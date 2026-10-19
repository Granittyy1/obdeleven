package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M2<T extends D2> {
    public static D2 a() {
        String strD;
        ClassLoader classLoader = M2.class.getClassLoader();
        if (D2.class.equals(D2.class)) {
            strD = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!D2.class.getPackage().equals(M2.class.getPackage())) {
                throw new IllegalArgumentException(D2.class.getName());
            }
            strD = C4.b.d(D2.class.getPackage().getName(), ".BlazeGenerated", D2.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (D2) D2.class.cast(((M2) Class.forName(strD, true, classLoader).getConstructor(null).newInstance(null)).b());
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(M2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((D2) D2.class.cast(((M2) it.next()).b()));
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(zzja.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(D2.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (D2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (D2) D2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract T b();
}
