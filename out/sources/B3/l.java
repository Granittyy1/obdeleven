package B3;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f1518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f1519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f1520d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f1519c = contentResolver;
        this.f1518b = uri;
    }

    @Override // B3.d
    public final void b() {
        T t8 = this.f1520d;
        if (t8 != null) {
            try {
                c(t8);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t8) throws IOException;

    public abstract Object d(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // B3.d
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            ?? r10 = (T) d(this.f1519c, this.f1518b);
            this.f1520d = r10;
            aVar.d(r10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
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
