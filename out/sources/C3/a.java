package C3;

import B3.d;
import B3.g;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f2329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f2331d;

    /* JADX INFO: renamed from: C3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class C0022a implements C3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f2332b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f2333a;

        public C0022a(ContentResolver contentResolver) {
            this.f2333a = contentResolver;
        }

        @Override // C3.b
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f2333a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2332b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class b implements C3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f2334b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f2335a;

        public b(ContentResolver contentResolver) {
            this.f2335a = contentResolver;
        }

        @Override // C3.b
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f2335a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2334b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f2329b = uri;
        this.f2330c = cVar;
    }

    @Override // B3.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // B3.d
    public final void b() {
        InputStream inputStream = this.f2331d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream c() throws Throwable {
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iA;
        Uri uri = this.f2329b;
        c cVar = this.f2330c;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = cVar.f2336a.a(uri);
                if (cursorA != null) {
                    try {
                        try {
                            if (cursorA.moveToFirst()) {
                                string = cursorA.getString(0);
                                cursorA.close();
                            }
                        } catch (SecurityException unused) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Objects.toString(uri);
                            }
                            if (cursorA != null) {
                            }
                            string = null;
                            zIsEmpty = TextUtils.isEmpty(string);
                            contentResolver = cVar.f2338c;
                            if (zIsEmpty) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    inputStreamOpenInputStream = null;
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iA = com.bumptech.glide.load.a.a(cVar.f2337b, inputStreamOpenInputStream2, cVar.f2339d);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else {
                                iA = -1;
                            }
                            if (iA != -1) {
                                return new g(inputStreamOpenInputStream, iA);
                            }
                            return inputStreamOpenInputStream;
                        }
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = cVar.f2338c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists() || 0 >= file.length()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                Uri uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                } catch (NullPointerException e10) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
                                }
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iA = com.bumptech.glide.load.a.a(cVar.f2337b, inputStreamOpenInputStream2, cVar.f2339d);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iA = -1;
                        }
                        if (iA != -1) {
                            return new g(inputStreamOpenInputStream, iA);
                        }
                        return inputStreamOpenInputStream;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (SecurityException unused5) {
                cursorA = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iA = com.bumptech.glide.load.a.a(cVar.f2337b, inputStreamOpenInputStream2, cVar.f2339d);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iA = -1;
            }
            if (iA != -1) {
                return new g(inputStreamOpenInputStream, iA);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th3;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = cVar.f2338c;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
    }

    @Override // B3.d
    public final void e(Priority priority, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamC = c();
            this.f2331d = inputStreamC;
            aVar.d(inputStreamC);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
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
