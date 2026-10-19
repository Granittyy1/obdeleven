package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class O1 {
    public static HashMap a(ContentResolver contentResolver, String[] strArr) throws zzgq {
        Cursor cursorQuery = contentResolver.query(K1.f25495b, null, null, strArr, null);
        try {
            if (cursorQuery == null) {
                throw new zzgq("Failed to connect to GservicesProvider");
            }
            HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
            while (cursorQuery.moveToNext()) {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
            return map;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
