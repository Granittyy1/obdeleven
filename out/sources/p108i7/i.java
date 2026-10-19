package p108i7;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.M1;
import com.google.firebase.installations.local.a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f36768b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36769c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i f36770d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f36771a;

    public i(M1 m7) {
        this.f36771a = m7;
    }

    public final boolean a(a aVar) {
        if (TextUtils.isEmpty(aVar.f28224d)) {
            return true;
        }
        long j = aVar.f28226f + aVar.f28227g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f36771a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f36768b;
    }
}
