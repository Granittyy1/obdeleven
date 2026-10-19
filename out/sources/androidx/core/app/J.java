package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TaskStackBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class J implements Iterable<Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f16693b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16694c;

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public J(Context context) {
        this.f16694c = context;
    }

    public final void d(ComponentName componentName) {
        Context context = this.f16694c;
        ArrayList<Intent> arrayList = this.f16693b;
        int size = arrayList.size();
        try {
            for (Intent intentA = n.a(context, componentName); intentA != null; intentA = n.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void e() {
        ArrayList<Intent> arrayList = this.f16693b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f16694c.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f16693b.iterator();
    }
}
