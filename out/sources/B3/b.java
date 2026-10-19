package B3;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f1498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f1499d;

    public b(AssetManager assetManager, String str) {
        this.f1498c = assetManager;
        this.f1497b = str;
    }

    @Override // B3.d
    public final void b() {
        T t8 = this.f1499d;
        if (t8 == null) {
            return;
        }
        try {
            c(t8);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t8) throws IOException;

    public abstract T d(AssetManager assetManager, String str) throws IOException;

    @Override // B3.d
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            T tD = d(this.f1498c, this.f1497b);
            this.f1499d = tD;
            aVar.d(tD);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e10);
        }
    }

    @Override // B3.d
    public final DataSource getDataSource() {
        return DataSource.f24511b;
    }

    @Override // B3.d
    public final void cancel() {
    }
}
