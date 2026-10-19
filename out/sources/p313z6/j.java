package p313z6;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f48883c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f48884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f48885b;

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f48886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48887b;

        public a(int i10, byte[] bArr) {
            this.f48886a = bArr;
            this.f48887b = i10;
        }
    }

    public j(File file) {
        this.f48884a = file;
    }

    @Override // p313z6.c
    public final void a() {
        CommonUtils.b(this.f48885b, "There was a problem closing the Crashlytics log file.");
        this.f48885b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p313z6.c
    public final String b() {
        a aVar;
        byte[] bArr;
        if (this.f48884a.exists()) {
            d();
            h hVar = this.f48885b;
            if (hVar == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[hVar.B()];
                try {
                    this.f48885b.h(new i(bArr2, iArr));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                aVar = new a(iArr[0], bArr2);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            bArr = null;
        } else {
            int i10 = aVar.f48887b;
            bArr = new byte[i10];
            System.arraycopy(aVar.f48886a, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, f48883c);
        }
        return null;
    }

    @Override // p313z6.c
    public final void c(long j, String str) {
        d();
        if (this.f48885b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f48885b.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f48883c));
            while (!this.f48885b.i() && this.f48885b.B() > 65536) {
                this.f48885b.p();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }

    public final void d() {
        File file = this.f48884a;
        if (this.f48885b == null) {
            try {
                this.f48885b = new h(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }
}
