package I3;

import H3.q;
import H3.r;
import H3.u;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class e<DataT> implements q<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<File, DataT> f3823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<Uri, DataT> f3824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<DataT> f3825d;

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements r<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<DataT> f3827b;

        public a(Context context, Class<DataT> cls) {
            this.f3826a = context;
            this.f3827b = cls;
        }

        @Override // H3.r
        public final q<Uri, DataT> a(u uVar) {
            Class<DataT> cls = this.f3827b;
            return new e(this.f3826a, uVar.a(File.class, cls), uVar.a(Uri.class, cls), cls);
        }
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
    }

    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static final class d<DataT> implements B3.d<DataT> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String[] f3828l = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f3829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<File, DataT> f3830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q<Uri, DataT> f3831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri f3832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f3833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f3834g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final A3.d f3835h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Class<DataT> f3836i;
        public volatile boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile B3.d<DataT> f3837k;

        public d(Context context, q<File, DataT> qVar, q<Uri, DataT> qVar2, Uri uri, int i10, int i11, A3.d dVar, Class<DataT> cls) {
            this.f3829b = context.getApplicationContext();
            this.f3830c = qVar;
            this.f3831d = qVar2;
            this.f3832e = uri;
            this.f3833f = i10;
            this.f3834g = i11;
            this.f3835h = dVar;
            this.f3836i = cls;
        }

        @Override // B3.d
        public final Class<DataT> a() {
            return this.f3836i;
        }

        @Override // B3.d
        public final void b() {
            B3.d<DataT> dVar = this.f3837k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final B3.d<DataT> c() throws Throwable {
            q.a<DataT> aVarA;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            A3.d dVar = this.f3835h;
            int i10 = this.f3834g;
            int i11 = this.f3833f;
            Context context = this.f3829b;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f3832e;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f3828l, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.f3830c.a(file, i11, i10, dVar);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                Uri requireOriginal = this.f3832e;
                if (iCheckSelfPermission == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                aVarA = this.f3831d.a(requireOriginal, i11, i10, dVar);
            }
            if (aVarA != null) {
                return aVarA.f3669c;
            }
            return null;
        }

        @Override // B3.d
        public final void cancel() {
            this.j = true;
            B3.d<DataT> dVar = this.f3837k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super DataT> aVar) throws Throwable {
            try {
                B3.d<DataT> dVarC = c();
                if (dVarC == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f3832e));
                } else {
                    this.f3837k = dVarC;
                    if (this.j) {
                        cancel();
                    } else {
                        dVarC.e(priority, aVar);
                    }
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return DataSource.f24511b;
        }
    }

    public e(Context context, q<File, DataT> qVar, q<Uri, DataT> qVar2, Class<DataT> cls) {
        this.f3822a = context.getApplicationContext();
        this.f3823b = qVar;
        this.f3824c = qVar2;
        this.f3825d = cls;
    }

    @Override // H3.q
    public final q.a a(Uri uri, int i10, int i11, A3.d dVar) {
        Uri uri2 = uri;
        return new q.a(new W3.b(uri2), new d(this.f3822a, this.f3823b, this.f3824c, uri2, i10, i11, dVar, this.f3825d));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C1787c0.m(uri);
    }
}
