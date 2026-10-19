package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f43500a;

    static {
        String property;
        int i10 = y.f43506a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            List<? extends p> listF = SequencesKt___SequencesKt.F(SequencesKt__SequencesKt.x(Arrays.asList(new kotlinx.coroutines.android.a()).iterator()));
            Iterator it = listF.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((p) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((p) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            }
            p pVar = (p) next;
            if (pVar != null) {
                try {
                    q0 q0VarB = pVar.b(listF);
                    if (q0VarB != null) {
                        f43500a = q0VarB;
                        return;
                    }
                } catch (Throwable th) {
                    pVar.a();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
