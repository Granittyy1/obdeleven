package p255u9;

import L7.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: u9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC2799b implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2800c f47461b;

    public /* synthetic */ CallableC2799b(C2800c c2800c) {
        this.f47461b = c2800c;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(this.f47461b.getParseFile("data").getUrl()));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenStream);
                try {
                    C2800c.a aVar = (C2800c.a) new Gson().c(inputStreamReader, a.get(C2800c.a.class));
                    inputStreamReader.close();
                    if (inputStreamOpenStream == null) {
                        return aVar;
                    }
                    inputStreamOpenStream.close();
                    return aVar;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
