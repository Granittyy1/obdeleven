package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DeviceProfileWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0196c f19464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f19465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f19466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19468f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p201q2.b[] f19469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f19470h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0196c interfaceC0196c, String str, File file) {
        byte[] bArr;
        this.f19463a = executor;
        this.f19464b = interfaceC0196c;
        this.f19467e = str;
        this.f19466d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            switch (i10) {
                case 26:
                    bArr = p201q2.e.f46024d;
                    break;
                case 27:
                    bArr = p201q2.e.f46023c;
                    break;
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    bArr = p201q2.e.f46022b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = p201q2.e.f46021a;
        }
        this.f19465c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null) {
                message.contains("compressed");
            }
            return null;
        }
    }

    public final void b(final int i10, final Serializable serializable) {
        this.f19463a.execute(new Runnable() { // from class: q2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f46007b.f19464b.a(i10, serializable);
            }
        });
    }
}
