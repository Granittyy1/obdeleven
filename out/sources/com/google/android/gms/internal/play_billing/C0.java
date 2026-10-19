package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C0 {
    public static C2013v0 b() {
        String strD;
        ClassLoader classLoader = C0.class.getClassLoader();
        if (C2013v0.class.equals(C2013v0.class)) {
            strD = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C2013v0.class.getPackage().equals(C0.class.getPackage())) {
                throw new IllegalArgumentException(C2013v0.class.getName());
            }
            strD = C4.b.d(C2013v0.class.getPackage().getName(), ".BlazeGenerated", C2013v0.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (C2013v0) C2013v0.class.cast(((C0) Class.forName(strD, true, classLoader).getConstructor(null).newInstance(null)).a());
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
            Iterator it = ServiceLoader.load(C0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C2013v0) C2013v0.class.cast(((C0) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(AbstractC2001r0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C2013v0.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (C2013v0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2013v0) C2013v0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract C2013v0 a();
}
