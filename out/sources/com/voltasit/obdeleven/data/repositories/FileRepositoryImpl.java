package com.voltasit.obdeleven.data.repositories;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: FileRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FileRepositoryImpl implements K8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30299a;

    public FileRepositoryImpl(Context context) {
        this.f30299a = context;
    }

    @Override // K8.g
    public final void a() {
        File file = new File(this.f30299a.getExternalFilesDir(null), "background.jpg");
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // K8.g
    public final Uri b(String str) throws IOException {
        File file = new File(this.f30299a.getExternalFilesDir(null), str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        Uri uriFromFile = Uri.fromFile(file);
        kotlin.jvm.internal.i.d(uriFromFile, "fromFile(...)");
        return uriFromFile;
    }

    @Override // K8.g
    public final Object c(kotlin.coroutines.c<? super byte[]> cVar) {
        return C2680e.f(N.f43200c, new FileRepositoryImpl$getReportFile$2(2, null), cVar);
    }

    @Override // K8.g
    public final void d() {
        File file = new File(this.f30299a.getExternalFilesDir(null), "menu_background.jpg");
        if (file.exists()) {
            file.delete();
        }
    }
}
