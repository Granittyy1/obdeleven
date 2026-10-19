package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p114j1.A;
import p140l1.a;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f17916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f17917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f17918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f17919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17920i;
    public boolean j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f17916e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p140l1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f17917f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f17919h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f17919h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f17918g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f17918g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L2b
            r5.j = r2
            r5.l()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f17918g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L3d
            r5.j = r2
            r5.l()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f17919h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f17918g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f17918g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L5d
            r5.j = r2
            r5.l()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f17918g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L6f
            r5.j = r2
            r5.l()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.ContentDataSource.close():void");
    }

    @Override // p140l1.d
    public final long f(e eVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = eVar.f44168a.normalizeScheme();
            this.f17917f = uriNormalizeScheme;
            m(eVar);
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f17916e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f17918g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f17919h = fileInputStream;
            long j = eVar.f44172e;
            if (length != -1 && j > length) {
                throw new ContentDataSourceException(2008, null);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new ContentDataSourceException(2008, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f17920i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f17920i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(2008, null);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f17920i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(2008, null);
                }
            }
            long j11 = eVar.f44173f;
            if (j11 != -1) {
                long j12 = this.f17920i;
                this.f17920i = j12 == -1 ? j11 : Math.min(j12, j11);
            }
            this.j = true;
            n(eVar);
            return j11 != -1 ? j11 : this.f17920i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f17917f;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j = this.f17920i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i11 = (int) Math.min(j, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(2000, e10);
            }
        }
        FileInputStream fileInputStream = this.f17919h;
        int i12 = A.f40996a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j10 = this.f17920i;
        if (j10 != -1) {
            this.f17920i = j10 - ((long) i13);
        }
        k(i13);
        return i13;
    }
}
