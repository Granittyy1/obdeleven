package com.voltas.crop;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: CropUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: compiled from: CropUtil.java */
    public static class a extends f.a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f29617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressDialog f29618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f29619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f29620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RunnableC0319a f29621f = new RunnableC0319a();

        /* JADX INFO: renamed from: com.voltas.crop.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CropUtil.java */
        public class RunnableC0319a implements Runnable {
            public RunnableC0319a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                aVar.f29617b.f29633b.remove(aVar);
                if (aVar.f29618c.getWindow() != null) {
                    aVar.f29618c.dismiss();
                }
            }
        }

        public a(f fVar, Runnable runnable, ProgressDialog progressDialog, Handler handler) {
            this.f29617b = fVar;
            this.f29618c = progressDialog;
            this.f29619d = runnable;
            ArrayList<f.b> arrayList = fVar.f29633b;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.f29620e = handler;
        }

        @Override // com.voltas.crop.f.b
        public final void a() {
            this.f29618c.hide();
        }

        @Override // com.voltas.crop.f.b
        public final void b() {
            RunnableC0319a runnableC0319a = this.f29621f;
            runnableC0319a.run();
            this.f29620e.removeCallbacks(runnableC0319a);
        }

        @Override // com.voltas.crop.f.b
        public final void c() {
            this.f29618c.show();
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC0319a runnableC0319a = this.f29621f;
            Handler handler = this.f29620e;
            try {
                this.f29619d.run();
            } finally {
                handler.post(runnableC0319a);
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    public static File b(Context context, ContentResolver contentResolver, Uri uri) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        if ("content".equals(uri.getScheme())) {
            try {
                try {
                    cursorQuery = contentResolver.query(uri, new String[]{"_data", "_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = uri.toString().startsWith("content://com.google.android.gallery3d") ? cursorQuery.getColumnIndex("_display_name") : cursorQuery.getColumnIndex("_data");
                                if (columnIndex != -1) {
                                    String string = cursorQuery.getString(columnIndex);
                                    if (!TextUtils.isEmpty(string)) {
                                        File file = new File(string);
                                        cursorQuery.close();
                                        return file;
                                    }
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            cursor = cursorQuery;
                            File fileC = c(context, contentResolver, uri);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return fileC;
                        } catch (SecurityException unused2) {
                            if (cursorQuery != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IllegalArgumentException unused3) {
            } catch (SecurityException unused4) {
                cursorQuery = null;
            }
        }
        return null;
    }

    public static File c(Context context, ContentResolver contentResolver, Uri uri) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (uri == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(contentResolver.openFileDescriptor(uri, "r").getFileDescriptor());
            try {
                String absolutePath = File.createTempFile(AppearanceType.IMAGE, "tmp", context.getCacheDir()).getAbsolutePath();
                fileOutputStream = new FileOutputStream(absolutePath);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            File file = new File(absolutePath);
                            a(fileInputStream);
                            a(fileOutputStream);
                            return file;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException unused) {
                    a(fileInputStream);
                    a(fileOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    a(fileInputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
