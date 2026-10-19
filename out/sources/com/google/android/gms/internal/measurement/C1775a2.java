package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1775a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25655a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f25656b;

    public synchronized Map a() {
        try {
            if (((Map) this.f25656b) == null) {
                this.f25656b = Collections.unmodifiableMap(new HashMap((HashMap) this.f25655a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f25656b;
    }

    public Object b() {
        String string;
        X1 x10 = (X1) this.f25655a;
        String str = (String) this.f25656b;
        ContentResolver contentResolver = x10.f25634a.getContentResolver();
        N1 n10 = L1.f25504a;
        if (contentResolver == null) {
            n10.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (n10) {
            try {
                if (n10.f25522b == null) {
                    n10.f25521a.set(false);
                    n10.f25522b = new HashMap<>(16, 1.0f);
                    n10.f25527g = new Object();
                    contentResolver.registerContentObserver(K1.f25494a, true, new P1(n10));
                } else if (n10.f25521a.getAndSet(false)) {
                    n10.f25522b.clear();
                    n10.f25523c.clear();
                    n10.f25524d.clear();
                    n10.f25525e.clear();
                    n10.f25526f.clear();
                    n10.f25527g = new Object();
                    n10.f25528h = false;
                }
                Object obj = n10.f25527g;
                if (n10.f25522b.containsKey(str)) {
                    String str2 = n10.f25522b.get(str);
                    return str2 != null ? str2 : null;
                }
                for (String str3 : n10.f25529i) {
                    if (str.startsWith(str3)) {
                        if (!n10.f25528h) {
                            String[] strArr = n10.f25529i;
                            try {
                                n10.j.getClass();
                                HashMap<String, String> mapA = O1.a(contentResolver, strArr);
                                if (!mapA.isEmpty()) {
                                    Set<String> setKeySet = mapA.keySet();
                                    setKeySet.removeAll(n10.f25523c.keySet());
                                    setKeySet.removeAll(n10.f25524d.keySet());
                                    setKeySet.removeAll(n10.f25525e.keySet());
                                    setKeySet.removeAll(n10.f25526f.keySet());
                                }
                                if (!mapA.isEmpty()) {
                                    if (n10.f25522b.isEmpty()) {
                                        n10.f25522b = mapA;
                                    } else {
                                        n10.f25522b.putAll(mapA);
                                    }
                                }
                                n10.f25528h = true;
                            } catch (zzgq unused) {
                            }
                            if (n10.f25522b.containsKey(str)) {
                                String str4 = n10.f25522b.get(str);
                                return str4 != null ? str4 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    n10.j.getClass();
                    Cursor cursorQuery = contentResolver.query(K1.f25494a, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new zzgq("Failed to connect to GservicesProvider");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (n10) {
                            try {
                                if (obj == n10.f25527g) {
                                    n10.f25522b.put(str, string);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (zzgq unused2) {
                    return null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
