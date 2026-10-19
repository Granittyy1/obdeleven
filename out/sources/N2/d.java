package N2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.k;

/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f4635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F8.a f4636b;

    static {
        k.d("SystemJobInfoConverter");
    }

    public d(Context context, F8.a aVar) {
        this.f4636b = aVar;
        this.f4635a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
