package p302y6;

import android.os.Looper;
import com.voltasit.obdeleven.presentation.dialogs.backup.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p191p5.g;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f48352a = L.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(g<T> gVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.g(f48352a, new d(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (gVar.o()) {
            return gVar.k();
        }
        if (gVar.m()) {
            throw new CancellationException("Task is already canceled");
        }
        if (gVar.n()) {
            throw new IllegalStateException(gVar.j());
        }
        throw new TimeoutException();
    }
}
