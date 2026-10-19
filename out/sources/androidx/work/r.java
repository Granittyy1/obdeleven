package androidx.work;

import android.content.Context;
import androidx.compose.foundation.C0936h;

/* JADX INFO: compiled from: WorkerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20472a = k.d("WorkerFactory");

    public final j a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f20472a;
        j jVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(j.class);
        } catch (Throwable th) {
            k.c().b(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                jVar = (j) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                k.c().b(str2, "Could not instantiate " + str, th2);
            }
        }
        if (jVar == null || !jVar.isUsed()) {
            return jVar;
        }
        throw new IllegalStateException(C0936h.d("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
