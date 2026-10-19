package p065f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: LocalBroadcastManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f34907f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f34908g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f34910b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f34911c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f34912d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HandlerC0363a f34913e;

    /* JADX INFO: renamed from: f1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public class HandlerC0363a extends Handler {
        public HandlerC0363a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f34910b) {
                    try {
                        size = aVar.f34912d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        aVar.f34912d.toArray(bVarArr);
                        aVar.f34912d.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f34916b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f34916b.get(i11);
                        if (!cVar.f34920d) {
                            cVar.f34918b.onReceive(aVar.f34909a, bVar.f34915a);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f34915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f34916b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f34915a = intent;
            this.f34916b = arrayList;
        }
    }

    /* JADX INFO: compiled from: LocalBroadcastManager.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f34917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f34918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f34920d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f34917a = intentFilter;
            this.f34918b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f34918b);
            sb2.append(" filter=");
            sb2.append(this.f34917a);
            if (this.f34920d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f34909a = context;
        this.f34913e = new HandlerC0363a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f34907f) {
            try {
                if (f34908g == null) {
                    f34908g = new a(context.getApplicationContext());
                }
                aVar = f34908g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f34910b) {
            try {
                c cVar = new c(broadcastReceiver, intentFilter);
                ArrayList<c> arrayList = this.f34910b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f34910b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f34911c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f34911c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void c(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z10;
        synchronized (this.f34910b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f34909a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = false;
                boolean z12 = (intent.getFlags() & 8) != 0;
                if (z12) {
                    intent.toString();
                }
                ArrayList<c> arrayList3 = this.f34911c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z12) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        c cVar = arrayList3.get(i11);
                        if (z12) {
                            Objects.toString(cVar.f34917a);
                        }
                        if (cVar.f34919c) {
                            i10 = i11;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z10 = z11;
                        } else {
                            IntentFilter intentFilter = cVar.f34917a;
                            String str3 = action;
                            String str4 = strResolveTypeIfNeeded;
                            i10 = i11;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z10 = z11;
                            int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z12) {
                                    Integer.toHexString(iMatch);
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f34919c = true;
                            }
                            i11 = i10 + 1;
                            z11 = z10;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        }
                        arrayList4 = arrayList;
                        i11 = i10 + 1;
                        z11 = z10;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ?? r10 = arrayList4;
                    boolean z13 = z11;
                    if (r10 != 0) {
                        for (?? r11 = z13; r11 < r10.size(); r11++) {
                            ((c) r10.get(r11)).f34919c = z13;
                        }
                        this.f34912d.add(new b(intent, r10));
                        if (!this.f34913e.hasMessages(1)) {
                            this.f34913e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f34910b) {
            try {
                ArrayList<c> arrayListRemove = this.f34910b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f34920d = true;
                    for (int i10 = 0; i10 < cVar.f34917a.countActions(); i10++) {
                        String action = cVar.f34917a.getAction(i10);
                        ArrayList<c> arrayList = this.f34911c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f34918b == broadcastReceiver) {
                                    cVar2.f34920d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f34911c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
