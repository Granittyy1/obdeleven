package H3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements q<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3659a;

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static final class a implements r<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3660a;

        public a(Context context) {
            this.f3660a = context;
        }

        @Override // H3.r
        public final q<Uri, File> a(u uVar) {
            return new m(this.f3660a);
        }
    }

    public m(Context context) {
        this.f3659a = context;
    }

    @Override // H3.q
    public final q.a<File> a(Uri uri, int i10, int i11, A3.d dVar) {
        Uri uri2 = uri;
        return new q.a<>(new W3.b(uri2), new b(this.f3659a, uri2));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        return C1787c0.m(uri);
    }

    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static class b implements B3.d<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String[] f3661d = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f3662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f3663c;

        public b(Context context, Uri uri) {
            this.f3662b = context;
            this.f3663c = uri;
        }

        @Override // B3.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f3662b.getContentResolver().query(this.f3663c, f3661d, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.d(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f3663c));
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return DataSource.f24511b;
        }

        @Override // B3.d
        public final void b() {
        }

        @Override // B3.d
        public final void cancel() {
        }
    }
}
