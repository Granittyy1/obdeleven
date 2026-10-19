package p019b6;

import com.google.android.play.integrity.internal.j;
import com.google.android.play.integrity.internal.k;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.f;
import okhttp3.internal.connection.i;
import p172nb.b;
import p184ob.d;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20561b;

    public c(k kVar) {
        this.f20561b = kVar;
    }

    @Override // com.google.android.play.integrity.internal.m
    public Object a() {
        return new b();
    }

    public void b() {
        Socket socket;
        i iVar = (i) this.f20561b;
        Iterator<f> it = iVar.f45520d.iterator();
        kotlin.jvm.internal.i.d(it, "connections.iterator()");
        while (it.hasNext()) {
            f connection = it.next();
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (connection.f45512p.isEmpty()) {
                    it.remove();
                    connection.j = true;
                    socket = connection.f45501d;
                    kotlin.jvm.internal.i.b(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                b.d(socket);
            }
        }
        if (iVar.f45520d.isEmpty()) {
            iVar.f45518b.a();
        }
    }

    public c() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        this.f20561b = new i(d.f45260h, timeUnit);
    }
}
