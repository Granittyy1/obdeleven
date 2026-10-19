package p206q7;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.l;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p241t7.a;
import p253u7.b;

/* JADX INFO: compiled from: FrameMetricsRecorder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46169e = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f46170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f46171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46173d;

    @VisibleForTesting
    public d() {
        throw null;
    }

    public d(Activity activity) {
        l lVar = new l();
        HashMap map = new HashMap();
        this.f46173d = false;
        this.f46170a = activity;
        this.f46171b = lVar;
        this.f46172c = map;
    }

    public final com.google.firebase.perf.util.d<b> a() {
        boolean z10 = this.f46173d;
        a aVar = f46169e;
        if (!z10) {
            aVar.a();
            return new com.google.firebase.perf.util.d<>();
        }
        SparseIntArray sparseIntArray = this.f46171b.f16739a.f16743b[0];
        if (sparseIntArray == null) {
            aVar.a();
            return new com.google.firebase.perf.util.d<>();
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int iKeyAt = sparseIntArray.keyAt(i13);
            int iValueAt = sparseIntArray.valueAt(i13);
            i10 += iValueAt;
            if (iKeyAt > 700) {
                i12 += iValueAt;
            }
            if (iKeyAt > 16) {
                i11 += iValueAt;
            }
        }
        return new com.google.firebase.perf.util.d<>(new b(i10, i11, i12));
    }

    public final void b() {
        boolean z10 = this.f46173d;
        Activity activity = this.f46170a;
        if (z10) {
            f46169e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        l.a aVar = this.f46171b.f16739a;
        aVar.getClass();
        if (l.a.f16740e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            l.a.f16740e = handlerThread;
            handlerThread.start();
            l.a.f16741f = new Handler(l.a.f16740e.getLooper());
        }
        for (int i10 = 0; i10 <= 8; i10++) {
            SparseIntArray[] sparseIntArrayArr = aVar.f16743b;
            if (sparseIntArrayArr[i10] == null) {
                if (((1 << i10) & aVar.f16742a) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.f16745d, l.a.f16741f);
        aVar.f16744c.add(new WeakReference<>(activity));
        this.f46173d = true;
    }
}
