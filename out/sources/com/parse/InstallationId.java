package com.parse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class InstallationId {
    private final File file;
    private String installationId;
    private final Object lock = new Object();

    public InstallationId(File file) {
        this.file = file;
    }

    private void setInternal(String str) {
        synchronized (this.lock) {
            try {
                ParseFileUtils.writeStringToFile(this.file, str, "UTF-8");
            } catch (IOException e10) {
                PLog.e("InstallationId", "Unexpected exception writing installation id to disk", e10);
            }
            this.installationId = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0012, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0024, B:15:0x0028, B:16:0x0033, B:11:0x0015, B:12:0x001d), top: B:21:0x0003, inners: #1, #2 }] */
    public String get() {
        synchronized (this.lock) {
            if (this.installationId == null) {
                try {
                    try {
                        this.installationId = ParseFileUtils.readFileToString(this.file, "UTF-8");
                    } catch (IOException e10) {
                        PLog.e("InstallationId", "Unexpected exception reading installation id from disk", e10);
                    }
                } catch (FileNotFoundException unused) {
                    PLog.i("InstallationId", "Couldn't find existing installationId file. Creating one instead.");
                }
                if (this.installationId == null) {
                    setInternal(UUID.randomUUID().toString());
                }
            } else if (this.installationId == null) {
                setInternal(UUID.randomUUID().toString());
            }
            throw th;
        }
        return this.installationId;
    }

    public void set(String str) {
        synchronized (this.lock) {
            try {
                if (!ParseTextUtils.isEmpty(str) && !str.equals(get())) {
                    setInternal(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
