package p136ka;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: AndroidSchedulers.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42909a;

    /* JADX INFO: renamed from: ka.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static final class C0476a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42910a = new b(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            b bVar = C0476a.f42910a;
            if (bVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f42909a = bVar;
        } catch (Throwable th) {
            throw ExceptionHelper.c(th);
        }
    }
}
